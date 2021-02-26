package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  
  /**
    * The unique key that identifies a certificate.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The type of the certificate.
    */
  var CertificateType: js.UndefOr[String] = js.native
  
  /**
    * Whether there is an override for the default certificate identifier.
    */
  var CustomerOverride: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * If there is an override for the default certificate identifier, when the override expires.
    */
  var CustomerOverrideValidTill: js.UndefOr[js.Date] = js.native
  
  /**
    * The thumbprint of the certificate.
    */
  var Thumbprint: js.UndefOr[String] = js.native
  
  /**
    * The starting date from which the certificate is valid.
    */
  var ValidFrom: js.UndefOr[js.Date] = js.native
  
  /**
    * The final date that the certificate continues to be valid.
    */
  var ValidTill: js.UndefOr[js.Date] = js.native
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
    def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setCertificateIdentifier(value: String): Self = StObject.set(x, "CertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdentifierUndefined: Self = StObject.set(x, "CertificateIdentifier", js.undefined)
    
    @scala.inline
    def setCertificateType(value: String): Self = StObject.set(x, "CertificateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateTypeUndefined: Self = StObject.set(x, "CertificateType", js.undefined)
    
    @scala.inline
    def setCustomerOverride(value: BooleanOptional): Self = StObject.set(x, "CustomerOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOverrideUndefined: Self = StObject.set(x, "CustomerOverride", js.undefined)
    
    @scala.inline
    def setCustomerOverrideValidTill(value: js.Date): Self = StObject.set(x, "CustomerOverrideValidTill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerOverrideValidTillUndefined: Self = StObject.set(x, "CustomerOverrideValidTill", js.undefined)
    
    @scala.inline
    def setThumbprint(value: String): Self = StObject.set(x, "Thumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbprintUndefined: Self = StObject.set(x, "Thumbprint", js.undefined)
    
    @scala.inline
    def setValidFrom(value: js.Date): Self = StObject.set(x, "ValidFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFromUndefined: Self = StObject.set(x, "ValidFrom", js.undefined)
    
    @scala.inline
    def setValidTill(value: js.Date): Self = StObject.set(x, "ValidTill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidTillUndefined: Self = StObject.set(x, "ValidTill", js.undefined)
  }
}
