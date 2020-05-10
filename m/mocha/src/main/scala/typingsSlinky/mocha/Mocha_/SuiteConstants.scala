package typingsSlinky.mocha.Mocha_

import typingsSlinky.mocha.mochaStrings.`post-require`
import typingsSlinky.mocha.mochaStrings.`pre-require`
import typingsSlinky.mocha.mochaStrings.afterAll
import typingsSlinky.mocha.mochaStrings.beforeAll
import typingsSlinky.mocha.mochaStrings.require
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Runner untyped events
@js.native
trait SuiteConstants extends js.Object {
  val EVENT_FILE_POST_REQUIRE: `post-require` = js.native
  val EVENT_FILE_PRE_REQUIRE: `pre-require` = js.native
  val EVENT_FILE_REQUIRE: require = js.native
  val EVENT_ROOT_SUITE_RUN: typingsSlinky.mocha.mochaStrings.run = js.native
  val EVENT_SUITE_ADD_HOOK_AFTER_ALL: afterAll = js.native
  val EVENT_SUITE_ADD_HOOK_AFTER_EACH: typingsSlinky.mocha.mochaStrings.afterEach = js.native
  val EVENT_SUITE_ADD_HOOK_BEFORE_ALL: beforeAll = js.native
  val EVENT_SUITE_ADD_HOOK_BEFORE_EACH: typingsSlinky.mocha.mochaStrings.beforeEach = js.native
  val EVENT_SUITE_ADD_SUITE: typingsSlinky.mocha.mochaStrings.suite = js.native
  val EVENT_SUITE_ADD_TEST: typingsSlinky.mocha.mochaStrings.test = js.native
  val HOOK_TYPE_AFTER_ALL: afterAll = js.native
  val HOOK_TYPE_AFTER_EACH: typingsSlinky.mocha.mochaStrings.afterEach = js.native
  val HOOK_TYPE_BEFORE_ALL: beforeAll = js.native
  val HOOK_TYPE_BEFORE_EACH: typingsSlinky.mocha.mochaStrings.beforeEach = js.native
}

object SuiteConstants {
  @scala.inline
  def apply(
    EVENT_FILE_POST_REQUIRE: `post-require`,
    EVENT_FILE_PRE_REQUIRE: `pre-require`,
    EVENT_FILE_REQUIRE: require,
    EVENT_ROOT_SUITE_RUN: typingsSlinky.mocha.mochaStrings.run,
    EVENT_SUITE_ADD_HOOK_AFTER_ALL: afterAll,
    EVENT_SUITE_ADD_HOOK_AFTER_EACH: typingsSlinky.mocha.mochaStrings.afterEach,
    EVENT_SUITE_ADD_HOOK_BEFORE_ALL: beforeAll,
    EVENT_SUITE_ADD_HOOK_BEFORE_EACH: typingsSlinky.mocha.mochaStrings.beforeEach,
    EVENT_SUITE_ADD_SUITE: typingsSlinky.mocha.mochaStrings.suite,
    EVENT_SUITE_ADD_TEST: typingsSlinky.mocha.mochaStrings.test,
    HOOK_TYPE_AFTER_ALL: afterAll,
    HOOK_TYPE_AFTER_EACH: typingsSlinky.mocha.mochaStrings.afterEach,
    HOOK_TYPE_BEFORE_ALL: beforeAll,
    HOOK_TYPE_BEFORE_EACH: typingsSlinky.mocha.mochaStrings.beforeEach
  ): SuiteConstants = {
    val __obj = js.Dynamic.literal(EVENT_FILE_POST_REQUIRE = EVENT_FILE_POST_REQUIRE.asInstanceOf[js.Any], EVENT_FILE_PRE_REQUIRE = EVENT_FILE_PRE_REQUIRE.asInstanceOf[js.Any], EVENT_FILE_REQUIRE = EVENT_FILE_REQUIRE.asInstanceOf[js.Any], EVENT_ROOT_SUITE_RUN = EVENT_ROOT_SUITE_RUN.asInstanceOf[js.Any], EVENT_SUITE_ADD_HOOK_AFTER_ALL = EVENT_SUITE_ADD_HOOK_AFTER_ALL.asInstanceOf[js.Any], EVENT_SUITE_ADD_HOOK_AFTER_EACH = EVENT_SUITE_ADD_HOOK_AFTER_EACH.asInstanceOf[js.Any], EVENT_SUITE_ADD_HOOK_BEFORE_ALL = EVENT_SUITE_ADD_HOOK_BEFORE_ALL.asInstanceOf[js.Any], EVENT_SUITE_ADD_HOOK_BEFORE_EACH = EVENT_SUITE_ADD_HOOK_BEFORE_EACH.asInstanceOf[js.Any], EVENT_SUITE_ADD_SUITE = EVENT_SUITE_ADD_SUITE.asInstanceOf[js.Any], EVENT_SUITE_ADD_TEST = EVENT_SUITE_ADD_TEST.asInstanceOf[js.Any], HOOK_TYPE_AFTER_ALL = HOOK_TYPE_AFTER_ALL.asInstanceOf[js.Any], HOOK_TYPE_AFTER_EACH = HOOK_TYPE_AFTER_EACH.asInstanceOf[js.Any], HOOK_TYPE_BEFORE_ALL = HOOK_TYPE_BEFORE_ALL.asInstanceOf[js.Any], HOOK_TYPE_BEFORE_EACH = HOOK_TYPE_BEFORE_EACH.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteConstants]
  }
  @scala.inline
  implicit class SuiteConstantsOps[Self <: SuiteConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEVENT_FILE_POST_REQUIRE(value: `post-require`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_FILE_POST_REQUIRE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_FILE_PRE_REQUIRE(value: `pre-require`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_FILE_PRE_REQUIRE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_FILE_REQUIRE(value: require): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_FILE_REQUIRE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_ROOT_SUITE_RUN(value: typingsSlinky.mocha.mochaStrings.run): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_ROOT_SUITE_RUN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_SUITE_ADD_HOOK_AFTER_ALL(value: afterAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_SUITE_ADD_HOOK_AFTER_ALL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_SUITE_ADD_HOOK_AFTER_EACH(value: typingsSlinky.mocha.mochaStrings.afterEach): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_SUITE_ADD_HOOK_AFTER_EACH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_SUITE_ADD_HOOK_BEFORE_ALL(value: beforeAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_SUITE_ADD_HOOK_BEFORE_ALL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_SUITE_ADD_HOOK_BEFORE_EACH(value: typingsSlinky.mocha.mochaStrings.beforeEach): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_SUITE_ADD_HOOK_BEFORE_EACH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_SUITE_ADD_SUITE(value: typingsSlinky.mocha.mochaStrings.suite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_SUITE_ADD_SUITE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT_SUITE_ADD_TEST(value: typingsSlinky.mocha.mochaStrings.test): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT_SUITE_ADD_TEST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHOOK_TYPE_AFTER_ALL(value: afterAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOOK_TYPE_AFTER_ALL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHOOK_TYPE_AFTER_EACH(value: typingsSlinky.mocha.mochaStrings.afterEach): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOOK_TYPE_AFTER_EACH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHOOK_TYPE_BEFORE_ALL(value: beforeAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOOK_TYPE_BEFORE_ALL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHOOK_TYPE_BEFORE_EACH(value: typingsSlinky.mocha.mochaStrings.beforeEach): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOOK_TYPE_BEFORE_EACH")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

