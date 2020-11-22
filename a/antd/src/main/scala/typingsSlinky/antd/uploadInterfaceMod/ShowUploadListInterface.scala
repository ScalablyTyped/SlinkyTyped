package typingsSlinky.antd.uploadInterfaceMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowUploadListInterface extends js.Object {
  
  var downloadIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[_], ReactElement])] = js.native
  
  var removeIcon: js.UndefOr[ReactElement | (js.Function1[/* file */ UploadFile[_], ReactElement])] = js.native
  
  var showDownloadIcon: js.UndefOr[Boolean] = js.native
  
  var showPreviewIcon: js.UndefOr[Boolean] = js.native
  
  var showRemoveIcon: js.UndefOr[Boolean] = js.native
}
object ShowUploadListInterface {
  
  @scala.inline
  def apply(): ShowUploadListInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowUploadListInterface]
  }
  
  @scala.inline
  implicit class ShowUploadListInterfaceOps[Self <: ShowUploadListInterface] (val x: Self) extends AnyVal {
    
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
    def setDownloadIconReactElement(value: ReactElement): Self = this.set("downloadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadIconFunction1(value: /* file */ UploadFile[_] => ReactElement): Self = this.set("downloadIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDownloadIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[_], ReactElement])): Self = this.set("downloadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadIcon: Self = this.set("downloadIcon", js.undefined)
    
    @scala.inline
    def setRemoveIconReactElement(value: ReactElement): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveIconFunction1(value: /* file */ UploadFile[_] => ReactElement): Self = this.set("removeIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveIcon(value: ReactElement | (js.Function1[/* file */ UploadFile[_], ReactElement])): Self = this.set("removeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveIcon: Self = this.set("removeIcon", js.undefined)
    
    @scala.inline
    def setShowDownloadIcon(value: Boolean): Self = this.set("showDownloadIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDownloadIcon: Self = this.set("showDownloadIcon", js.undefined)
    
    @scala.inline
    def setShowPreviewIcon(value: Boolean): Self = this.set("showPreviewIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPreviewIcon: Self = this.set("showPreviewIcon", js.undefined)
    
    @scala.inline
    def setShowRemoveIcon(value: Boolean): Self = this.set("showRemoveIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRemoveIcon: Self = this.set("showRemoveIcon", js.undefined)
  }
}
