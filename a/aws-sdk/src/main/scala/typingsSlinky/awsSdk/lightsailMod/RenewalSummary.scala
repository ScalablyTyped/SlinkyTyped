package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenewalSummary extends StObject {
  
  /**
    * An array of objects that describe the domain validation records of the certificate.
    */
  var domainValidationRecords: js.UndefOr[DomainValidationRecordList] = js.native
  
  /**
    * The renewal status of the certificate. The following renewal status are possible:     PendingAutoRenewal  - Lightsail is attempting to automatically validate the domain names of the certificate. No further action is required.      PendingValidation  - Lightsail couldn't automatically validate one or more domain names of the certificate. You must take action to validate these domain names or the certificate won't be renewed. Check to make sure your certificate's domain validation records exist in your domain's DNS, and that your certificate remains in use.     Success  - All domain names in the certificate are validated, and Lightsail renewed the certificate. No further action is required.      Failed  - One or more domain names were not validated before the certificate expired, and Lightsail did not renew the certificate. You can request a new certificate using the CreateCertificate action.  
    */
  var renewalStatus: js.UndefOr[RenewalStatus] = js.native
  
  /**
    * The reason for the renewal status of the certificate.
    */
  var renewalStatusReason: js.UndefOr[RenewalStatusReason] = js.native
  
  /**
    * The timestamp when the certificate was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.native
}
object RenewalSummary {
  
  @scala.inline
  def apply(): RenewalSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewalSummary]
  }
  
  @scala.inline
  implicit class RenewalSummaryMutableBuilder[Self <: RenewalSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainValidationRecords(value: DomainValidationRecordList): Self = StObject.set(x, "domainValidationRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainValidationRecordsUndefined: Self = StObject.set(x, "domainValidationRecords", js.undefined)
    
    @scala.inline
    def setDomainValidationRecordsVarargs(value: DomainValidationRecord*): Self = StObject.set(x, "domainValidationRecords", js.Array(value :_*))
    
    @scala.inline
    def setRenewalStatus(value: RenewalStatus): Self = StObject.set(x, "renewalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalStatusReason(value: RenewalStatusReason): Self = StObject.set(x, "renewalStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalStatusReasonUndefined: Self = StObject.set(x, "renewalStatusReason", js.undefined)
    
    @scala.inline
    def setRenewalStatusUndefined: Self = StObject.set(x, "renewalStatus", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
