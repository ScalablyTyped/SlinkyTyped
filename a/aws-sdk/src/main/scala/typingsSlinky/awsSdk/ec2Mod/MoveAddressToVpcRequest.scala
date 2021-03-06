package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveAddressToVpcRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The Elastic IP address.
    */
  var PublicIp: String = js.native
}
object MoveAddressToVpcRequest {
  
  @scala.inline
  def apply(PublicIp: String): MoveAddressToVpcRequest = {
    val __obj = js.Dynamic.literal(PublicIp = PublicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveAddressToVpcRequest]
  }
  
  @scala.inline
  implicit class MoveAddressToVpcRequestMutableBuilder[Self <: MoveAddressToVpcRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
  }
}
