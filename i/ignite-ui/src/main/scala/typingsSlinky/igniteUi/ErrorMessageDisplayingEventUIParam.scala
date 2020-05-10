package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorMessageDisplayingEventUIParam extends js.Object {
  /**
  	 * Used to get or set the error message that is to be shown.
  	 */
  var errorMessage: js.UndefOr[js.Any] = js.native
  /**
  	 * Used to obtain reference to the barcode widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ErrorMessageDisplayingEventUIParam {
  @scala.inline
  def apply(): ErrorMessageDisplayingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessageDisplayingEventUIParam]
  }
  @scala.inline
  implicit class ErrorMessageDisplayingEventUIParamOps[Self <: ErrorMessageDisplayingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessage(value: js.Any): Self = {
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
  }
  
}

