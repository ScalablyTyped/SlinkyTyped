package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCommon.angularCommonStrings.arraybuffer
import typingsSlinky.angularCommon.angularCommonStrings.body
import typingsSlinky.angularCommon.httpHttpMod.HttpHeaders
import typingsSlinky.angularCommon.httpHttpMod.HttpParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observe extends js.Object {
  
  var body: js.UndefOr[js.Any] = js.native
  
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.native
  
  var observe: js.UndefOr[body] = js.native
  
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.native
  
  var reportProgress: js.UndefOr[Boolean] = js.native
  
  var responseType: arraybuffer = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object Observe {
  
  @scala.inline
  def apply(responseType: arraybuffer): Observe = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observe]
  }
  
  @scala.inline
  implicit class ObserveOps[Self <: Observe] (val x: Self) extends AnyVal {
    
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
    def setResponseType(value: arraybuffer): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setObserve(value: body): Self = this.set("observe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObserve: Self = this.set("observe", js.undefined)
    
    @scala.inline
    def setParams(value: HttpParams | (StringDictionary[String | js.Array[String]])): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setReportProgress(value: Boolean): Self = this.set("reportProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportProgress: Self = this.set("reportProgress", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
