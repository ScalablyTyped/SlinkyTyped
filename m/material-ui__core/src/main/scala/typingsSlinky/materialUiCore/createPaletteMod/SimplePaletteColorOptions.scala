package typingsSlinky.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimplePaletteColorOptions extends PaletteColorOptions {
  var contrastText: js.UndefOr[String] = js.native
  var dark: js.UndefOr[String] = js.native
  var light: js.UndefOr[String] = js.native
  var main: String = js.native
}

object SimplePaletteColorOptions {
  @scala.inline
  def apply(main: String): SimplePaletteColorOptions = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplePaletteColorOptions]
  }
  @scala.inline
  implicit class SimplePaletteColorOptionsOps[Self <: SimplePaletteColorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContrastText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrastText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastText")(js.undefined)
        ret
    }
    @scala.inline
    def withDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(js.undefined)
        ret
    }
    @scala.inline
    def withLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(js.undefined)
        ret
    }
  }
  
}

