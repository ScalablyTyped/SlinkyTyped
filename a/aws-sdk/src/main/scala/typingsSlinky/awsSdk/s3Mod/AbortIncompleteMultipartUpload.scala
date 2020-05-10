package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortIncompleteMultipartUpload extends js.Object {
  /**
    * Specifies the number of days after which Amazon S3 aborts an incomplete multipart upload.
    */
  var DaysAfterInitiation: js.UndefOr[typingsSlinky.awsSdk.s3Mod.DaysAfterInitiation] = js.native
}

object AbortIncompleteMultipartUpload {
  @scala.inline
  def apply(): AbortIncompleteMultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortIncompleteMultipartUpload]
  }
  @scala.inline
  implicit class AbortIncompleteMultipartUploadOps[Self <: AbortIncompleteMultipartUpload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysAfterInitiation(value: DaysAfterInitiation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaysAfterInitiation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysAfterInitiation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DaysAfterInitiation")(js.undefined)
        ret
    }
  }
  
}

