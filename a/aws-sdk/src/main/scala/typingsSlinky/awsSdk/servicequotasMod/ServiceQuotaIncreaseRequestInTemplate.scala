package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceQuotaIncreaseRequestInTemplate extends js.Object {
  /**
    * The AWS Region where the increase request occurs.
    */
  var AwsRegion: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.AwsRegion] = js.native
  /**
    * Identifies the new, increased value of the service quota in the increase request. 
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.native
  /**
    * Specifies if the quota is a global quota.
    */
  var GlobalQuota: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.GlobalQuota] = js.native
  /**
    * The code identifier for the service quota specified in the increase request.
    */
  var QuotaCode: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.QuotaCode] = js.native
  /**
    * The name of the service quota in the increase request.
    */
  var QuotaName: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.QuotaName] = js.native
  /**
    * The code identifier for the AWS service specified in the increase request.
    */
  var ServiceCode: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceCode] = js.native
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceName] = js.native
  /**
    * The unit of measure for the increase request.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.native
}

object ServiceQuotaIncreaseRequestInTemplate {
  @scala.inline
  def apply(): ServiceQuotaIncreaseRequestInTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceQuotaIncreaseRequestInTemplate]
  }
  @scala.inline
  implicit class ServiceQuotaIncreaseRequestInTemplateOps[Self <: ServiceQuotaIncreaseRequestInTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsRegion(value: AwsRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredValue(value: QuotaValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DesiredValue")(js.undefined)
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
  }
  
}

