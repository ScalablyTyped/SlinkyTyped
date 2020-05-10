package typingsSlinky.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemePaletteColors extends js.Object {
  var productDark: String = js.native
  var productDarkActive: js.UndefOr[String] = js.native
  var productDarkHover: js.UndefOr[String] = js.native
  var productDarker: js.UndefOr[String] = js.native
  var productLight: String = js.native
  var productLightActive: String = js.native
  var productLightHover: String = js.native
  var productNormal: String = js.native
  var productNormalActive: String = js.native
  var productNormalHover: String = js.native
}

object ThemePaletteColors {
  @scala.inline
  def apply(
    productDark: String,
    productLight: String,
    productLightActive: String,
    productLightHover: String,
    productNormal: String,
    productNormalActive: String,
    productNormalHover: String
  ): ThemePaletteColors = {
    val __obj = js.Dynamic.literal(productDark = productDark.asInstanceOf[js.Any], productLight = productLight.asInstanceOf[js.Any], productLightActive = productLightActive.asInstanceOf[js.Any], productLightHover = productLightHover.asInstanceOf[js.Any], productNormal = productNormal.asInstanceOf[js.Any], productNormalActive = productNormalActive.asInstanceOf[js.Any], productNormalHover = productNormalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemePaletteColors]
  }
  @scala.inline
  implicit class ThemePaletteColorsOps[Self <: ThemePaletteColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productDark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductLightActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productLightActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductLightHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productLightHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductNormal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductNormalActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productNormalActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductNormalHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productNormalHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProductDarkActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productDarkActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductDarkActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productDarkActive")(js.undefined)
        ret
    }
    @scala.inline
    def withProductDarkHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productDarkHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductDarkHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productDarkHover")(js.undefined)
        ret
    }
    @scala.inline
    def withProductDarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productDarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductDarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productDarker")(js.undefined)
        ret
    }
  }
  
}

