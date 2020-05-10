package typingsSlinky.reactNativeFirebase.mod.RNFirebase

import typingsSlinky.reactNativeFirebase.AnonEmail
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.EMAIL_SIGNIN
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ERROR
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.PASSWORD_RESET
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.RECOVER_EMAIL
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.VERIFY_EMAIL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionCodeInfo extends js.Object {
  var data: AnonEmail = js.native
  var operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR = js.native
}

object ActionCodeInfo {
  @scala.inline
  def apply(data: AnonEmail, operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeInfo]
  }
  @scala.inline
  implicit class ActionCodeInfoOps[Self <: ActionCodeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: AnonEmail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

