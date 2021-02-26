package typingsSlinky.node.tlsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends StObject {
  
  /**
    * Country code.
    */
  var C: String = js.native
  
  /**
    * Common name.
    */
  var CN: String = js.native
  
  /**
    * Locality.
    */
  var L: String = js.native
  
  /**
    * Organization.
    */
  var O: String = js.native
  
  /**
    * Organizational unit.
    */
  var OU: String = js.native
  
  /**
    * Street.
    */
  var ST: String = js.native
}
object Certificate {
  
  @scala.inline
  def apply(C: String, CN: String, L: String, O: String, OU: String, ST: String): Certificate = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], OU = OU.asInstanceOf[js.Any], ST = ST.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCN(value: String): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: String): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: String): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOU(value: String): Self = StObject.set(x, "OU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setST(value: String): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
  }
}
