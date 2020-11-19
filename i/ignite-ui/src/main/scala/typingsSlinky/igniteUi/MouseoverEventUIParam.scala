package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseoverEventUIParam extends js.Object {
  
  /**
    * Gets a reference to the editor input field.
    */
  var editorInput: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the event target.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the event object of the browser.
    */
  var originalEvent: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object MouseoverEventUIParam {
  
  @scala.inline
  def apply(): MouseoverEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseoverEventUIParam]
  }
  
  @scala.inline
  implicit class MouseoverEventUIParamOps[Self <: MouseoverEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setEditorInput(value: js.Any): Self = this.set("editorInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorInput: Self = this.set("editorInput", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
}
