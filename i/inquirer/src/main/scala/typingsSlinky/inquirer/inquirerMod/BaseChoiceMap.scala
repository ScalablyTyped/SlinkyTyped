package typingsSlinky.inquirer.inquirerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for any kind of question.
  *
  * @template T
  * The type of the answers.
  */
trait BaseChoiceMap[T /* <: Answers */] extends js.Object {
  var Choice: typingsSlinky.inquirer.libObjectsChoiceMod.^[T]
  var ChoiceOptions: typingsSlinky.inquirer.inquirerMod.ChoiceOptions[T]
  var Separator: typingsSlinky.inquirer.libObjectsSeparatorMod.^
  var SeparatorOptions: typingsSlinky.inquirer.inquirerMod.SeparatorOptions
}

object BaseChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    Choice: typingsSlinky.inquirer.libObjectsChoiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typingsSlinky.inquirer.libObjectsSeparatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): BaseChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseChoiceMap[T]]
  }
}

