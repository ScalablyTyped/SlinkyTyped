package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPolicy extends js.Object {
  /**
    * The number of active simulation jobs create as part of the batch that can be in an active state at the same time.  Active states include: Pending,Preparing, Running, Restarting, RunningFailed and Terminating. All other states are terminal states. 
    */
  var maxConcurrency: js.UndefOr[MaxConcurrency] = js.native
  /**
    * The amount of time, in seconds, to wait for the batch to complete.  If a batch times out, and there are pending requests that were failing due to an internal failure (like InternalServiceError), they will be moved to the failed list and the batch status will be Failed. If the pending requests were failing for any other reason, the failed pending requests will be moved to the failed list and the batch status will be TimedOut. 
    */
  var timeoutInSeconds: js.UndefOr[BatchTimeoutInSeconds] = js.native
}

object BatchPolicy {
  @scala.inline
  def apply(): BatchPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPolicy]
  }
  @scala.inline
  implicit class BatchPolicyOps[Self <: BatchPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxConcurrency(value: MaxConcurrency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConcurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutInSeconds(value: BatchTimeoutInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInSeconds")(js.undefined)
        ret
    }
  }
  
}

