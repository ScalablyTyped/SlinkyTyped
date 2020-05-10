package typingsSlinky.googleCloudKms.mod.GAX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://googleapis.github.io/gax-nodejs/global.html#BackoffSettings */
@js.native
trait BackoffSettings extends js.Object {
  var initialRetryDelayMillis: Double = js.native
  var initialRpcTimeoutMillis: Double = js.native
  var maxRetryDelayMillis: Double = js.native
  var maxRpcTimeoutMillis: Double = js.native
  var retryDelayMultiplier: Double = js.native
  var totalTimeoutMillis: Double = js.native
}

object BackoffSettings {
  @scala.inline
  def apply(
    initialRetryDelayMillis: Double,
    initialRpcTimeoutMillis: Double,
    maxRetryDelayMillis: Double,
    maxRpcTimeoutMillis: Double,
    retryDelayMultiplier: Double,
    totalTimeoutMillis: Double
  ): BackoffSettings = {
    val __obj = js.Dynamic.literal(initialRetryDelayMillis = initialRetryDelayMillis.asInstanceOf[js.Any], initialRpcTimeoutMillis = initialRpcTimeoutMillis.asInstanceOf[js.Any], maxRetryDelayMillis = maxRetryDelayMillis.asInstanceOf[js.Any], maxRpcTimeoutMillis = maxRpcTimeoutMillis.asInstanceOf[js.Any], retryDelayMultiplier = retryDelayMultiplier.asInstanceOf[js.Any], totalTimeoutMillis = totalTimeoutMillis.asInstanceOf[js.Any])
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
    def withInitialRpcTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRpcTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRetryDelayMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetryDelayMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxRpcTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRpcTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetryDelayMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryDelayMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTimeoutMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTimeoutMillis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

