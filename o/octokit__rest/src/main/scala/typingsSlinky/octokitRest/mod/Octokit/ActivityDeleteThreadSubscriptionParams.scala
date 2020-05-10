package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityDeleteThreadSubscriptionParams extends js.Object {
  var thread_id: Double = js.native
}

object ActivityDeleteThreadSubscriptionParams {
  @scala.inline
  def apply(thread_id: Double): ActivityDeleteThreadSubscriptionParams = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityDeleteThreadSubscriptionParams]
  }
  @scala.inline
  implicit class ActivityDeleteThreadSubscriptionParamsOps[Self <: ActivityDeleteThreadSubscriptionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThread_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

