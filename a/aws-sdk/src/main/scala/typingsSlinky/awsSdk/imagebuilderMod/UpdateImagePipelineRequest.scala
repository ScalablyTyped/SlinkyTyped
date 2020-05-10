package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateImagePipelineRequest extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The description of the image pipeline. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and distribute images updated by this image pipeline. 
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image pipeline that you want to update. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image recipe that will be used to configure images updated by this image pipeline. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
  /**
    *  The image test configuration of the image pipeline. 
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images updated by this image pipeline. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
  /**
    *  The schedule of the image pipeline. 
    */
  var schedule: js.UndefOr[Schedule] = js.native
  /**
    *  The status of the image pipeline. 
    */
  var status: js.UndefOr[PipelineStatus] = js.native
}

object UpdateImagePipelineRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    imagePipelineArn: ImagePipelineArn,
    imageRecipeArn: ImageRecipeArn,
    infrastructureConfigurationArn: InfrastructureConfigurationArn
  ): UpdateImagePipelineRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any], imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateImagePipelineRequest]
  }
  @scala.inline
  implicit class UpdateImagePipelineRequestOps[Self <: UpdateImagePipelineRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImagePipelineArn(value: ImagePipelineArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePipelineArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageRecipeArn(value: ImageRecipeArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRecipeArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributionConfigurationArn(value: DistributionConfigurationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionConfigurationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionConfigurationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTestsConfiguration(value: ImageTestsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTestsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTestsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTestsConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: Schedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: PipelineStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

