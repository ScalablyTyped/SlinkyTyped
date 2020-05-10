package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<canvaskit-wasm.canvaskit-wasm.FontStyle> */
@js.native
trait FontStyleConfig extends js.Object {
  var slant: js.UndefOr[SkFontSlant] = js.native
  var weight: js.UndefOr[SkFontWeight] = js.native
  var width: js.UndefOr[SkFontWidth] = js.native
}

object FontStyleConfig {
  @scala.inline
  def apply(): FontStyleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyleConfig]
  }
  @scala.inline
  implicit class FontStyleConfigOps[Self <: FontStyleConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlant(value: SkFontSlant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slant")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: SkFontWeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: SkFontWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

