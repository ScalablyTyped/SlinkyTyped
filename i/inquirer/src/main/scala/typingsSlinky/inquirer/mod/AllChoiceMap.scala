package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types.
  *
  * @template T
  * The type of the answers.
  */
trait AllChoiceMap[T /* <: Answers */] extends js.Object {
  var BaseChoiceMap: typingsSlinky.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.separatorMod.^ 
  var CheckboxChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T]
  var ExpandChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | ExpandChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T]
  var ListChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | ListChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.choiceMod.^[T]
}

object AllChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    BaseChoiceMap: typingsSlinky.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.separatorMod.^ ,
    CheckboxChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T],
    ExpandChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | ExpandChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T],
    ListChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | ListChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.choiceMod.^[T]
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
}

