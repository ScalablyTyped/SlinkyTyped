package typingsSlinky.materialUiCore.createTypographyMod

import typingsSlinky.csstype.mod.FontFamilyProperty
import typingsSlinky.csstype.mod.FontWeightProperty
import typingsSlinky.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Record<@material-ui/core.@material-ui/core/styles/createTypography.ThemeStyle, @material-ui/core.@material-ui/core/styles/createTypography.TypographyStyleOptions> & @material-ui/core.@material-ui/core/styles/createTypography.FontStyleOptions> */
@js.native
trait TypographyOptions extends js.Object {
  var allVariants: js.UndefOr[CSSProperties] = js.native
  var body1: js.UndefOr[TypographyStyleOptions] = js.native
  var body2: js.UndefOr[TypographyStyleOptions] = js.native
  var button: js.UndefOr[TypographyStyleOptions] = js.native
  var caption: js.UndefOr[TypographyStyleOptions] = js.native
  var display1: js.UndefOr[TypographyStyleOptions] = js.native
  var display2: js.UndefOr[TypographyStyleOptions] = js.native
  var display3: js.UndefOr[TypographyStyleOptions] = js.native
  var display4: js.UndefOr[TypographyStyleOptions] = js.native
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var fontWeightLight: js.UndefOr[FontWeightProperty] = js.native
  var fontWeightMedium: js.UndefOr[FontWeightProperty] = js.native
  var fontWeightRegular: js.UndefOr[FontWeightProperty] = js.native
  var h1: js.UndefOr[TypographyStyleOptions] = js.native
  var h2: js.UndefOr[TypographyStyleOptions] = js.native
  var h3: js.UndefOr[TypographyStyleOptions] = js.native
  var h4: js.UndefOr[TypographyStyleOptions] = js.native
  var h5: js.UndefOr[TypographyStyleOptions] = js.native
  var h6: js.UndefOr[TypographyStyleOptions] = js.native
  var headline: js.UndefOr[TypographyStyleOptions] = js.native
  var htmlFontSize: js.UndefOr[Double] = js.native
  var overline: js.UndefOr[TypographyStyleOptions] = js.native
  var subheading: js.UndefOr[TypographyStyleOptions] = js.native
  var subtitle1: js.UndefOr[TypographyStyleOptions] = js.native
  var subtitle2: js.UndefOr[TypographyStyleOptions] = js.native
  var title: js.UndefOr[TypographyStyleOptions] = js.native
  var useNextVariants: js.UndefOr[Boolean] = js.native
}

object TypographyOptions {
  @scala.inline
  def apply(): TypographyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyOptions]
  }
  @scala.inline
  implicit class TypographyOptionsOps[Self <: TypographyOptions] (val x: Self) extends AnyVal {
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
    def withBody1(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body1")(js.undefined)
        ret
    }
    @scala.inline
    def withBody2(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body2")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay1(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display1")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay2(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display2")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay3(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display3")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay4(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display4")(js.undefined)
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
    def withH1(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h1")(js.undefined)
        ret
    }
    @scala.inline
    def withH2(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h2")(js.undefined)
        ret
    }
    @scala.inline
    def withH3(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h3")(js.undefined)
        ret
    }
    @scala.inline
    def withH4(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h4")(js.undefined)
        ret
    }
    @scala.inline
    def withH5(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h5")(js.undefined)
        ret
    }
    @scala.inline
    def withH6(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h6")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadline(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headline")(js.undefined)
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
    def withOverline(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overline")(js.undefined)
        ret
    }
    @scala.inline
    def withSubheading(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subheading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubheading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subheading")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle1(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle1")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle2(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle2")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: TypographyStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
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

