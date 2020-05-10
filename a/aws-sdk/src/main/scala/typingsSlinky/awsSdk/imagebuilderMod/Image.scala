package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date on which this image was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The distribution configuration used when creating this image.
    */
  var distributionConfiguration: js.UndefOr[DistributionConfiguration] = js.native
  /**
    * The image recipe used when creating the image.
    */
  var imageRecipe: js.UndefOr[ImageRecipe] = js.native
  /**
    * The image tests configuration used when creating this image.
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  /**
    *  The infrastructure used when creating this image.
    */
  var infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration] = js.native
  /**
    * The name of the image.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The output resources produced when creating this image.
    */
  var outputResources: js.UndefOr[OutputResources] = js.native
  /**
    * The platform of the image.
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that created this image.
    */
  var sourcePipelineArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the image pipeline that created this image.
    */
  var sourcePipelineName: js.UndefOr[ResourceName] = js.native
  /**
    * The state of the image.
    */
  var state: js.UndefOr[ImageState] = js.native
  /**
    * The tags of the image.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The semantic version of the image.
    */
  var version: js.UndefOr[VersionNumber] = js.native
}

object Image {
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: ImageBuilderArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDateCreated(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributionConfiguration(value: DistributionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withImageRecipe(value: ImageRecipe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRecipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageRecipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRecipe")(js.undefined)
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
    def withInfrastructureConfiguration(value: InfrastructureConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfrastructureConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputResources(value: OutputResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputResources")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: Platform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePipelineArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePipelineArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePipelineArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePipelineArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePipelineName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePipelineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePipelineName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePipelineName")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ImageState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
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
    @scala.inline
    def withVersion(value: VersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

