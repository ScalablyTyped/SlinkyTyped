package typingsSlinky.ejWebAll.ej.Dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionButtonClickEventArgs extends js.Object {
  
  /** Name of the event target attribute.
    */
  var buttonID: js.UndefOr[String] = js.native
  
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Name of the event current target title.
    */
  var currentTarget: js.UndefOr[String] = js.native
  
  /** Name of the event.
    */
  var event: js.UndefOr[String] = js.native
  
  /** Instance of the dialog model object.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ActionButtonClickEventArgs {
  
  @scala.inline
  def apply(): ActionButtonClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionButtonClickEventArgs]
  }
  
  @scala.inline
  implicit class ActionButtonClickEventArgsOps[Self <: ActionButtonClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setButtonID(value: String): Self = this.set("buttonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonID: Self = this.set("buttonID", js.undefined)
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCurrentTarget(value: String): Self = this.set("currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTarget: Self = this.set("currentTarget", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
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
