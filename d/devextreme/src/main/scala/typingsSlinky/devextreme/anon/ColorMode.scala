package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.gradient
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.source
import typingsSlinky.devextreme.devextremeStrings.target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorMode extends js.Object {
  var border: js.UndefOr[ColorVisible] = js.native
  var color: js.UndefOr[String] = js.native
  var colorMode: js.UndefOr[none | source | target | gradient] = js.native
  var hoverStyle: js.UndefOr[ColorHatching] = js.native
  var opacity: js.UndefOr[Double] = js.native
}

object ColorMode {
  @scala.inline
  def apply(): ColorMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMode]
  }
  @scala.inline
  implicit class ColorModeOps[Self <: ColorMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: ColorVisible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
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
    def withColorMode(value: none | source | target | gradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverStyle(value: ColorHatching): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
  }
  
}

