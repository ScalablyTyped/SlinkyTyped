package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for the `ExpandQuestion`.
  *
  * @template T
  * The type of the answers.
  */
trait ExpandChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var ExpandChoiceOptions: typingsSlinky.inquirer.mod.ExpandChoiceOptions[T]
}

object ExpandChoiceMap {
  @scala.inline
  def apply[T /* <: Answers */](
    Choice: typingsSlinky.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    ExpandChoiceOptions: ExpandChoiceOptions[T],
    Separator: typingsSlinky.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): ExpandChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], ExpandChoiceOptions = ExpandChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpandChoiceMap[T]]
  }
}

