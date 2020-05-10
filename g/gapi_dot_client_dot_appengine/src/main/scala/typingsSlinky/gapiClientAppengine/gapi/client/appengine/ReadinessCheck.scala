package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadinessCheck extends js.Object {
  /**
    * A maximum time limit on application initialization, measured from moment the application successfully replies to a healthcheck until it is ready to
    * serve traffic.
    */
  var appStartTimeout: js.UndefOr[String] = js.native
  /** Interval between health checks. */
  var checkInterval: js.UndefOr[String] = js.native
  /** Number of consecutive failed checks required before removing traffic. */
  var failureThreshold: js.UndefOr[Double] = js.native
  /** Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com" */
  var host: js.UndefOr[String] = js.native
  /** The request path. */
  var path: js.UndefOr[String] = js.native
  /** Number of consecutive successful checks required before receiving traffic. */
  var successThreshold: js.UndefOr[Double] = js.native
  /** Time before the check is considered failed. */
  var timeout: js.UndefOr[String] = js.native
}

object ReadinessCheck {
  @scala.inline
  def apply(): ReadinessCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadinessCheck]
  }
  @scala.inline
  implicit class ReadinessCheckOps[Self <: ReadinessCheck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppStartTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStartTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppStartTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStartTimeout")(js.undefined)
        ret
    }
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
    def withFailureThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureThreshold")(js.undefined)
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
    def withSuccessThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successThreshold")(js.undefined)
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
  }
  
}

