package typingsSlinky.inquirer.mod

import org.scalablytyped.runtime.StObject
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
trait AllChoiceMap[T /* <: Answers */] extends StObject {
  
  var BaseChoiceMap: typingsSlinky.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.separatorMod.^ = js.native
  
  var CheckboxChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^ | SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T] = js.native
  
  var ExpandChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^ | SeparatorOptions | ExpandChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T] = js.native
  
  var ListChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^ | ListChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.choiceMod.^[T] = js.native
}
object AllChoiceMap {
  
  @scala.inline
  def apply[T /* <: Answers */](
    BaseChoiceMap: typingsSlinky.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.separatorMod.^,
    CheckboxChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^ | SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T],
    ExpandChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^ | SeparatorOptions | ExpandChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T],
    ListChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^ | ListChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.choiceMod.^[T]
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
  
  @scala.inline
  implicit class AllChoiceMapMutableBuilder[Self <: AllChoiceMap[_], T /* <: Answers */] (val x: Self with AllChoiceMap[T]) extends AnyVal {
    
    @scala.inline
    def setBaseChoiceMap(
      value: typingsSlinky.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.separatorMod.^
    ): Self = StObject.set(x, "BaseChoiceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxChoiceMap(
      value: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^ | SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T]
    ): Self = StObject.set(x, "CheckboxChoiceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandChoiceMap(
      value: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^ | SeparatorOptions | ExpandChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T]
    ): Self = StObject.set(x, "ExpandChoiceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListChoiceMap(
      value: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^ | ListChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.choiceMod.^[T]
    ): Self = StObject.set(x, "ListChoiceMap", value.asInstanceOf[js.Any])
  }
}
