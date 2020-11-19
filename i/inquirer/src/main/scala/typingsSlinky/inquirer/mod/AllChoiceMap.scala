package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides all valid choice-types.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait AllChoiceMap[T /* <: Answers */] extends js.Object {
  
  var BaseChoiceMap: typingsSlinky.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.separatorMod.^  = js.native
  
  var CheckboxChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T] = js.native
  
  var ExpandChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | ExpandChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T] = js.native
  
  var ListChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | ListChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.choiceMod.^[T] = js.native
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
  
  @scala.inline
  implicit class AllChoiceMapOps[Self <: AllChoiceMap[_], T /* <: Answers */] (val x: Self with AllChoiceMap[T]) extends AnyVal {
    
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
    def setBaseChoiceMap(
      value: typingsSlinky.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.separatorMod.^ 
    ): Self = this.set("BaseChoiceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxChoiceMap(
      value: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T]
    ): Self = this.set("CheckboxChoiceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandChoiceMap(
      value: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | ExpandChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T]
    ): Self = this.set("ExpandChoiceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListChoiceMap(
      value: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | ListChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.choiceMod.^[T]
    ): Self = this.set("ListChoiceMap", value.asInstanceOf[js.Any])
  }
}
