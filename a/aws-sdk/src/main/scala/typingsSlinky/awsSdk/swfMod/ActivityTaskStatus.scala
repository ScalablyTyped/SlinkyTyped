package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTaskStatus extends js.Object {
  /**
    * Set to true if cancellation of the task is requested.
    */
  var cancelRequested: Canceled = js.native
}

object ActivityTaskStatus {
  @scala.inline
  def apply(cancelRequested: Canceled): ActivityTaskStatus = {
    val __obj = js.Dynamic.literal(cancelRequested = cancelRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTaskStatus]
  }
  @scala.inline
  implicit class ActivityTaskStatusOps[Self <: ActivityTaskStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelRequested(value: Canceled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelRequested")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

