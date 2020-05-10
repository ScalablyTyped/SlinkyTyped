package typingsSlinky.inquirer.mod

import typingsSlinky.inquirer.AnonIsFinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `InputPrompt`.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait InputQuestionOptions[T /* <: Answers */] extends Question[T] {
  /**
    * Transforms the value to display to the user.
    *
    * @param input
    * The input provided by the user.
    *
    * @param answers
    * The answers provided by the users.
    *
    * @param flags
    * Additional information about the value.
    *
    * @returns
    * The value to display to the user.
    */
  var transformer: js.UndefOr[
    js.Function3[
      /* input */ js.Any, 
      /* answers */ T, 
      /* flags */ AnonIsFinal, 
      String | js.Promise[String]
    ]
  ] = js.native
}

object InputQuestionOptions {
  @scala.inline
  def apply[T](): InputQuestionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputQuestionOptions[T]]
  }
  @scala.inline
  implicit class InputQuestionOptionsOps[Self[t] <: InputQuestionOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withTransformer(
      value: (/* input */ js.Any, /* answers */ T, /* flags */ AnonIsFinal) => String | js.Promise[String]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformer")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransformer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformer")(js.undefined)
        ret
    }
  }
  
}

