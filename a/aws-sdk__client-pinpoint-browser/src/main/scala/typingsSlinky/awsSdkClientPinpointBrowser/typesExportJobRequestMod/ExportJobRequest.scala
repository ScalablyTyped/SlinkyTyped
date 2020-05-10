package typingsSlinky.awsSdkClientPinpointBrowser.typesExportJobRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that endpoints will be exported to.
    */
  var RoleArn: js.UndefOr[String] = js.native
  /**
    * A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is typically a folder with multiple files.
    *
    * The URL should follow this format: s3://bucket-name/folder-name/
    *
    * Amazon Pinpoint will export endpoints to this location.
    */
  var S3UrlPrefix: js.UndefOr[String] = js.native
  /**
    * The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the endpoints that belong to the application.
    */
  var SegmentId: js.UndefOr[String] = js.native
  /**
    * The version of the segment to export if specified.
    */
  var SegmentVersion: js.UndefOr[Double] = js.native
}

object ExportJobRequest {
  @scala.inline
  def apply(): ExportJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJobRequest]
  }
  @scala.inline
  implicit class ExportJobRequestOps[Self <: ExportJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withS3UrlPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3UrlPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3UrlPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3UrlPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentVersion")(js.undefined)
        ret
    }
  }
  
}

