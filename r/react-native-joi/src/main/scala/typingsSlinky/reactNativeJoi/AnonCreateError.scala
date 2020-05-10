package typingsSlinky.reactNativeJoi

import typingsSlinky.reactNativeJoi.mod.Context
import typingsSlinky.reactNativeJoi.mod.Err
import typingsSlinky.reactNativeJoi.mod.State
import typingsSlinky.reactNativeJoi.mod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateError extends js.Object {
  /**
    * Creates a joi error object.
    * Used in conjunction with custom rules.
    * @param type - the type of rule to create the error for.
    * @param context - provide properties that will be available in the `language` templates.
    * @param state - should the context passed into the `validate` function in a custom rule
    * @param options - should the context passed into the `validate` function in a custom rule
    */
  def createError(`type`: String, context: Context, state: State, options: ValidationOptions): Err = js.native
}

object AnonCreateError {
  @scala.inline
  def apply(createError: (String, Context, State, ValidationOptions) => Err): AnonCreateError = {
    val __obj = js.Dynamic.literal(createError = js.Any.fromFunction4(createError))
    __obj.asInstanceOf[AnonCreateError]
  }
  @scala.inline
  implicit class AnonCreateErrorOps[Self <: AnonCreateError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateError(value: (String, Context, State, ValidationOptions) => Err): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createError")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

