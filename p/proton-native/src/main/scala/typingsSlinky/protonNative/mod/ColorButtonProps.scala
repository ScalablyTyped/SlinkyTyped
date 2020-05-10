package typingsSlinky.protonNative.mod

import typingsSlinky.protonNative.AnonA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorButtonProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * The initial color for the ColorButton. Can be passed as standard color seen in CSS (a color name, hex, rgb, rgba, hsl, hsla).
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Called when the color is changed for the ColorButton. The current color is passed as an object of RGBA.
    */
  var onChange: js.UndefOr[js.Function1[/* color */ AnonA, Unit]] = js.native
}

object ColorButtonProps {
  @scala.inline
  def apply(): ColorButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorButtonProps]
  }
  @scala.inline
  implicit class ColorButtonPropsOps[Self <: ColorButtonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* color */ AnonA => Unit): Self = {
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
  }
  
}

