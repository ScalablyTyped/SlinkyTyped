package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCommon.angularCommonStrings.json
import typingsSlinky.angularCommon.angularCommonStrings.response
import typingsSlinky.angularCommon.httpHttpMod.HttpHeaders
import typingsSlinky.angularCommon.httpHttpMod.HttpParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyHeadersObserve extends StObject {
  
  var body: js.UndefOr[js.Any] = js.native
  
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.native
  
  var observe: response = js.native
  
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.native
  
  var reportProgress: js.UndefOr[Boolean] = js.native
  
  var responseType: js.UndefOr[json] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object BodyHeadersObserve {
  
  @scala.inline
  def apply(observe: response): BodyHeadersObserve = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyHeadersObserve]
  }
  
  @scala.inline
  implicit class BodyHeadersObserveMutableBuilder[Self <: BodyHeadersObserve] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setObserve(value: response): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: HttpParams | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    @scala.inline
    def setResponseType(value: json): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
