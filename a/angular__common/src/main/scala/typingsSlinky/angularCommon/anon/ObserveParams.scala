package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCommon.angularCommonStrings.events
import typingsSlinky.angularCommon.angularCommonStrings.json
import typingsSlinky.angularCommon.httpHttpMod.HttpHeaders
import typingsSlinky.angularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserveParams extends js.Object {
  
  var body: js.UndefOr[js.Any] = js.native
  
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.native
  
  var observe: events = js.native
  
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.native
  
  var reportProgress: js.UndefOr[Boolean] = js.native
  
  var responseType: js.UndefOr[json] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object ObserveParams {
  
  @scala.inline
  def apply(observe: events): ObserveParams = {
    val __obj = js.Dynamic.literal(observe = observe.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveParams]
  }
  
  @scala.inline
  implicit class ObserveParamsOps[Self <: ObserveParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObserve(value: events): Self = this.set("observe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setParams(value: HttpParams | (StringDictionary[String | js.Array[String]])): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setReportProgress(value: Boolean): Self = this.set("reportProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportProgress: Self = this.set("reportProgress", js.undefined)
    
    @scala.inline
    def setResponseType(value: json): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
