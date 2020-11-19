package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WxGetSavedFileListSuccessCallbackResult extends js.Object {
  
  /** 文件数组，每一项是一个 FileItem */
  var fileList: WxGetSavedFileListSuccessCallbackResultFileItem = js.native
}
object WxGetSavedFileListSuccessCallbackResult {
  
  @scala.inline
  def apply(fileList: WxGetSavedFileListSuccessCallbackResultFileItem): WxGetSavedFileListSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxGetSavedFileListSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class WxGetSavedFileListSuccessCallbackResultOps[Self <: WxGetSavedFileListSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setFileList(value: WxGetSavedFileListSuccessCallbackResultFileItem): Self = this.set("fileList", value.asInstanceOf[js.Any])
  }
}
