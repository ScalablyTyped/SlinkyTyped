package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadTaskOnHeadersReceivedCallbackResult extends js.Object {
  
  /** 开发者服务器返回的 HTTP Response Header */
  var header: js.Object = js.native
}
object UploadTaskOnHeadersReceivedCallbackResult {
  
  @scala.inline
  def apply(header: js.Object): UploadTaskOnHeadersReceivedCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTaskOnHeadersReceivedCallbackResult]
  }
  
  @scala.inline
  implicit class UploadTaskOnHeadersReceivedCallbackResultOps[Self <: UploadTaskOnHeadersReceivedCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
  }
}
