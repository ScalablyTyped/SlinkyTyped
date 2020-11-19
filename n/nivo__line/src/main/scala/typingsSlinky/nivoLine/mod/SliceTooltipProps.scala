package typingsSlinky.nivoLine.mod

import typingsSlinky.nivoLine.anon.Height
import typingsSlinky.nivoLine.nivoLineStrings.x
import typingsSlinky.nivoLine.nivoLineStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliceTooltipProps extends js.Object {
  
  var axis: x | y = js.native
  
  var slice: Height = js.native
}
object SliceTooltipProps {
  
  @scala.inline
  def apply(axis: x | y, slice: Height): SliceTooltipProps = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceTooltipProps]
  }
  
  @scala.inline
  implicit class SliceTooltipPropsOps[Self <: SliceTooltipProps] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: typingsSlinky.nivoLine.nivoLineStrings.x | y): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlice(value: Height): Self = this.set("slice", value.asInstanceOf[js.Any])
  }
}
