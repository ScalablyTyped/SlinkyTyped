package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealthCheck extends js.Object {
  /** Interval between health checks. */
  var checkInterval: js.UndefOr[String] = js.native
  /** Whether to explicitly disable health checks for this instance. */
  var disableHealthCheck: js.UndefOr[Boolean] = js.native
  /** Number of consecutive successful health checks required before receiving traffic. */
  var healthyThreshold: js.UndefOr[Double] = js.native
  /** Host header to send when performing an HTTP health check. Example: "myapp.appspot.com" */
  var host: js.UndefOr[String] = js.native
  /** Number of consecutive failed health checks required before an instance is restarted. */
  var restartThreshold: js.UndefOr[Double] = js.native
  /** Time before the health check is considered failed. */
  var timeout: js.UndefOr[String] = js.native
  /** Number of consecutive failed health checks required before removing traffic. */
  var unhealthyThreshold: js.UndefOr[Double] = js.native
}

object HealthCheck {
  @scala.inline
  def apply(): HealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheck]
  }
  @scala.inline
  implicit class HealthCheckOps[Self <: HealthCheck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableHealthCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHealthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHealthCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthyThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthyThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthyThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthyThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self = {
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
    @scala.inline
    def withUnhealthyThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhealthyThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnhealthyThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhealthyThreshold")(js.undefined)
        ret
    }
  }
  
}

