package typingsSlinky.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateDomainRequest extends StObject {
  
  /**
    * The name of the domain.
    */
  var DomainName: typingsSlinky.awsSdk.worklinkMod.DomainName = js.native
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
}
object DisassociateDomainRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, FleetArn: FleetArn): DisassociateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDomainRequest]
  }
  
  @scala.inline
  implicit class DisassociateDomainRequestMutableBuilder[Self <: DisassociateDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
