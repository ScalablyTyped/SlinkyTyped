package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessReportS3Location extends js.Object {
  /**
    * The S3 bucket name of the output reports.
    */
  var BucketName: js.UndefOr[CustomerS3BucketName] = js.native
  /**
    * The path of the business report.
    */
  var Path: js.UndefOr[BusinessReportS3Path] = js.native
}

object BusinessReportS3Location {
  @scala.inline
  def apply(): BusinessReportS3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReportS3Location]
  }
  @scala.inline
  implicit class BusinessReportS3LocationOps[Self <: BusinessReportS3Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: CustomerS3BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: BusinessReportS3Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path")(js.undefined)
        ret
    }
  }
  
}

