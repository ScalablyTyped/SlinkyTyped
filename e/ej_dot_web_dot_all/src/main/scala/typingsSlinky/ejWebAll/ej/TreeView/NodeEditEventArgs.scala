package typingsSlinky.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeEditEventArgs extends js.Object {
  
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.native
  
  /** returns the id of the element
    */
  var id: js.UndefOr[String] = js.native
  
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the newText of the element
    */
  var newText: js.UndefOr[String] = js.native
  
  /** returns the given target node values
    */
  var nodeDetails: js.UndefOr[js.Any] = js.native
  
  /** returns the oldText of the element
    */
  var oldText: js.UndefOr[String] = js.native
  
  /** returns the target element, the given node to be cut
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object NodeEditEventArgs {
  
  @scala.inline
  def apply(): NodeEditEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeEditEventArgs]
  }
  
  @scala.inline
  implicit class NodeEditEventArgsOps[Self <: NodeEditEventArgs] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNewText(value: String): Self = this.set("newText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewText: Self = this.set("newText", js.undefined)
    
    @scala.inline
    def setNodeDetails(value: js.Any): Self = this.set("nodeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeDetails: Self = this.set("nodeDetails", js.undefined)
    
    @scala.inline
    def setOldText(value: String): Self = this.set("oldText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldText: Self = this.set("oldText", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
