package typingsSlinky.reactColor.colorWrapMod

import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorResult
import typingsSlinky.reactColor.mod.HSLColor
import typingsSlinky.reactColor.mod.RGBColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedColorProps extends js.Object {
  var hex: js.UndefOr[String] = js.native
  var hsl: js.UndefOr[HSLColor] = js.native
  var onChange: js.UndefOr[ColorWrapChangeHandler] = js.native
  var rgb: js.UndefOr[RGBColor] = js.native
}

object InjectedColorProps {
  @scala.inline
  def apply(): InjectedColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectedColorProps]
  }
  @scala.inline
  implicit class InjectedColorPropsOps[Self <: InjectedColorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(js.undefined)
        ret
    }
    @scala.inline
    def withHsl(value: HSLColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsl")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* color */ Color | ColorResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRgb(value: RGBColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRgb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rgb")(js.undefined)
        ret
    }
  }
  
}

