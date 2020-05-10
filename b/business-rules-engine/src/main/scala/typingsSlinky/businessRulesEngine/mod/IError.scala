package typingsSlinky.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IError extends js.Object {
  var ErrorMessage: String = js.native
  var HasError: Boolean = js.native
  var TranslateArgs: js.UndefOr[IErrorTranslateArgs] = js.native
}

object IError {
  @scala.inline
  def apply(ErrorMessage: String, HasError: Boolean): IError = {
    val __obj = js.Dynamic.literal(ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasError = HasError.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  @scala.inline
  implicit class IErrorOps[Self <: IError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateArgs(value: IErrorTranslateArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranslateArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslateArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranslateArgs")(js.undefined)
        ret
    }
  }
  
}

