package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingData extends js.Object {
  /**
    * A Sagemaker GroundTruth manifest file that contains the training images (assets).
    */
  var Assets: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.Assets] = js.native
}

object TrainingData {
  @scala.inline
  def apply(): TrainingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingData]
  }
  @scala.inline
  implicit class TrainingDataOps[Self <: TrainingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: Assets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Assets")(js.undefined)
        ret
    }
  }
  
}

