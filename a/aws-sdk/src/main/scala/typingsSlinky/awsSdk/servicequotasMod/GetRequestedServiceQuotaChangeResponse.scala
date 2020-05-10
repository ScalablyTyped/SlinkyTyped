package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRequestedServiceQuotaChangeResponse extends js.Object {
  /**
    * Returns the RequestedServiceQuotaChange object for the specific increase request.
    */
  var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.native
}

object GetRequestedServiceQuotaChangeResponse {
  @scala.inline
  def apply(): GetRequestedServiceQuotaChangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRequestedServiceQuotaChangeResponse]
  }
  @scala.inline
  implicit class GetRequestedServiceQuotaChangeResponseOps[Self <: GetRequestedServiceQuotaChangeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestedQuota(value: RequestedServiceQuotaChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedQuota")(js.undefined)
        ret
    }
  }
  
}

