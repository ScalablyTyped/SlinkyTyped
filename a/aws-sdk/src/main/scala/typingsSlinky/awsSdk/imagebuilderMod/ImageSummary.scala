package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.native
  /**
    * The date on which this image was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.native
  /**
    * The name of the image.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The output resources produced when creating this image.
    */
  var outputResources: js.UndefOr[OutputResources] = js.native
  /**
    * The owner of the image.
    */
  var owner: js.UndefOr[NonEmptyString] = js.native
  /**
    * The platform of the image.
    */
  var platform: js.UndefOr[Platform] = js.native
  /**
    * The state of the image.
    */
  var state: js.UndefOr[ImageState] = js.native
  /**
    * The tags of the image.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The version of the image.
    */
  var version: js.UndefOr[VersionNumber] = js.native
}

object ImageSummary {
  @scala.inline
  def apply(): ImageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSummary]
  }
  @scala.inline
  implicit class ImageSummaryOps[Self <: ImageSummary] (val x: Self) extends AnyVal {
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
    def withOwner(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
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

