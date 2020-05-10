package typingsSlinky.amplitudeJs.mod

import typingsSlinky.amplitudeJs.AnonCarrier
import typingsSlinky.amplitudeJs.amplitudeJsStrings.DISABLE
import typingsSlinky.amplitudeJs.amplitudeJsStrings.ERROR
import typingsSlinky.amplitudeJs.amplitudeJsStrings.INFO
import typingsSlinky.amplitudeJs.amplitudeJsStrings.WARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var apiEndpoint: js.UndefOr[String] = js.native
  var batchEvents: js.UndefOr[Boolean] = js.native
  var cookieExpiration: js.UndefOr[Double] = js.native
  var cookieName: js.UndefOr[String] = js.native
  var deviceId: js.UndefOr[String] = js.native
  var deviceIdFromUrlParam: js.UndefOr[Boolean] = js.native
  var domain: js.UndefOr[String] = js.native
  var eventUploadPeriodMillis: js.UndefOr[Double] = js.native
  var eventUploadThreshold: js.UndefOr[Double] = js.native
  var forceHttps: js.UndefOr[Boolean] = js.native
  var includeGclid: js.UndefOr[Boolean] = js.native
  var includeReferrer: js.UndefOr[Boolean] = js.native
  var includeUtm: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[DISABLE | ERROR | WARN | INFO] = js.native
  var onError: js.UndefOr[js.Function0[Unit]] = js.native
  var optOut: js.UndefOr[Boolean] = js.native
  var platform: js.UndefOr[String] = js.native
  var saveEvents: js.UndefOr[Boolean] = js.native
  var saveParamsReferrerOncePerSession: js.UndefOr[Boolean] = js.native
  var savedMaxCount: js.UndefOr[Double] = js.native
  var secureCookie: js.UndefOr[Boolean] = js.native
  var sessionTimeout: js.UndefOr[Double] = js.native
  var trackingOptions: js.UndefOr[AnonCarrier] = js.native
  var unsentIdentifyKey: js.UndefOr[String] = js.native
  var unsentKey: js.UndefOr[String] = js.native
  var unsetParamsReferrerOnNewSession: js.UndefOr[Boolean] = js.native
  var uploadBatchSize: js.UndefOr[Double] = js.native
  var useNativeDeviceInfo: js.UndefOr[Boolean] = js.native
  var userId: js.UndefOr[String] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieExpiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceIdFromUrlParam(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIdFromUrlParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceIdFromUrlParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIdFromUrlParam")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withEventUploadPeriodMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventUploadPeriodMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventUploadPeriodMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventUploadPeriodMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withEventUploadThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventUploadThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventUploadThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventUploadThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withForceHttps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHttps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceHttps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceHttps")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeGclid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGclid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeGclid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGclid")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeReferrer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeReferrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeReferrer")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeUtm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUtm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeUtm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUtm")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: DISABLE | ERROR | WARN | INFO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOptOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optOut")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveParamsReferrerOncePerSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveParamsReferrerOncePerSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveParamsReferrerOncePerSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveParamsReferrerOncePerSession")(js.undefined)
        ret
    }
    @scala.inline
    def withSavedMaxCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedMaxCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedMaxCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedMaxCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureCookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureCookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureCookie")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingOptions(value: AnonCarrier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsentIdentifyKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsentIdentifyKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsentIdentifyKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsentIdentifyKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsentKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsentKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsentKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsentKey")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsetParamsReferrerOnNewSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsetParamsReferrerOnNewSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsetParamsReferrerOnNewSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsetParamsReferrerOnNewSession")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadBatchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadBatchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUseNativeDeviceInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDeviceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeDeviceInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDeviceInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

