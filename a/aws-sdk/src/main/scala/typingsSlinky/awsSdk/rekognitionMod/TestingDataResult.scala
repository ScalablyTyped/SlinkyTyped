package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestingDataResult extends js.Object {
  /**
    * The testing dataset that was supplied for training.
    */
  var Input: js.UndefOr[TestingData] = js.native
  /**
    * The subset of the dataset that was actually tested. Some images (assets) might not be tested due to file formatting and other issues. 
    */
  var Output: js.UndefOr[TestingData] = js.native
}

object TestingDataResult {
  @scala.inline
  def apply(): TestingDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestingDataResult]
  }
  @scala.inline
  implicit class TestingDataResultOps[Self <: TestingDataResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: TestingData): Self = {
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
    def withOutput(value: TestingData): Self = {
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

