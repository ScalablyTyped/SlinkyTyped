package typingsSlinky.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRoomRequest extends StObject {
  
  /**
    * The updated description for the room.
    */
  var Description: js.UndefOr[RoomDescription] = js.native
  
  /**
    * The updated profile ARN for the room.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
  
  /**
    * The updated provider calendar ARN for the room.
    */
  var ProviderCalendarId: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.ProviderCalendarId] = js.native
  
  /**
    * The ARN of the room to update. 
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  
  /**
    * The updated name for the room.
    */
  var RoomName: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.RoomName] = js.native
}
object UpdateRoomRequest {
  
  @scala.inline
  def apply(): UpdateRoomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoomRequest]
  }
  
  @scala.inline
  implicit class UpdateRoomRequestMutableBuilder[Self <: UpdateRoomRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: RoomDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
    
    @scala.inline
    def setProviderCalendarId(value: ProviderCalendarId): Self = StObject.set(x, "ProviderCalendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderCalendarIdUndefined: Self = StObject.set(x, "ProviderCalendarId", js.undefined)
    
    @scala.inline
    def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomArnUndefined: Self = StObject.set(x, "RoomArn", js.undefined)
    
    @scala.inline
    def setRoomName(value: RoomName): Self = StObject.set(x, "RoomName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomNameUndefined: Self = StObject.set(x, "RoomName", js.undefined)
  }
}
