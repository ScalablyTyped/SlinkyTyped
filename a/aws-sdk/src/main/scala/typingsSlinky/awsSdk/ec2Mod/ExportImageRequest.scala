package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportImageRequest extends js.Object {
  /**
    * Token to enable idempotency for export image requests.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * A description of the image being exported. The maximum length is 255 bytes.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The disk image format.
    */
  var DiskImageFormat: typingsSlinky.awsSdk.ec2Mod.DiskImageFormat = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the image.
    */
  var ImageId: typingsSlinky.awsSdk.ec2Mod.ImageId = js.native
  /**
    * The name of the role that grants VM Import/Export permission to export images to your S3 bucket. If this parameter is not specified, the default role is named 'vmimport'.
    */
  var RoleName: js.UndefOr[String] = js.native
  /**
    * Information about the destination S3 bucket. The bucket must exist and grant WRITE and READ_ACP permissions to the AWS account vm-import-export@amazon.com.
    */
  var S3ExportLocation: ExportTaskS3LocationRequest = js.native
}

object ExportImageRequest {
  @scala.inline
  def apply(DiskImageFormat: DiskImageFormat, ImageId: ImageId, S3ExportLocation: ExportTaskS3LocationRequest): ExportImageRequest = {
    val __obj = js.Dynamic.literal(DiskImageFormat = DiskImageFormat.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any], S3ExportLocation = S3ExportLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportImageRequest]
  }
  @scala.inline
  implicit class ExportImageRequestOps[Self <: ExportImageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskImageFormat(value: DiskImageFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskImageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageId(value: ImageId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3ExportLocation(value: ExportTaskS3LocationRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ExportLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
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
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleName")(js.undefined)
        ret
    }
  }
  
}

