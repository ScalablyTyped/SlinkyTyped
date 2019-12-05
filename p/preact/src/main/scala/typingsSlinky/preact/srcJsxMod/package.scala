package typingsSlinky.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcJsxMod {
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Extract
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Defaultize[Props, Defaults] = (Partial[Pick[Props, Extract[String, String]]]) with (// Include the remaining properties from Props
  Pick[Props, Exclude[String, String]])
}
