package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.webRequest.BlockingResponse
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.SecurityInfo
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.WebRequestOnAuthRequiredEvent
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.WebRequestOnBeforeRedirectEvent
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.WebRequestOnBeforeRequestEvent
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.WebRequestOnBeforeSendHeadersEvent
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.WebRequestOnCompletedEvent
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.WebRequestOnErrorOccurredEvent
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.WebRequestOnHeadersReceivedEvent
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.WebRequestOnResponseStartedEvent
import typingsSlinky.firefoxWebextBrowser.browser.webRequest.WebRequestOnSendHeadersEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofwebRequest extends js.Object {
  
  /* webRequest properties */
  /**
    * The maximum number of times that `handlerBehaviorChanged` can be called per 10 minute sustained interval.
    * `handlerBehaviorChanged` is an expensive function call that shouldn't be called often.
    */
  val MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  
  /** ... */
  def filterResponseData(requestId: String): js.Object = js.native
  
  /**
    * Retrieves the security information for the request. Returns a promise that will resolve to a SecurityInfo object.
    */
  def getSecurityInfo(requestId: String): js.Promise[SecurityInfo] = js.native
  def getSecurityInfo(requestId: String, options: CertificateChain): js.Promise[SecurityInfo] = js.native
  
  /* webRequest functions */
  /**
    * Needs to be called when the behavior of the webRequest handlers has changed to prevent incorrect handling due to
    * caching. This function call is expensive. Don't call it often.
    */
  def handlerBehaviorChanged(): js.Promise[Unit] = js.native
  
  /**
    * Fired when an authentication failure is received. The listener has three options: it can provide authentication
    * credentials, it can cancel the request and display the error page, or it can take no action on the challenge. If
    * bad user credentials are provided, this may be called multiple times for the same request.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
    *     of this type.
    */
  val onAuthRequired: WebRequestOnAuthRequiredEvent[
    js.Function1[/* details */ Challenger, BlockingResponse | js.Promise[BlockingResponse] | Unit]
  ] = js.native
  
  /** Fired when a server-initiated redirect is about to occur. */
  val onBeforeRedirect: WebRequestOnBeforeRedirectEvent[js.Function1[/* details */ Ip, Unit]] = js.native
  
  /* webRequest events */
  /**
    * Fired when a request is about to occur.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
    *     of this type.
    */
  val onBeforeRequest: WebRequestOnBeforeRequestEvent[
    js.Function1[/* details */ DocumentUrl, BlockingResponse | js.Promise[BlockingResponse] | Unit]
  ] = js.native
  
  /**
    * Fired before sending an HTTP request, once the request headers are available. This may occur after a TCP
    * connection is made to the server, but before any HTTP data is sent.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
    *     of this type.
    */
  val onBeforeSendHeaders: WebRequestOnBeforeSendHeadersEvent[
    js.Function1[/* details */ Incognito, BlockingResponse | js.Promise[BlockingResponse] | Unit]
  ] = js.native
  
  /** Fired when a request is completed. */
  val onCompleted: WebRequestOnCompletedEvent[js.Function1[/* details */ OriginUrl, Unit]] = js.native
  
  /** Fired when an error occurs. */
  val onErrorOccurred: WebRequestOnErrorOccurredEvent[js.Function1[/* details */ RequestId, Unit]] = js.native
  
  /**
    * Fired when HTTP response headers of a request have been received.
    * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
    *     of this type.
    */
  val onHeadersReceived: WebRequestOnHeadersReceivedEvent[
    js.Function1[/* details */ Method, BlockingResponse | js.Promise[BlockingResponse] | Unit]
  ] = js.native
  
  /**
    * Fired when the first byte of the response body is received. For HTTP requests, this means that the status line
    * and response headers are available.
    */
  val onResponseStarted: WebRequestOnResponseStartedEvent[js.Function1[/* details */ FromCache, Unit]] = js.native
  
  /**
    * Fired just before a request is going to be sent to the server (modifications of previous onBeforeSendHeaders
    * callbacks are visible by the time onSendHeaders is fired).
    */
  val onSendHeaders: WebRequestOnSendHeadersEvent[js.Function1[/* details */ Incognito, Unit]] = js.native
}
