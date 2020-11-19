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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroupVariablesDefaults extends js.Object {
  
  var gapSizes: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` = js.native
}
object ColumnGroupVariablesDefaults {
  
  @scala.inline
  def apply(gapSizes: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): ColumnGroupVariablesDefaults = {
    val __obj = js.Dynamic.literal(gapSizes = gapSizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupVariablesDefaults]
  }
  
  @scala.inline
  implicit class ColumnGroupVariablesDefaultsOps[Self <: ColumnGroupVariablesDefaults] (val x: Self) extends AnyVal {
    
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
    def setGapSizes(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = this.set("gapSizes", value.asInstanceOf[js.Any])
  }
}
