package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jqueryui.JQuery
import typingsSlinky.jqueryui.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Draggable //////////////////////////////////////////////////
@js.native
trait DraggableEventUIParams extends js.Object {
  
  var helper: JQuery = js.native
  
  var offset: Left = js.native
  
  var position: Left = js.native
}
object DraggableEventUIParams {
  
  @scala.inline
  def apply(helper: JQuery, offset: Left, position: Left): DraggableEventUIParams = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableEventUIParams]
  }
  
  @scala.inline
  implicit class DraggableEventUIParamsOps[Self <: DraggableEventUIParams] (val x: Self) extends AnyVal {
    
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
    def setHelper(value: JQuery): Self = this.set("helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Left): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Left): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
