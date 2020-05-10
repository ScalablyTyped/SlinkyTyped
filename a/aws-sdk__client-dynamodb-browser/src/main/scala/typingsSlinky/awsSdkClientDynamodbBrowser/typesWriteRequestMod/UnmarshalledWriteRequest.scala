package typingsSlinky.awsSdkClientDynamodbBrowser.typesWriteRequestMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteRequestMod.UnmarshalledDeleteRequest
import typingsSlinky.awsSdkClientDynamodbBrowser.typesPutRequestMod.UnmarshalledPutRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledWriteRequest extends WriteRequest {
  /**
    * <p>A request to perform a <code>DeleteItem</code> operation.</p>
    */
  @JSName("DeleteRequest")
  var DeleteRequest_UnmarshalledWriteRequest: js.UndefOr[UnmarshalledDeleteRequest] = js.native
  /**
    * <p>A request to perform a <code>PutItem</code> operation.</p>
    */
  @JSName("PutRequest")
  var PutRequest_UnmarshalledWriteRequest: js.UndefOr[UnmarshalledPutRequest] = js.native
}

object UnmarshalledWriteRequest {
  @scala.inline
  def apply(): UnmarshalledWriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledWriteRequest]
  }
  @scala.inline
  implicit class UnmarshalledWriteRequestOps[Self <: UnmarshalledWriteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteRequest(value: UnmarshalledDeleteRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withPutRequest(value: UnmarshalledPutRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PutRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PutRequest")(js.undefined)
        ret
    }
  }
  
}

