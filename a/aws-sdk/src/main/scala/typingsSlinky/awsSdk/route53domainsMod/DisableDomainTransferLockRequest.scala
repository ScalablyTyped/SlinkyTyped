package typingsSlinky.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableDomainTransferLockRequest extends StObject {
  
  /**
    * The name of the domain that you want to remove the transfer lock for.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
}
object DisableDomainTransferLockRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DisableDomainTransferLockRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDomainTransferLockRequest]
  }
  
  @scala.inline
  implicit class DisableDomainTransferLockRequestMutableBuilder[Self <: DisableDomainTransferLockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
