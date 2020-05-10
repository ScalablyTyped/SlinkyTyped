package typingsSlinky.inquirer.mod

import typingsSlinky.inquirer.inquirerStrings.confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `ConfirmPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ConfirmQuestion[T /* <: Answers */] extends Question[T] {
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_ConfirmQuestion: confirm = js.native
}

object ConfirmQuestion {
  @scala.inline
  def apply[T](`type`: confirm): ConfirmQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmQuestion[T]]
  }
  @scala.inline
  implicit class ConfirmQuestionOps[Self[t] <: ConfirmQuestion[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withType(value: confirm): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

