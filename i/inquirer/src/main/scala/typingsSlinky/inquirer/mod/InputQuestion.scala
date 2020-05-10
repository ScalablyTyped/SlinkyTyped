package typingsSlinky.inquirer.mod

import typingsSlinky.inquirer.inquirerStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `InputPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait InputQuestion[T /* <: Answers */] extends InputQuestionOptions[T] {
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_InputQuestion: js.UndefOr[input] = js.native
}

object InputQuestion {
  @scala.inline
  def apply[T](): InputQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputQuestion[T]]
  }
  @scala.inline
  implicit class InputQuestionOps[Self[t] <: InputQuestion[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withType(value: input): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

