package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.chimeMod.ErrorCode] = js.native
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The phone number ID for which the action failed.
    */
  var PhoneNumberId: js.UndefOr[NonEmptyString] = js.native
}

object PhoneNumberError {
  @scala.inline
  def apply(): PhoneNumberError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberError]
  }
  @scala.inline
  implicit class PhoneNumberErrorOps[Self <: PhoneNumberError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumberId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumberId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneNumberId")(js.undefined)
        ret
    }
  }
  
}

