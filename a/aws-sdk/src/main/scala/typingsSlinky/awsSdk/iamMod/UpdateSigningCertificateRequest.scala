package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSigningCertificateRequest extends StObject {
  
  /**
    * The ID of the signing certificate you want to update. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var CertificateId: certificateIdType = js.native
  
  /**
    *  The status you want to assign to the certificate. Active means that the certificate can be used for API calls to AWS Inactive means that the certificate cannot be used.
    */
  var Status: statusType = js.native
  
  /**
    * The name of the IAM user the signing certificate belongs to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.native
}
object UpdateSigningCertificateRequest {
  
  @scala.inline
  def apply(CertificateId: certificateIdType, Status: statusType): UpdateSigningCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSigningCertificateRequest]
  }
  
  @scala.inline
  implicit class UpdateSigningCertificateRequestMutableBuilder[Self <: UpdateSigningCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: certificateIdType): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
