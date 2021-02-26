package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certreq extends StObject {
  
  var certreq: js.UndefOr[Boolean] = js.native
  
  var mi: MessageImprint = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var policy: js.UndefOr[String] = js.native
}
object Certreq {
  
  @scala.inline
  def apply(mi: MessageImprint): Certreq = {
    val __obj = js.Dynamic.literal(mi = mi.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certreq]
  }
  
  @scala.inline
  implicit class CertreqMutableBuilder[Self <: Certreq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertreq(value: Boolean): Self = StObject.set(x, "certreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertreqUndefined: Self = StObject.set(x, "certreq", js.undefined)
    
    @scala.inline
    def setMi(value: MessageImprint): Self = StObject.set(x, "mi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
