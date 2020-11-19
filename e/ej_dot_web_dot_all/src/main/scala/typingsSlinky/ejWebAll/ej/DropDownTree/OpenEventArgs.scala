package typingsSlinky.ejWebAll.ej.DropDownTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenEventArgs extends js.Object {
  
  /** If the event has to be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** DropDownTreeView model.
    */
  var model: js.UndefOr[js.Any] = js.native
  
  /** Selected item's text.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Event name
    */
  var `type`: js.UndefOr[String] = js.native
  
  /** Selected item's value.
    */
  var value: js.UndefOr[String] = js.native
}
object OpenEventArgs {
  
  @scala.inline
  def apply(): OpenEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenEventArgs]
  }
  
  @scala.inline
  implicit class OpenEventArgsOps[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
    
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
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
