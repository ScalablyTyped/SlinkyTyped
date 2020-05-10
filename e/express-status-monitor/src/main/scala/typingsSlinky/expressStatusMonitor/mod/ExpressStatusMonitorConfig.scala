package typingsSlinky.expressStatusMonitor.mod

import typingsSlinky.expressStatusMonitor.AnonCpu
import typingsSlinky.socketIo.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressStatusMonitorConfig extends js.Object {
  var chartVisibility: js.UndefOr[AnonCpu] = js.native
  var healthChecks: js.UndefOr[js.Array[HealthCheck]] = js.native
  var ignoreStartsWith: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var socketPath: js.UndefOr[String] = js.native
   // References a socket.io instance
  var spans: js.UndefOr[js.Array[RetentionSpan]] = js.native
  var theme: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var websocket: js.UndefOr[Server | Null] = js.native
}

object ExpressStatusMonitorConfig {
  @scala.inline
  def apply(): ExpressStatusMonitorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressStatusMonitorConfig]
  }
  @scala.inline
  implicit class ExpressStatusMonitorConfigOps[Self <: ExpressStatusMonitorConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChartVisibility(value: AnonCpu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthChecks(value: js.Array[HealthCheck]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreStartsWith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreStartsWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreStartsWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreStartsWith")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketPath")(js.undefined)
        ret
    }
    @scala.inline
    def withSpans(value: js.Array[RetentionSpan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spans")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsocket(value: Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websocket")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsocketNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websocket")(null)
        ret
    }
  }
  
}

