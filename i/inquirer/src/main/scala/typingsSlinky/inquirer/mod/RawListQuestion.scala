package typingsSlinky.inquirer.mod

import typingsSlinky.inquirer.inquirerStrings.rawlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `RawListPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait RawListQuestion[T /* <: Answers */] extends ListQuestionOptionsBase[T, ListChoiceMap[T]] {
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_RawListQuestion: rawlist
}

object RawListQuestion {
  @scala.inline
  def apply[/* <: typingsSlinky.inquirer.mod.Answers */ T](`type`: rawlist): RawListQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawListQuestion[T]]
  }
  @scala.inline
  implicit class RawListQuestionOps[Self <: RawListQuestion[_], /* <: typingsSlinky.inquirer.mod.Answers */ T] (val x: Self with RawListQuestion[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: rawlist): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

