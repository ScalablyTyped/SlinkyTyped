package typingsSlinky.atPusherChatkitDashClient.chatmanagerMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atPusherChatkitDashClient.currentuserMod.CurrentUser
import typingsSlinky.atPusherChatkitDashClient.hooksMod.RoomParams
import typingsSlinky.atPusherChatkitDashClient.hooksMod.UserParams
import typingsSlinky.atPusherChatkitDashClient.roomMod.PusherRoom
import typingsSlinky.atPusherChatkitDashClient.userMod.PusherUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatManager extends js.Object {
  def connect(): js.Promise[CurrentUser] = js.native
  def connect(hooks: GlobalHooks): js.Promise[CurrentUser] = js.native
  def disablePushNotifications(): js.Promise[Unit] = js.native
  def getRoom(params: RoomParams): js.Promise[PusherRoom] = js.native
  def getUser(params: UserParams): js.Promise[PusherUser] = js.native
}

@JSImport("@pusher/chatkit-client/chatmanager", "ChatManager")
@js.native
object ChatManager extends TopLevel[ChatManagerConstructor]

