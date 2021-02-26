package typingsSlinky.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainValidation extends StObject {
  
  /**
    * A fully qualified domain name (FQDN) in the certificate. For example, www.example.com or example.com. 
    */
  var DomainName: DomainNameString = js.native
  
  /**
    * Contains the CNAME record that you add to your DNS database for domain validation. For more information, see Use DNS to Validate Domain Ownership. Note: The CNAME information that you need does not include the name of your domain. If you include&#x2028; your domain name in the DNS database CNAME record, validation fails.&#x2028; For example, if the name is "_a79865eb4cd1a6ab990a45779b4e0b96.yourdomain.com", only "_a79865eb4cd1a6ab990a45779b4e0b96" must be used.
    */
  var ResourceRecord: js.UndefOr[typingsSlinky.awsSdk.acmMod.ResourceRecord] = js.native
  
  /**
    * The domain name that ACM used to send domain validation emails.
    */
  var ValidationDomain: js.UndefOr[DomainNameString] = js.native
  
  /**
    * A list of email addresses that ACM used to send domain validation emails.
    */
  var ValidationEmails: js.UndefOr[ValidationEmailList] = js.native
  
  /**
    * Specifies the domain validation method.
    */
  var ValidationMethod: js.UndefOr[typingsSlinky.awsSdk.acmMod.ValidationMethod] = js.native
  
  /**
    * The validation status of the domain name. This can be one of the following values:    PENDING_VALIDATION     SUCCESS    FAILED  
    */
  var ValidationStatus: js.UndefOr[DomainStatus] = js.native
}
object DomainValidation {
  
  @scala.inline
  def apply(DomainName: DomainNameString): DomainValidation = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainValidation]
  }
  
  @scala.inline
  implicit class DomainValidationMutableBuilder[Self <: DomainValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainNameString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRecord(value: ResourceRecord): Self = StObject.set(x, "ResourceRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRecordUndefined: Self = StObject.set(x, "ResourceRecord", js.undefined)
    
    @scala.inline
    def setValidationDomain(value: DomainNameString): Self = StObject.set(x, "ValidationDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationDomainUndefined: Self = StObject.set(x, "ValidationDomain", js.undefined)
    
    @scala.inline
    def setValidationEmails(value: ValidationEmailList): Self = StObject.set(x, "ValidationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationEmailsUndefined: Self = StObject.set(x, "ValidationEmails", js.undefined)
    
    @scala.inline
    def setValidationEmailsVarargs(value: String*): Self = StObject.set(x, "ValidationEmails", js.Array(value :_*))
    
    @scala.inline
    def setValidationMethod(value: ValidationMethod): Self = StObject.set(x, "ValidationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationMethodUndefined: Self = StObject.set(x, "ValidationMethod", js.undefined)
    
    @scala.inline
    def setValidationStatus(value: DomainStatus): Self = StObject.set(x, "ValidationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationStatusUndefined: Self = StObject.set(x, "ValidationStatus", js.undefined)
  }
}
