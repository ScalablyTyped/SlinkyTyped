package typingsSlinky.chromeApps.WebView

import typingsSlinky.chromeApps.chrome.webViewRequest.OnMessageEvent
import typingsSlinky.chromeApps.chrome.webViewRequest.OnRequestEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait WebRequestEventInterface extends StObject {
  
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
  implicit class WebRequestEventInterfaceMutableBuilder[Self <: WebRequestEventInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnAuthRequired(value: WebAuthenticationChallengeEvent): Self = StObject.set(x, "onAuthRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBeforeRedirect(value: WebRedirectionResponseEvent): Self = StObject.set(x, "onBeforeRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBeforeRequest(value: WebRequestBodyEvent): Self = StObject.set(x, "onBeforeRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBeforeSendHeaders(value: WebRequestHeadersEvent): Self = StObject.set(x, "onBeforeSendHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCompleted(value: WebResponseCacheEvent): Self = StObject.set(x, "onCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorOccured(value: WebResponseErrorEvent): Self = StObject.set(x, "onErrorOccured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHeadersReceived(value: WebResponseHeadersEvent): Self = StObject.set(x, "onHeadersReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMessage(value: OnMessageEvent): Self = StObject.set(x, "onMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRequest(value: OnRequestEvent): Self = StObject.set(x, "onRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResponseStarted(value: WebResponseCacheEvent): Self = StObject.set(x, "onResponseStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSendHeaders(value: WebRequestHeadersEvent): Self = StObject.set(x, "onSendHeaders", value.asInstanceOf[js.Any])
  }
}
