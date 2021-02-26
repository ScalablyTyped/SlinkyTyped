package typingsSlinky.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyDocument extends StObject {
  
  var base64: String = js.native
  
  var signature: String = js.native
  
  var string: String = js.native
}
object PolicyDocument {
  
  @scala.inline
  def apply(base64: String, signature: String, string: String): PolicyDocument = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyDocument]
  }
  
  @scala.inline
  implicit class PolicyDocumentMutableBuilder[Self <: PolicyDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
