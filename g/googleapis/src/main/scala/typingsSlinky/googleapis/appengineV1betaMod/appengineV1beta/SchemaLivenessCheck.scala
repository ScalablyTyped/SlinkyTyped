package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Health checking configuration for VM instances. Unhealthy instances are
  * killed and replaced with new instances.
  */
@js.native
trait SchemaLivenessCheck extends js.Object {
  /**
    * Interval between health checks.
    */
  var checkInterval: js.UndefOr[String] = js.native
  /**
    * Number of consecutive failed checks required before considering the VM
    * unhealthy.
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  /**
    * Host header to send when performing a HTTP Liveness check. Example:
    * &quot;myapp.appspot.com&quot;
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The initial delay before starting to execute the checks.
    */
  var initialDelay: js.UndefOr[String] = js.native
  /**
    * The request path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Number of consecutive successful checks required before considering the
    * VM healthy.
    */
  var successThreshold: js.UndefOr[Double] = js.native
  /**
    * Time before the check is considered failed.
    */
  var timeout: js.UndefOr[String] = js.native
}

object SchemaLivenessCheck {
  @scala.inline
  def apply(): SchemaLivenessCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLivenessCheck]
  }
  @scala.inline
  implicit class SchemaLivenessCheckOps[Self <: SchemaLivenessCheck] (val x: Self) extends AnyVal {
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
    def withInitialDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDelay")(js.undefined)
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

