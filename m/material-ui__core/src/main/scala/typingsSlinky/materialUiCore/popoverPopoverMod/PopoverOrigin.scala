package typingsSlinky.materialUiCore.popoverPopoverMod

import typingsSlinky.materialUiCore.materialUiCoreStrings.bottom
import typingsSlinky.materialUiCore.materialUiCoreStrings.center
import typingsSlinky.materialUiCore.materialUiCoreStrings.left
import typingsSlinky.materialUiCore.materialUiCoreStrings.right
import typingsSlinky.materialUiCore.materialUiCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverOrigin extends js.Object {
  
  var horizontal: left | center | right | Double = js.native
  
  var vertical: top | center | bottom | Double = js.native
}
object PopoverOrigin {
  
  @scala.inline
  def apply(horizontal: left | center | right | Double, vertical: top | center | bottom | Double): PopoverOrigin = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverOrigin]
  }
  
  @scala.inline
  implicit class PopoverOriginOps[Self <: PopoverOrigin] (val x: Self) extends AnyVal {
    
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
    def setHorizontal(value: left | center | right | Double): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: top | center | bottom | Double): Self = this.set("vertical", value.asInstanceOf[js.Any])
  }
}
