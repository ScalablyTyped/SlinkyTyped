package typingsSlinky.rbx.columnMod

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
import typingsSlinky.rbx.rbxStrings.`four-fifths`
import typingsSlinky.rbx.rbxStrings.`one-fifth`
import typingsSlinky.rbx.rbxStrings.`one-quarter`
import typingsSlinky.rbx.rbxStrings.`one-third`
import typingsSlinky.rbx.rbxStrings.`three-fifths`
import typingsSlinky.rbx.rbxStrings.`three-quarters`
import typingsSlinky.rbx.rbxStrings.`two-fifths`
import typingsSlinky.rbx.rbxStrings.`two-thirds`
import typingsSlinky.rbx.rbxStrings.full
import typingsSlinky.rbx.rbxStrings.half
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnModifierProps extends js.Object {
  var desktop: js.UndefOr[ColumnBreakpointOptions] = js.native
  var fullhd: js.UndefOr[ColumnBreakpointOptions] = js.native
  var mobile: js.UndefOr[ColumnBreakpointOptions] = js.native
  var narrow: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.native
  var size: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.native
  var tablet: js.UndefOr[ColumnBreakpointOptions] = js.native
  var touch: js.UndefOr[ColumnBreakpointOptions] = js.native
  var widescreen: js.UndefOr[ColumnBreakpointOptions] = js.native
}

object ColumnModifierProps {
  @scala.inline
  def apply(): ColumnModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnModifierProps]
  }
  @scala.inline
  implicit class ColumnModifierPropsOps[Self <: ColumnModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesktop(value: ColumnBreakpointOptions): Self = {
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
    def withFullhd(value: ColumnBreakpointOptions): Self = {
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
    def withMobile(value: ColumnBreakpointOptions): Self = {
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
    def withNarrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNarrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("narrow")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
    ): Self = {
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
    def withTablet(value: ColumnBreakpointOptions): Self = {
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
    def withTouch(value: ColumnBreakpointOptions): Self = {
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
    def withWidescreen(value: ColumnBreakpointOptions): Self = {
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

