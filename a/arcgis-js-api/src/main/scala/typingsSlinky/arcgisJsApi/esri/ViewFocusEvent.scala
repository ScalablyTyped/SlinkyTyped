package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewFocusEvent extends js.Object {
  
  var native: js.Any = js.native
  
  var target: View = js.native
}
object ViewFocusEvent {
  
  @scala.inline
  def apply(native: js.Any, target: View): ViewFocusEvent = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFocusEvent]
  }
  
  @scala.inline
  implicit class ViewFocusEventOps[Self <: ViewFocusEvent] (val x: Self) extends AnyVal {
    
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
    def setNative(value: js.Any): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: View): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
