package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SageMakerMachineLearningModelResourceData extends js.Object {
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[string] = js.native
  var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting] = js.native
  /**
    * The ARN of the Amazon SageMaker training job that represents the source model.
    */
  var SageMakerJobArn: js.UndefOr[string] = js.native
}

object SageMakerMachineLearningModelResourceData {
  @scala.inline
  def apply(): SageMakerMachineLearningModelResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SageMakerMachineLearningModelResourceData]
  }
  @scala.inline
  implicit class SageMakerMachineLearningModelResourceDataOps[Self <: SageMakerMachineLearningModelResourceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationPath(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationPath")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerSetting(value: ResourceDownloadOwnerSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withSageMakerJobArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SageMakerJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSageMakerJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SageMakerJobArn")(js.undefined)
        ret
    }
  }
  
}

