package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceQuotaResponse extends js.Object {
  /**
    * Returns the ServiceQuota object which contains all values for a quota.
    */
  var Quota: js.UndefOr[ServiceQuota] = js.native
}

object GetServiceQuotaResponse {
  @scala.inline
  def apply(): GetServiceQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceQuotaResponse]
  }
  @scala.inline
  implicit class GetServiceQuotaResponseOps[Self <: GetServiceQuotaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuota(value: ServiceQuota): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quota")(js.undefined)
        ret
    }
  }
  
}

