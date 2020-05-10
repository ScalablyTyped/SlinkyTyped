package typingsSlinky.awsSdkClientS3Node.typesAbortIncompleteMultipartUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortIncompleteMultipartUpload extends js.Object {
  /**
    * <p>Indicates the number of days that must pass since initiation for Lifecycle to abort an Incomplete Multipart Upload.</p>
    */
  var DaysAfterInitiation: js.UndefOr[Double] = js.native
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
    def withDaysAfterInitiation(value: Double): Self = {
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

