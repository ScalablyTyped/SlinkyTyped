package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCertificateRequest extends StObject {
  
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
  
  /**
    * Forces the deletion of a certificate if it is inactive and is not attached to an IoT thing.
    */
  var forceDelete: js.UndefOr[ForceDelete] = js.native
}
object DeleteCertificateRequest {
  
  @scala.inline
  def apply(certificateId: CertificateId): DeleteCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateRequest]
  }
  
  @scala.inline
  implicit class DeleteCertificateRequestMutableBuilder[Self <: DeleteCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDelete(value: ForceDelete): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
  }
}
