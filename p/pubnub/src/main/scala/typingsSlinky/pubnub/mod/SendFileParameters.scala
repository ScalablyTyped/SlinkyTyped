package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendFileParameters extends js.Object {
  
  var channel: String = js.native
  
  var cipherKey: js.UndefOr[String] = js.native
  
  var file: StreamFileInput | BufferFileInput | UriFileInput = js.native
  
  var message: js.UndefOr[js.Any] = js.native
  
  var meta: js.UndefOr[js.Any] = js.native
  
  var storeInHistory: js.UndefOr[Boolean] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
}
object SendFileParameters {
  
  @scala.inline
  def apply(channel: String, file: StreamFileInput | BufferFileInput | UriFileInput): SendFileParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendFileParameters]
  }
  
  @scala.inline
  implicit class SendFileParametersOps[Self <: SendFileParameters] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: StreamFileInput | BufferFileInput | UriFileInput): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherKey(value: String): Self = this.set("cipherKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCipherKey: Self = this.set("cipherKey", js.undefined)
    
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setStoreInHistory(value: Boolean): Self = this.set("storeInHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreInHistory: Self = this.set("storeInHistory", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
