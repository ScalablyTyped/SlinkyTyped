package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingDataResult extends js.Object {
  /**
    * The training assets that you supplied for training.
    */
  var Input: js.UndefOr[TrainingData] = js.native
  /**
    * The images (assets) that were actually trained by Amazon Rekognition Custom Labels. 
    */
  var Output: js.UndefOr[TrainingData] = js.native
}

object TrainingDataResult {
  @scala.inline
  def apply(): TrainingDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingDataResult]
  }
  @scala.inline
  implicit class TrainingDataResultOps[Self <: TrainingDataResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: TrainingData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: TrainingData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Output")(js.undefined)
        ret
    }
  }
  
}

