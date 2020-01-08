package typingsSlinky.jsonld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonldMod {
  import typingsSlinky.jsonld.jsonldDashSpecMod.JsonLd
  import typingsSlinky.jsonld.jsonldStrings.`applicationSlashn-quads`

  type Callback[T] = js.Function2[/* err */ js.Error, /* res */ T, Unit]
  type DocCallback = Callback[JsonLd]
  // Some typealiases for better readability and some placeholders
  type MimeNQuad = `applicationSlashn-quads`
  type RdfDataSet = js.Object
  type RdfOrString = RdfDataSet | String
}
