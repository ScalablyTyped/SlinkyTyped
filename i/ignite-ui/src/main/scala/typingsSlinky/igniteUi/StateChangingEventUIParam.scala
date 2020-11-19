package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateChangingEventUIParam extends js.Object {
  
  /**
    * Gets the name of the action. That can be one of the following: "open" - request to open the dialog. "close" - request to close the dialog. "minimize" - request to minimize the dialog. "maximize" - request to maximize the dialog. "restore" - request to restore the dialog from minimized or maximized state. "pin" - request to pin the dialog. "unpin" - request to unpin the dialog.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * Gets the name of the button, which triggered the event. Note: if the state was modified from the code, then "button" is undefined.
    */
  var button: js.UndefOr[String] = js.native
  
  /**
    * Gets the boolean value of the old pin state of the dialog.
    */
  var oldPinned: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the old state of the dialog, which can be one of the following: "opened", "minimized", "maximized", "closed".
    */
  var oldState: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the igDialog widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object StateChangingEventUIParam {
  
  @scala.inline
  def apply(): StateChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateChangingEventUIParam]
  }
  
  @scala.inline
  implicit class StateChangingEventUIParamOps[Self <: StateChangingEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setOldPinned(value: Boolean): Self = this.set("oldPinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldPinned: Self = this.set("oldPinned", js.undefined)
    
    @scala.inline
    def setOldState(value: String): Self = this.set("oldState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldState: Self = this.set("oldState", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
