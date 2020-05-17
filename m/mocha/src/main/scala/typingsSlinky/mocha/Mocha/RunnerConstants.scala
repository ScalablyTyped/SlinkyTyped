package typingsSlinky.mocha.Mocha

import typingsSlinky.mocha.mochaStrings.`hook end`
import typingsSlinky.mocha.mochaStrings.`suite end`
import typingsSlinky.mocha.mochaStrings.`test end`
import typingsSlinky.mocha.mochaStrings.end
import typingsSlinky.mocha.mochaStrings.fail
import typingsSlinky.mocha.mochaStrings.hook
import typingsSlinky.mocha.mochaStrings.pass
import typingsSlinky.mocha.mochaStrings.pending
import typingsSlinky.mocha.mochaStrings.ready
import typingsSlinky.mocha.mochaStrings.retry
import typingsSlinky.mocha.mochaStrings.start
import typingsSlinky.mocha.mochaStrings.suite
import typingsSlinky.mocha.mochaStrings.test
import typingsSlinky.mocha.mochaStrings.waiting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunnerConstants extends js.Object {
  val EVENT_DELAY_BEGIN: waiting = js.native
  val EVENT_DELAY_END: ready = js.native
  val EVENT_HOOK_BEGIN: hook = js.native
  val EVENT_HOOK_END: `hook end` = js.native
  val EVENT_RUN_BEGIN: start = js.native
  val EVENT_RUN_END: end = js.native
  val EVENT_SUITE_BEGIN: suite = js.native
  val EVENT_SUITE_END: `suite end` = js.native
  val EVENT_TEST_BEGIN: test = js.native
  val EVENT_TEST_END: `test end` = js.native
  val EVENT_TEST_FAIL: fail = js.native
  val EVENT_TEST_PASS: pass = js.native
  val EVENT_TEST_PENDING: pending = js.native
  val EVENT_TEST_RETRY: retry = js.native
}

object RunnerConstants {
  @scala.inline
  def apply(
    EVENT_DELAY_BEGIN: waiting,
    EVENT_DELAY_END: ready,
    EVENT_HOOK_BEGIN: hook,
    EVENT_HOOK_END: `hook end`,
    EVENT_RUN_BEGIN: start,
    EVENT_RUN_END: end,
    EVENT_SUITE_BEGIN: suite,
    EVENT_SUITE_END: `suite end`,
    EVENT_TEST_BEGIN: test,
    EVENT_TEST_END: `test end`,
    EVENT_TEST_FAIL: fail,
    EVENT_TEST_PASS: pass,
    EVENT_TEST_PENDING: pending,
    EVENT_TEST_RETRY: retry
  ): RunnerConstants = {
    val __obj = js.Dynamic.literal(EVENT_DELAY_BEGIN = EVENT_DELAY_BEGIN.asInstanceOf[js.Any], EVENT_DELAY_END = EVENT_DELAY_END.asInstanceOf[js.Any], EVENT_HOOK_BEGIN = EVENT_HOOK_BEGIN.asInstanceOf[js.Any], EVENT_HOOK_END = EVENT_HOOK_END.asInstanceOf[js.Any], EVENT_RUN_BEGIN = EVENT_RUN_BEGIN.asInstanceOf[js.Any], EVENT_RUN_END = EVENT_RUN_END.asInstanceOf[js.Any], EVENT_SUITE_BEGIN = EVENT_SUITE_BEGIN.asInstanceOf[js.Any], EVENT_SUITE_END = EVENT_SUITE_END.asInstanceOf[js.Any], EVENT_TEST_BEGIN = EVENT_TEST_BEGIN.asInstanceOf[js.Any], EVENT_TEST_END = EVENT_TEST_END.asInstanceOf[js.Any], EVENT_TEST_FAIL = EVENT_TEST_FAIL.asInstanceOf[js.Any], EVENT_TEST_PASS = EVENT_TEST_PASS.asInstanceOf[js.Any], EVENT_TEST_PENDING = EVENT_TEST_PENDING.asInstanceOf[js.Any], EVENT_TEST_RETRY = EVENT_TEST_RETRY.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerConstants]
  }
  @scala.inline
  implicit class RunnerConstantsOps[Self <: RunnerConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEVENT_DELAY_BEGIN(value: waiting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_DELAY_BEGIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_DELAY_END(value: ready): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_DELAY_END")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_HOOK_BEGIN(value: hook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_HOOK_BEGIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_HOOK_END(value: `hook end`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_HOOK_END")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_RUN_BEGIN(value: start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_RUN_BEGIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_RUN_END(value: end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_RUN_END")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_SUITE_BEGIN(value: suite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_SUITE_BEGIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_SUITE_END(value: `suite end`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_SUITE_END")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_TEST_BEGIN(value: test): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_TEST_BEGIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_TEST_END(value: `test end`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_TEST_END")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_TEST_FAIL(value: fail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_TEST_FAIL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_TEST_PASS(value: pass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_TEST_PASS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_TEST_PENDING(value: pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_TEST_PENDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_TEST_RETRY(value: retry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_TEST_RETRY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

