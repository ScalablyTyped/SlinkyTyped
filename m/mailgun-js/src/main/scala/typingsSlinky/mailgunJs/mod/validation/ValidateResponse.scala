package typingsSlinky.mailgunJs.mod.validation

import typingsSlinky.mailgunJs.AnonDisplayname
import typingsSlinky.mailgunJs.mailgunJsStrings.false_
import typingsSlinky.mailgunJs.mailgunJsStrings.true_
import typingsSlinky.mailgunJs.mailgunJsStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateResponse extends js.Object {
  var address: String = js.native
  var did_you_mean: String | Null = js.native
  var is_disposable_address: Boolean = js.native
  var is_role_address: Boolean = js.native
  var is_valid: Boolean = js.native
  var mailbox_verification: true_ | false_ | unknown | Null = js.native
  var parts: AnonDisplayname = js.native
}

object ValidateResponse {
  @scala.inline
  def apply(
    address: String,
    is_disposable_address: Boolean,
    is_role_address: Boolean,
    is_valid: Boolean,
    parts: AnonDisplayname
  ): ValidateResponse = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], is_disposable_address = is_disposable_address.asInstanceOf[js.Any], is_role_address = is_role_address.asInstanceOf[js.Any], is_valid = is_valid.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateResponse]
  }
  @scala.inline
  implicit class ValidateResponseOps[Self <: ValidateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_disposable_address(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_disposable_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_role_address(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_role_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_valid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParts(value: AnonDisplayname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDid_you_mean(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("did_you_mean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDid_you_meanNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("did_you_mean")(null)
        ret
    }
    @scala.inline
    def withMailbox_verification(value: true_ | false_ | unknown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailbox_verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMailbox_verificationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailbox_verification")(null)
        ret
    }
  }
  
}

