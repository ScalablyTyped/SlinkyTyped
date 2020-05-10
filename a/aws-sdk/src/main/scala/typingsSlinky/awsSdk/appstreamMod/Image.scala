package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  /**
    * The applications associated with the image.
    */
  var Applications: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Applications] = js.native
  /**
    * The version of the AppStream 2.0 agent to use for instances that are launched from this image. 
    */
  var AppstreamAgentVersion: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.AppstreamAgentVersion] = js.native
  /**
    * The ARN of the image.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Arn] = js.native
  /**
    * The ARN of the image from which this image was created.
    */
  var BaseImageArn: js.UndefOr[Arn] = js.native
  /**
    * The time the image was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The image name to display.
    */
  var DisplayName: js.UndefOr[String] = js.native
  /**
    * The name of the image builder that was used to create the private image. If the image is shared, this value is null.
    */
  var ImageBuilderName: js.UndefOr[String] = js.native
  /**
    * Indicates whether an image builder can be launched from this image.
    */
  var ImageBuilderSupported: js.UndefOr[Boolean] = js.native
  /**
    * The permissions to provide to the destination AWS account for the specified image.
    */
  var ImagePermissions: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.ImagePermissions] = js.native
  /**
    * The name of the image.
    */
  var Name: String = js.native
  /**
    * The operating system platform of the image.
    */
  var Platform: js.UndefOr[PlatformType] = js.native
  /**
    * The release date of the public base image. For private images, this date is the release date of the base image from which the image was created.
    */
  var PublicBaseImageReleasedDate: js.UndefOr[js.Date] = js.native
  /**
    * The image starts in the PENDING state. If image creation succeeds, the state is AVAILABLE. If image creation fails, the state is FAILED.
    */
  var State: js.UndefOr[ImageState] = js.native
  /**
    * The reason why the last state change occurred.
    */
  var StateChangeReason: js.UndefOr[ImageStateChangeReason] = js.native
  /**
    * Indicates whether the image is public or private.
    */
  var Visibility: js.UndefOr[VisibilityType] = js.native
}

object Image {
  @scala.inline
  def apply(Name: String): Image = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplications(value: Applications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Applications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Applications")(js.undefined)
        ret
    }
    @scala.inline
    def withAppstreamAgentVersion(value: AppstreamAgentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppstreamAgentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppstreamAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppstreamAgentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseImageArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseImageArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseImageArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseImageArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withImageBuilderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageBuilderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageBuilderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageBuilderName")(js.undefined)
        ret
    }
    @scala.inline
    def withImageBuilderSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageBuilderSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageBuilderSupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageBuilderSupported")(js.undefined)
        ret
    }
    @scala.inline
    def withImagePermissions(value: ImagePermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImagePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImagePermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: PlatformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicBaseImageReleasedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicBaseImageReleasedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicBaseImageReleasedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicBaseImageReleasedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ImageState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChangeReason(value: ImageStateChangeReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChangeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: VisibilityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(js.undefined)
        ret
    }
  }
  
}

