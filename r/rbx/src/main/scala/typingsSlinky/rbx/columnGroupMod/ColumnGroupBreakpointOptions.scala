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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupBreakpointOptions extends js.Object {
  var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
}

object ColumnGroupBreakpointOptions {
  @scala.inline
  def apply(gapSize: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` = null): ColumnGroupBreakpointOptions = {
    val __obj = js.Dynamic.literal()
    if (gapSize != null) __obj.updateDynamic("gapSize")(gapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupBreakpointOptions]
  }
}

