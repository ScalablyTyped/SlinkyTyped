package typingsSlinky.rbx.columnMod

import typingsSlinky.rbx.anon.BinVariablesbreakpointsLi
import typingsSlinky.rbx.anon.KinVariablesbreakpointsto
import typingsSlinky.rbx.rbxNumbers.`0`
import typingsSlinky.rbx.rbxNumbers.`10`
import typingsSlinky.rbx.rbxNumbers.`11`
import typingsSlinky.rbx.rbxNumbers.`12`
import typingsSlinky.rbx.rbxNumbers.`1`
import typingsSlinky.rbx.rbxNumbers.`2`
import typingsSlinky.rbx.rbxNumbers.`3`
import typingsSlinky.rbx.rbxNumbers.`4`
import typingsSlinky.rbx.rbxNumbers.`5`
import typingsSlinky.rbx.rbxNumbers.`6`
import typingsSlinky.rbx.rbxNumbers.`7`
import typingsSlinky.rbx.rbxNumbers.`8`
import typingsSlinky.rbx.rbxNumbers.`9`
import typingsSlinky.rbx.rbxStrings.`black-bis`
import typingsSlinky.rbx.rbxStrings.`black-ter`
import typingsSlinky.rbx.rbxStrings.`four-fifths`
import typingsSlinky.rbx.rbxStrings.`grey-dark`
import typingsSlinky.rbx.rbxStrings.`grey-darker`
import typingsSlinky.rbx.rbxStrings.`grey-light`
import typingsSlinky.rbx.rbxStrings.`grey-lighter`
import typingsSlinky.rbx.rbxStrings.`one-fifth`
import typingsSlinky.rbx.rbxStrings.`one-quarter`
import typingsSlinky.rbx.rbxStrings.`one-third`
import typingsSlinky.rbx.rbxStrings.`three-fifths`
import typingsSlinky.rbx.rbxStrings.`three-quarters`
import typingsSlinky.rbx.rbxStrings.`two-fifths`
import typingsSlinky.rbx.rbxStrings.`two-thirds`
import typingsSlinky.rbx.rbxStrings.`white-bis`
import typingsSlinky.rbx.rbxStrings.`white-ter`
import typingsSlinky.rbx.rbxStrings.black
import typingsSlinky.rbx.rbxStrings.bold
import typingsSlinky.rbx.rbxStrings.bottom
import typingsSlinky.rbx.rbxStrings.capitalized
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.danger
import typingsSlinky.rbx.rbxStrings.dark
import typingsSlinky.rbx.rbxStrings.full
import typingsSlinky.rbx.rbxStrings.grey
import typingsSlinky.rbx.rbxStrings.half
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

trait ColumnProps extends js.Object {
  var backgroundColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
  ] = js.undefined
  var badge: js.UndefOr[Double | String] = js.undefined
  var badgeColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var badgeOutlined: js.UndefOr[Boolean] = js.undefined
  var badgeRounded: js.UndefOr[Boolean] = js.undefined
  var badgeSize: js.UndefOr[small | medium | large] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearfix: js.UndefOr[Boolean] = js.undefined
  var clipped: js.UndefOr[Boolean] = js.undefined
  var desktop: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var fullhd: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var invisible: js.UndefOr[Boolean] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var marginless: js.UndefOr[Boolean] = js.undefined
  var mobile: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var narrow: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.undefined
  var overlay: js.UndefOr[Boolean] = js.undefined
  var paddingless: js.UndefOr[Boolean] = js.undefined
  var pull: js.UndefOr[left | right] = js.undefined
  var radiusless: js.UndefOr[Boolean] = js.undefined
  var relative: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.undefined
  var shadowless: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.undefined
  var srOnly: js.UndefOr[Boolean] = js.undefined
  var tablet: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var textAlign: js.UndefOr[centered | justified | left | right] = js.undefined
  var textColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
  ] = js.undefined
  var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
  var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.undefined
  var textWeight: js.UndefOr[light | medium | normal | semibold | bold] = js.undefined
  var tooltip: js.UndefOr[Double | String] = js.undefined
  var tooltipActive: js.UndefOr[Boolean] = js.undefined
  var tooltipColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var tooltipMultiline: js.UndefOr[Boolean] = js.undefined
  var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.undefined
  var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsto] = js.undefined
  var touch: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var unselectable: js.UndefOr[Boolean] = js.undefined
  var widescreen: js.UndefOr[ColumnBreakpointOptions] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply(
    backgroundColor: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis` = null,
    badge: Double | String = null,
    badgeColor: primary | success | info | warning | danger | light | dark | white | black | link = null,
    badgeOutlined: js.UndefOr[Boolean] = js.undefined,
    badgeRounded: js.UndefOr[Boolean] = js.undefined,
    badgeSize: small | medium | large = null,
    className: String = null,
    clearfix: js.UndefOr[Boolean] = js.undefined,
    clipped: js.UndefOr[Boolean] = js.undefined,
    desktop: ColumnBreakpointOptions = null,
    fullhd: ColumnBreakpointOptions = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    invisible: js.UndefOr[Boolean] = js.undefined,
    italic: js.UndefOr[Boolean] = js.undefined,
    marginless: js.UndefOr[Boolean] = js.undefined,
    mobile: ColumnBreakpointOptions = null,
    narrow: js.UndefOr[Boolean] = js.undefined,
    offset: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full = null,
    overlay: js.UndefOr[Boolean] = js.undefined,
    paddingless: js.UndefOr[Boolean] = js.undefined,
    pull: left | right = null,
    radiusless: js.UndefOr[Boolean] = js.undefined,
    relative: js.UndefOr[Boolean] = js.undefined,
    responsive: BinVariablesbreakpointsLi = null,
    shadowless: js.UndefOr[Boolean] = js.undefined,
    size: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full = null,
    srOnly: js.UndefOr[Boolean] = js.undefined,
    tablet: ColumnBreakpointOptions = null,
    textAlign: centered | justified | left | right = null,
    textColor: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis` = null,
    textSize: `1` | `2` | `3` | `4` | `5` | `6` | `7` = null,
    textTransform: capitalized | lowercase | uppercase = null,
    textWeight: light | medium | normal | semibold | bold = null,
    tooltip: Double | String = null,
    tooltipActive: js.UndefOr[Boolean] = js.undefined,
    tooltipColor: primary | success | info | warning | danger | light | dark | white | black | link = null,
    tooltipMultiline: js.UndefOr[Boolean] = js.undefined,
    tooltipPosition: top | right | bottom | left = null,
    tooltipResponsive: KinVariablesbreakpointsto = null,
    touch: ColumnBreakpointOptions = null,
    unselectable: js.UndefOr[Boolean] = js.undefined,
    widescreen: ColumnBreakpointOptions = null
  ): ColumnProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (badgeColor != null) __obj.updateDynamic("badgeColor")(badgeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(badgeOutlined)) __obj.updateDynamic("badgeOutlined")(badgeOutlined.get.asInstanceOf[js.Any])
    if (!js.isUndefined(badgeRounded)) __obj.updateDynamic("badgeRounded")(badgeRounded.get.asInstanceOf[js.Any])
    if (badgeSize != null) __obj.updateDynamic("badgeSize")(badgeSize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clearfix)) __obj.updateDynamic("clearfix")(clearfix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.get.asInstanceOf[js.Any])
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (fullhd != null) __obj.updateDynamic("fullhd")(fullhd.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginless)) __obj.updateDynamic("marginless")(marginless.get.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (!js.isUndefined(narrow)) __obj.updateDynamic("narrow")(narrow.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingless)) __obj.updateDynamic("paddingless")(paddingless.get.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusless)) __obj.updateDynamic("radiusless")(radiusless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.get.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowless)) __obj.updateDynamic("shadowless")(shadowless.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(srOnly)) __obj.updateDynamic("srOnly")(srOnly.get.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    if (textWeight != null) __obj.updateDynamic("textWeight")(textWeight.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipActive)) __obj.updateDynamic("tooltipActive")(tooltipActive.get.asInstanceOf[js.Any])
    if (tooltipColor != null) __obj.updateDynamic("tooltipColor")(tooltipColor.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipMultiline)) __obj.updateDynamic("tooltipMultiline")(tooltipMultiline.get.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition.asInstanceOf[js.Any])
    if (tooltipResponsive != null) __obj.updateDynamic("tooltipResponsive")(tooltipResponsive.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable.get.asInstanceOf[js.Any])
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
}

