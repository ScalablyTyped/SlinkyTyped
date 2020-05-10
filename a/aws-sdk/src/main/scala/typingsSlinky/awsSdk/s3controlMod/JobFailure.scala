package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobFailure extends js.Object {
  /**
    * The failure code, if any, for the specified job.
    */
  var FailureCode: js.UndefOr[JobFailureCode] = js.native
  /**
    * The failure reason, if any, for the specified job.
    */
  var FailureReason: js.UndefOr[JobFailureReason] = js.native
}

object JobFailure {
  @scala.inline
  def apply(): JobFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobFailure]
  }
  @scala.inline
  implicit class JobFailureOps[Self <: JobFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailureCode(value: JobFailureCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: JobFailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
  }
  
}

