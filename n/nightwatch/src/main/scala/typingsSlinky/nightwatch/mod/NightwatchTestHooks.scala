package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchTestHooks
  extends NightwatchGlobals
     with NightwatchTests {
  var after: js.UndefOr[NightwatchTestHook] = js.native
  var afterEach: js.UndefOr[NightwatchTestHook] = js.native
  var before: js.UndefOr[NightwatchTestHook] = js.native
  var beforeEach: js.UndefOr[NightwatchTestHook] = js.native
}

object NightwatchTestHooks {
  @scala.inline
  def apply(): NightwatchTestHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestHooks]
  }
  @scala.inline
  implicit class NightwatchTestHooksOps[Self <: NightwatchTestHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAfterFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfter(value: NightwatchTestHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterEachFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAfterEachFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAfterEach(value: NightwatchTestHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterEach")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeforeFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBefore(value: NightwatchTestHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeEachFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeforeEachFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeEach(value: NightwatchTestHook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEach")(value.asInstanceOf[js.Any])
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

