package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Query

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeError extends Error {
  var code: String = js.native
  var nativeErrorCode: js.UndefOr[String] = js.native
  var nativeErrorMessage: js.UndefOr[String] = js.native
}

object NativeError {
  @scala.inline
  def apply(code: String, message: String, name: String): NativeError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeError]
  }
  @scala.inline
  implicit class NativeErrorOps[Self <: NativeError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNativeErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeErrorMessage")(js.undefined)
        ret
    }
  }
  
}

