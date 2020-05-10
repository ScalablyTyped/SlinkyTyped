package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for the `ListQuestion`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ListChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var ListChoiceOptions: typingsSlinky.inquirer.mod.ListChoiceOptions[T] = js.native
}

object ListChoiceMap {
  @scala.inline
  def apply[T](
    Choice: typingsSlinky.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    ListChoiceOptions: ListChoiceOptions[T],
    Separator: typingsSlinky.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): ListChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], ListChoiceOptions = ListChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChoiceMap[T]]
  }
  @scala.inline
  implicit class ListChoiceMapOps[Self[t] <: ListChoiceMap[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withListChoiceOptions(value: ListChoiceOptions[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListChoiceOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

