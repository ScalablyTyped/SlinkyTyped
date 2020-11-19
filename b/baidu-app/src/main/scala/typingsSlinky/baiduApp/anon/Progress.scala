package typingsSlinky.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Progress extends js.Object {
  
  /** 上传进度百分比 */
  var progress: Double = js.native
  
  /** 预期需要上传的数据总长度，单位 Bytes */
  var totalBytesExpectedToSend: Double = js.native
  
  /** 已经上传的数据长度，单位 Bytes */
  var totalBytesSent: Double = js.native
}
object Progress {
  
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToSend: Double, totalBytesSent: Double): Progress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], totalBytesExpectedToSend = totalBytesExpectedToSend.asInstanceOf[js.Any], totalBytesSent = totalBytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
    
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
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesExpectedToSend(value: Double): Self = this.set("totalBytesExpectedToSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesSent(value: Double): Self = this.set("totalBytesSent", value.asInstanceOf[js.Any])
  }
}
