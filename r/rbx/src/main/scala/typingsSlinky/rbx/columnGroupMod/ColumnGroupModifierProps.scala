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

@js.native
trait ColumnGroupModifierProps extends js.Object {
  var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.native
  var centered: js.UndefOr[Boolean] = js.native
  var desktop: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  var fullhd: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
  var gapless: js.UndefOr[Boolean] = js.native
  var mobile: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  var multiline: js.UndefOr[Boolean] = js.native
  var tablet: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  var touch: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  var vcentered: js.UndefOr[Boolean] = js.native
  var widescreen: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
}

object ColumnGroupModifierProps {
  @scala.inline
  def apply(): ColumnGroupModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroupModifierProps]
  }
  @scala.inline
  implicit class ColumnGroupModifierPropsOps[Self <: ColumnGroupModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakpoint(value: mobile | tablet | desktop | widescreen | fullhd | touch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(js.undefined)
        ret
    }
    @scala.inline
    def withDesktop(value: ColumnGroupBreakpointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(js.undefined)
        ret
    }
    @scala.inline
    def withFullhd(value: ColumnGroupBreakpointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullhd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullhd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullhd")(js.undefined)
        ret
    }
    @scala.inline
    def withGapSize(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGapless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGapless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapless")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: ColumnGroupBreakpointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withTablet(value: ColumnGroupBreakpointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: ColumnGroupBreakpointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.undefined)
        ret
    }
    @scala.inline
    def withVcentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcentered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVcentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcentered")(js.undefined)
        ret
    }
    @scala.inline
    def withWidescreen(value: ColumnGroupBreakpointOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widescreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidescreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widescreen")(js.undefined)
        ret
    }
  }
  
}

