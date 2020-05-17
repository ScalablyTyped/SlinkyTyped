package typingsSlinky.googleGax.gaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryParamsConfig extends js.Object {
  var initial_retry_delay_millis: Double = js.native
  var initial_rpc_timeout_millis: Double = js.native
  var max_retry_delay_millis: Double = js.native
  var max_rpc_timeout_millis: Double = js.native
  var retry_delay_multiplier: Double = js.native
  var rpc_timeout_multiplier: Double = js.native
  var total_timeout_millis: Double = js.native
}

object RetryParamsConfig {
  @scala.inline
  def apply(
    initial_retry_delay_millis: Double,
    initial_rpc_timeout_millis: Double,
    max_retry_delay_millis: Double,
    max_rpc_timeout_millis: Double,
    retry_delay_multiplier: Double,
    rpc_timeout_multiplier: Double,
    total_timeout_millis: Double
  ): RetryParamsConfig = {
    val __obj = js.Dynamic.literal(initial_retry_delay_millis = initial_retry_delay_millis.asInstanceOf[js.Any], initial_rpc_timeout_millis = initial_rpc_timeout_millis.asInstanceOf[js.Any], max_retry_delay_millis = max_retry_delay_millis.asInstanceOf[js.Any], max_rpc_timeout_millis = max_rpc_timeout_millis.asInstanceOf[js.Any], retry_delay_multiplier = retry_delay_multiplier.asInstanceOf[js.Any], rpc_timeout_multiplier = rpc_timeout_multiplier.asInstanceOf[js.Any], total_timeout_millis = total_timeout_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryParamsConfig]
  }
  @scala.inline
  implicit class RetryParamsConfigOps[Self <: RetryParamsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitial_retry_delay_millis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_retry_delay_millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitial_rpc_timeout_millis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initial_rpc_timeout_millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_retry_delay_millis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_retry_delay_millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_rpc_timeout_millis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_rpc_timeout_millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetry_delay_multiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry_delay_multiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRpc_timeout_multiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpc_timeout_multiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_timeout_millis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_timeout_millis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

