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
@js.native
trait AllChoiceMap[T /* <: Answers */] extends js.Object {
  var BaseChoiceMap: typingsSlinky.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.separatorMod.^  = js.native
  var CheckboxChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T] = js.native
  var ExpandChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | ExpandChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T] = js.native
  var ListChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | ListChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.choiceMod.^[T] = js.native
}

object AllChoiceMap {
  @scala.inline
  def apply[T](
    BaseChoiceMap: typingsSlinky.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.separatorMod.^ ,
    CheckboxChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T],
    ExpandChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | ExpandChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T],
    ListChoiceMap: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | ListChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.choiceMod.^[T]
  ): AllChoiceMap[T] = {
    val __obj = js.Dynamic.literal(BaseChoiceMap = BaseChoiceMap.asInstanceOf[js.Any], CheckboxChoiceMap = CheckboxChoiceMap.asInstanceOf[js.Any], ExpandChoiceMap = ExpandChoiceMap.asInstanceOf[js.Any], ListChoiceMap = ListChoiceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllChoiceMap[T]]
  }
  @scala.inline
  implicit class AllChoiceMapOps[Self[t] <: AllChoiceMap[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBaseChoiceMap(
      value: typingsSlinky.inquirer.choiceMod.^[T] | ChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.separatorMod.^ 
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseChoiceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckboxChoiceMap(
      value: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | CheckboxChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckboxChoiceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandChoiceMap(
      value: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | SeparatorOptions | ExpandChoiceOptions[T] | typingsSlinky.inquirer.choiceMod.^[T]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpandChoiceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListChoiceMap(
      value: ChoiceOptions[T] | typingsSlinky.inquirer.separatorMod.^  | ListChoiceOptions[T] | SeparatorOptions | typingsSlinky.inquirer.choiceMod.^[T]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListChoiceMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

