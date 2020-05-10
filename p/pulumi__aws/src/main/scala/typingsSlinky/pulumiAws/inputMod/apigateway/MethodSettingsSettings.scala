package typingsSlinky.pulumiAws.inputMod.apigateway

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSettingsSettings extends js.Object {
  /**
    * Specifies whether the cached responses are encrypted.
    */
  var cacheDataEncrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached.
    */
  var cacheTtlInSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached.
    */
  var cachingEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether data trace logging is enabled for this method, which effects the log entries pushed to Amazon CloudWatch Logs.
    */
  var dataTraceEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies the logging level for this method, which effects the log entries pushed to Amazon CloudWatch Logs. The available levels are `OFF`, `ERROR`, and `INFO`.
    */
  var loggingLevel: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether Amazon CloudWatch metrics are enabled for this method.
    */
  var metricsEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether authorization is required for a cache invalidation request.
    */
  var requireAuthorizationForCacheControl: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies the throttling burst limit.
    */
  var throttlingBurstLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies the throttling rate limit.
    */
  var throttlingRateLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies how to handle unauthorized requests for cache invalidation. The available values are `FAIL_WITH_403`, `SUCCEED_WITH_RESPONSE_HEADER`, `SUCCEED_WITHOUT_RESPONSE_HEADER`.
    */
  var unauthorizedCacheControlHeaderStrategy: js.UndefOr[Input[String]] = js.native
}

object MethodSettingsSettings {
  @scala.inline
  def apply(): MethodSettingsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodSettingsSettings]
  }
  @scala.inline
  implicit class MethodSettingsSettingsOps[Self <: MethodSettingsSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheDataEncrypted(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDataEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheDataEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDataEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheTtlInSeconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTtlInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheTtlInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheTtlInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withCachingEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTraceEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTraceEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTraceEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTraceEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingLevel(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricsEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireAuthorizationForCacheControl(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireAuthorizationForCacheControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireAuthorizationForCacheControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireAuthorizationForCacheControl")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottlingBurstLimit(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttlingBurstLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottlingBurstLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttlingBurstLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottlingRateLimit(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttlingRateLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottlingRateLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttlingRateLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withUnauthorizedCacheControlHeaderStrategy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unauthorizedCacheControlHeaderStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnauthorizedCacheControlHeaderStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unauthorizedCacheControlHeaderStrategy")(js.undefined)
        ret
    }
  }
  
}

