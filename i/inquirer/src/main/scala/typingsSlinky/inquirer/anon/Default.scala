package typingsSlinky.inquirer.anon

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.inquirer.mod.ChoiceCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default[T /* <: Answers */] extends js.Object {
  /**
    * The choices of the question.
    */
  var choices: ChoiceCollection[T]
  /**
    * The default value of the question.
    */
  var default: js.Any
  /**
    * The message to show to the user.
    */
  var message: String
  /**
    * The type of the question.
    */
  var `type`: String
}

object Default {
  @scala.inline
  def apply[/* <: typingsSlinky.inquirer.mod.Answers */ T](choices: ChoiceCollection[T], default: js.Any, message: String, `type`: String): Default[T] = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[T]]
  }
  @scala.inline
  implicit class DefaultOps[Self <: Default[_], /* <: typingsSlinky.inquirer.mod.Answers */ T] (val x: Self with Default[T]) extends AnyVal {
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
    def setChoices(value: ChoiceCollection[T]): Self = this.set("choices", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

