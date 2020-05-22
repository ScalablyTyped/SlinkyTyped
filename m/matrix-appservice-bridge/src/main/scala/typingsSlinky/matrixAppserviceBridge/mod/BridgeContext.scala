package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixAppserviceBridge.anon.Matrix
import typingsSlinky.matrixAppserviceBridge.anon.Remote
import typingsSlinky.matrixAppserviceBridge.anon.Remotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeContext extends js.Object {
  var rooms: Remotes
  var senders: Matrix
  var targets: Remote
}

object BridgeContext {
  @scala.inline
  def apply(rooms: Remotes, senders: Matrix, targets: Remote): BridgeContext = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any], senders = senders.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeContext]
  }
}

