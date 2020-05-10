package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobTimeout extends js.Object {
  /**
    * The time duration in seconds (measured from the job attempt's startedAt timestamp) after which AWS Batch terminates your jobs if they have not finished.
    */
  var attemptDurationSeconds: js.UndefOr[Integer] = js.native
}

object JobTimeout {
  @scala.inline
  def apply(): JobTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTimeout]
  }
  @scala.inline
  implicit class JobTimeoutOps[Self <: JobTimeout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptDurationSeconds(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptDurationSeconds")(js.undefined)
        ret
    }
  }
  
}

