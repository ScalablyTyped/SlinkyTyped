package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a choice of the `ExpandPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait ExpandChoiceOptions[T /* <: Answers */] extends ChoiceOptions[T] {
  /**
    * The key to press for selecting the choice.
    */
  var key: js.UndefOr[String] = js.native
}

object ExpandChoiceOptions {
  @scala.inline
  def apply[T](): ExpandChoiceOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandChoiceOptions[T]]
  }
  @scala.inline
  implicit class ExpandChoiceOptionsOps[Self[t] <: ExpandChoiceOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

