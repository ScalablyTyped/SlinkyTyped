package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatPermissions extends js.Object {
  var can_add_web_page_previews: js.UndefOr[Boolean] = js.native
  var can_change_info: js.UndefOr[Boolean] = js.native
  var can_invite_users: js.UndefOr[Boolean] = js.native
  var can_pin_messages: js.UndefOr[Boolean] = js.native
  var can_send_media_messages: js.UndefOr[Boolean] = js.native
  var can_send_messages: js.UndefOr[Boolean] = js.native
  var can_send_other_messages: js.UndefOr[Boolean] = js.native
  var can_send_polls: js.UndefOr[Boolean] = js.native
}

object ChatPermissions {
  @scala.inline
  def apply(): ChatPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatPermissions]
  }
  @scala.inline
  implicit class ChatPermissionsOps[Self <: ChatPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCan_add_web_page_previews(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_add_web_page_previews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_add_web_page_previews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_add_web_page_previews")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_change_info(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_change_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_change_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_change_info")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_invite_users(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_invite_users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_invite_users: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_invite_users")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_pin_messages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_pin_messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_pin_messages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_pin_messages")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_send_media_messages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_send_media_messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_send_media_messages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_send_media_messages")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_send_messages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_send_messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_send_messages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_send_messages")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_send_other_messages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_send_other_messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_send_other_messages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_send_other_messages")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_send_polls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_send_polls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_send_polls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_send_polls")(js.undefined)
        ret
    }
  }
  
}

