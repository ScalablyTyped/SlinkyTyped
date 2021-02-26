package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGException extends StObject {
  
  @JSName("MSHTML.SVGException_typekey")
  var MSHTMLDotSVGException_typekey: SVGException = js.native
  
  var code: Double = js.native
  
  val message: String = js.native
}
object SVGException {
  
  @scala.inline
  def apply(MSHTMLDotSVGException_typekey: SVGException, code: Double, message: String): SVGException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGException_typekey")(MSHTMLDotSVGException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGException]
  }
  
  @scala.inline
  implicit class SVGExceptionMutableBuilder[Self <: SVGException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGException_typekey(value: SVGException): Self = StObject.set(x, "MSHTML.SVGException_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
