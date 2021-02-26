package typingsSlinky.phantom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined phantom.phantom.IRequestData & {  errorCode :number,   errorString :string} */
@js.native
trait IRequestDataerrorCodenumb extends StObject {
  
  var errorCode: Double = js.native
  
  var errorString: String = js.native
  
  var headers: js.Array[Name] = js.native
  
  var id: Double = js.native
  
  var method: String = js.native
  
  var time: js.Date = js.native
  
  var url: String = js.native
}
object IRequestDataerrorCodenumb {
  
  @scala.inline
  def apply(
    errorCode: Double,
    errorString: String,
    headers: js.Array[Name],
    id: Double,
    method: String,
    time: js.Date,
    url: String
  ): IRequestDataerrorCodenumb = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestDataerrorCodenumb]
  }
  
  @scala.inline
  implicit class IRequestDataerrorCodenumbMutableBuilder[Self <: IRequestDataerrorCodenumb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorString(value: String): Self = StObject.set(x, "errorString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Array[Name]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersVarargs(value: Name*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
