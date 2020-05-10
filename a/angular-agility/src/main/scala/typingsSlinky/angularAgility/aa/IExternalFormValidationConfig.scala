package typingsSlinky.angularAgility.aa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExternalFormValidationConfig extends js.Object {
  var globals: js.UndefOr[js.Any] = js.native
  var ignore: js.UndefOr[js.Any] = js.native
  var resolve: js.UndefOr[js.Any] = js.native
  var resolveFn: js.UndefOr[js.Function1[/* modelValue */ String, String]] = js.native
  var validations: js.Any = js.native
}

object IExternalFormValidationConfig {
  @scala.inline
  def apply(validations: js.Any): IExternalFormValidationConfig = {
    val __obj = js.Dynamic.literal(validations = validations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExternalFormValidationConfig]
  }
  @scala.inline
  implicit class IExternalFormValidationConfigOps[Self <: IExternalFormValidationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidations(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlobals(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveFn(value: /* modelValue */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveFn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolveFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveFn")(js.undefined)
        ret
    }
  }
  
}

