package typingsSlinky.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question.
  *
  * @template T
  * The type of the answers.
  */
@js.native
trait Question[T /* <: Answers */] extends js.Object {
  /**
    * The default value of the question.
    */
  var default: js.UndefOr[AsyncDynamicQuestionProperty[_, T]] = js.native
  /**
    * Post-processes the answer.
    *
    * @param input
    * The answer provided by the user.
    */
  var filter: js.UndefOr[js.Function1[/* input */ js.Any, _]] = js.native
  /**
    * The message to show to the user.
    */
  var message: js.UndefOr[AsyncDynamicQuestionProperty[String, T]] = js.native
  /**
    * The key to save the answer to the answers-hash.
    */
  var name: js.UndefOr[KeyUnion[T]] = js.native
  /**
    * The prefix of the `message`.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * The suffix of the `message`.
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * The type of the question.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Validates the integrity of the answer.
    *
    * @param input
    * The answer provided by the user.
    *
    * @param answers
    * The answers provided by the user.
    *
    * @returns
    * Either a value indicating whether the answer is valid or a `string` which describes the error.
    */
  var validate: js.UndefOr[
    js.Function2[
      /* input */ js.Any, 
      /* answers */ js.UndefOr[T], 
      Boolean | String | (js.Promise[Boolean | String])
    ]
  ] = js.native
  /**
    * A value indicating whether the question should be prompted.
    */
  var when: js.UndefOr[AsyncDynamicQuestionProperty[Boolean, T]] = js.native
}

object Question {
  @scala.inline
  def apply[T](): Question[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Question[T]]
  }
  @scala.inline
  implicit class QuestionOps[Self[t] <: Question[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDefaultFunction1(value: T => _ | js.Promise[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDefault(value: AsyncDynamicQuestionProperty[_, T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* input */ js.Any => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageFunction1(value: T => String | js.Promise[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMessage(value: AsyncDynamicQuestionProperty[String, T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: KeyUnion[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffix: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(
      value: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => Boolean | String | (js.Promise[Boolean | String])
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withWhenFunction1(value: T => Boolean | js.Promise[Boolean]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWhen(value: AsyncDynamicQuestionProperty[Boolean, T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhen: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("when")(js.undefined)
        ret
    }
  }
  
}

