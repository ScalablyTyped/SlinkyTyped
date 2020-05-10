package typingsSlinky.gapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmpUrlError extends js.Object {
  /** The error code of an API call. */
  var errorCode: js.UndefOr[String] = js.native
  /** An optional descriptive error message. */
  var errorMessage: js.UndefOr[String] = js.native
  /** The original non-AMP URL. */
  var originalUrl: js.UndefOr[String] = js.native
}

object AmpUrlError {
  @scala.inline
  def apply(): AmpUrlError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpUrlError]
  }
  @scala.inline
  implicit class AmpUrlErrorOps[Self <: AmpUrlError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: String): Self = {
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
    def withOriginalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalUrl")(js.undefined)
        ret
    }
  }
  
}

