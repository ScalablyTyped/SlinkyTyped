package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Health checking configuration for VM instances. Unhealthy instances are
  * killed and replaced with new instances. Only applicable for instances in
  * App Engine flexible environment.
  */
@js.native
trait SchemaHealthCheck extends js.Object {
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String] = js.native
  /**
    * Whether to explicitly disable health checks for this instance.
    */
  var disableHealthCheck: js.UndefOr[Boolean] = js.native
  /**
    * Number of consecutive successful health checks required before receiving
    * traffic.
    */
  var healthyThreshold: js.UndefOr[Double] = js.native
  /**
    * Host header to send when performing an HTTP health check. Example:
    * &quot;myapp.appspot.com&quot;
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Number of consecutive failed health checks required before an instance is
    * restarted.
    */
  var restartThreshold: js.UndefOr[Double] = js.native
  /**
    * Time before the health check is considered failed.
    */
  var timeout: js.UndefOr[String] = js.native
  /**
    * Number of consecutive failed health checks required before removing
    * traffic.
    */
  var unhealthyThreshold: js.UndefOr[Double] = js.native
}

object SchemaHealthCheck {
  @scala.inline
  def apply(): SchemaHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheck]
  }
  @scala.inline
  implicit class SchemaHealthCheckOps[Self <: SchemaHealthCheck] (val x: Self) extends AnyVal {
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

