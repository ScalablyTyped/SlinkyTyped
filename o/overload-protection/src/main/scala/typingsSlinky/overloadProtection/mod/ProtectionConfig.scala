package typingsSlinky.overloadProtection.mod

import typingsSlinky.overloadProtection.overloadProtectionBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectionConfig extends js.Object {
  var clientRetrySecs: js.UndefOr[Double] = js.native
  var errorPropagationMode: js.UndefOr[Boolean] = js.native
  var logStatsOnReq: js.UndefOr[`false`] = js.native
  var logging: js.UndefOr[Boolean | String | (js.Function1[/* msg */ String, Unit])] = js.native
  var maxEventLoopDelay: js.UndefOr[Double] = js.native
  var maxHeapUsedBytes: js.UndefOr[Double] = js.native
  var maxRssBytes: js.UndefOr[Double] = js.native
  var production: js.UndefOr[Boolean] = js.native
  var sampleInterval: js.UndefOr[Double] = js.native
}

object ProtectionConfig {
  @scala.inline
  def apply(): ProtectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectionConfig]
  }
  @scala.inline
  implicit class ProtectionConfigOps[Self <: ProtectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientRetrySecs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRetrySecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRetrySecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRetrySecs")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorPropagationMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPropagationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorPropagationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorPropagationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStatsOnReq(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStatsOnReq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStatsOnReq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStatsOnReq")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingFunction1(value: /* msg */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLogging(value: Boolean | String | (js.Function1[/* msg */ String, Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEventLoopDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEventLoopDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEventLoopDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEventLoopDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeapUsedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeapUsedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeapUsedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeapUsedBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRssBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRssBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRssBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRssBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withProduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleInterval")(js.undefined)
        ret
    }
  }
  
}

