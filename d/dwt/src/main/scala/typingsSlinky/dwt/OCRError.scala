package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OCRError extends js.Object {
  var errorString: String = js.native
  var responseText: String = js.native
}

object OCRError {
  @scala.inline
  def apply(errorString: String, responseText: String): OCRError = {
    val __obj = js.Dynamic.literal(errorString = errorString.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OCRError]
  }
  @scala.inline
  implicit class OCRErrorOps[Self <: OCRError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

