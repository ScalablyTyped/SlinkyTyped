package typingsSlinky.pulumiAws.getServiceQuotaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceQuotaResult extends js.Object {
  /**
    * Whether the service quota is adjustable.
    */
  val adjustable: Boolean = js.native
  /**
    * Amazon Resource Name (ARN) of the service quota.
    */
  val arn: String = js.native
  /**
    * Default value of the service quota.
    */
  val defaultValue: Double = js.native
  /**
    * Whether the service quota is global for the AWS account.
    */
  val globalQuota: Boolean = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val quotaCode: String = js.native
  val quotaName: String = js.native
  val serviceCode: String = js.native
  /**
    * Name of the service.
    */
  val serviceName: String = js.native
  /**
    * Current value of the service quota.
    */
  val value: Double = js.native
}

object GetServiceQuotaResult {
  @scala.inline
  def apply(
    adjustable: Boolean,
    arn: String,
    defaultValue: Double,
    globalQuota: Boolean,
    id: String,
    quotaCode: String,
    quotaName: String,
    serviceCode: String,
    serviceName: String,
    value: Double
  ): GetServiceQuotaResult = {
    val __obj = js.Dynamic.literal(adjustable = adjustable.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], globalQuota = globalQuota.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], quotaCode = quotaCode.asInstanceOf[js.Any], quotaName = quotaName.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceQuotaResult]
  }
  @scala.inline
  implicit class GetServiceQuotaResultOps[Self <: GetServiceQuotaResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobalQuota(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuotaCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuotaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

