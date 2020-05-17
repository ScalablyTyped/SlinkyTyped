package typingsSlinky.inquirer.anon

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.inquirer.mod.ChoiceCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default[T /* <: Answers */] extends js.Object {
  /**
    * The choices of the question.
    */
  var choices: ChoiceCollection[T] = js.native
  /**
    * The default value of the question.
    */
  var default: js.Any = js.native
  /**
    * The message to show to the user.
    */
  var message: String = js.native
  /**
    * The type of the question.
    */
  var `type`: String = js.native
}

object Default {
  @scala.inline
  def apply[T](choices: ChoiceCollection[T], default: js.Any, message: String, `type`: String): Default[T] = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[T]]
  }
  @scala.inline
  implicit class DefaultOps[Self[t] <: Default[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChoices(value: ChoiceCollection[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

