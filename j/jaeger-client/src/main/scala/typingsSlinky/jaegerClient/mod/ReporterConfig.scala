package typingsSlinky.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReporterConfig extends js.Object {
  var agentHost: js.UndefOr[String] = js.native
  var agentPort: js.UndefOr[Double] = js.native
  var collectorEndpoint: js.UndefOr[String] = js.native
  var flushIntervalMs: js.UndefOr[Double] = js.native
  var logSpans: js.UndefOr[Boolean] = js.native
  var password: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
}

object ReporterConfig {
  @scala.inline
  def apply(): ReporterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReporterConfig]
  }
  @scala.inline
  implicit class ReporterConfigOps[Self <: ReporterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHost")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentPort")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectorEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectorEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectorEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectorEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withFlushIntervalMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushIntervalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlushIntervalMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushIntervalMs")(js.undefined)
        ret
    }
    @scala.inline
    def withLogSpans(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logSpans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogSpans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logSpans")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

