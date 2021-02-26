package typingsSlinky.filepond.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.FormData
import typingsSlinky.filepond.filepondStrings.DELETE
import typingsSlinky.filepond.filepondStrings.GET
import typingsSlinky.filepond.filepondStrings.POST
import typingsSlinky.filepond.filepondStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerUrl extends StObject {
  
  var headers: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
  
  var method: js.UndefOr[GET | POST | PUT | DELETE] = js.native
  
  /**
    * Called with the formdata object right before it is sent,
    * return extended formdata object to make changes.
    */
  var ondata: js.UndefOr[js.Function1[/* data */ FormData, FormData]] = js.native
  
  /**
    * Called when server error is received, receives the response
    * body, useful to select the relevant error data.
    */
  var onerror: js.UndefOr[js.Function1[/* responseBody */ js.Any, _]] = js.native
  
  /**
    * Called when server response is received, useful for getting
    * the unique file id from the server response.
    */
  var onload: js.UndefOr[js.Function1[/* response */ js.Any, Double | String]] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: String = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object ServerUrl {
  
  @scala.inline
  def apply(url: String): ServerUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerUrl]
  }
  
  @scala.inline
  implicit class ServerUrlMutableBuilder[Self <: ServerUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | POST | PUT | DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOndata(value: /* data */ FormData => FormData): Self = StObject.set(x, "ondata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOndataUndefined: Self = StObject.set(x, "ondata", js.undefined)
    
    @scala.inline
    def setOnerror(value: /* responseBody */ js.Any => _): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    @scala.inline
    def setOnload(value: /* response */ js.Any => Double | String): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
