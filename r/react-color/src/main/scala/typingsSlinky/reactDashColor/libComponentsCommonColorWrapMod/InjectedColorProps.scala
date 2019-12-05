package typingsSlinky.reactDashColor.libComponentsCommonColorWrapMod

import typingsSlinky.reactDashColor.reactDashColorMod.Color
import typingsSlinky.reactDashColor.reactDashColorMod.ColorResult
import typingsSlinky.reactDashColor.reactDashColorMod.HSLColor
import typingsSlinky.reactDashColor.reactDashColorMod.RGBColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedColorProps extends js.Object {
  var hex: js.UndefOr[String] = js.undefined
  var hsl: js.UndefOr[HSLColor] = js.undefined
  var onChange: js.UndefOr[ColorWrapChangeHandler] = js.undefined
  var rgb: js.UndefOr[RGBColor] = js.undefined
}

object InjectedColorProps {
  @scala.inline
  def apply(
    hex: String = null,
    hsl: HSLColor = null,
    onChange: /* color */ Color | ColorResult => Unit = null,
    rgb: RGBColor = null
  ): InjectedColorProps = {
    val __obj = js.Dynamic.literal()
    if (hex != null) __obj.updateDynamic("hex")(hex.asInstanceOf[js.Any])
    if (hsl != null) __obj.updateDynamic("hsl")(hsl.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (rgb != null) __obj.updateDynamic("rgb")(rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedColorProps]
  }
}

