package typingsSlinky.reactNativeFirebaseApp.ReactNativeFirebase

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeFirebaseError extends Error {
  /**
    * Firebase error code, e.g. `auth/invalid-email`
    */
  val code: String = js.native
  /**
    * The firebase module namespace that this error originated from, e.g. 'analytics'
    */
  val namespace: String = js.native
  /**
    * The native sdks returned error code, different per platform
    */
  val nativeErrorCode: String | Double = js.native
  /**
    * The native sdks returned error message, different per platform
    */
  val nativeErrorMessage: String = js.native
}

object NativeFirebaseError {
  @scala.inline
  def apply(
    code: String,
    message: String,
    name: String,
    namespace: String,
    nativeErrorCode: String | Double,
    nativeErrorMessage: String
  ): NativeFirebaseError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], nativeErrorCode = nativeErrorCode.asInstanceOf[js.Any], nativeErrorMessage = nativeErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeFirebaseError]
  }
  @scala.inline
  implicit class NativeFirebaseErrorOps[Self <: NativeFirebaseError] (val x: Self) extends AnyVal {
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
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeErrorCode(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

