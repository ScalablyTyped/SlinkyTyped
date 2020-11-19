package typingsSlinky.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGossipBatchResponse extends js.Object {
  
  /** GossipBatchResponse content */
  var content: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}
object IGossipBatchResponse {
  
  @scala.inline
  def apply(): IGossipBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGossipBatchResponse]
  }
  
  @scala.inline
  implicit class IGossipBatchResponseOps[Self <: IGossipBatchResponse] (val x: Self) extends AnyVal {
    
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
    def setContent(value: js.typedarray.Uint8Array): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
  }
}
