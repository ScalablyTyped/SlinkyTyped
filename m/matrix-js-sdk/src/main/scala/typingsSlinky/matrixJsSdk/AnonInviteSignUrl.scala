package typingsSlinky.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInviteSignUrl extends js.Object {
  // True to do a room initial sync on the resulting room. If false, the returned Room object will have no current state. Default: true.
  var inviteSignUrl: Boolean
  var syncRoom: Boolean
  // If the caller has a keypair 3pid invite, the signing URL is passed in this parameter.
  var viaServers: js.Array[String]
}

object AnonInviteSignUrl {
  @scala.inline
  def apply(inviteSignUrl: Boolean, syncRoom: Boolean, viaServers: js.Array[String]): AnonInviteSignUrl = {
    val __obj = js.Dynamic.literal(inviteSignUrl = inviteSignUrl.asInstanceOf[js.Any], syncRoom = syncRoom.asInstanceOf[js.Any], viaServers = viaServers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInviteSignUrl]
  }
}

