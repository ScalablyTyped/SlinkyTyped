package typingsSlinky.ddTrace.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ddTrace.AnonB3
import typingsSlinky.ddTrace.AnonDebug
import typingsSlinky.ddTrace.AnonPort
import typingsSlinky.ddTrace.ddTraceStrings.async_hooks
import typingsSlinky.ddTrace.ddTraceStrings.noop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracerOptions extends js.Object {
  /**
    * Enable Trace Analytics.
    * @default false
    */
  var analytics: js.UndefOr[Boolean] = js.native
  /**
    * Enable debug logging in the tracer.
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Options specific for the Dogstatsd agent.
    */
  var dogstatsd: js.UndefOr[AnonPort] = js.native
  /**
    * Whether to enable the tracer.
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Set an application’s environment e.g. prod, pre-prod, stage.
    */
  var env: js.UndefOr[String] = js.native
  /**
    * Experimental features can be enabled all at once by using true or individually using key / value pairs.
    * @default {}
    */
  var experimental: js.UndefOr[Boolean | AnonB3] = js.native
  /**
    * Interval in milliseconds at which the tracer will submit traces to the agent.
    * @default 2000
    */
  var flushInterval: js.UndefOr[Double] = js.native
  /**
    * The address of the trace agent that the tracer will submit to.
    * @default 'localhost'
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * Whether to enable trace ID injection in log records to be able to correlate
    * traces with logs.
    * @default false
    */
  var logInjection: js.UndefOr[Boolean] = js.native
  /**
    * Custom logger to be used by the tracer (if debug = true),
    * should support debug() and error() methods
    * see https://datadog.github.io/dd-trace-js/#custom-logging
    */
  var logger: js.UndefOr[AnonDebug] = js.native
  /**
    * Whether to load all built-in plugins.
    * @default true
    */
  var plugins: js.UndefOr[Boolean] = js.native
  /**
    * The port of the trace agent that the tracer will submit to.
    * @default 8126
    */
  var port: js.UndefOr[Double | String] = js.native
  /**
    * Whether to report the hostname of the service host. This is used when the agent is deployed on a different host and cannot determine the hostname automatically.
    * @default false
    */
  var reportHostname: js.UndefOr[Boolean] = js.native
  /**
    * Whether to enable runtime metrics.
    * @default false
    */
  var runtimeMetrics: js.UndefOr[Boolean] = js.native
  /**
    * Percentage of spans to sample as a float between 0 and 1.
    * @default 1
    */
  var sampleRate: js.UndefOr[Double] = js.native
  /**
    * Specifies which scope implementation to use. The default is to use the best
    * implementation for the runtime. Only change this if you know what you are
    * doing.
    */
  var scope: js.UndefOr[async_hooks | noop] = js.native
  /**
    * The service name to be used for this program. If not set, the service name
    * will attempted to be inferred from package.json
    */
  var service: js.UndefOr[String] = js.native
  /**
    * Global tags that should be assigned to every span.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The url of the trace agent that the tracer will submit to.
    * Takes priority over hostname and port, if set.
    */
  var url: js.UndefOr[String] = js.native
}

object TracerOptions {
  @scala.inline
  def apply(): TracerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracerOptions]
  }
  @scala.inline
  implicit class TracerOptionsOps[Self <: TracerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalytics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalytics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analytics")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDogstatsd(value: AnonPort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dogstatsd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDogstatsd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dogstatsd")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimental(value: Boolean | AnonB3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimental: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(js.undefined)
        ret
    }
    @scala.inline
    def withFlushInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlushInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withLogInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logInjection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogInjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logInjection")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: AnonDebug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double | String): Self = {
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
    def withReportHostname(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportHostname")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeMetrics(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: async_hooks | noop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

