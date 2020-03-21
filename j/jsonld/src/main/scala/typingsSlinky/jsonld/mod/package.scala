package typingsSlinky.jsonld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* err */ js.Error, /* res */ T, scala.Unit]
  // Some typealiases for better readability and some placeholders
  type MimeNQuad = typingsSlinky.jsonld.jsonldStrings.`applicationSlashn-quads`
  type RdfDataSet = js.Object
}
