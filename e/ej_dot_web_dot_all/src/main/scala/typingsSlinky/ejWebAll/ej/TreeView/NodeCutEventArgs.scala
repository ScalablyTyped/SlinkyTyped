package typingsSlinky.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeCutEventArgs extends js.Object {
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.native
  
  /** returns the key pressed key code value
    */
  var keyCode: js.UndefOr[Double] = js.native
  
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the given parent node details
    */
  var parentDetails: js.UndefOr[js.Any] = js.native
  
  /** returns the current parent element of the cut node
    */
  var parentElement: js.UndefOr[js.Any] = js.native
  
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object NodeCutEventArgs {
  
  @scala.inline
  def apply(): NodeCutEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCutEventArgs]
  }
  
  @scala.inline
  implicit class NodeCutEventArgsOps[Self <: NodeCutEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyCode: Self = this.set("keyCode", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setParentDetails(value: js.Any): Self = this.set("parentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentDetails: Self = this.set("parentDetails", js.undefined)
    
    @scala.inline
    def setParentElement(value: js.Any): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentElement: Self = this.set("parentElement", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
