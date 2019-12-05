package typingsSlinky.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdMod

import typingsSlinky.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorAuthenticationFailed
import typingsSlinky.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorPasscodeNotSet
import typingsSlinky.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorSystemCancel
import typingsSlinky.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorTouchIDNotAvailable
import typingsSlinky.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorTouchIDNotEnrolled
import typingsSlinky.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorUserCancel
import typingsSlinky.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorUserFallback
import typingsSlinky.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.RCTTouchIDNotSupported
import typingsSlinky.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.RCTTouchIDUnknownError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchIDError extends js.Object {
  var details: js.Any
  var message: String
  var name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
}

object TouchIDError {
  @scala.inline
  def apply(
    details: js.Any,
    message: String,
    name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
  ): TouchIDError = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TouchIDError]
  }
}

