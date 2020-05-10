package typingsSlinky.raygun4js.mod

import typingsSlinky.raygun4js.raygun4jsStrings.onLoad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunOptions extends js.Object {
  /**
    * Posts error payloads over HTTP. This allows IE8 to send JS errors.
    */
  var allowInsecureSubmissions: js.UndefOr[Boolean] = js.native
  /**
    * A string URI containing the protocol, domain and port (optional) where all payloads will be sent to.
    * This can be used to proxy payloads to the Raygun API through your own server. When not set this defaults internally to the Raygun API, and for most usages you won't need to set this.
    */
  var apiEndpoint: js.UndefOr[String] = js.native
  var captureUnhandledRejections: js.UndefOr[Boolean] = js.native
  /**
    * Raygun4JS will log to the console when sending errors.
    */
  var debugMode: js.UndefOr[Boolean] = js.native
  /**
    * Disabling anonymous user tracking.
    */
  var disableAnonymousUserTracking: js.UndefOr[Boolean] = js.native
  /**
    * Prevent uncaught errors from being sent.
    */
  var disableErrorTracking: js.UndefOr[Boolean] = js.native
  /**
    * Prevent Pulse real user monitoring events from being sent.
    */
  var disablePulse: js.UndefOr[Boolean] = js.native
  /**
    * Prevents errors from being sent from certain hostnames (domains) by providing an array of strings or RegExp objects (for partial matches).
    * Each should match the hostname or TLD that you want to exclude. Note that protocols are not tested.
    */
  var excludedHostnames: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  /**
    * Prevents errors from being sent from certain user agents by providing an array of strings.
    * This is very helpful to exclude errors reported by certain browsers or test automation with CasperJS, PhantomJS or any other testing utility that sends a custom user agent.
    * If a part of the client's navigator.userAgent matches one of the given strings in the array, then the client will be excluded from error reporting.
    */
  var excludedUserAgents: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  /**
    * String which can be optionally set "onLoad" which will then boot the RealUserMonitoring side instead of waiting for the `load` event.
    */
  var from: js.UndefOr[String | onLoad] = js.native
  /**
    * Ignores any errors that have no stack trace information. This will discard any errors that occur completely within 3rd party scripts -
    * if code loaded from the current domain called the 3rd party function, it will have at least one stack line and will still be sent.
    */
  var ignore3rdPartyErrors: js.UndefOr[Boolean] = js.native
  /**
    * User-aborted Ajax calls result in errors. If this option is true, these errors will not be sent.
    */
  var ignoreAjaxAbort: js.UndefOr[Boolean] = js.native
  /**
    * Ajax requests that return error codes will not be sent as errors to Raygun if this options is true.
    */
  var ignoreAjaxError: js.UndefOr[Boolean] = js.native
  /**
    * Ignore URL casing when sending data to Pulse.
    */
  var pulseIgnoreUrlCasing: js.UndefOr[Boolean] = js.native
  /**
    * The maximum time a virtual page can be considered viewed, in milliseconds (defaults to 30 minutes).
    */
  var pulseMaxVirtualPageDuration: js.UndefOr[Double] = js.native
  var setCookieAsSecure: js.UndefOr[Boolean] = js.native
  /**
    * If false, async callback functions triggered by setTimeout/setInterval will not be wrapped when attach() is called. Defaults to true
    */
  var wrapAsynchronousCallbacks: js.UndefOr[Boolean] = js.native
}

object RaygunOptions {
  @scala.inline
  def apply(): RaygunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaygunOptions]
  }
  @scala.inline
  implicit class RaygunOptionsOps[Self <: RaygunOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInsecureSubmissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsecureSubmissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsecureSubmissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsecureSubmissions")(js.undefined)
        ret
    }
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
    def withDebugMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAnonymousUserTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnonymousUserTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAnonymousUserTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnonymousUserTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableErrorTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableErrorTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableErrorTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableErrorTracking")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePulse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePulse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePulse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePulse")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedHostnames(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedHostnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedHostnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedHostnames")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedUserAgents(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedUserAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedUserAgents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedUserAgents")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String | onLoad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore3rdPartyErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore3rdPartyErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore3rdPartyErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore3rdPartyErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreAjaxAbort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAjaxAbort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAjaxAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAjaxAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreAjaxError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAjaxError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAjaxError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAjaxError")(js.undefined)
        ret
    }
    @scala.inline
    def withPulseIgnoreUrlCasing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulseIgnoreUrlCasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPulseIgnoreUrlCasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulseIgnoreUrlCasing")(js.undefined)
        ret
    }
    @scala.inline
    def withPulseMaxVirtualPageDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulseMaxVirtualPageDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPulseMaxVirtualPageDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pulseMaxVirtualPageDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCookieAsSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCookieAsSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetCookieAsSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCookieAsSecure")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapAsynchronousCallbacks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAsynchronousCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapAsynchronousCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapAsynchronousCallbacks")(js.undefined)
        ret
    }
  }
  
}

