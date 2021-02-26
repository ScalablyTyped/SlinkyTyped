package typingsSlinky.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAvailabilityOptionsRequest extends StObject {
  
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
}
object DescribeAvailabilityOptionsRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DescribeAvailabilityOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAvailabilityOptionsRequest]
  }
  
  @scala.inline
  implicit class DescribeAvailabilityOptionsRequestMutableBuilder[Self <: DescribeAvailabilityOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployed(value: Boolean): Self = StObject.set(x, "Deployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedUndefined: Self = StObject.set(x, "Deployed", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
