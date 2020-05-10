package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a choice of the `CheckboxPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait CheckboxChoiceOptions[T /* <: Answers */] extends ListChoiceOptions[T] {
  /**
    * A value indicating whether the choice should be initially checked.
    */
  var checked: js.UndefOr[Boolean] = js.native
}

object CheckboxChoiceOptions {
  @scala.inline
  def apply[T](): CheckboxChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxChoiceOptions[T]]
  }
  @scala.inline
  implicit class CheckboxChoiceOptionsOps[Self[t] <: CheckboxChoiceOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChecked(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
  }
  
}

