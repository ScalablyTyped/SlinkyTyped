package typingsSlinky.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainResponse extends StObject {
  
  /**
    * The ARN of an issued ACM certificate that is valid for the domain being associated.
    */
  var AcmCertificateArn: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.AcmCertificateArn] = js.native
  
  /**
    * The time that the domain was added.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DisplayName] = js.native
  
  /**
    * The name of the domain.
    */
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DomainName] = js.native
  
  /**
    * The current state for the domain.
    */
  var DomainStatus: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DomainStatus] = js.native
}
object DescribeDomainResponse {
  
  @scala.inline
  def apply(): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainResponse]
  }
  
  @scala.inline
  implicit class DescribeDomainResponseMutableBuilder[Self <: DescribeDomainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcmCertificateArn(value: AcmCertificateArn): Self = StObject.set(x, "AcmCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcmCertificateArnUndefined: Self = StObject.set(x, "AcmCertificateArn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainStatusUndefined: Self = StObject.set(x, "DomainStatus", js.undefined)
  }
}
