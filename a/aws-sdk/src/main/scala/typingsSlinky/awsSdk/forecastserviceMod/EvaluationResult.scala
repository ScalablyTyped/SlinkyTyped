package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm that was evaluated.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
  /**
    * The array of test windows used for evaluating the algorithm. The NumberOfBacktestWindows from the EvaluationParameters object determines the number of windows in the array.
    */
  var TestWindows: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.TestWindows] = js.native
}

object EvaluationResult {
  @scala.inline
  def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  @scala.inline
  implicit class EvaluationResultOps[Self <: EvaluationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithmArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlgorithmArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTestWindows(value: TestWindows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestWindows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestWindows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestWindows")(js.undefined)
        ret
    }
  }
  
}

