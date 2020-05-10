package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationRequest extends js.Object {
  /**
    * A GUID used to identify the operation.
    */
  var operationId: NonEmptyString = js.native
}

object GetOperationRequest {
  @scala.inline
  def apply(operationId: NonEmptyString): GetOperationRequest = {
    val __obj = js.Dynamic.literal(operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationRequest]
  }
  @scala.inline
  implicit class GetOperationRequestOps[Self <: GetOperationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

