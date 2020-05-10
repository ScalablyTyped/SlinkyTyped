package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for the `CheckboxQuestion`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait CheckboxChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var CheckboxChoiceOptions: typingsSlinky.inquirer.mod.CheckboxChoiceOptions[T] = js.native
}

object CheckboxChoiceMap {
  @scala.inline
  def apply[T](
    CheckboxChoiceOptions: CheckboxChoiceOptions[T],
    Choice: typingsSlinky.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typingsSlinky.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): CheckboxChoiceMap[T] = {
    val __obj = js.Dynamic.literal(CheckboxChoiceOptions = CheckboxChoiceOptions.asInstanceOf[js.Any], Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxChoiceMap[T]]
  }
  @scala.inline
  implicit class CheckboxChoiceMapOps[Self[t] <: CheckboxChoiceMap[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCheckboxChoiceOptions(value: CheckboxChoiceOptions[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckboxChoiceOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

