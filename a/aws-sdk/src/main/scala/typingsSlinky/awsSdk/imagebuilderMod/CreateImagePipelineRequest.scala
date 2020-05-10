package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImagePipelineRequest extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The description of the image pipeline. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and distribute images created by this image pipeline. 
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image recipe that will be used to configure images created by this image pipeline. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
  /**
    *  The image test configuration of the image pipeline. 
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images created by this image pipeline. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
  /**
    *  The name of the image pipeline. 
    */
  var name: ResourceName = js.native
  /**
    *  The schedule of the image pipeline. 
    */
  var schedule: js.UndefOr[Schedule] = js.native
  /**
    *  The status of the image pipeline. 
    */
  var status: js.UndefOr[PipelineStatus] = js.native
  /**
    *  The tags of the image pipeline. 
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateImagePipelineRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    imageRecipeArn: ImageRecipeArn,
    infrastructureConfigurationArn: InfrastructureConfigurationArn,
    name: ResourceName
  ): CreateImagePipelineRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImagePipelineRequest]
  }
  @scala.inline
  implicit class CreateImagePipelineRequestOps[Self <: CreateImagePipelineRequest] (val x: Self) extends AnyVal {
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
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

