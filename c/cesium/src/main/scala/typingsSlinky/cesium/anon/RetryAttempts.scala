package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.DefaultProxy
import typingsSlinky.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryAttempts extends StObject {
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var overrideMimeType: js.UndefOr[String] = js.native
  
  var proxy: js.UndefOr[DefaultProxy] = js.native
  
  var queryParameters: js.UndefOr[js.Any] = js.native
  
  var request: js.UndefOr[org.scalajs.dom.experimental.Request] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var retryAttempts: js.UndefOr[Double] = js.native
  
  var retryCallback: js.UndefOr[typingsSlinky.cesium.mod.Resource.RetryCallback] = js.native
  
  var templateValues: js.UndefOr[js.Any] = js.native
  
  var url: String = js.native
}
object RetryAttempts {
  
  @scala.inline
  def apply(url: String): RetryAttempts = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryAttempts]
  }
  
  @scala.inline
  implicit class RetryAttemptsMutableBuilder[Self <: RetryAttempts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
    
    @scala.inline
    def setProxy(value: DefaultProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setQueryParameters(value: js.Any): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    @scala.inline
    def setRequest(value: org.scalajs.dom.experimental.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setRetryAttempts(value: Double): Self = StObject.set(x, "retryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryAttemptsUndefined: Self = StObject.set(x, "retryAttempts", js.undefined)
    
    @scala.inline
    def setRetryCallback(value: (/* resource */ Resource, /* error */ js.Error) => Unit): Self = StObject.set(x, "retryCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRetryCallbackUndefined: Self = StObject.set(x, "retryCallback", js.undefined)
    
    @scala.inline
    def setTemplateValues(value: js.Any): Self = StObject.set(x, "templateValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateValuesUndefined: Self = StObject.set(x, "templateValues", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
