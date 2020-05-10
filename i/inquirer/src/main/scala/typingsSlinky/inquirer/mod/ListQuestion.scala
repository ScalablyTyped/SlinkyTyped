package typingsSlinky.inquirer.mod

import typingsSlinky.inquirer.inquirerStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `ListPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ListQuestion[T /* <: Answers */] extends ListQuestionOptionsBase[T, ListChoiceMap[T]] {
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ListQuestion: list = js.native
}

object ListQuestion {
  @scala.inline
  def apply[T](`type`: list): ListQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQuestion[T]]
  }
  @scala.inline
  implicit class ListQuestionOps[Self[t] <: ListQuestion[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withType(value: list): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

