package typingsSlinky.jqueryFileupload

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryFileUploadXhr extends StObject {
  
  var errorThrown: js.Any = js.native
  
  var headers: StringDictionary[js.Any] = js.native
  
  var jqXHR: JQueryXHR = js.native
  
  var result: js.Any = js.native
  
  var textStatus: String = js.native
}
object JQueryFileUploadXhr {
  
  @scala.inline
  def apply(
    errorThrown: js.Any,
    headers: StringDictionary[js.Any],
    jqXHR: JQueryXHR,
    result: js.Any,
    textStatus: String
  ): JQueryFileUploadXhr = {
    val __obj = js.Dynamic.literal(errorThrown = errorThrown.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadXhr]
  }
  
  @scala.inline
  implicit class JQueryFileUploadXhrMutableBuilder[Self <: JQueryFileUploadXhr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorThrown(value: js.Any): Self = StObject.set(x, "errorThrown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJqXHR(value: JQueryXHR): Self = StObject.set(x, "jqXHR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStatus(value: String): Self = StObject.set(x, "textStatus", value.asInstanceOf[js.Any])
  }
}
