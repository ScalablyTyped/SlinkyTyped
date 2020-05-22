package typingsSlinky.inquirer.anon

import typingsSlinky.inquirer.choicesMod.^
import typingsSlinky.inquirer.mod.Answers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choices extends js.Object {
  /**
    * The choices of the prompt.
    */
  var choices: ^[Answers]
}

object Choices {
  @scala.inline
  def apply(choices: ^[Answers]): Choices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choices]
  }
}

