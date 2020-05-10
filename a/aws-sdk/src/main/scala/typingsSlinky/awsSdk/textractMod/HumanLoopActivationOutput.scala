package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopActivationOutput extends js.Object {
  /**
    * Shows the result of condition evaluations, including those conditions which activated a human review.
    */
  var HumanLoopActivationConditionsEvaluationResults: js.UndefOr[typingsSlinky.awsSdk.textractMod.HumanLoopActivationConditionsEvaluationResults] = js.native
  /**
    * Shows if and why human review was needed.
    */
  var HumanLoopActivationReasons: js.UndefOr[typingsSlinky.awsSdk.textractMod.HumanLoopActivationReasons] = js.native
  /**
    * The Amazon Resource Name (ARN) of the HumanLoop created.
    */
  var HumanLoopArn: js.UndefOr[typingsSlinky.awsSdk.textractMod.HumanLoopArn] = js.native
}

object HumanLoopActivationOutput {
  @scala.inline
  def apply(): HumanLoopActivationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanLoopActivationOutput]
  }
  @scala.inline
  implicit class HumanLoopActivationOutputOps[Self <: HumanLoopActivationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHumanLoopActivationConditionsEvaluationResults(value: HumanLoopActivationConditionsEvaluationResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationConditionsEvaluationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanLoopActivationConditionsEvaluationResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationConditionsEvaluationResults")(js.undefined)
        ret
    }
    @scala.inline
    def withHumanLoopActivationReasons(value: HumanLoopActivationReasons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanLoopActivationReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopActivationReasons")(js.undefined)
        ret
    }
    @scala.inline
    def withHumanLoopArn(value: HumanLoopArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanLoopArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HumanLoopArn")(js.undefined)
        ret
    }
  }
  
}

