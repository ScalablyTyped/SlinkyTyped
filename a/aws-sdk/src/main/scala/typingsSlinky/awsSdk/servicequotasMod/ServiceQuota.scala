package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceQuota extends js.Object {
  /**
    * Specifies if the quota value can be increased.
    */
  var Adjustable: js.UndefOr[QuotaAdjustable] = js.native
  /**
    * Specifies the ErrorCode and ErrorMessage when success isn't achieved.
    */
  var ErrorReason: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ErrorReason] = js.native
  /**
    * Specifies if the quota is global.
    */
  var GlobalQuota: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.GlobalQuota] = js.native
  /**
    * Identifies the unit and value of how time is measured.
    */
  var Period: js.UndefOr[QuotaPeriod] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service quota.
    */
  var QuotaArn: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.QuotaArn] = js.native
  /**
    * The code identifier for the service quota specified.
    */
  var QuotaCode: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.QuotaCode] = js.native
  /**
    * The name identifier of the service quota.
    */
  var QuotaName: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.QuotaName] = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceCode] = js.native
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceName] = js.native
  /**
    * The unit of measurement for the value of the service quota.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.native
  /**
    * Specifies the details about the measurement. 
    */
  var UsageMetric: js.UndefOr[MetricInfo] = js.native
  /**
    * The value of service quota.
    */
  var Value: js.UndefOr[QuotaValue] = js.native
}

object ServiceQuota {
  @scala.inline
  def apply(): ServiceQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceQuota]
  }
  @scala.inline
  implicit class ServiceQuotaOps[Self <: ServiceQuota] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustable(value: QuotaAdjustable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Adjustable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Adjustable")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorReason(value: ErrorReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorReason")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalQuota(value: GlobalQuota): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: QuotaPeriod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Period")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaArn(value: QuotaArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuotaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuotaArn")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaCode(value: QuotaCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuotaCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuotaCode")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaName(value: QuotaName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuotaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuotaName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCode(value: ServiceCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceCode")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: ServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: QuotaUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageMetric(value: MetricInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsageMetric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageMetric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsageMetric")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: QuotaValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

