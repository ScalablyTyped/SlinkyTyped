package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportTaskS3Location extends js.Object {
  /**
    * The destination S3 bucket.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  /**
    * The prefix (logical hierarchy) in the bucket.
    */
  var S3Prefix: js.UndefOr[String] = js.native
}

object ExportTaskS3Location {
  @scala.inline
  def apply(): ExportTaskS3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTaskS3Location]
  }
  @scala.inline
  implicit class ExportTaskS3LocationOps[Self <: ExportTaskS3Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

