package typingsSlinky.awsSdkClientDynamodbNode.typesWriteRequestMod

import typingsSlinky.awsSdkClientDynamodbNode.typesDeleteRequestMod.DeleteRequest
import typingsSlinky.awsSdkClientDynamodbNode.typesPutRequestMod.PutRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteRequest extends js.Object {
  /**
    * <p>A request to perform a <code>DeleteItem</code> operation.</p>
    */
  var DeleteRequest: js.UndefOr[typingsSlinky.awsSdkClientDynamodbNode.typesDeleteRequestMod.DeleteRequest] = js.undefined
  /**
    * <p>A request to perform a <code>PutItem</code> operation.</p>
    */
  var PutRequest: js.UndefOr[typingsSlinky.awsSdkClientDynamodbNode.typesPutRequestMod.PutRequest] = js.undefined
}

object WriteRequest {
  @scala.inline
  def apply(DeleteRequest: DeleteRequest = null, PutRequest: PutRequest = null): WriteRequest = {
    val __obj = js.Dynamic.literal()
    if (DeleteRequest != null) __obj.updateDynamic("DeleteRequest")(DeleteRequest.asInstanceOf[js.Any])
    if (PutRequest != null) __obj.updateDynamic("PutRequest")(PutRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRequest]
  }
}

