package typingsSlinky.inquirer.anon

import typingsSlinky.inquirer.choicesMod.^
import typingsSlinky.inquirer.mod.Answers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Choices extends js.Object {
  /**
    * The choices of the prompt.
    */
  var choices: ^[Answers] = js.native
}

object Choices {
  @scala.inline
  def apply(choices: ^[Answers]): Choices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choices]
  }
  @scala.inline
  implicit class ChoicesOps[Self <: Choices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChoices(value: ^[Answers]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

