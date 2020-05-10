package typingsSlinky.awsSdkClientPinpointBrowser.typesImportJobRequestMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CSV
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportJobRequest extends js.Object {
  /**
    * Sets whether the endpoints create a segment when they are imported.
    */
  var DefineSegment: js.UndefOr[Boolean] = js.native
  /**
    * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[String] = js.native
  /**
    * The format of the files that contain the endpoint definitions.
    * Valid values: CSV, JSON
    */
  var Format: js.UndefOr[CSV | JSON | String] = js.native
  /**
    * Sets whether the endpoints are registered with Amazon Pinpoint when they are imported.
    */
  var RegisterEndpoints: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that contains the endpoints to import.
    */
  var RoleArn: js.UndefOr[String] = js.native
  /**
    * The URL of the S3 bucket that contains the segment information to import. The location can be a folder or a single file. The URL should use the following format: s3://bucket-name/folder-name/file-name
    *
    * Amazon Pinpoint imports endpoints from this location and any subfolders it contains.
    */
  var S3Url: js.UndefOr[String] = js.native
  /**
    * The ID of the segment to update if the import job is meant to update an existing segment.
    */
  var SegmentId: js.UndefOr[String] = js.native
  /**
    * A custom name for the segment created by the import job. Use if DefineSegment is true.
    */
  var SegmentName: js.UndefOr[String] = js.native
}

object ImportJobRequest {
  @scala.inline
  def apply(): ImportJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportJobRequest]
  }
  @scala.inline
  implicit class ImportJobRequestOps[Self <: ImportJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefineSegment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefineSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefineSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefineSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExternalId")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: CSV | JSON | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterEndpoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisterEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegisterEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisterEndpoints")(js.undefined)
        ret
    }
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
    def withS3Url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Url")(js.undefined)
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
    def withSegmentName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentName")(js.undefined)
        ret
    }
  }
  
}

