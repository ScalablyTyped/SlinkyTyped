package typingsSlinky.mailgunJs.mod.validation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptionsPrivate extends js.Object {
  var mailbox_verification: js.UndefOr[Boolean] = js.native
}

object ValidationOptionsPrivate {
  @scala.inline
  def apply(): ValidationOptionsPrivate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptionsPrivate]
  }
  @scala.inline
  implicit class ValidationOptionsPrivateOps[Self <: ValidationOptionsPrivate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMailbox_verification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailbox_verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailbox_verification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailbox_verification")(js.undefined)
        ret
    }
  }
  
}

