package typingsSlinky.inquirer.inquirerMod

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
  var BaseChoiceMap: typingsSlinky.inquirer.libObjectsChoiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.libObjectsSeparatorMod.^ 
  var CheckboxChoiceMap: SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typingsSlinky.inquirer.libObjectsChoiceMod.^[T]
  var ExpandChoiceMap: SeparatorOptions | typingsSlinky.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typingsSlinky.inquirer.libObjectsChoiceMod.^[T] | ExpandChoiceOptions[T]
  var ListChoiceMap: SeparatorOptions | ListChoiceOptions[T] | typingsSlinky.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typingsSlinky.inquirer.libObjectsChoiceMod.^[T]
}

object AllChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    BaseChoiceMap: typingsSlinky.inquirer.libObjectsChoiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.libObjectsSeparatorMod.^ ,
    CheckboxChoiceMap: SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typingsSlinky.inquirer.libObjectsChoiceMod.^[T],
    ExpandChoiceMap: SeparatorOptions | typingsSlinky.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typingsSlinky.inquirer.libObjectsChoiceMod.^[T] | ExpandChoiceOptions[T],
    ListChoiceMap: SeparatorOptions | ListChoiceOptions[T] | typingsSlinky.inquirer.libObjectsSeparatorMod.^  | ChoiceOptions[T] | typingsSlinky.inquirer.libObjectsChoiceMod.^[T]
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
}

