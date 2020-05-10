package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoteChatMemberOptions extends js.Object {
  var can_change_info: js.UndefOr[Boolean] = js.native
  var can_delete_messages: js.UndefOr[Boolean] = js.native
  var can_edit_messages: js.UndefOr[Boolean] = js.native
  var can_invite_users: js.UndefOr[Boolean] = js.native
  var can_pin_messages: js.UndefOr[Boolean] = js.native
  var can_post_messages: js.UndefOr[Boolean] = js.native
  var can_promote_members: js.UndefOr[Boolean] = js.native
  var can_restrict_members: js.UndefOr[Boolean] = js.native
}

object PromoteChatMemberOptions {
  @scala.inline
  def apply(): PromoteChatMemberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromoteChatMemberOptions]
  }
  @scala.inline
  implicit class PromoteChatMemberOptionsOps[Self <: PromoteChatMemberOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

