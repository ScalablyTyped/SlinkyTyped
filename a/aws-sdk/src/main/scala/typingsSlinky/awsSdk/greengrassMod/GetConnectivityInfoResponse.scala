package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectivityInfoResponse extends js.Object {
  
  /**
    * Connectivity info list.
    */
  var ConnectivityInfo: js.UndefOr[listOfConnectivityInfo] = js.native
  
  /**
    * A message about the connectivity info request.
    */
  var Message: js.UndefOr[string] = js.native
}
object GetConnectivityInfoResponse {
  
  @scala.inline
  def apply(): GetConnectivityInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectivityInfoResponse]
  }
  
  @scala.inline
  implicit class GetConnectivityInfoResponseOps[Self <: GetConnectivityInfoResponse] (val x: Self) extends AnyVal {
    
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
    def setConnectivityInfoVarargs(value: ConnectivityInfo*): Self = this.set("ConnectivityInfo", js.Array(value :_*))
    
    @scala.inline
    def setConnectivityInfo(value: listOfConnectivityInfo): Self = this.set("ConnectivityInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectivityInfo: Self = this.set("ConnectivityInfo", js.undefined)
    
    @scala.inline
    def setMessage(value: string): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
