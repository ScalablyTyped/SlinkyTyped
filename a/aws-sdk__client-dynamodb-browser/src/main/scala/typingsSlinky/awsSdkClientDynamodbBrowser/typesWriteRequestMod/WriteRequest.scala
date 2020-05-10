package typingsSlinky.awsSdkClientDynamodbBrowser.typesWriteRequestMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteRequestMod.DeleteRequest
import typingsSlinky.awsSdkClientDynamodbBrowser.typesPutRequestMod.PutRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteRequest extends js.Object {
  /**
    * <p>A request to perform a <code>DeleteItem</code> operation.</p>
    */
  var DeleteRequest: js.UndefOr[typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteRequestMod.DeleteRequest] = js.native
  /**
    * <p>A request to perform a <code>PutItem</code> operation.</p>
    */
  var PutRequest: js.UndefOr[typingsSlinky.awsSdkClientDynamodbBrowser.typesPutRequestMod.PutRequest] = js.native
}

object WriteRequest {
  @scala.inline
  def apply(): WriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteRequest]
  }
  @scala.inline
  implicit class WriteRequestOps[Self <: WriteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteRequest(value: DeleteRequest): Self = {
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
    def withPutRequest(value: PutRequest): Self = {
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

