package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixAppserviceBridge.AnonMatrix
import typingsSlinky.matrixAppserviceBridge.AnonRemote
import typingsSlinky.matrixAppserviceBridge.AnonRemotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeContext extends js.Object {
  var rooms: AnonRemotes = js.native
  var senders: AnonMatrix = js.native
  var targets: AnonRemote = js.native
}

object BridgeContext {
  @scala.inline
  def apply(rooms: AnonRemotes, senders: AnonMatrix, targets: AnonRemote): BridgeContext = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any], senders = senders.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeContext]
  }
  @scala.inline
  implicit class BridgeContextOps[Self <: BridgeContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRooms(value: AnonRemotes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenders(value: AnonMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: AnonRemote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

