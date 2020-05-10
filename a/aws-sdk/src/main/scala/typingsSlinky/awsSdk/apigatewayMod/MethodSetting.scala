package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSetting extends js.Object {
  /**
    * Specifies whether the cached responses are encrypted. The PATCH path for this setting is /{method_setting_key}/caching/dataEncrypted, and the value is a Boolean.
    */
  var cacheDataEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the time to live (TTL), in seconds, for cached responses. The higher the TTL, the longer the response will be cached. The PATCH path for this setting is /{method_setting_key}/caching/ttlInSeconds, and the value is an integer.
    */
  var cacheTtlInSeconds: js.UndefOr[Integer] = js.native
  /**
    * Specifies whether responses should be cached and returned for requests. A cache cluster must be enabled on the stage for responses to be cached. The PATCH path for this setting is /{method_setting_key}/caching/enabled, and the value is a Boolean.
    */
  var cachingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether data trace logging is enabled for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting is /{method_setting_key}/logging/dataTrace, and the value is a Boolean.
    */
  var dataTraceEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the logging level for this method, which affects the log entries pushed to Amazon CloudWatch Logs. The PATCH path for this setting is /{method_setting_key}/logging/loglevel, and the available levels are OFF, ERROR, and INFO.
    */
  var loggingLevel: js.UndefOr[String] = js.native
  /**
    * Specifies whether Amazon CloudWatch metrics are enabled for this method. The PATCH path for this setting is /{method_setting_key}/metrics/enabled, and the value is a Boolean.
    */
  var metricsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether authorization is required for a cache invalidation request. The PATCH path for this setting is /{method_setting_key}/caching/requireAuthorizationForCacheControl, and the value is a Boolean.
    */
  var requireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the throttling burst limit. The PATCH path for this setting is /{method_setting_key}/throttling/burstLimit, and the value is an integer.
    */
  var throttlingBurstLimit: js.UndefOr[Integer] = js.native
  /**
    * Specifies the throttling rate limit. The PATCH path for this setting is /{method_setting_key}/throttling/rateLimit, and the value is a double.
    */
  var throttlingRateLimit: js.UndefOr[Double] = js.native
  /**
    * Specifies how to handle unauthorized requests for cache invalidation. The PATCH path for this setting is /{method_setting_key}/caching/unauthorizedCacheControlHeaderStrategy, and the available values are FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER, SUCCEED_WITHOUT_RESPONSE_HEADER.
    */
  var unauthorizedCacheControlHeaderStrategy: js.UndefOr[UnauthorizedCacheControlHeaderStrategy] = js.native
}

object MethodSetting {
  @scala.inline
  def apply(): MethodSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodSetting]
  }
  @scala.inline
  implicit class MethodSettingOps[Self <: MethodSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheDataEncrypted(value: Boolean): Self = {
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
    def withCacheTtlInSeconds(value: Integer): Self = {
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
    def withCachingEnabled(value: Boolean): Self = {
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
    def withDataTraceEnabled(value: Boolean): Self = {
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
    def withLoggingLevel(value: String): Self = {
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
    def withMetricsEnabled(value: Boolean): Self = {
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
    def withRequireAuthorizationForCacheControl(value: Boolean): Self = {
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
    def withThrottlingBurstLimit(value: Integer): Self = {
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
    def withThrottlingRateLimit(value: Double): Self = {
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
    def withUnauthorizedCacheControlHeaderStrategy(value: UnauthorizedCacheControlHeaderStrategy): Self = {
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

