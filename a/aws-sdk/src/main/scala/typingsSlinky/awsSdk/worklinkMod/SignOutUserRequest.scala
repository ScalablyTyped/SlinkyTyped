package typingsSlinky.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignOutUserRequest extends StObject {
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
  
  /**
    * The name of the user.
    */
  var Username: typingsSlinky.awsSdk.worklinkMod.Username = js.native
}
object SignOutUserRequest {
  
  @scala.inline
  def apply(FleetArn: FleetArn, Username: Username): SignOutUserRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOutUserRequest]
  }
  
  @scala.inline
  implicit class SignOutUserRequestMutableBuilder[Self <: SignOutUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
