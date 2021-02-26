package typingsSlinky.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionByoipCidrRequest extends StObject {
  
  /**
    * The public IPv4 address range, in CIDR notation. The most specific IP prefix that you can specify is /24. The address range cannot overlap with another address range that you've brought to this or another Region.
    */
  var Cidr: GenericString = js.native
  
  /**
    * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. 
    */
  var CidrAuthorizationContext: typingsSlinky.awsSdk.globalacceleratorMod.CidrAuthorizationContext = js.native
}
object ProvisionByoipCidrRequest {
  
  @scala.inline
  def apply(Cidr: GenericString, CidrAuthorizationContext: CidrAuthorizationContext): ProvisionByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any], CidrAuthorizationContext = CidrAuthorizationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionByoipCidrRequest]
  }
  
  @scala.inline
  implicit class ProvisionByoipCidrRequestMutableBuilder[Self <: ProvisionByoipCidrRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: GenericString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrAuthorizationContext(value: CidrAuthorizationContext): Self = StObject.set(x, "CidrAuthorizationContext", value.asInstanceOf[js.Any])
  }
}
