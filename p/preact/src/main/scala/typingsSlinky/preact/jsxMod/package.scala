package typingsSlinky.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsxMod {
  type Defaultize[Props, Defaults] = (typingsSlinky.std.Partial[
    typingsSlinky.std.Pick[Props, typingsSlinky.std.Extract[java.lang.String, java.lang.String]]
  ]) with (// Include the remaining properties from Props
  typingsSlinky.std.Pick[Props, typingsSlinky.std.Exclude[java.lang.String, java.lang.String]])
}
