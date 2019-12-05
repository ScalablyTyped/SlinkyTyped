package typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import typingsSlinky.reactDashNativeDashFirebase.Anon_Email
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.EMAIL_SIGNIN
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.ERROR
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.PASSWORD_RESET
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.RECOVER_EMAIL
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.VERIFY_EMAIL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCodeInfo extends js.Object {
  var data: Anon_Email
  var operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR
}

object ActionCodeInfo {
  @scala.inline
  def apply(data: Anon_Email, operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionCodeInfo]
  }
}

