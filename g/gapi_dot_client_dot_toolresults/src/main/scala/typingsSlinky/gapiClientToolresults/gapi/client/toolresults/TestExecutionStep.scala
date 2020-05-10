package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestExecutionStep extends js.Object {
  /**
    * Issues observed during the test execution.
    *
    * For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist
    * debugging.
    *
    * - In response: present if set by create or update - In create/update request: optional
    */
  var testIssues: js.UndefOr[js.Array[TestIssue]] = js.native
  /**
    * List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be
    * called when test suites are fully parsed or uploaded.
    *
    * The maximum allowed number of test suite overviews per step is 1000.
    *
    * - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
    */
  var testSuiteOverviews: js.UndefOr[js.Array[TestSuiteOverview]] = js.native
  /**
    * The timing break down of the test execution.
    *
    * - In response: present if set by create or update - In create/update request: optional
    */
  var testTiming: js.UndefOr[TestTiming] = js.native
  /**
    * Represents the execution of the test runner.
    *
    * The exit code of this tool will be used to determine if the test passed.
    *
    * - In response: always set - In create/update request: optional
    */
  var toolExecution: js.UndefOr[ToolExecution] = js.native
}

object TestExecutionStep {
  @scala.inline
  def apply(): TestExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestExecutionStep]
  }
  @scala.inline
  implicit class TestExecutionStepOps[Self <: TestExecutionStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestIssues(value: js.Array[TestIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testIssues")(js.undefined)
        ret
    }
    @scala.inline
    def withTestSuiteOverviews(value: js.Array[TestSuiteOverview]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuiteOverviews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestSuiteOverviews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuiteOverviews")(js.undefined)
        ret
    }
    @scala.inline
    def withTestTiming(value: TestTiming): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withToolExecution(value: ToolExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolExecution")(js.undefined)
        ret
    }
  }
  
}

