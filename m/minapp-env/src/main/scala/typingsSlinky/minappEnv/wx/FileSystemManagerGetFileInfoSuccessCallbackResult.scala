package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemManagerGetFileInfoSuccessCallbackResult extends js.Object {
  
  /** 文件大小，以字节为单位 */
  var size: Double = js.native
}
object FileSystemManagerGetFileInfoSuccessCallbackResult {
  
  @scala.inline
  def apply(size: Double): FileSystemManagerGetFileInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerGetFileInfoSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class FileSystemManagerGetFileInfoSuccessCallbackResultOps[Self <: FileSystemManagerGetFileInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
