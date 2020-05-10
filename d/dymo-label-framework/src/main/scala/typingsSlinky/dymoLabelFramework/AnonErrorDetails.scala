package typingsSlinky.dymoLabelFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorDetails extends js.Object {
  /** An empty string if no error is detected; an error message if an error is detected. */
  var errorDetails: String = js.native
  /** Indicates whether the browser is supported or not. */
  var isBrowserSupported: Boolean = js.native
  /** Indicates whether the Framework is installed or not. */
  var isFrameworkInstalled: Boolean = js.native
}

object AnonErrorDetails {
  @scala.inline
  def apply(errorDetails: String, isBrowserSupported: Boolean, isFrameworkInstalled: Boolean): AnonErrorDetails = {
    val __obj = js.Dynamic.literal(errorDetails = errorDetails.asInstanceOf[js.Any], isBrowserSupported = isBrowserSupported.asInstanceOf[js.Any], isFrameworkInstalled = isFrameworkInstalled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorDetails]
  }
  @scala.inline
  implicit class AnonErrorDetailsOps[Self <: AnonErrorDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBrowserSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBrowserSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFrameworkInstalled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFrameworkInstalled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

