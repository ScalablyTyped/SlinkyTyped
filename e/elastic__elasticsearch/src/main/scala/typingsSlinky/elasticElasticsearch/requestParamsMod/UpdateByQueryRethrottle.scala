package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateByQueryRethrottle extends Generic {
  var requests_per_second: Double = js.native
  var task_id: String = js.native
}

object UpdateByQueryRethrottle {
  @scala.inline
  def apply(requests_per_second: Double, task_id: String): UpdateByQueryRethrottle = {
    val __obj = js.Dynamic.literal(requests_per_second = requests_per_second.asInstanceOf[js.Any], task_id = task_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateByQueryRethrottle]
  }
  @scala.inline
  implicit class UpdateByQueryRethrottleOps[Self <: UpdateByQueryRethrottle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequests_per_second(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests_per_second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTask_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

