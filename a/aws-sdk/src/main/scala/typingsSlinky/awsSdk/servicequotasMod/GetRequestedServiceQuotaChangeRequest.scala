package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRequestedServiceQuotaChangeRequest extends js.Object {
  /**
    * Identifies the quota increase request.
    */
  var RequestId: typingsSlinky.awsSdk.servicequotasMod.RequestId = js.native
}

object GetRequestedServiceQuotaChangeRequest {
  @scala.inline
  def apply(RequestId: RequestId): GetRequestedServiceQuotaChangeRequest = {
    val __obj = js.Dynamic.literal(RequestId = RequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRequestedServiceQuotaChangeRequest]
  }
  @scala.inline
  implicit class GetRequestedServiceQuotaChangeRequestOps[Self <: GetRequestedServiceQuotaChangeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestId(value: RequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

