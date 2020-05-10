package typingsSlinky.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPalette extends js.Object {
  var `0`: js.UndefOr[String] = js.native
  var `100`: js.UndefOr[String] = js.native
  var `200`: js.UndefOr[String] = js.native
  var `300`: js.UndefOr[String] = js.native
  var `400`: js.UndefOr[String] = js.native
  var `50`: js.UndefOr[String] = js.native
  var `500`: js.UndefOr[String] = js.native
  var `600`: js.UndefOr[String] = js.native
  var `700`: js.UndefOr[String] = js.native
  var `800`: js.UndefOr[String] = js.native
  var `900`: js.UndefOr[String] = js.native
  var A100: js.UndefOr[String] = js.native
  var A200: js.UndefOr[String] = js.native
  var A400: js.UndefOr[String] = js.native
  var A700: js.UndefOr[String] = js.native
  var contrastDarkColors: js.UndefOr[String | js.Array[String]] = js.native
  var contrastDefaultColor: js.UndefOr[String] = js.native
  var contrastLightColors: js.UndefOr[String | js.Array[String]] = js.native
  var contrastStrongLightColors: js.UndefOr[String | js.Array[String]] = js.native
}

object IPalette {
  @scala.inline
  def apply(): IPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPalette]
  }
  @scala.inline
  implicit class IPaletteOps[Self <: IPalette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with0(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(js.undefined)
        ret
    }
    @scala.inline
    def with100(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("100")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without100: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("100")(js.undefined)
        ret
    }
    @scala.inline
    def with200(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("200")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without200: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("200")(js.undefined)
        ret
    }
    @scala.inline
    def with300(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("300")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without300: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("300")(js.undefined)
        ret
    }
    @scala.inline
    def with400(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("400")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without400: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("400")(js.undefined)
        ret
    }
    @scala.inline
    def with50(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("50")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without50: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("50")(js.undefined)
        ret
    }
    @scala.inline
    def with500(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("500")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without500: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("500")(js.undefined)
        ret
    }
    @scala.inline
    def with600(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("600")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without600: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("600")(js.undefined)
        ret
    }
    @scala.inline
    def with700(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("700")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without700: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("700")(js.undefined)
        ret
    }
    @scala.inline
    def with800(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("800")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without800: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("800")(js.undefined)
        ret
    }
    @scala.inline
    def with900(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("900")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without900: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("900")(js.undefined)
        ret
    }
    @scala.inline
    def withA100(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A100")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA100: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A100")(js.undefined)
        ret
    }
    @scala.inline
    def withA200(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A200")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA200: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A200")(js.undefined)
        ret
    }
    @scala.inline
    def withA400(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A400")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA400: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A400")(js.undefined)
        ret
    }
    @scala.inline
    def withA700(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A700")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA700: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A700")(js.undefined)
        ret
    }
    @scala.inline
    def withContrastDarkColors(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastDarkColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrastDarkColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastDarkColors")(js.undefined)
        ret
    }
    @scala.inline
    def withContrastDefaultColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastDefaultColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrastDefaultColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastDefaultColor")(js.undefined)
        ret
    }
    @scala.inline
    def withContrastLightColors(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastLightColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrastLightColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastLightColors")(js.undefined)
        ret
    }
    @scala.inline
    def withContrastStrongLightColors(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastStrongLightColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrastStrongLightColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrastStrongLightColors")(js.undefined)
        ret
    }
  }
  
}

