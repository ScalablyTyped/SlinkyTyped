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

@js.native
trait TouchIDError extends js.Object {
  var details: js.Any = js.native
  var message: String = js.native
  var name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported = js.native
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
  @scala.inline
  implicit class TouchIDErrorOps[Self <: TouchIDError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(
      value: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

