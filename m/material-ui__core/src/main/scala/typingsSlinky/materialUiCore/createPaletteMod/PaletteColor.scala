package typingsSlinky.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaletteColor extends js.Object {
  var contrastText: String = js.native
  var dark: String = js.native
  var light: String = js.native
  var main: String = js.native
}

object PaletteColor {
  @scala.inline
  def apply(contrastText: String, dark: String, light: String, main: String): PaletteColor = {
    val __obj = js.Dynamic.literal(contrastText = contrastText.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteColor]
  }
  @scala.inline
  implicit class PaletteColorOps[Self <: PaletteColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContrastText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("main")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

