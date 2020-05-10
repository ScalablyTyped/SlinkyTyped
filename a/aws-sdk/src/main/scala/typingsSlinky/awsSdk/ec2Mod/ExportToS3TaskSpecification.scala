package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportToS3TaskSpecification extends js.Object {
  /**
    * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is exported.
    */
  var ContainerFormat: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ContainerFormat] = js.native
  /**
    * The format for the exported image.
    */
  var DiskImageFormat: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.DiskImageFormat] = js.native
  /**
    * The S3 bucket for the destination image. The destination bucket must exist and grant WRITE and READ_ACP permissions to the AWS account vm-import-export@amazon.com.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  /**
    * The image is written to a single object in the S3 bucket at the S3 key s3prefix + exportTaskId + '.' + diskImageFormat.
    */
  var S3Prefix: js.UndefOr[String] = js.native
}

object ExportToS3TaskSpecification {
  @scala.inline
  def apply(): ExportToS3TaskSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportToS3TaskSpecification]
  }
  @scala.inline
  implicit class ExportToS3TaskSpecificationOps[Self <: ExportToS3TaskSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerFormat(value: ContainerFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskImageFormat(value: DiskImageFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskImageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskImageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskImageFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Bucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Prefix")(js.undefined)
        ret
    }
  }
  
}

