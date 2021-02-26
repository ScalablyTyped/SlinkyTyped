package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mi extends StObject {
  
  var certreq: Boolean = js.native
  
  var mi: MessageImprint = js.native
  
  var nonce: IntegerParam | BigIntegerParam | HexParam | Double = js.native
  
  var policy: ObjectIdentifierParam | HexParam | NameParam = js.native
}
object Mi {
  
  @scala.inline
  def apply(
    certreq: Boolean,
    mi: MessageImprint,
    nonce: IntegerParam | BigIntegerParam | HexParam | Double,
    policy: ObjectIdentifierParam | HexParam | NameParam
  ): Mi = {
    val __obj = js.Dynamic.literal(certreq = certreq.asInstanceOf[js.Any], mi = mi.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mi]
  }
  
  @scala.inline
  implicit class MiMutableBuilder[Self <: Mi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertreq(value: Boolean): Self = StObject.set(x, "certreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMi(value: MessageImprint): Self = StObject.set(x, "mi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: IntegerParam | BigIntegerParam | HexParam | Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: ObjectIdentifierParam | HexParam | NameParam): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
