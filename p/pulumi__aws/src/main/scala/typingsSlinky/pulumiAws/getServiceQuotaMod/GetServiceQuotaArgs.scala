package typingsSlinky.pulumiAws.getServiceQuotaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceQuotaArgs extends js.Object {
  /**
    * Quota code within the service. When configured, the data source directly looks up the service quota. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaCode: js.UndefOr[String] = js.native
  /**
    * Quota name within the service. When configured, the data source searches through all service quotas to find the matching quota name. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
    */
  val quotaName: js.UndefOr[String] = js.native
  /**
    * Service code for the quota. Available values can be found with the [`aws.servicequotas.getService` data source](https://www.terraform.io/docs/providers/aws/d/servicequotas_service.html) or [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
    */
  val serviceCode: String = js.native
}

object GetServiceQuotaArgs {
  @scala.inline
  def apply(serviceCode: String): GetServiceQuotaArgs = {
    val __obj = js.Dynamic.literal(serviceCode = serviceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceQuotaArgs]
  }
  @scala.inline
  implicit class GetServiceQuotaArgsOps[Self <: GetServiceQuotaArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuotaCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaCode")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaName")(js.undefined)
        ret
    }
  }
  
}

