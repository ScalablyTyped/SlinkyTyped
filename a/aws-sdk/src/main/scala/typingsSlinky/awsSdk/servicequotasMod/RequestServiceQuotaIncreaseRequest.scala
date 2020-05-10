package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestServiceQuotaIncreaseRequest extends js.Object {
  /**
    * Specifies the value submitted in the service quota increase request. 
    */
  var DesiredValue: QuotaValue = js.native
  /**
    * Specifies the service quota that you want to use.
    */
  var QuotaCode: typingsSlinky.awsSdk.servicequotasMod.QuotaCode = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typingsSlinky.awsSdk.servicequotasMod.ServiceCode = js.native
}

object RequestServiceQuotaIncreaseRequest {
  @scala.inline
  def apply(DesiredValue: QuotaValue, QuotaCode: QuotaCode, ServiceCode: ServiceCode): RequestServiceQuotaIncreaseRequest = {
    val __obj = js.Dynamic.literal(DesiredValue = DesiredValue.asInstanceOf[js.Any], QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestServiceQuotaIncreaseRequest]
  }
  @scala.inline
  implicit class RequestServiceQuotaIncreaseRequestOps[Self <: RequestServiceQuotaIncreaseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredValue(value: QuotaValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuotaCode(value: QuotaCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuotaCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceCode(value: ServiceCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

