package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputLocation extends js.Object {
  /**
    * The S3 bucket for output.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * The S3 folder in the s3Bucket where output files will be placed.
    */
  var s3Prefix: js.UndefOr[S3Key] = js.native
}

object OutputLocation {
  @scala.inline
  def apply(): OutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLocation]
  }
  @scala.inline
  implicit class OutputLocationOps[Self <: OutputLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Bucket(value: S3Bucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Prefix(value: S3Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Prefix")(js.undefined)
        ret
    }
  }
  
}

