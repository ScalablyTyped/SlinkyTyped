package typingsSlinky.cordovaPluginMediaCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates the error code resulting from a failed media capture operation. */
@js.native
trait CaptureError extends js.Object {
  
  /**
    * One of the pre-defined error codes listed below.
    *     CaptureError.CAPTURE_INTERNAL_ERR
    *         The camera or microphone failed to capture image or sound.
    *     CaptureError.CAPTURE_APPLICATION_BUSY
    *         The camera or audio capture application is currently serving another capture request.
    *     CaptureError.CAPTURE_INVALID_ARGUMENT
    *         Invalid use of the API (e.g., the value of limit is less than one).
    *     CaptureError.CAPTURE_NO_MEDIA_FILES
    *         The user exits the camera or audio capture application before capturing anything.
    *     CaptureError.CAPTURE_NOT_SUPPORTED
    *         The requested capture operation is not supported.
    */
  var code: Double = js.native
  
  var message: String = js.native
}
object CaptureError {
  
  @scala.inline
  def apply(code: Double, message: String): CaptureError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureError]
  }
  
  @scala.inline
  implicit class CaptureErrorOps[Self <: CaptureError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
