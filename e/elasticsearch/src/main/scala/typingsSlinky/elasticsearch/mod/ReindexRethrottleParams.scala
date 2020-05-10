package typingsSlinky.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReindexRethrottleParams extends GenericParams {
  var requestsPerSecond: Double = js.native
  var taskId: String = js.native
}

object ReindexRethrottleParams {
  @scala.inline
  def apply(requestsPerSecond: Double, taskId: String): ReindexRethrottleParams = {
    val __obj = js.Dynamic.literal(requestsPerSecond = requestsPerSecond.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexRethrottleParams]
  }
  @scala.inline
  implicit class ReindexRethrottleParamsOps[Self <: ReindexRethrottleParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestsPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestsPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

