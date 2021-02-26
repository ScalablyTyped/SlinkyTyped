package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X500NameParam extends StObject {
  
  var C: String = js.native
  
  var CN: String = js.native
  
  var O: String = js.native
}
object X500NameParam {
  
  @scala.inline
  def apply(C: String, CN: String, O: String): X500NameParam = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[X500NameParam]
  }
  
  @scala.inline
  implicit class X500NameParamMutableBuilder[Self <: X500NameParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCN(value: String): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: String): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
