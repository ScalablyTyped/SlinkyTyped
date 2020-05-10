package typingsSlinky.lightship.mod

import typingsSlinky.node.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserConfigurationType extends js.Object {
  /* Run Lightship in local mode when Kubernetes is not detected. Default: true. */
  var detectKubernetes: js.UndefOr[Boolean] = js.native
  /* The port on which the Lightship service listens. This port must be different than your main service port, if any. The default port is 9000. */
  var port: js.UndefOr[Double] = js.native
  /* An a array of [signal events]{@link https://nodejs.org/api/process.html#process_signal_events}. Default: [SIGTERM, SIGHUP, SIGINT]. */
  var signals: js.UndefOr[js.Array[Signals]] = js.native
  /* A number of milliseconds before forceful termination. Default: 60000. */
  var timeout: js.UndefOr[Double] = js.native
}

object UserConfigurationType {
  @scala.inline
  def apply(): UserConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserConfigurationType]
  }
  @scala.inline
  implicit class UserConfigurationTypeOps[Self <: UserConfigurationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectKubernetes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectKubernetes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectKubernetes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectKubernetes")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withSignals(value: js.Array[Signals]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signals")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

