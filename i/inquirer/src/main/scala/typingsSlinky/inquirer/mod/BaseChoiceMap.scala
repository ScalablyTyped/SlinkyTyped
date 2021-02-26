package typingsSlinky.inquirer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides all valid choice-types for any kind of question.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait BaseChoiceMap[T /* <: Answers */] extends StObject {
  
  var Choice: typingsSlinky.inquirer.choiceMod.^[T] = js.native
  
  var ChoiceOptions: typingsSlinky.inquirer.mod.ChoiceOptions[T] = js.native
  
  var Separator: typingsSlinky.inquirer.separatorMod.^ = js.native
  
  var SeparatorOptions: typingsSlinky.inquirer.mod.SeparatorOptions = js.native
}
object BaseChoiceMap {
  
  @scala.inline
  def apply[T /* <: Answers */](
    Choice: typingsSlinky.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typingsSlinky.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): BaseChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChoiceMap[T]]
  }
  
  @scala.inline
  implicit class BaseChoiceMapMutableBuilder[Self <: BaseChoiceMap[_], T /* <: Answers */] (val x: Self with BaseChoiceMap[T]) extends AnyVal {
    
    @scala.inline
    def setChoice(value: typingsSlinky.inquirer.choiceMod.^[T]): Self = StObject.set(x, "Choice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoiceOptions(value: ChoiceOptions[T]): Self = StObject.set(x, "ChoiceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: typingsSlinky.inquirer.separatorMod.^): Self = StObject.set(x, "Separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorOptions(value: SeparatorOptions): Self = StObject.set(x, "SeparatorOptions", value.asInstanceOf[js.Any])
  }
}
