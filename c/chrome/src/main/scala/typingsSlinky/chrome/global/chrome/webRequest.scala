package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.webRequest.WebAuthenticationChallengeEvent
import typingsSlinky.chrome.chrome.webRequest.WebRedirectionResponseEvent
import typingsSlinky.chrome.chrome.webRequest.WebRequestBodyEvent
import typingsSlinky.chrome.chrome.webRequest.WebRequestHeadersEvent
import typingsSlinky.chrome.chrome.webRequest.WebRequestHeadersSynchronousEvent
import typingsSlinky.chrome.chrome.webRequest.WebResponseCacheEvent
import typingsSlinky.chrome.chrome.webRequest.WebResponseErrorEvent
import typingsSlinky.chrome.chrome.webRequest.WebResponseHeadersEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Web Request
////////////////////
/**
  * Use the chrome.webRequest API to observe and analyze traffic and to intercept, block, or modify requests in-flight.
  * Permissions:  "webRequest", host permissions
  * @since Chrome 17.
  */
object webRequest {
  
  @JSGlobal("chrome.webRequest")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.webRequest.MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES")
  @js.native
  def MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES: Double = js.native
  @scala.inline
  def MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_HANDLER_BEHAVIOR_CHANGED_CALLS_PER_10_MINUTES")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.handlerBehaviorChanged")
  @js.native
  def handlerBehaviorChanged(): Unit = js.native
  @JSGlobal("chrome.webRequest.handlerBehaviorChanged")
  @js.native
  def handlerBehaviorChanged(callback: js.Function): Unit = js.native
  
  @JSGlobal("chrome.webRequest.onAuthRequired")
  @js.native
  def onAuthRequired: WebAuthenticationChallengeEvent = js.native
  @scala.inline
  def onAuthRequired_=(x: WebAuthenticationChallengeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAuthRequired")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onBeforeRedirect")
  @js.native
  def onBeforeRedirect: WebRedirectionResponseEvent = js.native
  @scala.inline
  def onBeforeRedirect_=(x: WebRedirectionResponseEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRedirect")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onBeforeRequest")
  @js.native
  def onBeforeRequest: WebRequestBodyEvent = js.native
  @scala.inline
  def onBeforeRequest_=(x: WebRequestBodyEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRequest")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onBeforeSendHeaders")
  @js.native
  def onBeforeSendHeaders: WebRequestHeadersSynchronousEvent = js.native
  @scala.inline
  def onBeforeSendHeaders_=(x: WebRequestHeadersSynchronousEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeSendHeaders")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onCompleted")
  @js.native
  def onCompleted: WebResponseCacheEvent = js.native
  @scala.inline
  def onCompleted_=(x: WebResponseCacheEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCompleted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onErrorOccurred")
  @js.native
  def onErrorOccurred: WebResponseErrorEvent = js.native
  @scala.inline
  def onErrorOccurred_=(x: WebResponseErrorEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onErrorOccurred")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onHeadersReceived")
  @js.native
  def onHeadersReceived: WebResponseHeadersEvent = js.native
  @scala.inline
  def onHeadersReceived_=(x: WebResponseHeadersEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHeadersReceived")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onResponseStarted")
  @js.native
  def onResponseStarted: WebResponseCacheEvent = js.native
  @scala.inline
  def onResponseStarted_=(x: WebResponseCacheEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResponseStarted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.webRequest.onSendHeaders")
  @js.native
  def onSendHeaders: WebRequestHeadersEvent = js.native
  @scala.inline
  def onSendHeaders_=(x: WebRequestHeadersEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSendHeaders")(x.asInstanceOf[js.Any])
}
