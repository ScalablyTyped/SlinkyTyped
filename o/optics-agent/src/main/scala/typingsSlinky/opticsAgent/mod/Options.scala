package typingsSlinky.opticsAgent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Your API key for the Optics service.
    *
    * This defaults to the OPTICS_API_KEY environment variable, but can be overridden here.
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * Where to send the reports. Defaults to the production Optics endpoint, or the OPTICS_ENDPOINT_URL environment variable if it is set.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var endpointUrl: js.UndefOr[String] = js.native
  /**
    * Called to determine the query shape for for a GraphQL query.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var normalizeQuery: js.UndefOr[js.Function1[/* graphQLResolveInfo */ js.Any, String]] = js.native
  /**
    * Print a JSON version of reports as they are sent. This may be useful for debugging. Defaults to false.
    */
  var printReports: js.UndefOr[Boolean] = js.native
  /**
    * HTTP proxy to use when sending reports. Default to no proxying, or the HTTPS_PROXY environment variable if it is set.
    *
    * You should only set this when your servers cannot connect directly to the Optics service.
    */
  var proxyUrl: js.UndefOr[String] = js.native
  /**
    * How often to send reports in milliseconds. Defaults to 1 minute. Minimum 10 seconds.
    *
    * You shouldn't need to set this unless you are debugging.
    */
  var reportIntervalMs: js.UndefOr[Double] = js.native
  /**
    * Send detailed traces along with usage reports. Defaults to true.
    */
  var reportTraces: js.UndefOr[Boolean] = js.native
  /**
    * Send the query variables along with traces. Defaults to true.
    */
  var reportVariables: js.UndefOr[Boolean] = js.native
  /**
    * Send statistics when the process exits. Defaults to true.
    */
  var shutdownGracefully: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeQuery(value: /* graphQLResolveInfo */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNormalizeQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeQuery")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintReports(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printReports")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withReportIntervalMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportIntervalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportIntervalMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportIntervalMs")(js.undefined)
        ret
    }
    @scala.inline
    def withReportTraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportTraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTraces")(js.undefined)
        ret
    }
    @scala.inline
    def withReportVariables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withShutdownGracefully(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownGracefully")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutdownGracefully: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownGracefully")(js.undefined)
        ret
    }
  }
  
}

