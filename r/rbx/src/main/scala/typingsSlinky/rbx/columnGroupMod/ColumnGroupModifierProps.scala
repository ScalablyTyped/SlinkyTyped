package typingsSlinky.rbx.columnGroupMod

import typingsSlinky.rbx.rbxNumbers.`0`
import typingsSlinky.rbx.rbxNumbers.`1`
import typingsSlinky.rbx.rbxNumbers.`2`
import typingsSlinky.rbx.rbxNumbers.`3`
import typingsSlinky.rbx.rbxNumbers.`4`
import typingsSlinky.rbx.rbxNumbers.`5`
import typingsSlinky.rbx.rbxNumbers.`6`
import typingsSlinky.rbx.rbxNumbers.`7`
import typingsSlinky.rbx.rbxNumbers.`8`
import typingsSlinky.rbx.rbxStrings.desktop
import typingsSlinky.rbx.rbxStrings.fullhd
import typingsSlinky.rbx.rbxStrings.mobile
import typingsSlinky.rbx.rbxStrings.tablet
import typingsSlinky.rbx.rbxStrings.touch
import typingsSlinky.rbx.rbxStrings.widescreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupModifierProps extends js.Object {
  var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.undefined
  var centered: js.UndefOr[Boolean] = js.undefined
  var desktop: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  var fullhd: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  var gapless: js.UndefOr[Boolean] = js.undefined
  var mobile: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
  var tablet: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  var touch: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  var vcentered: js.UndefOr[Boolean] = js.undefined
  var widescreen: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
}

object ColumnGroupModifierProps {
  @scala.inline
  def apply(
    breakpoint: mobile | tablet | desktop | widescreen | fullhd | touch = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    desktop: ColumnGroupBreakpointOptions = null,
    fullhd: ColumnGroupBreakpointOptions = null,
    gapSize: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` = null,
    gapless: js.UndefOr[Boolean] = js.undefined,
    mobile: ColumnGroupBreakpointOptions = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    tablet: ColumnGroupBreakpointOptions = null,
    touch: ColumnGroupBreakpointOptions = null,
    vcentered: js.UndefOr[Boolean] = js.undefined,
    widescreen: ColumnGroupBreakpointOptions = null
  ): ColumnGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (fullhd != null) __obj.updateDynamic("fullhd")(fullhd.asInstanceOf[js.Any])
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    if (!js.isUndefined(gapless)) __obj.updateDynamic("gapless")(gapless.get.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.get.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (!js.isUndefined(vcentered)) __obj.updateDynamic("vcentered")(vcentered.get.asInstanceOf[js.Any])
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupModifierProps]
  }
}

