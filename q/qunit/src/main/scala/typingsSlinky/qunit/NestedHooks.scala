package typingsSlinky.qunit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedHooks extends js.Object {
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  def after(fn: js.Function1[/* assert */ Assert, Unit]): Unit = js.native
  /**
    * Runs after each test.
    */
  def afterEach(fn: js.Function1[/* assert */ Assert, Unit]): Unit = js.native
  /**
    * Runs before the first test.
    */
  def before(fn: js.Function1[/* assert */ Assert, Unit]): Unit = js.native
  /**
    * Runs before each test.
    */
  def beforeEach(fn: js.Function1[/* assert */ Assert, Unit]): Unit = js.native
}

object NestedHooks {
  @scala.inline
  def apply(
    after: js.Function1[/* assert */ Assert, Unit] => Unit,
    afterEach: js.Function1[/* assert */ Assert, Unit] => Unit,
    before: js.Function1[/* assert */ Assert, Unit] => Unit,
    beforeEach: js.Function1[/* assert */ Assert, Unit] => Unit
  ): NestedHooks = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), afterEach = js.Any.fromFunction1(afterEach), before = js.Any.fromFunction1(before), beforeEach = js.Any.fromFunction1(beforeEach))
    __obj.asInstanceOf[NestedHooks]
  }
  @scala.inline
  implicit class NestedHooksOps[Self <: NestedHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: js.Function1[/* assert */ Assert, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterEach(value: js.Function1[/* assert */ Assert, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBefore(value: js.Function1[/* assert */ Assert, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeEach(value: js.Function1[/* assert */ Assert, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

