package typingsSlinky.ejWebAll.ej.Dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeCloseEventArgs extends js.Object {
  
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Current event object.
    */
  var event: js.UndefOr[js.Any] = js.native
  
  /** returns true when the dialog activated by user interaction otherwise returns false
    */
  var isInteraction: js.UndefOr[Boolean] = js.native
  
  /** Instance of the dialog model object.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object BeforeCloseEventArgs {
  
  @scala.inline
  def apply(): BeforeCloseEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeCloseEventArgs]
  }
  
  @scala.inline
  implicit class BeforeCloseEventArgsOps[Self <: BeforeCloseEventArgs] (val x: Self) extends AnyVal {
    
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
    def setIsInteraction(value: Boolean): Self = this.set("isInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInteraction: Self = this.set("isInteraction", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
