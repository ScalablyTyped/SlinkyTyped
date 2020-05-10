package typingsSlinky.inquirer.mod.prompts

import typingsSlinky.inquirer.inquirerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data about the successful state of a prompt.
  *
  * @param T
  * The type of the answer.
  */
@js.native
trait SuccessfulPromptStateData[T] extends PromptStateData {
  /**
    * @inheritdoc
    */
  @JSName("isValid")
  var isValid_SuccessfulPromptStateData: `true` = js.native
  /**
    * The value of the prompt.
    */
  var value: T = js.native
}

object SuccessfulPromptStateData {
  @scala.inline
  def apply[T](isValid: `true`, value: T): SuccessfulPromptStateData[T] = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessfulPromptStateData[T]]
  }
  @scala.inline
  implicit class SuccessfulPromptStateDataOps[Self[t] <: SuccessfulPromptStateData[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsValid(value: `true`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

