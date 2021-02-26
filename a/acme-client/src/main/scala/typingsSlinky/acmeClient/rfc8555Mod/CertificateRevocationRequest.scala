package typingsSlinky.acmeClient.rfc8555Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateRevocationRequest extends StObject {
  
  var reason: js.UndefOr[CertificateRevocationReason] = js.native
}
object CertificateRevocationRequest {
  
  @scala.inline
  def apply(): CertificateRevocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateRevocationRequest]
  }
  
  @scala.inline
  implicit class CertificateRevocationRequestMutableBuilder[Self <: CertificateRevocationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: CertificateRevocationReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
