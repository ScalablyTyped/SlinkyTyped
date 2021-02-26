package typingsSlinky.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainSummary extends StObject {
  
  /**
    * Indicates whether the domain is automatically renewed upon expiration.
    */
  var AutoRenew: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the domain that the summary information applies to.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * Expiration date of the domain in Unix time format and Coordinated Universal Time (UTC).
    */
  var Expiry: js.UndefOr[js.Date] = js.native
  
  /**
    * Indicates whether a domain is locked from unauthorized transfer to another party.
    */
  var TransferLock: js.UndefOr[Boolean] = js.native
}
object DomainSummary {
  
  @scala.inline
  def apply(DomainName: DomainName): DomainSummary = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainSummary]
  }
  
  @scala.inline
  implicit class DomainSummaryMutableBuilder[Self <: DomainSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRenew(value: Boolean): Self = StObject.set(x, "AutoRenew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRenewUndefined: Self = StObject.set(x, "AutoRenew", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiry(value: js.Date): Self = StObject.set(x, "Expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryUndefined: Self = StObject.set(x, "Expiry", js.undefined)
    
    @scala.inline
    def setTransferLock(value: Boolean): Self = StObject.set(x, "TransferLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferLockUndefined: Self = StObject.set(x, "TransferLock", js.undefined)
  }
}
