package typingsSlinky.reactNativeFirebase.mod.RNFirebase

import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.error_
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.sent
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.timeout
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneAuthSnapshot extends js.Object {
  var code: String | Null = js.native
  var error: NativeError | Null = js.native
  var state: sent | timeout | verified | error_ = js.native
  var verificationId: String = js.native
}

object PhoneAuthSnapshot {
  @scala.inline
  def apply(state: sent | timeout | verified | error_, verificationId: String): PhoneAuthSnapshot = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], verificationId = verificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneAuthSnapshot]
  }
  @scala.inline
  implicit class PhoneAuthSnapshotOps[Self <: PhoneAuthSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: sent | timeout | verified | error_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerificationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(null)
        ret
    }
    @scala.inline
    def withError(value: NativeError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(null)
        ret
    }
  }
  
}

