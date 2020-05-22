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

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/grid/tiles/tile.TileVariablesOverrides, rbx.rbx/grid/tiles/tile.TileVariablesDefaults> */
trait TileVariables extends js.Object {
  var kinds: ancestor | parent | child
  var sizes: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`
}

object TileVariables {
  @scala.inline
  def apply(
    kinds: ancestor | parent | child,
    sizes: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`
  ): TileVariables = {
    val __obj = js.Dynamic.literal(kinds = kinds.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileVariables]
  }
}

