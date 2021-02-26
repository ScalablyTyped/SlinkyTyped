package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends StObject {
  
  /**
    * The ARN of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  
  /**
    * The mode of the certificate.
    */
  var certificateMode: js.UndefOr[CertificateMode] = js.native
  
  /**
    * The date and time the certificate was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The status of the certificate. The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var status: js.UndefOr[CertificateStatus] = js.native
}
object Certificate {
  
  @scala.inline
  def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    @scala.inline
    def setCertificateMode(value: CertificateMode): Self = StObject.set(x, "certificateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateModeUndefined: Self = StObject.set(x, "certificateMode", js.undefined)
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setStatus(value: CertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
