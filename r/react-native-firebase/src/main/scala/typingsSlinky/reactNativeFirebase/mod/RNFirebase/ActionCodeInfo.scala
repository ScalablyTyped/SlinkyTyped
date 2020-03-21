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

trait ActionCodeInfo extends js.Object {
  var data: AnonEmail
  var operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR
}

object ActionCodeInfo {
  @scala.inline
  def apply(data: AnonEmail, operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionCodeInfo]
  }
}

