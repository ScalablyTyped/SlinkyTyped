package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `PasswordPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait PasswordQuestionOptions[T /* <: Answers */] extends InputQuestionOptions[T] {
  /**
    * The character to replace the user-input.
    */
  var mask: js.UndefOr[String] = js.native
}

object PasswordQuestionOptions {
  @scala.inline
  def apply[T](): PasswordQuestionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordQuestionOptions[T]]
  }
  @scala.inline
  implicit class PasswordQuestionOptionsOps[Self[t] <: PasswordQuestionOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMask(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
  }
  
}

