package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfig extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var appId: js.UndefOr[String] = js.native
  var autoTrackPageVisitTime: js.UndefOr[Boolean] = js.native
  var cookieDomain: js.UndefOr[String] = js.native
  var correlationHeaderExcludedDomains: js.UndefOr[js.Array[String]] = js.native
  var diagnosticLogInterval: js.UndefOr[Double] = js.native
  var disableAjaxTracking: js.UndefOr[Boolean] = js.native
  var disableCorrelationHeaders: js.UndefOr[Boolean] = js.native
  var disableDataLossAnalysis: js.UndefOr[Boolean] = js.native
  var disableExceptionTracking: js.UndefOr[Boolean] = js.native
  var disableFlushOnBeforeUnload: js.UndefOr[Boolean] = js.native
  var disableTelemetry: js.UndefOr[Boolean] = js.native
  var emitLineDelimitedJson: js.UndefOr[Boolean] = js.native
  var enableCorsCorrelation: js.UndefOr[Boolean] = js.native
  var enableDebug: js.UndefOr[Boolean] = js.native
  var enableSessionStorageBuffer: js.UndefOr[Boolean] = js.native
  var endpointUrl: js.UndefOr[String] = js.native
  var instrumentationKey: js.UndefOr[String] = js.native
  var isBeaconApiDisabled: js.UndefOr[Boolean] = js.native
  var isBrowserLinkTrackingEnabled: js.UndefOr[Boolean] = js.native
  var isCookieUseDisabled: js.UndefOr[Boolean] = js.native
  var isRetryDisabled: js.UndefOr[Boolean] = js.native
  var isStorageUseDisabled: js.UndefOr[Boolean] = js.native
  var maxAjaxCallsPerView: js.UndefOr[Double] = js.native
  var maxBatchInterval: js.UndefOr[Double] = js.native
  var maxBatchSizeInBytes: js.UndefOr[Double] = js.native
  var overridePageViewDuration: js.UndefOr[Boolean] = js.native
  var samplingPercentage: js.UndefOr[Double] = js.native
  var sdkExtension: js.UndefOr[String] = js.native
  var sessionExpirationMs: js.UndefOr[Double] = js.native
  var sessionRenewalMs: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var verboseLogging: js.UndefOr[Boolean] = js.native
}

object IConfig {
  @scala.inline
  def apply(): IConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConfig]
  }
  @scala.inline
  implicit class IConfigOps[Self <: IConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoTrackPageVisitTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTrackPageVisitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoTrackPageVisitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTrackPageVisitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrelationHeaderExcludedDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationHeaderExcludedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelationHeaderExcludedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationHeaderExcludedDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnosticLogInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticLogInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnosticLogInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosticLogInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAjaxTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAjaxTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAjaxTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAjaxTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCorrelationHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCorrelationHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCorrelationHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCorrelationHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDataLossAnalysis(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDataLossAnalysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDataLossAnalysis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDataLossAnalysis")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableExceptionTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableExceptionTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableExceptionTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableExceptionTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFlushOnBeforeUnload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFlushOnBeforeUnload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFlushOnBeforeUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFlushOnBeforeUnload")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTelemetry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTelemetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTelemetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTelemetry")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitLineDelimitedJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitLineDelimitedJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitLineDelimitedJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitLineDelimitedJson")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCorsCorrelation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCorsCorrelation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCorsCorrelation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCorsCorrelation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDebug")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSessionStorageBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSessionStorageBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSessionStorageBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSessionStorageBuffer")(js.undefined)
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
    def withInstrumentationKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentationKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstrumentationKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentationKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBeaconApiDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeaconApiDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBeaconApiDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBeaconApiDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsBrowserLinkTrackingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBrowserLinkTrackingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsBrowserLinkTrackingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBrowserLinkTrackingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCookieUseDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCookieUseDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCookieUseDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCookieUseDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRetryDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRetryDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRetryDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRetryDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStorageUseDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStorageUseDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStorageUseDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStorageUseDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAjaxCallsPerView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAjaxCallsPerView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAjaxCallsPerView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAjaxCallsPerView")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBatchInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBatchInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBatchInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBatchInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBatchSizeInBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBatchSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBatchSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBatchSizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withOverridePageViewDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridePageViewDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverridePageViewDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridePageViewDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withSdkExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdkExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionExpirationMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionExpirationMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionExpirationMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionExpirationMs")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionRenewalMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionRenewalMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionRenewalMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionRenewalMs")(js.undefined)
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
    @scala.inline
    def withVerboseLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verboseLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerboseLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verboseLogging")(js.undefined)
        ret
    }
  }
  
}

