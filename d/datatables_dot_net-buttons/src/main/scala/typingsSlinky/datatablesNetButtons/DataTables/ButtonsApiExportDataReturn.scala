package typingsSlinky.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonsApiExportDataReturn extends StObject {
  
  var body: js.Array[String] = js.native
  
  var footer: js.Array[String] = js.native
  
  var header: js.Array[String] = js.native
}
object ButtonsApiExportDataReturn {
  
  @scala.inline
  def apply(body: js.Array[String], footer: js.Array[String], header: js.Array[String]): ButtonsApiExportDataReturn = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsApiExportDataReturn]
  }
  
  @scala.inline
  implicit class ButtonsApiExportDataReturnMutableBuilder[Self <: ButtonsApiExportDataReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: String*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setFooter(value: js.Array[String]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterVarargs(value: String*): Self = StObject.set(x, "footer", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
  }
}
