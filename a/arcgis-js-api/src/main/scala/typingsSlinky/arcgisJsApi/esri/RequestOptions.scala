package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import org.scalajs.dom.raw.FormData
import org.scalajs.dom.raw.HTMLFormElement
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`array-buffer`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`no-prompt`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.anonymous
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.auto
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.blob
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.document
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.image
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.immediate
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.json
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.post
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.text
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xml
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptions extends Object {
  
  /**
    * Indicates if and how requests to ArcGIS Services are authenticated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var authMode: js.UndefOr[auto | anonymous | immediate | `no-prompt`] = js.native
  
  /**
    * If uploading a file, specify the form data or element used to submit the file here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var body: js.UndefOr[FormData | HTMLFormElement | String] = js.native
  
  /**
    * If `true`, the browser will send a request to the server instead of using the browser's local cache.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var cacheBust: js.UndefOr[Boolean] = js.native
  
  /**
    * Headers to use for the request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var headers: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicates if the request should be made using the HTTP POST method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var method: js.UndefOr[auto | post] = js.native
  
  /**
    * Query parameters for the request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var query: js.UndefOr[js.Any] = js.native
  
  /**
    * Response format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var responseType: js.UndefOr[json | xml | text | blob | `array-buffer` | document | image] = js.native
  
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * Indicates the amount of time in milliseconds to wait for a response from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * Indicates the request should use the proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#RequestOptions)
    */
  var useProxy: js.UndefOr[Boolean] = js.native
}
object RequestOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthMode(value: auto | anonymous | immediate | `no-prompt`): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthModeUndefined: Self = StObject.set(x, "authMode", js.undefined)
    
    @scala.inline
    def setBody(value: FormData | HTMLFormElement | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyFormData(value: FormData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyHTMLFormElement(value: HTMLFormElement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCacheBust(value: Boolean): Self = StObject.set(x, "cacheBust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheBustUndefined: Self = StObject.set(x, "cacheBust", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: auto | post): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setResponseType(value: json | xml | text | blob | `array-buffer` | document | image): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUseProxy(value: Boolean): Self = StObject.set(x, "useProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseProxyUndefined: Self = StObject.set(x, "useProxy", js.undefined)
  }
}
