package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePipeline extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image pipeline.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date on which this image pipeline was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The date on which this image pipeline was last run.
    */
  var dateLastRun: js.UndefOr[DateTime] = js.native
  /**
    * The date on which this image pipeline will next be run.
    */
  var dateNextRun: js.UndefOr[DateTime] = js.native
  /**
    * The date on which this image pipeline was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.native
  /**
    * The description of the image pipeline.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration associated with this image pipeline.
    */
  var distributionConfigurationArn: js.UndefOr[Arn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the image recipe associated with this image pipeline.
    */
  var imageRecipeArn: js.UndefOr[Arn] = js.native
  /**
    * The image tests configuration of the image pipeline.
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration associated with this image pipeline.
    */
  var infrastructureConfigurationArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the image pipeline.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The platform of the image pipeline.
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    * The schedule of the image pipeline.
    */
  var schedule: js.UndefOr[Schedule] = js.native
  /**
    * The status of the image pipeline.
    */
  var status: js.UndefOr[PipelineStatus] = js.native
  /**
    * The tags of this image pipeline.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object ImagePipeline {
  @scala.inline
  def apply(): ImagePipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePipeline]
  }
  @scala.inline
  implicit class ImagePipelineOps[Self <: ImagePipeline] (val x: Self) extends AnyVal {
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
    def withDateLastRun(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateLastRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateLastRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateLastRun")(js.undefined)
        ret
    }
    @scala.inline
    def withDateNextRun(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateNextRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateNextRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateNextRun")(js.undefined)
        ret
    }
    @scala.inline
    def withDateUpdated(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateUpdated")(js.undefined)
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
    def withDistributionConfigurationArn(value: Arn): Self = {
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
    def withImageRecipeArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRecipeArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageRecipeArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageRecipeArn")(js.undefined)
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
    def withInfrastructureConfigurationArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureConfigurationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfrastructureConfigurationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infrastructureConfigurationArn")(js.undefined)
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

