package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSettings extends js.Object {
  /**
    * Specifies whether (true) or not (false) data trace logging is enabled for this route. This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for WebSocket APIs.
    */
  var DataTraceEnabled: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether detailed metrics are enabled.
    */
  var DetailedMetricsEnabled: js.UndefOr[boolean] = js.native
  /**
    * Specifies the logging level for this route: INFO, ERROR, or OFF. This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for WebSocket APIs.
    */
  var LoggingLevel: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.LoggingLevel] = js.native
  /**
    * Specifies the throttling burst limit.
    */
  var ThrottlingBurstLimit: js.UndefOr[integer] = js.native
  /**
    * Specifies the throttling rate limit.
    */
  var ThrottlingRateLimit: js.UndefOr[double] = js.native
}

object RouteSettings {
  @scala.inline
  def apply(): RouteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSettings]
  }
  @scala.inline
  implicit class RouteSettingsOps[Self <: RouteSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataTraceEnabled(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTraceEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTraceEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTraceEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailedMetricsEnabled(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailedMetricsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailedMetricsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DetailedMetricsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingLevel(value: LoggingLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottlingBurstLimit(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrottlingBurstLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottlingBurstLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrottlingBurstLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottlingRateLimit(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrottlingRateLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottlingRateLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThrottlingRateLimit")(js.undefined)
        ret
    }
  }
  
}

