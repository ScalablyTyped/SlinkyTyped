package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.tsp.TSTInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignerCert extends StObject {
  
  var certs: js.Array[String] = js.native
  
  var hashAlg: String = js.native
  
  var sigAlg: String = js.native
  
  var signerCert: String = js.native
  
  var signerPrvKey: String = js.native
  
  var tstInfo: TSTInfo = js.native
}
object SignerCert {
  
  @scala.inline
  def apply(
    certs: js.Array[String],
    hashAlg: String,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String,
    tstInfo: TSTInfo
  ): SignerCert = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any], tstInfo = tstInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerCert]
  }
  
  @scala.inline
  implicit class SignerCertMutableBuilder[Self <: SignerCert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCerts(value: js.Array[String]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertsVarargs(value: String*): Self = StObject.set(x, "certs", js.Array(value :_*))
    
    @scala.inline
    def setHashAlg(value: String): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigAlg(value: String): Self = StObject.set(x, "sigAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerCert(value: String): Self = StObject.set(x, "signerCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerPrvKey(value: String): Self = StObject.set(x, "signerPrvKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTstInfo(value: TSTInfo): Self = StObject.set(x, "tstInfo", value.asInstanceOf[js.Any])
  }
}
