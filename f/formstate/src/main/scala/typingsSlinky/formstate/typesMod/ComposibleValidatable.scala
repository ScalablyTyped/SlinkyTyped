package typingsSlinky.formstate.typesMod

import typingsSlinky.formstate.anon.HasError
import typingsSlinky.formstate.anon.OnReinit
import typingsSlinky.formstate.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposibleValidatable[TValue] extends Validatable[TValue] {
  @JSName("_on$Reinit")
  def _on$Reinit(): Unit = js.native
  /** Used to tell the parent about validation */
  @JSName("_on$ValidationPass")
  def _on$ValidationPass(): Unit = js.native
  /** Used by the parent to register listeners */
  def _setCompositionParent(config: OnReinit): Unit = js.native
  /** Allows a convinient reset for all fields */
  def reset(): Unit = js.native
}

object ComposibleValidatable {
  @scala.inline
  def apply[TValue](
    $: TValue,
    _on$Reinit: () => Unit,
    _on$ValidationPass: () => Unit,
    _setCompositionParent: OnReinit => Unit,
    disableAutoValidation: () => Unit,
    enableAutoValidation: () => Unit,
    hasError: Boolean,
    reset: () => Unit,
    validate: () => js.Promise[HasError | Value[TValue]],
    validating: Boolean
  ): ComposibleValidatable[TValue] = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], _on$Reinit = js.Any.fromFunction0(_on$Reinit), _on$ValidationPass = js.Any.fromFunction0(_on$ValidationPass), _setCompositionParent = js.Any.fromFunction1(_setCompositionParent), disableAutoValidation = js.Any.fromFunction0(disableAutoValidation), enableAutoValidation = js.Any.fromFunction0(enableAutoValidation), hasError = hasError.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), validate = js.Any.fromFunction0(validate), validating = validating.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposibleValidatable[TValue]]
  }
  @scala.inline
  implicit class ComposibleValidatableOps[Self[tvalue] <: ComposibleValidatable[tvalue], TValue] (val x: Self[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TValue] with Other]
    @scala.inline
    def with_on$Reinit(value: () => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_on$Reinit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_on$ValidationPass(value: () => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_on$ValidationPass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_setCompositionParent(value: OnReinit => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_setCompositionParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

