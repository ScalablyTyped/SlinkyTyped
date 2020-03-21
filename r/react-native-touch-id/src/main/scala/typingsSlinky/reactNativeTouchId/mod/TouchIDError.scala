package typingsSlinky.reactNativeTouchId.mod

import typingsSlinky.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorAuthenticationFailed
import typingsSlinky.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorPasscodeNotSet
import typingsSlinky.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorSystemCancel
import typingsSlinky.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorTouchIDNotAvailable
import typingsSlinky.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorTouchIDNotEnrolled
import typingsSlinky.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorUserCancel
import typingsSlinky.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorUserFallback
import typingsSlinky.reactNativeTouchId.reactNativeTouchIdStrings.RCTTouchIDNotSupported
import typingsSlinky.reactNativeTouchId.reactNativeTouchIdStrings.RCTTouchIDUnknownError
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

