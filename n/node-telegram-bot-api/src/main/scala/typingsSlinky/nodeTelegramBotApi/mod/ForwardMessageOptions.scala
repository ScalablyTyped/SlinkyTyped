package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardMessageOptions extends js.Object {
  var disable_notification: js.UndefOr[Boolean] = js.native
}

object ForwardMessageOptions {
  @scala.inline
  def apply(): ForwardMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardMessageOptions]
  }
  @scala.inline
  implicit class ForwardMessageOptionsOps[Self <: ForwardMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable_notification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_notification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_notification")(js.undefined)
        ret
    }
  }
  
}

