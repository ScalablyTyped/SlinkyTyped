package typingsSlinky.awsSdk.apigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostToConnectionRequest extends js.Object {
  /**
    * The identifier of the connection that a specific client is using.
    */
  var ConnectionId: string = js.native
  /**
    * The data to be sent to the client specified by its connection id.
    */
  var Data: typingsSlinky.awsSdk.apigatewaymanagementapiMod.Data = js.native
}

object PostToConnectionRequest {
  @scala.inline
  def apply(ConnectionId: string, Data: Data): PostToConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionId = ConnectionId.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostToConnectionRequest]
  }
  @scala.inline
  implicit class PostToConnectionRequestOps[Self <: PostToConnectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

