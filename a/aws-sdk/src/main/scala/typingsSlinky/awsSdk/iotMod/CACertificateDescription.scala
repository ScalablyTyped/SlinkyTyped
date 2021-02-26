package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CACertificateDescription extends StObject {
  
  /**
    * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and "DISABLE"
    */
  var autoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.native
  
  /**
    * The CA certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  
  /**
    * The CA certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  
  /**
    * The CA certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  
  /**
    * The date the CA certificate was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The customer version of the CA certificate.
    */
  var customerVersion: js.UndefOr[CustomerVersion] = js.native
  
  /**
    * The generation ID of the CA certificate.
    */
  var generationId: js.UndefOr[GenerationId] = js.native
  
  /**
    * The date the CA certificate was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The owner of the CA certificate.
    */
  var ownedBy: js.UndefOr[AwsAccountId] = js.native
  
  /**
    * The status of a CA certificate.
    */
  var status: js.UndefOr[CACertificateStatus] = js.native
  
  /**
    * When the CA certificate is valid.
    */
  var validity: js.UndefOr[CertificateValidity] = js.native
}
object CACertificateDescription {
  
  @scala.inline
  def apply(): CACertificateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CACertificateDescription]
  }
  
  @scala.inline
  implicit class CACertificateDescriptionMutableBuilder[Self <: CACertificateDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRegistrationStatus(value: AutoRegistrationStatus): Self = StObject.set(x, "autoRegistrationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRegistrationStatusUndefined: Self = StObject.set(x, "autoRegistrationStatus", js.undefined)
    
    @scala.inline
    def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    @scala.inline
    def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setCustomerVersion(value: CustomerVersion): Self = StObject.set(x, "customerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerVersionUndefined: Self = StObject.set(x, "customerVersion", js.undefined)
    
    @scala.inline
    def setGenerationId(value: GenerationId): Self = StObject.set(x, "generationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationIdUndefined: Self = StObject.set(x, "generationId", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setOwnedBy(value: AwsAccountId): Self = StObject.set(x, "ownedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnedByUndefined: Self = StObject.set(x, "ownedBy", js.undefined)
    
    @scala.inline
    def setStatus(value: CACertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setValidity(value: CertificateValidity): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidityUndefined: Self = StObject.set(x, "validity", js.undefined)
  }
}
