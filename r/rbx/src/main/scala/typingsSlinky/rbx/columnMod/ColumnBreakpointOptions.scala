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

trait ColumnBreakpointOptions extends js.Object {
  var narrow: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.undefined
  var size: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.undefined
}

object ColumnBreakpointOptions {
  @scala.inline
  def apply(
    narrow: js.UndefOr[Boolean] = js.undefined,
    offset: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full = null,
    size: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full = null
  ): ColumnBreakpointOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(narrow)) __obj.updateDynamic("narrow")(narrow.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnBreakpointOptions]
  }
}

