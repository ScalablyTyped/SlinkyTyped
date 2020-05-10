package typingsSlinky.matrixAppserviceBridge.mod

import typingsSlinky.matrixAppserviceBridge.matrixAppserviceBridgeStrings.`private`
import typingsSlinky.matrixAppserviceBridge.matrixAppserviceBridgeStrings.public
import typingsSlinky.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trusted_private_chat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoomOptions extends js.Object {
      // Either 'public' or 'private'.
  var invite: js.Array[String] = js.native
  var is_direct: js.UndefOr[Boolean] = js.native
                  // A list of user IDs to invite to this room.
  var name: js.UndefOr[String] = js.native
  var preset: js.UndefOr[trusted_private_chat] = js.native
  var room_alias_name: js.UndefOr[String] = js.native
                    // The name to give this room.
  var topic: js.UndefOr[String] = js.native
                    // The alias localpart to assign to this room.
  var visibility: public | `private` = js.native
}

object CreateRoomOptions {
  @scala.inline
  def apply(invite: js.Array[String], visibility: public | `private`): CreateRoomOptions = {
    val __obj = js.Dynamic.literal(invite = invite.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomOptions]
  }
  @scala.inline
  implicit class CreateRoomOptionsOps[Self <: CreateRoomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvite(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibility(value: public | `private`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_direct(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_direct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_direct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_direct")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: trusted_private_chat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withRoom_alias_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room_alias_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoom_alias_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room_alias_name")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
  }
  
}

