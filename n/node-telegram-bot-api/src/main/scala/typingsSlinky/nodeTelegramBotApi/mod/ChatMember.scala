package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatMember extends js.Object {
  var can_add_web_page_previews: js.UndefOr[Boolean] = js.native
  var can_be_edited: js.UndefOr[Boolean] = js.native
  var can_change_info: js.UndefOr[Boolean] = js.native
  var can_delete_messages: js.UndefOr[Boolean] = js.native
  var can_edit_messages: js.UndefOr[Boolean] = js.native
  var can_invite_users: js.UndefOr[Boolean] = js.native
  var can_pin_messages: js.UndefOr[Boolean] = js.native
  var can_post_messages: js.UndefOr[Boolean] = js.native
  var can_promote_members: js.UndefOr[Boolean] = js.native
  var can_restrict_members: js.UndefOr[Boolean] = js.native
  var can_send_media_messages: js.UndefOr[Boolean] = js.native
  var can_send_messages: js.UndefOr[Boolean] = js.native
  var can_send_other_messages: js.UndefOr[Boolean] = js.native
  var can_send_polls: Boolean = js.native
  var is_member: js.UndefOr[Boolean] = js.native
  var status: ChatMemberStatus = js.native
  var until_date: js.UndefOr[Double] = js.native
  var user: User = js.native
}

object ChatMember {
  @scala.inline
  def apply(can_send_polls: Boolean, status: ChatMemberStatus, user: User): ChatMember = {
    val __obj = js.Dynamic.literal(can_send_polls = can_send_polls.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMember]
  }
  @scala.inline
  implicit class ChatMemberOps[Self <: ChatMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCan_send_polls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_send_polls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ChatMemberStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCan_be_edited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_be_edited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_be_edited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_be_edited")(js.undefined)
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
    def withCan_delete_messages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_delete_messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_delete_messages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_delete_messages")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_edit_messages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_edit_messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_edit_messages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_edit_messages")(js.undefined)
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
    def withCan_post_messages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_post_messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_post_messages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_post_messages")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_promote_members(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_promote_members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_promote_members: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_promote_members")(js.undefined)
        ret
    }
    @scala.inline
    def withCan_restrict_members(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_restrict_members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCan_restrict_members: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("can_restrict_members")(js.undefined)
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
    def withIs_member(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_member")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_member: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_member")(js.undefined)
        ret
    }
    @scala.inline
    def withUntil_date(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUntil_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until_date")(js.undefined)
        ret
    }
  }
  
}

