package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestrictChatMemberOptions extends js.Object {
  var can_add_web_page_previews: js.UndefOr[Boolean] = js.native
  var can_send_media_messages: js.UndefOr[Boolean] = js.native
  var can_send_messages: js.UndefOr[Boolean] = js.native
  var can_send_other_messages: js.UndefOr[Boolean] = js.native
  var until_date: js.UndefOr[Double] = js.native
}

object RestrictChatMemberOptions {
  @scala.inline
  def apply(): RestrictChatMemberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestrictChatMemberOptions]
  }
  @scala.inline
  implicit class RestrictChatMemberOptionsOps[Self <: RestrictChatMemberOptions] (val x: Self) extends AnyVal {
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

