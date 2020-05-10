package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an update on the status of peers in a room.
  */
@js.native
trait SchemaRoomP2PStatuses extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomP2PStatuses.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The updates for the peers.
    */
  var updates: js.UndefOr[js.Array[SchemaRoomP2PStatus]] = js.native
}

object SchemaRoomP2PStatuses {
  @scala.inline
  def apply(): SchemaRoomP2PStatuses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomP2PStatuses]
  }
  @scala.inline
  implicit class SchemaRoomP2PStatusesOps[Self <: SchemaRoomP2PStatuses] (val x: Self) extends AnyVal {
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
    def withUpdates(value: js.Array[SchemaRoomP2PStatus]): Self = {
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

