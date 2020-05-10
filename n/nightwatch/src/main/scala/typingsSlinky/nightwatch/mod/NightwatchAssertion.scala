package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchAssertion[T, U] extends js.Object {
  var api: NightwatchAPI = js.native
  var expected: js.Function0[T] | T = js.native
  var failure: js.UndefOr[js.Function1[/* result */ U, Boolean]] = js.native
  var message: String = js.native
  def command(callback: js.Function1[/* result */ U, Unit]): this.type = js.native
  def pass(value: T): js.Any = js.native
  def value(result: U): T = js.native
}

object NightwatchAssertion {
  @scala.inline
  def apply[T, U](
    api: NightwatchAPI,
    command: js.Function1[/* result */ U, Unit] => NightwatchAssertion[T, U],
    expected: js.Function0[T] | T,
    message: String,
    pass: T => js.Any,
    value: U => T
  ): NightwatchAssertion[T, U] = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], command = js.Any.fromFunction1(command), expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pass = js.Any.fromFunction1(pass), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[NightwatchAssertion[T, U]]
  }
  @scala.inline
  implicit class NightwatchAssertionOps[Self[t, u] <: NightwatchAssertion[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withApi(value: NightwatchAPI): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: js.Function1[/* result */ U, Unit] => NightwatchAssertion[T, U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpectedFunction0(value: () => T): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpected(value: js.Function0[T] | T): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPass(value: T => js.Any): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: U => T): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFailure(value: /* result */ U => Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFailure: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.undefined)
        ret
    }
  }
  
}

