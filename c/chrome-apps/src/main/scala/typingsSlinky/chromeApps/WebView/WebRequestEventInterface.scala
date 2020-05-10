package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chrome.webViewRequest.OnMessageEvent
import typingsSlinky.chromeApps.chrome.webViewRequest.OnRequestEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface which provides access to webRequest events on the guest page.
  * @see[chrome.webRequest]{@link http://developer.chrome.com/extensions/webRequest}
  * extensions API for details on webRequest life cycle and related concepts.
  *
  * To illustrate how usage differs from the extensions webRequest API,
  * consider the following example code which blocks any guest requests
  * for URLs which match *://www.evil.com/ *:
  * @example
  * webview.request.onBeforeRequest.addListener(
  *   function(details) { return {cancel: true}; }, {urls: ['*://www.evil.com/ *']}, ['blocking']);
  * @description
  * Additionally, this interface supports declarative webRequest rules through onRequest and onMessage events.
  * @see[Docs]{@link http://developer.chrome.com/extensions/declarativeWebRequest.htmldeclarativeWebRequest}
  * @description
  * Note that conditions and actions for declarative webview webRequests should be instantiated
  * from their chrome.webViewRequest.* counterparts. The following example code declaratively
  * blocks all requests to 'example.com' on the webview myWebview:
  * @example const rule = { conditions: [ new chrome.webViewRequest.RequestMatcher({ url: { hostSuffix: 'example.com' } }) ], actions: [ new chrome.webViewRequest.CancelRequest() ] }; myWebview.request.onRequest.addRules([rule]);
  **/
@js.native
trait WebRequestEventInterface extends js.Object {
  /**
    * Fired when an authentication failure is received.
    * The listener has three options: it can provide authentication credentials,
    * it can cancel the request and display the error page, or it can take no
    * action on the challenge. If bad user credentials are provided, this may be
    * called multiple times for the same request.
    */
  var onAuthRequired: WebAuthenticationChallengeEvent = js.native
  /** Fired when a server-initiated redirect is about to occur. */
  var onBeforeRedirect: WebRedirectionResponseEvent = js.native
  /** Fired when a request is about to occur. */
  var onBeforeRequest: WebRequestBodyEvent = js.native
  /**
    * Fired before sending an HTTP request, once the request headers are available.
    * This may occur after a TCP connection is made to the server, but before any HTTP data is sent.
    */
  var onBeforeSendHeaders: WebRequestHeadersEvent = js.native
  /** Fired when a request is completed. */
  var onCompleted: WebResponseCacheEvent = js.native
  /** Fired when an error occurs. */
  var onErrorOccured: WebResponseErrorEvent = js.native
  /** Fired when HTTP response headers of a request have been received. */
  var onHeadersReceived: WebResponseHeadersEvent = js.native
  /**
    * This interface supports declarative webRequest rules through
    * **onRequest** and **onMessage** events.
    * @see[See declarativeWebRequest for API details.]{@link http://developer.chrome.com/extensions/declarativeWebRequest.html}
    */
  var onMessage: OnMessageEvent = js.native
  /**
    * Provides the Declarative Event API consisting of addRules, removeRules, and getRules.
    * This interface supports declarative webRequest rules through
    * **onRequest** and **onMessage** events.
    * @see[See declarativeWebRequest for API details.]{@link http://developer.chrome.com/extensions/declarativeWebRequest.html}
    */
  var onRequest: OnRequestEvent = js.native
  /**
    * Fired when the first byte of the response body is received.
    * For HTTP requests, this means that the status line and
    * response headers are available.
    */
  var onResponseStarted: WebResponseCacheEvent = js.native
  /**
    * Fired just before a request is going to be sent to the server
    * (modifications of previous onBeforeSendHeaders callbacks
    * are visible by the time onSendHeaders is fired).
    */
  var onSendHeaders: WebRequestHeadersEvent = js.native
}

object WebRequestEventInterface {
  @scala.inline
  def apply(
    onAuthRequired: WebAuthenticationChallengeEvent,
    onBeforeRedirect: WebRedirectionResponseEvent,
    onBeforeRequest: WebRequestBodyEvent,
    onBeforeSendHeaders: WebRequestHeadersEvent,
    onCompleted: WebResponseCacheEvent,
    onErrorOccured: WebResponseErrorEvent,
    onHeadersReceived: WebResponseHeadersEvent,
    onMessage: OnMessageEvent,
    onRequest: OnRequestEvent,
    onResponseStarted: WebResponseCacheEvent,
    onSendHeaders: WebRequestHeadersEvent
  ): WebRequestEventInterface = {
    val __obj = js.Dynamic.literal(onAuthRequired = onAuthRequired.asInstanceOf[js.Any], onBeforeRedirect = onBeforeRedirect.asInstanceOf[js.Any], onBeforeRequest = onBeforeRequest.asInstanceOf[js.Any], onBeforeSendHeaders = onBeforeSendHeaders.asInstanceOf[js.Any], onCompleted = onCompleted.asInstanceOf[js.Any], onErrorOccured = onErrorOccured.asInstanceOf[js.Any], onHeadersReceived = onHeadersReceived.asInstanceOf[js.Any], onMessage = onMessage.asInstanceOf[js.Any], onRequest = onRequest.asInstanceOf[js.Any], onResponseStarted = onResponseStarted.asInstanceOf[js.Any], onSendHeaders = onSendHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestEventInterface]
  }
  @scala.inline
  implicit class WebRequestEventInterfaceOps[Self <: WebRequestEventInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnAuthRequired(value: WebAuthenticationChallengeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAuthRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBeforeRedirect(value: WebRedirectionResponseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRedirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBeforeRequest(value: WebRequestBodyEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBeforeSendHeaders(value: WebRequestHeadersEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeSendHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCompleted(value: WebResponseCacheEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnErrorOccured(value: WebResponseErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorOccured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnHeadersReceived(value: WebResponseHeadersEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHeadersReceived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnMessage(value: OnMessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRequest(value: OnRequestEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnResponseStarted(value: WebResponseCacheEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResponseStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSendHeaders(value: WebRequestHeadersEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSendHeaders")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

