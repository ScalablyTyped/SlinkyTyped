package typingsSlinky.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var currentDescribeBlock: DescribeBlock = js.native
  var currentlyRunningTest: js.UndefOr[TestEntry | Null] = js.native
  var expand: js.UndefOr[Boolean] = js.native
  var hasFocusedTests: Boolean = js.native
  var includeTestLocationInResult: Boolean = js.native
  var originalGlobalErrorHandlers: js.UndefOr[GlobalErrorHandlers] = js.native
  var parentProcess: Process | Null = js.native
  var rootDescribeBlock: DescribeBlock = js.native
  var testNamePattern: js.UndefOr[js.RegExp | Null] = js.native
  var testTimeout: Double = js.native
  var unhandledErrors: js.Array[Exception] = js.native
}

object State {
  @scala.inline
  def apply(
    currentDescribeBlock: DescribeBlock,
    hasFocusedTests: Boolean,
    includeTestLocationInResult: Boolean,
    rootDescribeBlock: DescribeBlock,
    testTimeout: Double,
    unhandledErrors: js.Array[Exception]
  ): State = {
    val __obj = js.Dynamic.literal(currentDescribeBlock = currentDescribeBlock.asInstanceOf[js.Any], hasFocusedTests = hasFocusedTests.asInstanceOf[js.Any], includeTestLocationInResult = includeTestLocationInResult.asInstanceOf[js.Any], rootDescribeBlock = rootDescribeBlock.asInstanceOf[js.Any], testTimeout = testTimeout.asInstanceOf[js.Any], unhandledErrors = unhandledErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentDescribeBlock(value: DescribeBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDescribeBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasFocusedTests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFocusedTests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeTestLocationInResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTestLocationInResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootDescribeBlock(value: DescribeBlock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDescribeBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhandledErrors(value: js.Array[Exception]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhandledErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentlyRunningTest(value: TestEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyRunningTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentlyRunningTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyRunningTest")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentlyRunningTestNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyRunningTest")(null)
        ret
    }
    @scala.inline
    def withExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalGlobalErrorHandlers(value: GlobalErrorHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalGlobalErrorHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalGlobalErrorHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalGlobalErrorHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withParentProcess(value: Process): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentProcessNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentProcess")(null)
        ret
    }
    @scala.inline
    def withTestNamePattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testNamePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestNamePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testNamePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withTestNamePatternNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testNamePattern")(null)
        ret
    }
  }
  
}

