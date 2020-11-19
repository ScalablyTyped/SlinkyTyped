package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerDplProcessingUpload extends js.Object {
  
  var saveField: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object PDFViewerDplProcessingUpload {
  
  @scala.inline
  def apply(): PDFViewerDplProcessingUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerDplProcessingUpload]
  }
  
  @scala.inline
  implicit class PDFViewerDplProcessingUploadOps[Self <: PDFViewerDplProcessingUpload] (val x: Self) extends AnyVal {
    
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
    def setSaveField(value: String): Self = this.set("saveField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveField: Self = this.set("saveField", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
