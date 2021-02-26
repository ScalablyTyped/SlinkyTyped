package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCertificateRequest extends StObject {
  
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
  
  /**
    * The new status.  Note: Setting the status to PENDING_TRANSFER or PENDING_ACTIVATION will result in an exception being thrown. PENDING_TRANSFER and PENDING_ACTIVATION are statuses used internally by AWS IoT. They are not intended for developer use.  Note: The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var newStatus: CertificateStatus = js.native
}
object UpdateCertificateRequest {
  
  @scala.inline
  def apply(certificateId: CertificateId, newStatus: CertificateStatus): UpdateCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any], newStatus = newStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateRequest]
  }
  
  @scala.inline
  implicit class UpdateCertificateRequestMutableBuilder[Self <: UpdateCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewStatus(value: CertificateStatus): Self = StObject.set(x, "newStatus", value.asInstanceOf[js.Any])
  }
}
