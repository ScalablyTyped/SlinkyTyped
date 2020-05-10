package typingsSlinky.instagramPrivateApi.uploadVideoOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadRetryContext extends js.Object {
  var num_reupload: Double = js.native
  var num_step_auto_retry: Double = js.native
  var num_step_manual_retry: Double = js.native
}

object UploadRetryContext {
  @scala.inline
  def apply(num_reupload: Double, num_step_auto_retry: Double, num_step_manual_retry: Double): UploadRetryContext = {
    val __obj = js.Dynamic.literal(num_reupload = num_reupload.asInstanceOf[js.Any], num_step_auto_retry = num_step_auto_retry.asInstanceOf[js.Any], num_step_manual_retry = num_step_manual_retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRetryContext]
  }
  @scala.inline
  implicit class UploadRetryContextOps[Self <: UploadRetryContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNum_reupload(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_reupload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_step_auto_retry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_step_auto_retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_step_manual_retry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_step_manual_retry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

