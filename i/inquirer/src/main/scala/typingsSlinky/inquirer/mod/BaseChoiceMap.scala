package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for any kind of question.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait BaseChoiceMap[T /* <: Answers */] extends js.Object {
  var Choice: typingsSlinky.inquirer.choiceMod.^[T] = js.native
  var ChoiceOptions: typingsSlinky.inquirer.mod.ChoiceOptions[T] = js.native
  var Separator: typingsSlinky.inquirer.separatorMod.^ = js.native
  var SeparatorOptions: typingsSlinky.inquirer.mod.SeparatorOptions = js.native
}

object BaseChoiceMap {
  @scala.inline
  def apply[T](
    Choice: typingsSlinky.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    Separator: typingsSlinky.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): BaseChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseChoiceMap[T]]
  }
  @scala.inline
  implicit class BaseChoiceMapOps[Self[t] <: BaseChoiceMap[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChoice(value: typingsSlinky.inquirer.choiceMod.^[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Choice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChoiceOptions(value: ChoiceOptions[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChoiceOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: typingsSlinky.inquirer.separatorMod.^): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparatorOptions(value: SeparatorOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeparatorOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

