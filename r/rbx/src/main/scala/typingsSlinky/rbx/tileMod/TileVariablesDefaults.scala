package typingsSlinky.rbx.tileMod

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
import typingsSlinky.rbx.rbxStrings.ancestor
import typingsSlinky.rbx.rbxStrings.child
import typingsSlinky.rbx.rbxStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileVariablesDefaults extends js.Object {
  var kinds: ancestor | parent | child = js.native
  var sizes: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` = js.native
}

object TileVariablesDefaults {
  @scala.inline
  def apply(
    kinds: ancestor | parent | child,
    sizes: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`
  ): TileVariablesDefaults = {
    val __obj = js.Dynamic.literal(kinds = kinds.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileVariablesDefaults]
  }
  @scala.inline
  implicit class TileVariablesDefaultsOps[Self <: TileVariablesDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKinds(value: ancestor | parent | child): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kinds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizes(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

