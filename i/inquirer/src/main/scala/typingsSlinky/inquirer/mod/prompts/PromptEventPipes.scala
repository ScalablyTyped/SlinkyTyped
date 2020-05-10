package typingsSlinky.inquirer.mod.prompts

import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides pipes for handling events of a prompt.
  *
  * @param T
  * The type of the answer.
  */
@js.native
trait PromptEventPipes[T] extends js.Object {
  /**
    * An object representing an error.
    */
  var error: Observable_[FailedPromptStateData] = js.native
  /**
    * A pypeline for succesful inputs.
    */
  var success: Observable_[SuccessfulPromptStateData[T]] = js.native
}

object PromptEventPipes {
  @scala.inline
  def apply[T](error: Observable_[FailedPromptStateData], success: Observable_[SuccessfulPromptStateData[T]]): PromptEventPipes[T] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptEventPipes[T]]
  }
  @scala.inline
  implicit class PromptEventPipesOps[Self[t] <: PromptEventPipes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withError(value: Observable_[FailedPromptStateData]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Observable_[SuccessfulPromptStateData[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

