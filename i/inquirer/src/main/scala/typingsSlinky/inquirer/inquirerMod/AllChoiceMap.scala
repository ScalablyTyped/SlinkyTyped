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
  var CheckboxChoiceMap: typingsSlinky.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.libObjectsSeparatorMod.^ 
  var ExpandChoiceMap: typingsSlinky.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ExpandChoiceOptions[T] | ChoiceOptions[T] | typingsSlinky.inquirer.libObjectsSeparatorMod.^ 
  var ListChoiceMap: typingsSlinky.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | ListChoiceOptions[T] | typingsSlinky.inquirer.libObjectsSeparatorMod.^ 
}

object AllChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    BaseChoiceMap: typingsSlinky.inquirer.libObjectsChoiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.libObjectsSeparatorMod.^ ,
    CheckboxChoiceMap: typingsSlinky.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.libObjectsSeparatorMod.^ ,
    ExpandChoiceMap: typingsSlinky.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ExpandChoiceOptions[T] | ChoiceOptions[T] | typingsSlinky.inquirer.libObjectsSeparatorMod.^ ,
    ListChoiceMap: typingsSlinky.inquirer.libObjectsChoiceMod.^[T] | SeparatorOptions | ChoiceOptions[T] | ListChoiceOptions[T] | typingsSlinky.inquirer.libObjectsSeparatorMod.^ 
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
}

