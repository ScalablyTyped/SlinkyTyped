package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUserRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The identifier of the user.
    */
  var UserId: typingsSlinky.awsSdk.connectMod.UserId = js.native
}
object DeleteUserRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, UserId: UserId): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  
  @scala.inline
  implicit class DeleteUserRequestMutableBuilder[Self <: DeleteUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
