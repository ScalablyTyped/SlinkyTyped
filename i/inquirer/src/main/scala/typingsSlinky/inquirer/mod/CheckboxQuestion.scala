package typingsSlinky.inquirer.mod

import typingsSlinky.inquirer.inquirerStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `CheckboxPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait CheckboxQuestion[T /* <: Answers */] extends ListQuestionOptionsBase[T, CheckboxChoiceMap[T]] {
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_CheckboxQuestion: checkbox = js.native
}

object CheckboxQuestion {
  @scala.inline
  def apply[T](`type`: checkbox): CheckboxQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxQuestion[T]]
  }
  @scala.inline
  implicit class CheckboxQuestionOps[Self[t] <: CheckboxQuestion[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withType(value: checkbox): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

