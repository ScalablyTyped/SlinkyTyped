package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for room modification metadata.
  */
@js.native
trait SchemaRoomModification extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomModification.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp at which they modified the room, in milliseconds since the
    * epoch in UTC.
    */
  var modifiedTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The ID of the participant that modified the room.
    */
  var participantId: js.UndefOr[String] = js.native
}

object SchemaRoomModification {
  @scala.inline
  def apply(): SchemaRoomModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomModification]
  }
  @scala.inline
  implicit class SchemaRoomModificationOps[Self <: SchemaRoomModification] (val x: Self) extends AnyVal {
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
    def withModifiedTimestampMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedTimestampMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiedTimestampMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedTimestampMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withParticipantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantId")(js.undefined)
        ret
    }
  }
  
}

