package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a choice of the `ListPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ListChoiceOptions[T /* <: Answers */] extends ChoiceOptions[T] {
  /**
    * A value indicating whether the choice is disabled.
    */
  var disabled: js.UndefOr[DynamicQuestionProperty[Boolean | String, T]] = js.native
}

object ListChoiceOptions {
  @scala.inline
  def apply[T](): ListChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChoiceOptions[T]]
  }
  @scala.inline
  implicit class ListChoiceOptionsOps[Self[t] <: ListChoiceOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDisabledFunction1(value: T => Boolean | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisabled(value: DynamicQuestionProperty[Boolean | String, T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
  }
  
}

