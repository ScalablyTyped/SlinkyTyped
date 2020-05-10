package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateEvaluationResult extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * Supplementary information about how the agrregate evaluation determined the compliance.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AwsRegion] = js.native
  /**
    * The resource compliance status. For the AggregationEvaluationResult data type, AWS Config supports only the COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and INSUFFICIENT_DATA value.
    */
  var ComplianceType: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceType] = js.native
  /**
    * The time when the AWS Config rule evaluated the AWS resource.
    */
  var ConfigRuleInvokedTime: js.UndefOr[js.Date] = js.native
  /**
    * Uniquely identifies the evaluation result.
    */
  var EvaluationResultIdentifier: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.EvaluationResultIdentifier] = js.native
  /**
    * The time when AWS Config recorded the aggregate evaluation result.
    */
  var ResultRecordedTime: js.UndefOr[js.Date] = js.native
}

object AggregateEvaluationResult {
  @scala.inline
  def apply(): AggregateEvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateEvaluationResult]
  }
  @scala.inline
  implicit class AggregateEvaluationResultOps[Self <: AggregateEvaluationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAnnotation(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotation")(js.undefined)
        ret
    }
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
    def withComplianceType(value: ComplianceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceType")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigRuleInvokedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleInvokedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleInvokedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleInvokedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluationResultIdentifier(value: EvaluationResultIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationResultIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationResultIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationResultIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withResultRecordedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultRecordedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultRecordedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultRecordedTime")(js.undefined)
        ret
    }
  }
  
}

