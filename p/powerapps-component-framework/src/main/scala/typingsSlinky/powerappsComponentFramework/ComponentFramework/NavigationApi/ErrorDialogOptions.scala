package typingsSlinky.powerappsComponentFramework.ComponentFramework.NavigationApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface for error dialog options.
		 * You must set either the errorCode or message attribute.
		 */
@js.native
trait ErrorDialogOptions extends js.Object {
  /**
  			 * Details about the error. When you specify this, the Download Log File button is available in the error message, and clicking it will let users download a text file with
  			 * the content specified in this attribute.
  			 */
  var details: js.UndefOr[String] = js.native
  /**
  			 * If you just set errorCode, the message for the error code is automatically retrieved from the server and displayed in the error dialog. If you specify an errorCode value,
  			 * an error dialog with a default error message is displyed.
  			 */
  var errorCode: js.UndefOr[Double] = js.native
  /**
  			 * The message to be displayed in the error dialog.
  			 */
  var message: js.UndefOr[String] = js.native
}

object ErrorDialogOptions {
  @scala.inline
  def apply(): ErrorDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDialogOptions]
  }
  @scala.inline
  implicit class ErrorDialogOptionsOps[Self <: ErrorDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

