package typingsSlinky.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.Base> */
@js.native
trait CustomBase extends js.Object {
  var borderRadius: js.UndefOr[String] = js.native
  var boxShadowActionable: js.UndefOr[String] = js.native
  var boxShadowColorActionable: js.UndefOr[String] = js.native
  var boxShadowColorElevated: js.UndefOr[String] = js.native
  var boxShadowColorModal: js.UndefOr[String] = js.native
  var boxShadowColorStatic: js.UndefOr[String] = js.native
  var boxShadowElevated: js.UndefOr[String] = js.native
  var boxShadowModal: js.UndefOr[String] = js.native
  var boxShadowStatic: js.UndefOr[String] = js.native
  var durationFast: js.UndefOr[String] = js.native
  var durationNormal: js.UndefOr[String] = js.native
  var durationSlow: js.UndefOr[String] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSizeLg: js.UndefOr[String] = js.native
  var fontSizeMd: js.UndefOr[String] = js.native
  var fontSizeSm: js.UndefOr[String] = js.native
  var fontWeightBold: js.UndefOr[String] = js.native
  var fontWeightMedium: js.UndefOr[String] = js.native
  var fontWeightNormal: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[String] = js.native
  var opacityLarge: js.UndefOr[String] = js.native
  var opacityMedium: js.UndefOr[String] = js.native
  var opacitySmall: js.UndefOr[String] = js.native
  var size2xl: js.UndefOr[String] = js.native
  var sizeLg: js.UndefOr[String] = js.native
  var sizeMd: js.UndefOr[String] = js.native
  var sizeSm: js.UndefOr[String] = js.native
  var sizeXl: js.UndefOr[String] = js.native
  var space2xl: js.UndefOr[String] = js.native
  var space2xs: js.UndefOr[String] = js.native
  var space3xl: js.UndefOr[String] = js.native
  var spaceLg: js.UndefOr[String] = js.native
  var spaceMd: js.UndefOr[String] = js.native
  var spaceSm: js.UndefOr[String] = js.native
  var spaceXl: js.UndefOr[String] = js.native
  var spaceXs: js.UndefOr[String] = js.native
  var transitionDefault: js.UndefOr[String] = js.native
}

object CustomBase {
  @scala.inline
  def apply(): CustomBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomBase]
  }
  @scala.inline
  implicit class CustomBaseOps[Self <: CustomBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderRadius(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxShadowActionable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowActionable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxShadowActionable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowActionable")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxShadowColorActionable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowColorActionable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxShadowColorActionable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowColorActionable")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxShadowColorElevated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowColorElevated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxShadowColorElevated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowColorElevated")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxShadowColorModal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowColorModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxShadowColorModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowColorModal")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxShadowColorStatic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowColorStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxShadowColorStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowColorStatic")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxShadowElevated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowElevated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxShadowElevated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowElevated")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxShadowModal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowModal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxShadowModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowModal")(js.undefined)
        ret
    }
    @scala.inline
    def withBoxShadowStatic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxShadowStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxShadowStatic")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationFast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationFast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationFast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationFast")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationNormal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationNormal")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationSlow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationSlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationSlow")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
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
    def withFontSizeLg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeLg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizeLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeLg")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizeMd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeMd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizeMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeMd")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizeSm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeSm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizeSm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeSm")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeightBold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightBold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeightBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightBold")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeightMedium(value: String): Self = {
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
    def withFontWeightNormal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeightNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeightNormal")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacityLarge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacityLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacityLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacityLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacityMedium(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacityMedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacityMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacityMedium")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacitySmall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacitySmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacitySmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacitySmall")(js.undefined)
        ret
    }
    @scala.inline
    def withSize2xl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size2xl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize2xl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size2xl")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeLg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLg")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeMd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMd")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeSm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeSm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSm")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeXl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeXl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeXl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeXl")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace2xl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space2xl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace2xl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space2xl")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace2xs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space2xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace2xs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space2xs")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace3xl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space3xl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace3xl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space3xl")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceLg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceLg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceLg")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceMd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceMd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceMd")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceSm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceSm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceSm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceSm")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceXl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceXl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceXl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceXl")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceXs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceXs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceXs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceXs")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDefault")(js.undefined)
        ret
    }
  }
  
}

