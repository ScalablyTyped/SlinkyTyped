package typingsSlinky.chromeApps.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.chromeApps.chrome.webViewRequest.AddCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.AddRequestCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.AddResponseCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.AddResponseHeader
import typingsSlinky.chromeApps.chrome.webViewRequest.AddResponseHeaderParams
import typingsSlinky.chromeApps.chrome.webViewRequest.CancelRequest
import typingsSlinky.chromeApps.chrome.webViewRequest.EditCookieParams
import typingsSlinky.chromeApps.chrome.webViewRequest.EditRequestCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.EditResponseCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.FilterResponseCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.IgnoreRules
import typingsSlinky.chromeApps.chrome.webViewRequest.IgnoreRulesParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RedirectByRegEx
import typingsSlinky.chromeApps.chrome.webViewRequest.RedirectByRegExParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RedirectRequest
import typingsSlinky.chromeApps.chrome.webViewRequest.RedirectRequestParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RedirectToEmptyDocument
import typingsSlinky.chromeApps.chrome.webViewRequest.RedirectToTransparentImage
import typingsSlinky.chromeApps.chrome.webViewRequest.RemoveCookieParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RemoveRequestCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.RemoveRequestHeader
import typingsSlinky.chromeApps.chrome.webViewRequest.RemoveRequestHeaderParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RemoveResponseCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.RemoveResponseHeader
import typingsSlinky.chromeApps.chrome.webViewRequest.RemoveResponseHeaderParams
import typingsSlinky.chromeApps.chrome.webViewRequest.RequestCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.RequestMatcher
import typingsSlinky.chromeApps.chrome.webViewRequest.RequestMatcherFields
import typingsSlinky.chromeApps.chrome.webViewRequest.ResponseCookie
import typingsSlinky.chromeApps.chrome.webViewRequest.SendMessageParams
import typingsSlinky.chromeApps.chrome.webViewRequest.SendMessageToExtension
import typingsSlinky.chromeApps.chrome.webViewRequest.SetRequestHeader
import typingsSlinky.chromeApps.chrome.webViewRequest.SetRequestHeaderParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofwebViewRequest extends StObject {
  
  /**
    * Adds a cookie to the request or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var AddRequestCookie: Instantiable1[
    /* parameters */ AddCookie[RequestCookie], 
    typingsSlinky.chromeApps.chrome.webViewRequest.AddRequestCookie
  ] = js.native
  
  /**
    * Adds a cookie to the response or overrides a cookie, in case another cookie of the same name exists already.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var AddResponseCookie: Instantiable1[
    /* parameters */ AddCookie[ResponseCookie], 
    typingsSlinky.chromeApps.chrome.webViewRequest.AddResponseCookie
  ] = js.native
  
  /**
    * Adds the response header to the response of this web request.
    * As multiple response headers may share the same name,
    * you need to first remove and then add a new
    * response header in order to replace one.
    */
  var AddResponseHeader: Instantiable1[
    /* parameters */ AddResponseHeaderParams, 
    typingsSlinky.chromeApps.chrome.webViewRequest.AddResponseHeader
  ] = js.native
  
  /** Declarative event action that cancels a network request. */
  var CancelRequest: Instantiable0[typingsSlinky.chromeApps.chrome.webViewRequest.CancelRequest] = js.native
  
  /**
    * Edits one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var EditRequestCookie: Instantiable1[
    /* parameters */ EditCookieParams[RequestCookie, RequestCookie], 
    typingsSlinky.chromeApps.chrome.webViewRequest.EditRequestCookie
  ] = js.native
  
  /**
    * Edits one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var EditResponseCookie: Instantiable1[
    /* parameter */ EditCookieParams[FilterResponseCookie, ResponseCookie], 
    typingsSlinky.chromeApps.chrome.webViewRequest.EditResponseCookie
  ] = js.native
  
  /**
    * Masks all rules that match the specified criteria.
    */
  var IgnoreRules: Instantiable1[
    /* parameters */ IgnoreRulesParams, 
    typingsSlinky.chromeApps.chrome.webViewRequest.IgnoreRules
  ] = js.native
  
  /**
    * Redirects a request by applying a regular expression on the URL.
    * The regular expressions use the RE2 syntax.
    * @see[RE2 syntax]{@link https://github.com/google/re2/blob/master/doc/syntax.txt}
    */
  var RedirectByRegEx: Instantiable1[
    /* parameters */ RedirectByRegExParams, 
    typingsSlinky.chromeApps.chrome.webViewRequest.RedirectByRegEx
  ] = js.native
  
  /** Declarative event action that redirects a network request.  */
  var RedirectRequest: Instantiable1[
    /* parameters */ RedirectRequestParams, 
    typingsSlinky.chromeApps.chrome.webViewRequest.RedirectRequest
  ] = js.native
  
  /** Declarative event action that redirects a network request to an empty document. */
  var RedirectToEmptyDocument: Instantiable0[typingsSlinky.chromeApps.chrome.webViewRequest.RedirectToEmptyDocument] = js.native
  
  /** Declarative event action that redirects a network request to a transparent image. */
  var RedirectToTransparentImage: Instantiable0[typingsSlinky.chromeApps.chrome.webViewRequest.RedirectToTransparentImage] = js.native
  
  /**
    * Removes one or more cookies of request.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var RemoveRequestCookie: Instantiable1[
    /* parameters */ RemoveCookieParams[RequestCookie], 
    typingsSlinky.chromeApps.chrome.webViewRequest.RemoveRequestCookie
  ] = js.native
  
  /**
    * Removes the request header of the specified name.
    * Do not use SetRequestHeader and RemoveRequestHeader with
    * the same header name on the same request.
    * Each request header name occurs only once in each request.
    */
  var RemoveRequestHeader: Instantiable1[
    /* parameters */ RemoveRequestHeaderParams, 
    typingsSlinky.chromeApps.chrome.webViewRequest.RemoveRequestHeader
  ] = js.native
  
  /**
    * Removes one or more cookies of response.
    * Note that it is preferred to use the Cookies API because this is computationally less expensive.
    */
  var RemoveResponseCookie: Instantiable1[
    /* parameters */ RemoveCookieParams[FilterResponseCookie], 
    typingsSlinky.chromeApps.chrome.webViewRequest.RemoveResponseCookie
  ] = js.native
  
  /**
    * Removes all response headers of the specified names and values.
    */
  var RemoveResponseHeader: Instantiable1[
    /* parameters */ RemoveResponseHeaderParams, 
    typingsSlinky.chromeApps.chrome.webViewRequest.RemoveResponseHeader
  ] = js.native
  
  /**
    * @description Matches network events by various criteria.
    */
  var RequestMatcher: Instantiable1[
    /* parameters */ js.UndefOr[RequestMatcherFields], 
    typingsSlinky.chromeApps.chrome.webViewRequest.RequestMatcher
  ] = js.native
  
  /**
    * Triggers the webviewWebRequest.*OnMessageEvent* event which are used in webviews.
    */
  var SendMessageToExtension: Instantiable1[
    /* parameters */ SendMessageParams, 
    typingsSlinky.chromeApps.chrome.webViewRequest.SendMessageToExtension
  ] = js.native
  
  /**
    * Sets the request header of the specified name to the specified value.
    * If a header with the specified name did not exist before, a new one is created.
    * Header name comparison is always case-insensitive.
    * Each request header name occurs only once in each request.
    */
  var SetRequestHeader: Instantiable1[
    /* parameters */ SetRequestHeaderParams, 
    typingsSlinky.chromeApps.chrome.webViewRequest.SetRequestHeader
  ] = js.native
}
object TypeofwebViewRequest {
  
  @scala.inline
  def apply(
    AddRequestCookie: Instantiable1[/* parameters */ AddCookie[RequestCookie], AddRequestCookie],
    AddResponseCookie: Instantiable1[/* parameters */ AddCookie[ResponseCookie], AddResponseCookie],
    AddResponseHeader: Instantiable1[/* parameters */ AddResponseHeaderParams, AddResponseHeader],
    CancelRequest: Instantiable0[CancelRequest],
    EditRequestCookie: Instantiable1[/* parameters */ EditCookieParams[RequestCookie, RequestCookie], EditRequestCookie],
    EditResponseCookie: Instantiable1[
      /* parameter */ EditCookieParams[FilterResponseCookie, ResponseCookie], 
      EditResponseCookie
    ],
    IgnoreRules: Instantiable1[/* parameters */ IgnoreRulesParams, IgnoreRules],
    RedirectByRegEx: Instantiable1[/* parameters */ RedirectByRegExParams, RedirectByRegEx],
    RedirectRequest: Instantiable1[/* parameters */ RedirectRequestParams, RedirectRequest],
    RedirectToEmptyDocument: Instantiable0[RedirectToEmptyDocument],
    RedirectToTransparentImage: Instantiable0[RedirectToTransparentImage],
    RemoveRequestCookie: Instantiable1[/* parameters */ RemoveCookieParams[RequestCookie], RemoveRequestCookie],
    RemoveRequestHeader: Instantiable1[/* parameters */ RemoveRequestHeaderParams, RemoveRequestHeader],
    RemoveResponseCookie: Instantiable1[/* parameters */ RemoveCookieParams[FilterResponseCookie], RemoveResponseCookie],
    RemoveResponseHeader: Instantiable1[/* parameters */ RemoveResponseHeaderParams, RemoveResponseHeader],
    RequestMatcher: Instantiable1[/* parameters */ js.UndefOr[RequestMatcherFields], RequestMatcher],
    SendMessageToExtension: Instantiable1[/* parameters */ SendMessageParams, SendMessageToExtension],
    SetRequestHeader: Instantiable1[/* parameters */ SetRequestHeaderParams, SetRequestHeader]
  ): TypeofwebViewRequest = {
    val __obj = js.Dynamic.literal(AddRequestCookie = AddRequestCookie.asInstanceOf[js.Any], AddResponseCookie = AddResponseCookie.asInstanceOf[js.Any], AddResponseHeader = AddResponseHeader.asInstanceOf[js.Any], CancelRequest = CancelRequest.asInstanceOf[js.Any], EditRequestCookie = EditRequestCookie.asInstanceOf[js.Any], EditResponseCookie = EditResponseCookie.asInstanceOf[js.Any], IgnoreRules = IgnoreRules.asInstanceOf[js.Any], RedirectByRegEx = RedirectByRegEx.asInstanceOf[js.Any], RedirectRequest = RedirectRequest.asInstanceOf[js.Any], RedirectToEmptyDocument = RedirectToEmptyDocument.asInstanceOf[js.Any], RedirectToTransparentImage = RedirectToTransparentImage.asInstanceOf[js.Any], RemoveRequestCookie = RemoveRequestCookie.asInstanceOf[js.Any], RemoveRequestHeader = RemoveRequestHeader.asInstanceOf[js.Any], RemoveResponseCookie = RemoveResponseCookie.asInstanceOf[js.Any], RemoveResponseHeader = RemoveResponseHeader.asInstanceOf[js.Any], RequestMatcher = RequestMatcher.asInstanceOf[js.Any], SendMessageToExtension = SendMessageToExtension.asInstanceOf[js.Any], SetRequestHeader = SetRequestHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofwebViewRequest]
  }
  
  @scala.inline
  implicit class TypeofwebViewRequestMutableBuilder[Self <: TypeofwebViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRequestCookie(value: Instantiable1[/* parameters */ AddCookie[RequestCookie], AddRequestCookie]): Self = StObject.set(x, "AddRequestCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddResponseCookie(value: Instantiable1[/* parameters */ AddCookie[ResponseCookie], AddResponseCookie]): Self = StObject.set(x, "AddResponseCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddResponseHeader(value: Instantiable1[/* parameters */ AddResponseHeaderParams, AddResponseHeader]): Self = StObject.set(x, "AddResponseHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelRequest(value: Instantiable0[CancelRequest]): Self = StObject.set(x, "CancelRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditRequestCookie(
      value: Instantiable1[/* parameters */ EditCookieParams[RequestCookie, RequestCookie], EditRequestCookie]
    ): Self = StObject.set(x, "EditRequestCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditResponseCookie(
      value: Instantiable1[
          /* parameter */ EditCookieParams[FilterResponseCookie, ResponseCookie], 
          EditResponseCookie
        ]
    ): Self = StObject.set(x, "EditResponseCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreRules(value: Instantiable1[/* parameters */ IgnoreRulesParams, IgnoreRules]): Self = StObject.set(x, "IgnoreRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectByRegEx(value: Instantiable1[/* parameters */ RedirectByRegExParams, RedirectByRegEx]): Self = StObject.set(x, "RedirectByRegEx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectRequest(value: Instantiable1[/* parameters */ RedirectRequestParams, RedirectRequest]): Self = StObject.set(x, "RedirectRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectToEmptyDocument(value: Instantiable0[RedirectToEmptyDocument]): Self = StObject.set(x, "RedirectToEmptyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectToTransparentImage(value: Instantiable0[RedirectToTransparentImage]): Self = StObject.set(x, "RedirectToTransparentImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRequestCookie(value: Instantiable1[/* parameters */ RemoveCookieParams[RequestCookie], RemoveRequestCookie]): Self = StObject.set(x, "RemoveRequestCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRequestHeader(value: Instantiable1[/* parameters */ RemoveRequestHeaderParams, RemoveRequestHeader]): Self = StObject.set(x, "RemoveRequestHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveResponseCookie(
      value: Instantiable1[/* parameters */ RemoveCookieParams[FilterResponseCookie], RemoveResponseCookie]
    ): Self = StObject.set(x, "RemoveResponseCookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveResponseHeader(value: Instantiable1[/* parameters */ RemoveResponseHeaderParams, RemoveResponseHeader]): Self = StObject.set(x, "RemoveResponseHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMatcher(value: Instantiable1[/* parameters */ js.UndefOr[RequestMatcherFields], RequestMatcher]): Self = StObject.set(x, "RequestMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendMessageToExtension(value: Instantiable1[/* parameters */ SendMessageParams, SendMessageToExtension]): Self = StObject.set(x, "SendMessageToExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRequestHeader(value: Instantiable1[/* parameters */ SetRequestHeaderParams, SetRequestHeader]): Self = StObject.set(x, "SetRequestHeader", value.asInstanceOf[js.Any])
  }
}
