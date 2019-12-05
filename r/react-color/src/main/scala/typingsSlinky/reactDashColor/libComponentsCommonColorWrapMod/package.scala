package typingsSlinky.reactDashColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsCommonColorWrapMod {
  import typingsSlinky.reactDashColor.reactDashColorMod.Color
  import typingsSlinky.reactDashColor.reactDashColorMod.ColorResult

  type ColorWrapChangeHandler = js.Function1[/* color */ Color | ColorResult, Unit]
}
