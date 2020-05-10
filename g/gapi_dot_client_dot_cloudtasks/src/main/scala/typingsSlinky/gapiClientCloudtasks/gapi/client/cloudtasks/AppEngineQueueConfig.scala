package typingsSlinky.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppEngineQueueConfig extends js.Object {
  /** Deprecated. Use AppEngineTarget.app_engine_routing_override. */
  var appEngineRoutingOverride: js.UndefOr[AppEngineRouting] = js.native
}

object AppEngineQueueConfig {
  @scala.inline
  def apply(): AppEngineQueueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngineQueueConfig]
  }
  @scala.inline
  implicit class AppEngineQueueConfigOps[Self <: AppEngineQueueConfig] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutAppEngineRoutingOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appEngineRoutingOverride")(js.undefined)
        ret
    }
  }
  
}

