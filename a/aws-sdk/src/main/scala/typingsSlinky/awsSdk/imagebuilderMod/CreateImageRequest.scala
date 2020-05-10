package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageRequest extends js.Object {
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The Amazon Resource Name (ARN) of the distribution configuration that defines and configures the outputs of your pipeline. 
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
  /**
    *  The image tests configuration of the image. 
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment in which your image will be built and tested. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
  /**
    *  The tags of the image. 
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateImageRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    imageRecipeArn: ImageRecipeArn,
    infrastructureConfigurationArn: InfrastructureConfigurationArn
  ): CreateImageRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRequest]
  }
  @scala.inline
  implicit class CreateImageRequestOps[Self <: CreateImageRequest] (val x: Self) extends AnyVal {
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

