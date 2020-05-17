package typingsSlinky.googleGax.gaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackoffSettings extends js.Object {
  var initialRetryDelayMillis: Double = js.native
  var initialRpcTimeoutMillis: js.UndefOr[Double | Null] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var maxRetryDelayMillis: Double = js.native
  var maxRpcTimeoutMillis: js.UndefOr[Double | Null] = js.native
  var retryDelayMultiplier: Double = js.native
  var rpcTimeoutMultiplier: js.UndefOr[Double | Null] = js.native
  var totalTimeoutMillis: js.UndefOr[Double | Null] = js.native
}

object BackoffSettings {
  @scala.inline
  def apply(initialRetryDelayMillis: Double, maxRetryDelayMillis: Double, retryDelayMultiplier: Double): BackoffSettings = {
    val __obj = js.Dynamic.literal(initialRetryDelayMillis = initialRetryDelayMillis.asInstanceOf[js.Any], maxRetryDelayMillis = maxRetryDelayMillis.asInstanceOf[js.Any], retryDelayMultiplier = retryDelayMultiplier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffSettings]
  }
  @scala.inline
  implicit class BackoffSettingsOps[Self <: BackoffSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialRetryDelayMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRetryDelayMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRetryDelayMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetryDelayMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryDelayMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialRpcTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRpcTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRpcTimeoutMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRpcTimeoutMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialRpcTimeoutMillisNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRpcTimeoutMillis")(null)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRpcTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRpcTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRpcTimeoutMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRpcTimeoutMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRpcTimeoutMillisNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRpcTimeoutMillis")(null)
        ret
    }
    @scala.inline
    def withRpcTimeoutMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpcTimeoutMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRpcTimeoutMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpcTimeoutMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withRpcTimeoutMultiplierNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpcTimeoutMultiplier")(null)
        ret
    }
    @scala.inline
    def withTotalTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalTimeoutMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTimeoutMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalTimeoutMillisNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTimeoutMillis")(null)
        ret
    }
  }
  
}

