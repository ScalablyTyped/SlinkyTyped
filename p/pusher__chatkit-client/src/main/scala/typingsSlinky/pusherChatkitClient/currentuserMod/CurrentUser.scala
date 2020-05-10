package typingsSlinky.pusherChatkitClient.currentuserMod

import typingsSlinky.pusherChatkitClient.hooksMod.UserAndRoomParams
import typingsSlinky.pusherChatkitClient.messageMod.PusherMessage
import typingsSlinky.pusherChatkitClient.roomMod.PusherReadCursor
import typingsSlinky.pusherChatkitClient.roomMod.PusherRoom
import typingsSlinky.pusherChatkitClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentUser extends js.Object {
  var roomSubscriptions: RoomSubscriptions = js.native
  var rooms: js.Array[PusherRoom] = js.native
  var users: js.Array[PusherUser] = js.native
  def addUserToRoom(params: UserAndRoomParams): js.Promise[Unit] = js.native
  def createRoom(params: CreateRoomParams): js.Promise[PusherRoom] = js.native
  def deleteRoom(params: RoomIdParams): js.Promise[Unit] = js.native
  def disconnect(): js.Promise[Unit] = js.native
  def enablePushNotifications(): js.Promise[Unit] = js.native
  def fetchMultipartMessages(params: FetchMultipartMessagesParams): js.Promise[js.Array[PusherMessage]] = js.native
  def getJoinableRooms(): js.Promise[js.Array[PusherRoom]] = js.native
  def isTypingIn(params: RoomIdParams): js.Promise[Unit] = js.native
  def joinRoom(params: RoomIdParams): js.Promise[PusherRoom] = js.native
  def leaveRoom(params: RoomIdParams): js.Promise[PusherRoom] = js.native
  def readCursor(params: ReadCursorParams): js.Promise[PusherReadCursor] = js.native
  def removeUserFromRoom(params: UserAndRoomParams): js.Promise[Unit] = js.native
  def sendMultipartMessage(params: SendMultipartMessageParams): js.Promise[Double] = js.native
  def sendSimpleMessage(params: SendSimpleMessageParams): js.Promise[Double] = js.native
  def setReadCursor(params: SetReadCursorParams): js.Promise[Unit] = js.native
  def subscribeToRoomMultipart(params: RoomSubcriptionParams): js.Promise[PusherRoom] = js.native
  def updateRoom(params: UpdateRoomParams): js.Promise[PusherRoom] = js.native
}

object CurrentUser {
  @scala.inline
  def apply(
    addUserToRoom: UserAndRoomParams => js.Promise[Unit],
    createRoom: CreateRoomParams => js.Promise[PusherRoom],
    deleteRoom: RoomIdParams => js.Promise[Unit],
    disconnect: () => js.Promise[Unit],
    enablePushNotifications: () => js.Promise[Unit],
    fetchMultipartMessages: FetchMultipartMessagesParams => js.Promise[js.Array[PusherMessage]],
    getJoinableRooms: () => js.Promise[js.Array[PusherRoom]],
    isTypingIn: RoomIdParams => js.Promise[Unit],
    joinRoom: RoomIdParams => js.Promise[PusherRoom],
    leaveRoom: RoomIdParams => js.Promise[PusherRoom],
    readCursor: ReadCursorParams => js.Promise[PusherReadCursor],
    removeUserFromRoom: UserAndRoomParams => js.Promise[Unit],
    roomSubscriptions: RoomSubscriptions,
    rooms: js.Array[PusherRoom],
    sendMultipartMessage: SendMultipartMessageParams => js.Promise[Double],
    sendSimpleMessage: SendSimpleMessageParams => js.Promise[Double],
    setReadCursor: SetReadCursorParams => js.Promise[Unit],
    subscribeToRoomMultipart: RoomSubcriptionParams => js.Promise[PusherRoom],
    updateRoom: UpdateRoomParams => js.Promise[PusherRoom],
    users: js.Array[PusherUser]
  ): CurrentUser = {
    val __obj = js.Dynamic.literal(addUserToRoom = js.Any.fromFunction1(addUserToRoom), createRoom = js.Any.fromFunction1(createRoom), deleteRoom = js.Any.fromFunction1(deleteRoom), disconnect = js.Any.fromFunction0(disconnect), enablePushNotifications = js.Any.fromFunction0(enablePushNotifications), fetchMultipartMessages = js.Any.fromFunction1(fetchMultipartMessages), getJoinableRooms = js.Any.fromFunction0(getJoinableRooms), isTypingIn = js.Any.fromFunction1(isTypingIn), joinRoom = js.Any.fromFunction1(joinRoom), leaveRoom = js.Any.fromFunction1(leaveRoom), readCursor = js.Any.fromFunction1(readCursor), removeUserFromRoom = js.Any.fromFunction1(removeUserFromRoom), roomSubscriptions = roomSubscriptions.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], sendMultipartMessage = js.Any.fromFunction1(sendMultipartMessage), sendSimpleMessage = js.Any.fromFunction1(sendSimpleMessage), setReadCursor = js.Any.fromFunction1(setReadCursor), subscribeToRoomMultipart = js.Any.fromFunction1(subscribeToRoomMultipart), updateRoom = js.Any.fromFunction1(updateRoom), users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentUser]
  }
  @scala.inline
  implicit class CurrentUserOps[Self <: CurrentUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddUserToRoom(value: UserAndRoomParams => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addUserToRoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateRoom(value: CreateRoomParams => js.Promise[PusherRoom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteRoom(value: RoomIdParams => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisconnect(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnablePushNotifications(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePushNotifications")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFetchMultipartMessages(value: FetchMultipartMessagesParams => js.Promise[js.Array[PusherMessage]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchMultipartMessages")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetJoinableRooms(value: () => js.Promise[js.Array[PusherRoom]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJoinableRooms")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTypingIn(value: RoomIdParams => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTypingIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withJoinRoom(value: RoomIdParams => js.Promise[PusherRoom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinRoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLeaveRoom(value: RoomIdParams => js.Promise[PusherRoom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaveRoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadCursor(value: ReadCursorParams => js.Promise[PusherReadCursor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readCursor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveUserFromRoom(value: UserAndRoomParams => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUserFromRoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoomSubscriptions(value: RoomSubscriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roomSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRooms(value: js.Array[PusherRoom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendMultipartMessage(value: SendMultipartMessageParams => js.Promise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMultipartMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendSimpleMessage(value: SendSimpleMessageParams => js.Promise[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendSimpleMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetReadCursor(value: SetReadCursorParams => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadCursor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubscribeToRoomMultipart(value: RoomSubcriptionParams => js.Promise[PusherRoom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribeToRoomMultipart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateRoom(value: UpdateRoomParams => js.Promise[PusherRoom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[PusherUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

