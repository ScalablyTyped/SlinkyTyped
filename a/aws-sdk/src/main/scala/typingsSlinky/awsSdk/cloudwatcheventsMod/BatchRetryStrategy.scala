package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRetryStrategy extends js.Object {
  /**
    * The number of times to attempt to retry, if the job fails. Valid values are 1–10.
    */
  var Attempts: js.UndefOr[Integer] = js.native
}

object BatchRetryStrategy {
  @scala.inline
  def apply(): BatchRetryStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRetryStrategy]
  }
  @scala.inline
  implicit class BatchRetryStrategyOps[Self <: BatchRetryStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttempts(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attempts")(js.undefined)
        ret
    }
  }
  
}

