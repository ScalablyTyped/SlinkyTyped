package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MovingAddressStatus extends StObject {
  
  /**
    * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic platform.
    */
  var MoveStatus: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.MoveStatus] = js.native
  
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
}
object MovingAddressStatus {
  
  @scala.inline
  def apply(): MovingAddressStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MovingAddressStatus]
  }
  
  @scala.inline
  implicit class MovingAddressStatusMutableBuilder[Self <: MovingAddressStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMoveStatus(value: MoveStatus): Self = StObject.set(x, "MoveStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveStatusUndefined: Self = StObject.set(x, "MoveStatus", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
  }
}
