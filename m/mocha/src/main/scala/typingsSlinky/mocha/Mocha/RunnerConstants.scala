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

trait RunnerConstants extends js.Object {
  val EVENT_DELAY_BEGIN: waiting
  val EVENT_DELAY_END: ready
  val EVENT_HOOK_BEGIN: hook
  val EVENT_HOOK_END: `hook end`
  val EVENT_RUN_BEGIN: start
  val EVENT_RUN_END: end
  val EVENT_SUITE_BEGIN: suite
  val EVENT_SUITE_END: `suite end`
  val EVENT_TEST_BEGIN: test
  val EVENT_TEST_END: `test end`
  val EVENT_TEST_FAIL: fail
  val EVENT_TEST_PASS: pass
  val EVENT_TEST_PENDING: pending
  val EVENT_TEST_RETRY: retry
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
}

