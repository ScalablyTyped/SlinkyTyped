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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnBreakpointOptions extends js.Object {
  
  var narrow: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.native
  
  var size: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.native
}
object ColumnBreakpointOptions {
  
  @scala.inline
  def apply(): ColumnBreakpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnBreakpointOptions]
  }
  
  @scala.inline
  implicit class ColumnBreakpointOptionsOps[Self <: ColumnBreakpointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNarrow(value: Boolean): Self = this.set("narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNarrow: Self = this.set("narrow", js.undefined)
    
    @scala.inline
    def setOffset(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
    ): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setSize(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
    ): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
