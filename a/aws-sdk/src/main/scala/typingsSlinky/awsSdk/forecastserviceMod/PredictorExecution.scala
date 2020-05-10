package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictorExecution extends js.Object {
  /**
    * The ARN of the algorithm used to test the predictor.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
  /**
    * An array of test windows used to evaluate the algorithm. The NumberOfBacktestWindows from the object determines the number of windows in the array.
    */
  var TestWindows: js.UndefOr[TestWindowDetails] = js.native
}

object PredictorExecution {
  @scala.inline
  def apply(): PredictorExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorExecution]
  }
  @scala.inline
  implicit class PredictorExecutionOps[Self <: PredictorExecution] (val x: Self) extends AnyVal {
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
    def withTestWindows(value: TestWindowDetails): Self = {
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

