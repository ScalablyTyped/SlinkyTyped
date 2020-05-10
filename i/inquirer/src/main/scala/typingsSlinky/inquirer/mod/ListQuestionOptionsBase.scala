package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list-based question.
  *
  * @template T
  * The type of the answers.
  *
  * @template TChoiceMap
  * The valid choices for the question.
  */
@js.native
trait ListQuestionOptionsBase[T, TChoiceMap] extends Question[T] {
  /**
    * The choices of the prompt.
    */
  var choices: js.UndefOr[AsyncDynamicQuestionProperty[js.Array[DistinctChoice[TChoiceMap]], T]] = js.native
  /**
    * The number of elements to show on each page.
    */
  var pageSize: js.UndefOr[Double] = js.native
}

object ListQuestionOptionsBase {
  @scala.inline
  def apply[T, TChoiceMap](): ListQuestionOptionsBase[T, TChoiceMap] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQuestionOptionsBase[T, TChoiceMap]]
  }
  @scala.inline
  implicit class ListQuestionOptionsBaseOps[Self[t, tchoicemap] <: ListQuestionOptionsBase[t, tchoicemap], T, TChoiceMap] (val x: Self[T, TChoiceMap]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, TChoiceMap] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, TChoiceMap]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, TChoiceMap]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, TChoiceMap]) with Other]
    @scala.inline
    def withChoicesFunction1(
      value: T => js.Array[DistinctChoice[TChoiceMap]] | js.Promise[js.Array[DistinctChoice[TChoiceMap]]]
    ): Self[T, TChoiceMap] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChoices(value: AsyncDynamicQuestionProperty[js.Array[DistinctChoice[TChoiceMap]], T]): Self[T, TChoiceMap] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChoices: Self[T, TChoiceMap] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self[T, TChoiceMap] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self[T, TChoiceMap] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
  }
  
}

