package typingsSlinky.formstate.typesMod

import typingsSlinky.formstate.anon.HasError
import typingsSlinky.formstate.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validatable[TValue] extends js.Object {
  @JSName("$")
  var $: TValue = js.native
  var error: js.UndefOr[String | Null] = js.native
  var hasError: Boolean = js.native
  var validating: Boolean = js.native
  def disableAutoValidation(): Unit = js.native
  def enableAutoValidation(): Unit = js.native
  def validate(): js.Promise[HasError | Value[TValue]] = js.native
}

object Validatable {
  @scala.inline
  def apply[TValue](
    $: TValue,
    disableAutoValidation: () => Unit,
    enableAutoValidation: () => Unit,
    hasError: Boolean,
    validate: () => js.Promise[HasError | Value[TValue]],
    validating: Boolean
  ): Validatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], disableAutoValidation = js.Any.fromFunction0(disableAutoValidation), enableAutoValidation = js.Any.fromFunction0(enableAutoValidation), hasError = hasError.asInstanceOf[js.Any], validate = js.Any.fromFunction0(validate), validating = validating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validatable[TValue]]
  }
  @scala.inline
  implicit class ValidatableOps[Self[tvalue] <: Validatable[tvalue], TValue] (val x: Self[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TValue] with Other]
    @scala.inline
    def with$(value: TValue): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableAutoValidation(value: () => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoValidation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnableAutoValidation(value: () => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoValidation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasError(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: () => js.Promise[HasError | Value[TValue]]): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidating(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: String): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorNull: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(null)
        ret
    }
  }
  
}

