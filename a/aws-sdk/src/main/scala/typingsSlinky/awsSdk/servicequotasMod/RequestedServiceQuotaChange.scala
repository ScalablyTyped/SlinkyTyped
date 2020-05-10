package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestedServiceQuotaChange extends js.Object {
  /**
    * The case Id for the service quota increase request.
    */
  var CaseId: js.UndefOr[CustomerServiceEngagementId] = js.native
  /**
    * The date and time when the service quota increase request was received and the case Id was created. 
    */
  var Created: js.UndefOr[js.Date] = js.native
  /**
    * New increased value for the service quota.
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.native
  /**
    * Identifies if the quota is global.
    */
  var GlobalQuota: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.GlobalQuota] = js.native
  /**
    * The unique identifier of a requested service quota change.
    */
  var Id: js.UndefOr[RequestId] = js.native
  /**
    * The date and time of the most recent change in the service quota increase request.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service quota.
    */
  var QuotaArn: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.QuotaArn] = js.native
  /**
    * Specifies the service quota that you want to use.
    */
  var QuotaCode: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.QuotaCode] = js.native
  /**
    * Name of the service quota.
    */
  var QuotaName: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.QuotaName] = js.native
  /**
    * The IAM identity who submitted the service quota increase request.
    */
  var Requester: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.Requester] = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceCode] = js.native
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ServiceName] = js.native
  /**
    * State of the service quota increase request.
    */
  var Status: js.UndefOr[RequestStatus] = js.native
  /**
    * Specifies the unit used for the quota.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.native
}

object RequestedServiceQuotaChange {
  @scala.inline
  def apply(): RequestedServiceQuotaChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestedServiceQuotaChange]
  }
  @scala.inline
  implicit class RequestedServiceQuotaChangeOps[Self <: RequestedServiceQuotaChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseId(value: CustomerServiceEngagementId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaseId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Created")(js.undefined)
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
    def withId(value: RequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdated")(js.undefined)
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
    def withRequester(value: Requester): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Requester")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequester: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Requester")(js.undefined)
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
    def withStatus(value: RequestStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
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

