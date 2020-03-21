package typingsSlinky.reactColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.reactColor.mod.HSLColor
    - typingsSlinky.reactColor.mod.RGBColor
  */
  type Color = typingsSlinky.reactColor.mod._Color | java.lang.String
  type ColorChangeHandler = js.Function1[/* color */ typingsSlinky.reactColor.mod.ColorResult, scala.Unit]
}
