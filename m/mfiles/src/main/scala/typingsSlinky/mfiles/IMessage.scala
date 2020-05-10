package typingsSlinky.mfiles

import typingsSlinky.mfiles.mfilesNumbers.`1`
import typingsSlinky.mfiles.mfilesNumbers.`2`
import typingsSlinky.mfiles.mfilesNumbers.`3`
import typingsSlinky.mfiles.mfilesNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessage extends js.Object {
  var button1_enabled: js.UndefOr[Boolean] = js.native
  var button1_title: js.UndefOr[String] = js.native
  var button2_enabled: js.UndefOr[Boolean] = js.native
  var button2_title: js.UndefOr[String] = js.native
  var button3_enabled: js.UndefOr[Boolean] = js.native
  var button3_title: js.UndefOr[String] = js.native
  var button4_enabled: js.UndefOr[Boolean] = js.native
  var button4_title: js.UndefOr[String] = js.native
  var cancelButton: js.UndefOr[`1` | `2` | `3` | `4`] = js.native
  var caption: js.UndefOr[String] = js.native
  var checkbox_checked: js.UndefOr[Boolean] = js.native
  var checkbox_enabled: js.UndefOr[Boolean] = js.native
  var checkbox_title: js.UndefOr[String] = js.native
  var defaultButton: js.UndefOr[`1` | `2` | `3` | `4`] = js.native
  var icon: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var timeOut: js.UndefOr[Double] = js.native
  var timeOutButton: js.UndefOr[`1` | `2` | `3` | `4`] = js.native
  var timeout_deactivateOnFocusChange: js.UndefOr[Boolean] = js.native
}

object IMessage {
  @scala.inline
  def apply(): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessage]
  }
  @scala.inline
  implicit class IMessageOps[Self <: IMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton1_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button1_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton1_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button1_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withButton1_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button1_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton1_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button1_title")(js.undefined)
        ret
    }
    @scala.inline
    def withButton2_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button2_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton2_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button2_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withButton2_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button2_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton2_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button2_title")(js.undefined)
        ret
    }
    @scala.inline
    def withButton3_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button3_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton3_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button3_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withButton3_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button3_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton3_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button3_title")(js.undefined)
        ret
    }
    @scala.inline
    def withButton4_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button4_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton4_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button4_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withButton4_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button4_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton4_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button4_title")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButton(value: `1` | `2` | `3` | `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButton")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckbox_checked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox_checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckbox_checked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox_checked")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckbox_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckbox_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckbox_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckbox_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox_title")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultButton(value: `1` | `2` | `3` | `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultButton")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOut(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOutButton(value: `1` | `2` | `3` | `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOutButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOutButton")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout_deactivateOnFocusChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout_deactivateOnFocusChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout_deactivateOnFocusChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout_deactivateOnFocusChange")(js.undefined)
        ret
    }
  }
  
}

