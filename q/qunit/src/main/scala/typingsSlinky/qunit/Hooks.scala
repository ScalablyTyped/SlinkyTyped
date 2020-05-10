package typingsSlinky.qunit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hooks extends js.Object {
  /**
    * Runs after the last test. If additional tests are defined after the
    * module's queue has emptied, it will not run this hook again.
    */
  var after: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.native
  /**
    * Runs after each test.
    */
  var afterEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.native
  /**
    * Runs before the first test.
    */
  var before: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.native
  /**
    * Runs before each test.
    */
  var beforeEach: js.UndefOr[js.Function1[/* assert */ Assert, Unit | js.Promise[Unit]]] = js.native
}

object Hooks {
  @scala.inline
  def apply(): Hooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hooks]
  }
  @scala.inline
  implicit class HooksOps[Self <: Hooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterEach(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeEach(value: /* assert */ Assert => Unit | js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.undefined)
        ret
    }
  }
  
}

