package typingsSlinky.rbx.contentContentMod

import typingsSlinky.rbx.anon.BinVariablesbreakpointsLi
import typingsSlinky.rbx.anon.KinVariablesbreakpointsto
import typingsSlinky.rbx.rbxNumbers.`1`
import typingsSlinky.rbx.rbxNumbers.`2`
import typingsSlinky.rbx.rbxNumbers.`3`
import typingsSlinky.rbx.rbxNumbers.`4`
import typingsSlinky.rbx.rbxNumbers.`5`
import typingsSlinky.rbx.rbxNumbers.`6`
import typingsSlinky.rbx.rbxNumbers.`7`
import typingsSlinky.rbx.rbxStrings.`black-bis`
import typingsSlinky.rbx.rbxStrings.`black-ter`
import typingsSlinky.rbx.rbxStrings.`grey-dark`
import typingsSlinky.rbx.rbxStrings.`grey-darker`
import typingsSlinky.rbx.rbxStrings.`grey-light`
import typingsSlinky.rbx.rbxStrings.`grey-lighter`
import typingsSlinky.rbx.rbxStrings.`white-bis`
import typingsSlinky.rbx.rbxStrings.`white-ter`
import typingsSlinky.rbx.rbxStrings.black
import typingsSlinky.rbx.rbxStrings.bold
import typingsSlinky.rbx.rbxStrings.bottom
import typingsSlinky.rbx.rbxStrings.capitalized
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.danger
import typingsSlinky.rbx.rbxStrings.dark
import typingsSlinky.rbx.rbxStrings.grey
import typingsSlinky.rbx.rbxStrings.info
import typingsSlinky.rbx.rbxStrings.justified
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.light
import typingsSlinky.rbx.rbxStrings.link
import typingsSlinky.rbx.rbxStrings.lowercase
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.normal
import typingsSlinky.rbx.rbxStrings.primary
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.semibold
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.success
import typingsSlinky.rbx.rbxStrings.top
import typingsSlinky.rbx.rbxStrings.uppercase
import typingsSlinky.rbx.rbxStrings.warning
import typingsSlinky.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/base/helpers.HelpersProps & rbx.rbx/elements/content/content.ContentModifierProps */
@js.native
trait ContentProps extends js.Object {
  var backgroundColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
  ] = js.native
  var badge: js.UndefOr[Double | String] = js.native
  var badgeColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  var badgeOutlined: js.UndefOr[Boolean] = js.native
  var badgeRounded: js.UndefOr[Boolean] = js.native
  var badgeSize: js.UndefOr[small | medium | large] = js.native
  var className: js.UndefOr[String] = js.native
  var clearfix: js.UndefOr[Boolean] = js.native
  var clipped: js.UndefOr[Boolean] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var invisible: js.UndefOr[Boolean] = js.native
  var italic: js.UndefOr[Boolean] = js.native
  var marginless: js.UndefOr[Boolean] = js.native
  var overlay: js.UndefOr[Boolean] = js.native
  var paddingless: js.UndefOr[Boolean] = js.native
  var pull: js.UndefOr[left | right] = js.native
  var radiusless: js.UndefOr[Boolean] = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.native
  var shadowless: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[small | medium | large] = js.native
  var srOnly: js.UndefOr[Boolean] = js.native
  var textAlign: js.UndefOr[centered | justified | left | right] = js.native
  var textColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
  ] = js.native
  var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
  var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.native
  var textWeight: js.UndefOr[light | medium | normal | semibold | bold] = js.native
  var tooltip: js.UndefOr[Double | String] = js.native
  var tooltipActive: js.UndefOr[Boolean] = js.native
  var tooltipColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  var tooltipMultiline: js.UndefOr[Boolean] = js.native
  var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.native
  var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsto] = js.native
  var unselectable: js.UndefOr[Boolean] = js.native
}

object ContentProps {
  @scala.inline
  def apply(): ContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentProps]
  }
  @scala.inline
  implicit class ContentPropsOps[Self <: ContentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(
      value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeOutlined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeOutlined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeOutlined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeOutlined")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeRounded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeRounded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeRounded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeRounded")(js.undefined)
        ret
    }
    @scala.inline
    def withBadgeSize(value: small | medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadgeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badgeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClearfix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearfix")(js.undefined)
        ret
    }
    @scala.inline
    def withClipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipped")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withInvisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invisible")(js.undefined)
        ret
    }
    @scala.inline
    def withItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItalic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(js.undefined)
        ret
    }
    @scala.inline
    def withMarginless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarginless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginless")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingless")(js.undefined)
        ret
    }
    @scala.inline
    def withPull(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.undefined)
        ret
    }
    @scala.inline
    def withRadiusless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusless")(js.undefined)
        ret
    }
    @scala.inline
    def withRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: BinVariablesbreakpointsLi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowless")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: small | medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSrOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: centered | justified | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(
      value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTransform(value: capitalized | lowercase | uppercase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withTextWeight(value: light | medium | normal | semibold | bold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipActive")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipMultiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipMultiline")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipPosition(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipResponsive(value: KinVariablesbreakpointsto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(js.undefined)
        ret
    }
  }
  
}

