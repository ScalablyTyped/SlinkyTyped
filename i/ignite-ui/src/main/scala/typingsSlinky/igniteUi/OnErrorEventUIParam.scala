package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnErrorEventUIParam extends js.Object {
  /**
  	 * Gets the current errorCode.
  	 */
  var errorCode: js.UndefOr[Double] = js.native
  /**
  	 * Gets the detailed error description.
  	 */
  var errorMessage: js.UndefOr[String] = js.native
  /**
  	 * Gets the error type - it could be clientside or serverside.
  	 */
  var errorType: js.UndefOr[String] = js.native
  /**
  	 * Gets the identifier of the file for which the event is fired(after that it can be used API function getFileInfo). NOTE: It is possible to be null in some cases: try to drop multiple files when mode is single , check maximum allowed uploading files fails or check for count of maximum allowed simultaneous files upload fails.
  	 */
  var fileId: js.UndefOr[Double] = js.native
  /**
  	 * Gets the igUpload widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the specific server message returned by server - if errorType is serverside.
  	 */
  var serverMessage: js.UndefOr[String] = js.native
}

object OnErrorEventUIParam {
  @scala.inline
  def apply(): OnErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnErrorEventUIParam]
  }
  @scala.inline
  implicit class OnErrorEventUIParamOps[Self <: OnErrorEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorType")(js.undefined)
        ret
    }
    @scala.inline
    def withFileId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withServerMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverMessage")(js.undefined)
        ret
    }
  }
  
}

