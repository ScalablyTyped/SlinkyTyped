package typingsSlinky.chromeApps.global.chrome

import typingsSlinky.chromeApps.chrome.webViewRequest.AddCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.AddResponseHeaderParams
import typingsSlinky.chromeApps.chrome.webViewRequest.EditCookieParams
import typingsSlinky.chromeApps.chrome.webViewRequest.FilterResponseCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.IgnoreRulesParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RedirectByRegExParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RedirectRequestParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RemoveCookieParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RemoveRequestHeaderParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RemoveResponseHeaderParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RequestCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.RequestMatcherFields
import typingsSlinky.chromeApps.chrome.webViewRequest.ResponseCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.SendMessageParams
import typingsSlinky.chromeApps.chrome.webViewRequest.SetRequestHeaderParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.webViewRequest
/////////////////////
// WebView Request //
/////////////////////
/**
  * @requires Permissions: 'webview'
  * @description
  * Use the *chrome.webViewRequest* API to intercept, block, or modify requests in-flight.
  */
@JSGlobal("chrome.webViewRequest")
@js.native
object webViewRequest extends js.Object {
  
  /**
    * Adds a cookie to the request or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @js.native
  class AddRequestCookie protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.AddRequestCookie {
    def this(parameters: AddCookie[RequestCookie]) = this()
  }
  
  /**
    * Adds a cookie to the response or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @js.native
  class AddResponseCookie protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.AddResponseCookie {
    def this(parameters: AddCookie[ResponseCookie]) = this()
  }
  
  /**
    * Adds the response header to the response of this web request.
    * As multiple response headers may share the same name,
    * you need to first remove and then add a new
    * response header in order to replace one.
    */
  @js.native
  class AddResponseHeader protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.AddResponseHeader {
    def this(parameters: AddResponseHeaderParams) = this()
  }
  
  /** Declarative event action that cancels a network request. */
  @js.native
  class CancelRequest ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.CancelRequest
  
  /**
    * Edits one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @js.native
  class EditRequestCookie protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.EditRequestCookie {
    /**
      * @param filter
      * @param modification Attributes that shall be overridden in cookies that machted the filter.
      *                     Attributes that are set to an empty string are removed.
      */
    def this(parameters: EditCookieParams[RequestCookie, RequestCookie]) = this()
  }
  
  /**
    * Edits one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @js.native
  class EditResponseCookie protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.EditResponseCookie {
    /**
      * @param filter Filter for cookies that will be modified.All empty entries are ignored.
      * @param modification
      */
    def this(parameter: EditCookieParams[FilterResponseCookie, ResponseCookie]) = this()
  }
  
  /**
    * Masks all rules that match the specified criteria.
    */
  @js.native
  class IgnoreRules protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.IgnoreRules {
    def this(parameters: IgnoreRulesParams) = this()
  }
  
  /**
    * Redirects a request by applying a regular expression on the URL.
    * The regular expressions use the RE2 syntax.
    * @see[RE2 syntax]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
    */
  @js.native
  class RedirectByRegEx protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.RedirectByRegEx {
    def this(parameters: RedirectByRegExParams) = this()
  }
  
  /** Declarative event action that redirects a network request.  */
  @js.native
  class RedirectRequest protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.RedirectRequest {
    def this(parameters: RedirectRequestParams) = this()
  }
  
  /** Declarative event action that redirects a network request to an empty document. */
  @js.native
  class RedirectToEmptyDocument ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.RedirectToEmptyDocument
  
  /** Declarative event action that redirects a network request to a transparent image. */
  @js.native
  class RedirectToTransparentImage ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.RedirectToTransparentImage
  
  /**
    * Removes one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @js.native
  class RemoveRequestCookie protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.RemoveRequestCookie {
    def this(parameters: RemoveCookieParams[RequestCookie]) = this()
  }
  
  /**
    * Removes the request header of the specified name.
    * Do not use SetRequestHeader and RemoveRequestHeader with
    * the same header name on the same request.
    * Each request header name occurs only once in each request.
    */
  @js.native
  class RemoveRequestHeader protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.RemoveRequestHeader {
    def this(parameters: RemoveRequestHeaderParams) = this()
  }
  
  /**
    * Removes one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  @js.native
  class RemoveResponseCookie protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.RemoveResponseCookie {
    def this(parameters: RemoveCookieParams[FilterResponseCookie]) = this()
  }
  
  /**
    * Removes all response headers of the specified names and values.
    */
  @js.native
  class RemoveResponseHeader protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.RemoveResponseHeader {
    def this(parameters: RemoveResponseHeaderParams) = this()
  }
  
  /**
    * @description Matches network events by various criteria.
    */
  @js.native
  class RequestMatcher ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.RequestMatcher {
    def this(parameters: RequestMatcherFields) = this()
  }
  
  /**
    * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
    */
  @js.native
  class SendMessageToExtension protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.SendMessageToExtension {
    def this(parameters: SendMessageParams) = this()
  }
  
  /**
    * Sets the request header of the specified name to the specified value.
    * If a header with the specified name did not exist before, a new one is created.
    * Header name comparison is always case-insensitive.
    * Each request header name occurs only once in each request.
    */
  @js.native
  class SetRequestHeader protected ()
    extends typingsSlinky.chromeApps.chrome.webViewRequest.SetRequestHeader {
    def this(parameters: SetRequestHeaderParams) = this()
  }
}
