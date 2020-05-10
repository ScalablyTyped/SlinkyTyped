package typingsSlinky.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracingConfig extends js.Object {
  var disable: js.UndefOr[Boolean] = js.native
  var reporter: js.UndefOr[ReporterConfig] = js.native
  var sampler: js.UndefOr[SamplerConfig] = js.native
  var serviceName: js.UndefOr[String] = js.native
  var shareRpcSpan: js.UndefOr[Boolean] = js.native
  var traceId128bit: js.UndefOr[Boolean] = js.native
}

object TracingConfig {
  @scala.inline
  def apply(): TracingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfig]
  }
  @scala.inline
  implicit class TracingConfigOps[Self <: TracingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: ReporterConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
        ret
    }
    @scala.inline
    def withSampler(value: SamplerConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampler")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withShareRpcSpan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareRpcSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareRpcSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareRpcSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceId128bit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId128bit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceId128bit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traceId128bit")(js.undefined)
        ret
    }
  }
  
}

