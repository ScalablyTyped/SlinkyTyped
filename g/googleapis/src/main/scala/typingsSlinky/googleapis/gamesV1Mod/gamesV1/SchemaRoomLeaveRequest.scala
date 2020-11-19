package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a leave room request.
  */
@js.native
trait SchemaRoomLeaveRequest extends js.Object {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomLeaveRequest.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Diagnostics for a player leaving the room.
    */
  var leaveDiagnostics: js.UndefOr[SchemaRoomLeaveDiagnostics] = js.native
  
  /**
    * Reason for leaving the match. Possible values are:   -
    * &quot;PLAYER_LEFT&quot; - The player chose to leave the room..  -
    * &quot;GAME_LEFT&quot; - The game chose to remove the player from the
    * room.  - &quot;REALTIME_ABANDONED&quot; - The player switched to another
    * application and abandoned the room.  -
    * &quot;REALTIME_PEER_CONNECTION_FAILURE&quot; - The client was unable to
    * establish a connection to other peer(s).  -
    * &quot;REALTIME_SERVER_CONNECTION_FAILURE&quot; - The client was unable to
    * communicate with the server.  - &quot;REALTIME_SERVER_ERROR&quot; - The
    * client received an error response when it tried to communicate with the
    * server.  - &quot;REALTIME_TIMEOUT&quot; - The client timed out while
    * waiting for a room.  - &quot;REALTIME_CLIENT_DISCONNECTING&quot; - The
    * client disconnects without first calling Leave.  -
    * &quot;REALTIME_SIGN_OUT&quot; - The user signed out of G+ while in the
    * room.  - &quot;REALTIME_GAME_CRASHED&quot; - The game crashed.  -
    * &quot;REALTIME_ROOM_SERVICE_CRASHED&quot; - RoomAndroidService crashed.
    * - &quot;REALTIME_DIFFERENT_CLIENT_ROOM_OPERATION&quot; - Another client
    * is trying to enter a room.  -
    * &quot;REALTIME_SAME_CLIENT_ROOM_OPERATION&quot; - The same client is
    * trying to enter a new room.
    */
  var reason: js.UndefOr[String] = js.native
}
object SchemaRoomLeaveRequest {
  
  @scala.inline
  def apply(): SchemaRoomLeaveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomLeaveRequest]
  }
  
  @scala.inline
  implicit class SchemaRoomLeaveRequestOps[Self <: SchemaRoomLeaveRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLeaveDiagnostics(value: SchemaRoomLeaveDiagnostics): Self = this.set("leaveDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaveDiagnostics: Self = this.set("leaveDiagnostics", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
