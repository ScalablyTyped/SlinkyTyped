package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceImage extends js.Object {
  /**
    * The description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.native
  /**
    * The error code that is returned for the image.
    */
  var ErrorCode: js.UndefOr[WorkspaceImageErrorCode] = js.native
  /**
    * The text of the error message that is returned for the image.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
  /**
    * The name of the image.
    */
  var Name: js.UndefOr[WorkspaceImageName] = js.native
  /**
    * The operating system that the image is running. 
    */
  var OperatingSystem: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.OperatingSystem] = js.native
  /**
    * Specifies whether the image is running on dedicated hardware. When Bring Your Own License (BYOL) is enabled, this value is set to DEDICATED. For more information, see Bring Your Own Windows Desktop Images.
    */
  var RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy] = js.native
  /**
    * The status of the image.
    */
  var State: js.UndefOr[WorkspaceImageState] = js.native
}

object WorkspaceImage {
  @scala.inline
  def apply(): WorkspaceImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceImage]
  }
  @scala.inline
  implicit class WorkspaceImageOps[Self <: WorkspaceImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: WorkspaceImageDescription): Self = {
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
    def withErrorCode(value: WorkspaceImageErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withImageId(value: WorkspaceImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: WorkspaceImageName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystem(value: OperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredTenancy(value: WorkspaceImageRequiredTenancy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiredTenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredTenancy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequiredTenancy")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: WorkspaceImageState): Self = {
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
  }
  
}

