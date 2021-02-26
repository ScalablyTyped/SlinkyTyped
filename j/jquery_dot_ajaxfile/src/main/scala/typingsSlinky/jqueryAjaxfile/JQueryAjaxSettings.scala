package typingsSlinky.jqueryAjaxfile

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryAjaxSettings extends StObject {
  
  /**
    * The content type sent in the request header that tells the server what kind of response it will accept in return. If the accepts setting needs modification, it is recommended to do so once in the $.ajaxSetup() method.
    */
  var accepts: js.UndefOr[js.Any] = js.native
  
  /**
    * By default, all requests are sent asynchronously (i.e. this is set to true by default). If you need synchronous requests, set this option to false. Cross-domain requests and dataType: "jsonp" requests do not support synchronous operation. Note that synchronous requests may temporarily lock the browser, disabling any actions while the request is active. As of jQuery 1.8, the use of async: false with jqXHR ($.Deferred) is deprecated; you must use the success/error/complete callback options instead of the corresponding methods of the jqXHR object such as jqXHR.done() or the deprecated jqXHR.success().
    */
  var async: js.UndefOr[Boolean] = js.native
  
  /**
    * A pre-request callback function that can be used to modify the jqXHR (in jQuery 1.4.x, XMLHTTPRequest) object before it is sent. Use this to set custom headers, etc. The jqXHR and settings objects are passed as arguments. This is an Ajax Event. Returning false in the beforeSend function will cancel the request. As of jQuery 1.5, the beforeSend option will be called regardless of the type of request.
    */
  var beforeSend: js.UndefOr[js.Function2[/* jqXHR */ JQueryXHR, /* settings */ this.type, _]] = js.native
  
  /**
    * If set to false, it will force requested pages not to be cached by the browser. Note: Setting cache to false will only work correctly with HEAD and GET requests. It works by appending "_={timestamp}" to the GET parameters. The parameter is not needed for other types of requests, except in IE8 when a POST is made to a URL that has already been requested by a GET.
    */
  var cache: js.UndefOr[Boolean] = js.native
  
  /**
    * A function to be called when the request finishes (after success and error callbacks are executed). The function gets passed two arguments: The jqXHR (in jQuery 1.4.x, XMLHTTPRequest) object and a string categorizing the status of the request ("success", "notmodified", "error", "timeout", "abort", or "parsererror"). As of jQuery 1.5, the complete setting can accept an array of functions. Each function will be called in turn. This is an Ajax Event.
    */
  var complete: js.UndefOr[js.Function2[/* jqXHR */ JQueryXHR, /* textStatus */ String, _]] = js.native
  
  //According to jQuery.ajax source code, ajax's option actually allows contentType to set to "false"
  // https://github.com/borisyankov/DefinitelyTyped/issues/742
  /**
    * When sending data to the server, use this content type. Default is "application/x-www-form-urlencoded; charset=UTF-8", which is fine for most cases. If you explicitly pass in a content-type to $.ajax(), then it is always sent to the server (even if no data is sent). The W3C XMLHttpRequest specification dictates that the charset is always UTF-8; specifying another charset will not force the browser to change the encoding.
    */
  var contentType: js.UndefOr[js.Any] = js.native
  
  /**
    * An object of string/regular-expression pairs that determine how jQuery will parse the response, given its content type. (version added: 1.5)
    */
  var contents: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * This object will be made the context of all Ajax-related callbacks. By default, the context is an object that represents the ajax settings used in the call ($.ajaxSettings merged with the settings passed to $.ajax).
    */
  var context: js.UndefOr[js.Any] = js.native
  
  /**
    * An object containing dataType-to-dataType converters. Each converter's value is a function that returns the transformed value of the response. (version added: 1.5)
    */
  var converters: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * If you wish to force a crossDomain request (such as JSONP) on the same domain, set the value of crossDomain to true. This allows, for example, server-side redirection to another domain. (version added: 1.5)
    */
  var crossDomain: js.UndefOr[Boolean] = js.native
  
  /**
    * Data to be sent to the server. It is converted to a query string, if not already a string. It's appended to the url for GET-requests. See processData option to prevent this automatic processing. Object must be Key/Value pairs. If value is an Array, jQuery serializes multiple values with same key based on the value of the traditional setting (described below).
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * A function to be used to handle the raw response data of XMLHttpRequest.This is a pre-filtering function to sanitize the response. You should return the sanitized data. The function accepts two arguments: The raw data returned from the server and the 'dataType' parameter.
    */
  var dataFilter: js.UndefOr[js.Function2[/* data */ js.Any, /* ty */ js.Any, _]] = js.native
  
  /**
    * The type of data that you're expecting back from the server. If none is specified, jQuery will try to infer it based on the MIME type of the response (an XML MIME type will yield XML, in 1.4 JSON will yield a JavaScript object, in 1.4 script will execute the script, and anything else will be returned as a string). 
    */
  var dataType: js.UndefOr[String] = js.native
  
  /**
    * A function to be called if the request fails. The function receives three arguments: The jqXHR (in jQuery 1.4.x, XMLHttpRequest) object, a string describing the type of error that occurred and an optional exception object, if one occurred. Possible values for the second argument (besides null) are "timeout", "error", "abort", and "parsererror". When an HTTP error occurs, errorThrown receives the textual portion of the HTTP status, such as "Not Found" or "Internal Server Error." As of jQuery 1.5, the error setting can accept an array of functions. Each function will be called in turn. Note: This handler is not called for cross-domain script and cross-domain JSONP requests. This is an Ajax Event.
    */
  var error: js.UndefOr[
    js.Function3[/* jqXHR */ JQueryXHR, /* textStatus */ String, /* errorThrown */ String, _]
  ] = js.native
  
  /**
    * Whether to trigger global Ajax event handlers for this request. The default is true. Set to false to prevent the global handlers like ajaxStart or ajaxStop from being triggered. This can be used to control various Ajax Events.
    */
  var global: js.UndefOr[Boolean] = js.native
  
  /**
    * An object of additional header key/value pairs to send along with requests using the XMLHttpRequest transport. The header X-Requested-With: XMLHttpRequest is always added, but its default XMLHttpRequest value can be changed here. Values in the headers setting can also be overwritten from within the beforeSend function. (version added: 1.5)
    */
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Allow the request to be successful only if the response has changed since the last request. This is done by checking the Last-Modified header. Default value is false, ignoring the header. In jQuery 1.4 this technique also checks the 'etag' specified by the server to catch unmodified data.
    */
  var ifModified: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow the current environment to be recognized as "local," (e.g. the filesystem), even if jQuery does not recognize it as such by default. The following protocols are currently recognized as local: file, *-extension, and widget. If the isLocal setting needs modification, it is recommended to do so once in the $.ajaxSetup() method. (version added: 1.5.1)
    */
  var isLocal: js.UndefOr[Boolean] = js.native
  
  /**
    * Override the callback function name in a jsonp request. This value will be used instead of 'callback' in the 'callback=?' part of the query string in the url. So {jsonp:'onJSONPLoad'} would result in 'onJSONPLoad=?' passed to the server. As of jQuery 1.5, setting the jsonp option to false prevents jQuery from adding the "?callback" string to the URL or attempting to use "=?" for transformation. In this case, you should also explicitly set the jsonpCallback setting. For example, { jsonp: false, jsonpCallback: "callbackName" }
    */
  var jsonp: js.UndefOr[js.Any] = js.native
  
  /**
    * Specify the callback function name for a JSONP request. This value will be used instead of the random name automatically generated by jQuery. It is preferable to let jQuery generate a unique name as it'll make it easier to manage the requests and provide callbacks and error handling. You may want to specify the callback when you want to enable better browser caching of GET requests. As of jQuery 1.5, you can also use a function for this setting, in which case the value of jsonpCallback is set to the return value of that function.
    */
  var jsonpCallback: js.UndefOr[js.Any] = js.native
  
  /**
    * The HTTP method to use for the request (e.g. "POST", "GET", "PUT"). (version added: 1.9.0)
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * A mime type to override the XHR mime type. (version added: 1.5.1)
    */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * A password to be used with XMLHttpRequest in response to an HTTP access authentication request.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * By default, data passed in to the data option as an object (technically, anything other than a string) will be processed and transformed into a query string, fitting to the default content-type "application/x-www-form-urlencoded". If you want to send a DOMDocument, or other non-processed data, set this option to false.
    */
  var processData: js.UndefOr[Boolean] = js.native
  
  /**
    * Only applies when the "script" transport is used (e.g., cross-domain requests with "jsonp" or "script" dataType and "GET" type). Sets the charset attribute on the script tag used in the request. Used when the character set on the local page is not the same as the one on the remote script.
    */
  var scriptCharset: js.UndefOr[String] = js.native
  
  /**
    * An object of numeric HTTP codes and functions to be called when the response has the corresponding code. f the request is successful, the status code functions take the same parameters as the success callback; if it results in an error (including 3xx redirect), they take the same parameters as the error callback. (version added: 1.5)
    */
  var statusCode: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * A function to be called if the request succeeds. The function gets passed three arguments: The data returned from the server, formatted according to the dataType parameter; a string describing the status; and the jqXHR (in jQuery 1.4.x, XMLHttpRequest) object. As of jQuery 1.5, the success setting can accept an array of functions. Each function will be called in turn. This is an Ajax Event.
    */
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR, _]
  ] = js.native
  
  /**
    * Set a timeout (in milliseconds) for the request. This will override any global timeout set with $.ajaxSetup(). The timeout period starts at the point the $.ajax call is made; if several other requests are in progress and the browser has no connections available, it is possible for a request to time out before it can be sent. In jQuery 1.4.x and below, the XMLHttpRequest object will be in an invalid state if the request times out; accessing any object members may throw an exception. In Firefox 3.0+ only, script and JSONP requests cannot be cancelled by a timeout; the script will run even if it arrives after the timeout period.
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * Set this to true if you wish to use the traditional style of param serialization.
    */
  var traditional: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of request to make ("POST" or "GET"), default is "GET". Note: Other HTTP request methods, such as PUT and DELETE, can also be used here, but they are not supported by all browsers.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * A string containing the URL to which the request is sent.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * A username to be used with XMLHttpRequest in response to an HTTP access authentication request.
    */
  var username: js.UndefOr[String] = js.native
  
  /**
    * Callback for creating the XMLHttpRequest object. Defaults to the ActiveXObject when available (IE), the XMLHttpRequest otherwise. Override to provide your own implementation for XMLHttpRequest or enhancements to the factory.
    */
  var xhr: js.UndefOr[js.Any] = js.native
  
  /**
    * An object of fieldName-fieldValue pairs to set on the native XHR object. For example, you can use it to set withCredentials to true for cross-domain requests if needed. In jQuery 1.5, the withCredentials property was not propagated to the native XHR and thus CORS requests requiring it would ignore this flag. For this reason, we recommend using jQuery 1.5.1+ should you require the use of it. (version added: 1.5.1)
    */
  var xhrFields: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object JQueryAjaxSettings {
  
  @scala.inline
  def apply(): JQueryAjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryAjaxSettings]
  }
  
  @scala.inline
  implicit class JQueryAjaxSettingsMutableBuilder[Self <: JQueryAjaxSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepts(value: js.Any): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setBeforeSend(value: (/* jqXHR */ JQueryXHR, JQueryAjaxSettings) => _): Self = StObject.set(x, "beforeSend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setComplete(value: (/* jqXHR */ JQueryXHR, /* textStatus */ String) => _): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setContentType(value: js.Any): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContents(value: StringDictionary[js.Any]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setConverters(value: StringDictionary[js.Any]): Self = StObject.set(x, "converters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertersUndefined: Self = StObject.set(x, "converters", js.undefined)
    
    @scala.inline
    def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFilter(value: (/* data */ js.Any, /* ty */ js.Any) => _): Self = StObject.set(x, "dataFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataFilterUndefined: Self = StObject.set(x, "dataFilter", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: (/* jqXHR */ JQueryXHR, /* textStatus */ String, /* errorThrown */ String) => _): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setIfModified(value: Boolean): Self = StObject.set(x, "ifModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfModifiedUndefined: Self = StObject.set(x, "ifModified", js.undefined)
    
    @scala.inline
    def setIsLocal(value: Boolean): Self = StObject.set(x, "isLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocalUndefined: Self = StObject.set(x, "isLocal", js.undefined)
    
    @scala.inline
    def setJsonp(value: js.Any): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpCallback(value: js.Any): Self = StObject.set(x, "jsonpCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpCallbackUndefined: Self = StObject.set(x, "jsonpCallback", js.undefined)
    
    @scala.inline
    def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setProcessData(value: Boolean): Self = StObject.set(x, "processData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessDataUndefined: Self = StObject.set(x, "processData", js.undefined)
    
    @scala.inline
    def setScriptCharset(value: String): Self = StObject.set(x, "scriptCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptCharsetUndefined: Self = StObject.set(x, "scriptCharset", js.undefined)
    
    @scala.inline
    def setStatusCode(value: StringDictionary[js.Any]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setSuccess(value: (/* data */ js.Any, /* textStatus */ String, /* jqXHR */ JQueryXHR) => _): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTraditional(value: Boolean): Self = StObject.set(x, "traditional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraditionalUndefined: Self = StObject.set(x, "traditional", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setXhr(value: js.Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrFields(value: StringDictionary[js.Any]): Self = StObject.set(x, "xhrFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrFieldsUndefined: Self = StObject.set(x, "xhrFields", js.undefined)
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
