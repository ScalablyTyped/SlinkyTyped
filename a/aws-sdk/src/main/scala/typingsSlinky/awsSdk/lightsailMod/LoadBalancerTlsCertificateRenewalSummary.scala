package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerTlsCertificateRenewalSummary extends StObject {
  
  /**
    * Contains information about the validation of each domain name in the certificate, as it pertains to Lightsail's managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate request.
    */
  var domainValidationOptions: js.UndefOr[LoadBalancerTlsCertificateDomainValidationOptionList] = js.native
  
  /**
    * The renewal status of the certificate. The following renewal status are possible:     PendingAutoRenewal  - Lightsail is attempting to automatically validate the domain names of the certificate. No further action is required.      PendingValidation  - Lightsail couldn't automatically validate one or more domain names of the certificate. You must take action to validate these domain names or the certificate won't be renewed. Check to make sure your certificate's domain validation records exist in your domain's DNS, and that your certificate remains in use.     Success  - All domain names in the certificate are validated, and Lightsail renewed the certificate. No further action is required.      Failed  - One or more domain names were not validated before the certificate expired, and Lightsail did not renew the certificate. You can request a new certificate using the CreateCertificate action.  
    */
  var renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus] = js.native
}
object LoadBalancerTlsCertificateRenewalSummary {
  
  @scala.inline
  def apply(): LoadBalancerTlsCertificateRenewalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateRenewalSummary]
  }
  
  @scala.inline
  implicit class LoadBalancerTlsCertificateRenewalSummaryMutableBuilder[Self <: LoadBalancerTlsCertificateRenewalSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainValidationOptions(value: LoadBalancerTlsCertificateDomainValidationOptionList): Self = StObject.set(x, "domainValidationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainValidationOptionsUndefined: Self = StObject.set(x, "domainValidationOptions", js.undefined)
    
    @scala.inline
    def setDomainValidationOptionsVarargs(value: LoadBalancerTlsCertificateDomainValidationOption*): Self = StObject.set(x, "domainValidationOptions", js.Array(value :_*))
    
    @scala.inline
    def setRenewalStatus(value: LoadBalancerTlsCertificateRenewalStatus): Self = StObject.set(x, "renewalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalStatusUndefined: Self = StObject.set(x, "renewalStatus", js.undefined)
  }
}
