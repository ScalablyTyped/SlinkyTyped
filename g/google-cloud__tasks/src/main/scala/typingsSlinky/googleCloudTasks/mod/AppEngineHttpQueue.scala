package typingsSlinky.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppEngineHttpQueue extends js.Object {
  var appEngineRoutingOverride: AppEngineRouting = js.native
}

object AppEngineHttpQueue {
  @scala.inline
  def apply(appEngineRoutingOverride: AppEngineRouting): AppEngineHttpQueue = {
    val __obj = js.Dynamic.literal(appEngineRoutingOverride = appEngineRoutingOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEngineHttpQueue]
  }
  @scala.inline
  implicit class AppEngineHttpQueueOps[Self <: AppEngineHttpQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppEngineRoutingOverride(value: AppEngineRouting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineRoutingOverride")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

