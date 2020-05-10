package typingsSlinky.materialUiCore.createTypographyMod

import typingsSlinky.csstype.mod.FontFamilyProperty
import typingsSlinky.csstype.mod.FontWeightProperty
import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.FontStyle> */
@js.native
trait FontStyleOptions extends js.Object {
  var allVariants: js.UndefOr[CSSProperties] = js.native
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontWeightLight: js.UndefOr[FontWeightProperty] = js.native
  var fontWeightMedium: js.UndefOr[FontWeightProperty] = js.native
  var fontWeightRegular: js.UndefOr[FontWeightProperty] = js.native
  var htmlFontSize: js.UndefOr[Double] = js.native
  var useNextVariants: js.UndefOr[Boolean] = js.native
}

object FontStyleOptions {
  @scala.inline
  def apply(): FontStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyleOptions]
  }
  @scala.inline
  implicit class FontStyleOptionsOps[Self <: FontStyleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllVariants(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allVariants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllVariants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allVariants")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: FontFamilyProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeightLight(value: FontWeightProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeightLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightLight")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeightMedium(value: FontWeightProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightMedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeightMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightMedium")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeightRegular(value: FontWeightProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightRegular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeightRegular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightRegular")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNextVariants(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNextVariants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNextVariants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNextVariants")(js.undefined)
        ret
    }
  }
  
}

