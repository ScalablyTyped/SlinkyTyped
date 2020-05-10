package typingsSlinky.businessRulesEngine.mod

import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValidatorFce extends js.Object {
  var AsyncValidationFce: js.UndefOr[IAsyncValidate] = js.native
  var Name: String = js.native
  var ValidationFce: js.UndefOr[IValidate] = js.native
}

object IValidatorFce {
  @scala.inline
  def apply(Name: String): IValidatorFce = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidatorFce]
  }
  @scala.inline
  implicit class IValidatorFceOps[Self <: IValidatorFce] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncValidationFce(value: /* args */ IError => Promise[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AsyncValidationFce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAsyncValidationFce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AsyncValidationFce")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationFce(value: /* args */ IError => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationFce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidationFce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidationFce")(js.undefined)
        ret
    }
  }
  
}

