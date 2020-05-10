package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResultIdentifier extends js.Object {
  /**
    * Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the evaluated resource.
    */
  var EvaluationResultQualifier: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.EvaluationResultQualifier] = js.native
  /**
    * The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS Config delivered a configuration item change notification, or it can indicate when AWS Config delivered the configuration snapshot, depending on which event triggered the evaluation.
    */
  var OrderingTimestamp: js.UndefOr[js.Date] = js.native
}

object EvaluationResultIdentifier {
  @scala.inline
  def apply(): EvaluationResultIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResultIdentifier]
  }
  @scala.inline
  implicit class EvaluationResultIdentifierOps[Self <: EvaluationResultIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluationResultQualifier(value: EvaluationResultQualifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationResultQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationResultQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationResultQualifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderingTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrderingTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderingTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrderingTimestamp")(js.undefined)
        ret
    }
  }
  
}

