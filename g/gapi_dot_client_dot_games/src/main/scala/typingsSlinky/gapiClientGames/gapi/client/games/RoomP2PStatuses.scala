package typingsSlinky.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomP2PStatuses extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#roomP2PStatuses. */
  var kind: js.UndefOr[String] = js.native
  /** The updates for the peers. */
  var updates: js.UndefOr[js.Array[RoomP2PStatus]] = js.native
}

object RoomP2PStatuses {
  @scala.inline
  def apply(): RoomP2PStatuses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomP2PStatuses]
  }
  @scala.inline
  implicit class RoomP2PStatusesOps[Self <: RoomP2PStatuses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdates(value: js.Array[RoomP2PStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updates")(js.undefined)
        ret
    }
  }
  
}

