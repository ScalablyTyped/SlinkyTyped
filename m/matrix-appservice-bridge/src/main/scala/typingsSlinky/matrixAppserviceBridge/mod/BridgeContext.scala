package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixAppserviceBridge.anon.Matrix
import typingsSlinky.matrixAppserviceBridge.anon.Remote
import typingsSlinky.matrixAppserviceBridge.anon.Remotes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BridgeContext extends js.Object {
  var rooms: Remotes = js.native
  var senders: Matrix = js.native
  var targets: Remote = js.native
}

object BridgeContext {
  @scala.inline
  def apply(rooms: Remotes, senders: Matrix, targets: Remote): BridgeContext = {
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
    def withRooms(value: Remotes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenders(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: Remote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

