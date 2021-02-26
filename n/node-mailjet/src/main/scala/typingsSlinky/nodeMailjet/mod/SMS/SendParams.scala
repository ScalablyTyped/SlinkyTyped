package typingsSlinky.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendParams extends StObject {
  
  var From: String = js.native
  
  var Text: String = js.native
  
  var To: String = js.native
}
object SendParams {
  
  @scala.inline
  def apply(From: String, Text: String, To: String): SendParams = {
    val __obj = js.Dynamic.literal(From = From.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendParams]
  }
  
  @scala.inline
  implicit class SendParamsMutableBuilder[Self <: SendParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
