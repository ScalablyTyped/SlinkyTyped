package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadSuccessEvent extends UploadEvent {
  
  var XMLHttpRequest: js.UndefOr[js.Any] = js.native
  
  var files: js.UndefOr[js.Array[_]] = js.native
  
  var operation: js.UndefOr[String] = js.native
  
  var response: js.UndefOr[js.Any] = js.native
}
object UploadSuccessEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Upload): UploadSuccessEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSuccessEvent]
  }
  
  @scala.inline
  implicit class UploadSuccessEventOps[Self <: UploadSuccessEvent] (val x: Self) extends AnyVal {
    
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
    def setXMLHttpRequest(value: js.Any): Self = this.set("XMLHttpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXMLHttpRequest: Self = this.set("XMLHttpRequest", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: js.Any*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[_]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    
    @scala.inline
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
}
