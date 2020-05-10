package typingsSlinky.matrixJsSdk.mod

import typingsSlinky.matrixJsSdk.matrixJsSdkStrings.`private`
import typingsSlinky.matrixJsSdk.matrixJsSdkStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoomOptions extends js.Object {
  var invite: js.UndefOr[js.Array[String]] = js.native
    //  <string> A list of user IDs to invite to this room.
  var name: js.UndefOr[String] = js.native
           //  The name to give this room.
  var room_alias_name: js.UndefOr[String] = js.native
           //  The alias localpart to assign to this room.
  var topic: js.UndefOr[String] = js.native
           //  The topic to give this room.
  var visibility: js.UndefOr[public | `private`] = js.native
}

object CreateRoomOptions {
  @scala.inline
  def apply(): CreateRoomOptions = {
    val __obj = js.Dynamic.literal()
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
    def withoutInvite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invite")(js.undefined)
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
    @scala.inline
    def withVisibility(value: public | `private`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

