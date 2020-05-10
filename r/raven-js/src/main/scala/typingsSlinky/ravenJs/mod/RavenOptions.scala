package typingsSlinky.ravenJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RavenOptions extends js.Object {
  /**
    * By default, Raven.js attempts to suppress duplicate captured errors and messages that occur back-to-back.
    * Such events are often triggered by rogue code (e.g. from a `setInterval` callback in a browser extension),
    * are not actionable, and eat up your event quota.
    */
  var allowDuplicates: js.UndefOr[Boolean] = js.native
  /** Allow use of private/secretKey. */
  var allowSecretKey: js.UndefOr[Boolean] = js.native
  /** Enables/disables automatic collection of breadcrumbs. */
  var autoBreadcrumbs: js.UndefOr[Boolean | AutoBreadcrumbOptions] = js.native
  /** A function that allows filtering or mutating breadcrumb payloads. Return false to throw away the breadcrumb. */
  var breadcrumbCallback: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  /** By default, Raven captures all unhandled promise rejections using standard `unhandledrejection` event. If you want to disable this behaviour, set this option to `false` */
  var captureUnhandledRejections: js.UndefOr[Boolean] = js.native
  /** A function which allows mutation of the data payload right before being sent to Sentry */
  var dataCallback: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  /**
    * If set to true, Raven.js outputs some light debugging information onto the console.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /** The environment of the application you are monitoring with Sentry */
  var environment: js.UndefOr[String] = js.native
  var extra: js.UndefOr[js.Any] = js.native
  /** `fetch` init parameters */
  var fetchParameters: js.UndefOr[StringDictionary[String | js.Function]] = js.native
  /** In some cases you may see issues where Sentry groups multiple events together when they should be separate entities. In other cases, Sentry simply doesn’t group events together because they’re so sporadic that they never look the same. */
  var fingerprint: js.UndefOr[js.Array[String]] = js.native
  /** Append headers to the fetch or XMLHttpRequest request. Should be in a form of hash, were value can be string or function */
  var headers: js.UndefOr[StringDictionary[String | js.Function]] = js.native
  /** List of messages to be filtered out before being sent to Sentry. */
  var ignoreErrors: js.UndefOr[js.Array[js.RegExp | String]] = js.native
  /** Similar to ignoreErrors, but will ignore errors from whole urls patching a regex pattern. */
  var ignoreUrls: js.UndefOr[js.Array[js.RegExp | String]] = js.native
  /** An array of regex patterns to indicate which urls are a part of your app. */
  var includePaths: js.UndefOr[js.Array[js.RegExp | String]] = js.native
  /** Enables/disables instrumentation of globals. */
  var instrument: js.UndefOr[Boolean | RavenInstrumentationOptions] = js.native
  /** The log level associated with this event. Default: error */
  var level: js.UndefOr[LogLevel] = js.native
  /** The name of the logger used by Sentry. Default: javascript */
  var logger: js.UndefOr[String] = js.native
  /** By default, Raven captures as many as 100 breadcrumb entries. If you find this too noisy, you can reduce this number by setting maxBreadcrumbs. Note that this number cannot be set higher than the default of 100. */
  var maxBreadcrumbs: js.UndefOr[Double] = js.native
  /** By default, Raven does not truncate messages. If you need to truncate characters for whatever reason, you may set this to limit the length. */
  var maxMessageLength: js.UndefOr[Double] = js.native
  /** By default, Raven will truncate URLs as they appear in breadcrumbs and other meta interfaces to 250 characters in order to minimize bytes over the wire. This does *not* affect URLs in stack traces. */
  var maxUrlLength: js.UndefOr[Double] = js.native
  /** The release version of the application you are monitoring with Sentry */
  var release: js.UndefOr[String] = js.native
  /**
    * A sampling rate to apply to events. A value of 0.0 will send no events, and a value of 1.0 will send all events (default).
    */
  var sampleRate: js.UndefOr[Double] = js.native
  /** An array of strings representing keys that should be scrubbed from the payload sent to Sentry */
  var sanitizeKeys: js.UndefOr[js.Array[js.RegExp | String]] = js.native
  /** The name of the server or device that the client is running on */
  var serverName: js.UndefOr[String] = js.native
  /** A callback function that allows you to apply your own filters to determine if the message should be sent to Sentry. */
  var shouldSendCallback: js.UndefOr[js.Function1[/* data */ js.Any, Boolean]] = js.native
  /** set to true to get the stack trace of your message */
  var stacktrace: js.UndefOr[Boolean] = js.native
  /** Additional data to be tagged onto the error. */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  /** Override the default HTTP data transport handler. */
  var transport: js.UndefOr[js.Function1[/* options */ RavenTransportOptions, Unit]] = js.native
  /** The inverse of ignoreUrls. Only report errors from whole urls matching a regex pattern. */
  var whitelistUrls: js.UndefOr[js.Array[js.RegExp | String]] = js.native
}

object RavenOptions {
  @scala.inline
  def apply(): RavenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RavenOptions]
  }
  @scala.inline
  implicit class RavenOptionsOps[Self <: RavenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDuplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDuplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDuplicates")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSecretKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSecretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSecretKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSecretKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoBreadcrumbs(value: Boolean | AutoBreadcrumbOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBreadcrumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBreadcrumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBreadcrumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withBreadcrumbCallback(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBreadcrumbCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureUnhandledRejections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureUnhandledRejections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureUnhandledRejections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureUnhandledRejections")(js.undefined)
        ret
    }
    @scala.inline
    def withDataCallback(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataCallback")(js.undefined)
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
    def withEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchParameters(value: StringDictionary[String | js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String | js.Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreErrors(value: js.Array[js.RegExp | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUrls(value: js.Array[js.RegExp | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePaths(value: js.Array[js.RegExp | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withInstrument(value: Boolean | RavenInstrumentationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstrument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrument")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: String): Self = {
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
    def withMaxBreadcrumbs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBreadcrumbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBreadcrumbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBreadcrumbs")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMessageLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessageLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMessageLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMessageLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxUrlLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUrlLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxUrlLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxUrlLength")(js.undefined)
        ret
    }
    @scala.inline
    def withRelease(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.undefined)
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
    def withSanitizeKeys(value: js.Array[js.RegExp | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizeKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSanitizeKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizeKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldSendCallback(value: /* data */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSendCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShouldSendCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSendCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withStacktrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacktrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStacktrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stacktrace")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[String]): Self = {
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
    def withTransport(value: /* options */ RavenTransportOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelistUrls(value: js.Array[js.RegExp | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelistUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelistUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelistUrls")(js.undefined)
        ret
    }
  }
  
}

