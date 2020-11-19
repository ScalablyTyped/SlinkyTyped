package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixJsSdk.mod.MatrixClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "AppServiceBot")
@js.native
class AppServiceBot protected () extends js.Object {
  def this(client: MatrixClient, registration: AppServiceRegistration, memberCache: MembershipCache) = this()
  
  def getJoinedMembers(roomId: String): js.Promise[RoomMemberDict] = js.native
  
  def getJoinedRooms(): js.Promise[js.Array[String]] = js.native
  
  def isRemoteUser(userId: String): Boolean = js.native
}
