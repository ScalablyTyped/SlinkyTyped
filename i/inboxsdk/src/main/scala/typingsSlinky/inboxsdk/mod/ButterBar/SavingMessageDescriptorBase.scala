package typingsSlinky.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingMessageDescriptorBase extends js.Object {
  var className: js.UndefOr[String] = js.native
  var confirmationText: js.UndefOr[String] = js.native
  var confirmationTime: js.UndefOr[Double] = js.native
  var hideOnViewChanged: js.UndefOr[Boolean] = js.native
  var messageKey: js.UndefOr[js.Object | String] = js.native
  var persistent: js.UndefOr[Boolean] = js.native
  var priority: js.UndefOr[Double] = js.native
  var showConfirmation: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Double] = js.native
}

object SavingMessageDescriptorBase {
  @scala.inline
  def apply(): SavingMessageDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingMessageDescriptorBase]
  }
  @scala.inline
  implicit class SavingMessageDescriptorBaseOps[Self <: SavingMessageDescriptorBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmationText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmationText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationText")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmationTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnViewChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnViewChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnViewChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnViewChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageKey(value: js.Object | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withShowConfirmation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

