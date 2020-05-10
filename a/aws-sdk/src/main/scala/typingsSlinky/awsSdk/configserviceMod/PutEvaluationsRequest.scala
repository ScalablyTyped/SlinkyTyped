package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEvaluationsRequest extends js.Object {
  /**
    * The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and indicates whether it complies with the AWS Config rule that invokes the AWS Lambda function.
    */
  var Evaluations: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Evaluations] = js.native
  /**
    * An encrypted token that associates an evaluation with an AWS Config rule. Identifies the rule and the event that triggered the evaluation.
    */
  var ResultToken: String = js.native
  /**
    * Use this parameter to specify a test run for PutEvaluations. You can verify whether your AWS Lambda function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and evaluation results are not sent to AWS Config.  When TestMode is true, PutEvaluations doesn't require a valid value for the ResultToken parameter, but the value cannot be null. 
    */
  var TestMode: js.UndefOr[Boolean] = js.native
}

object PutEvaluationsRequest {
  @scala.inline
  def apply(ResultToken: String): PutEvaluationsRequest = {
    val __obj = js.Dynamic.literal(ResultToken = ResultToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEvaluationsRequest]
  }
  @scala.inline
  implicit class PutEvaluationsRequestOps[Self <: PutEvaluationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResultToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluations(value: Evaluations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Evaluations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Evaluations")(js.undefined)
        ret
    }
    @scala.inline
    def withTestMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestMode")(js.undefined)
        ret
    }
  }
  
}

