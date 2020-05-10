package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A step that represents running tests.  It accepts ant-junit xml files which
  * will be parsed into structured test results by the service. Xml file paths
  * are updated in order to append more files, however they can&#39;t be
  * deleted.  Users can also add test results manually by using the test_result
  * field.
  */
@js.native
trait SchemaTestExecutionStep extends js.Object {
  /**
    * Issues observed during the test execution.  For example, if the mobile
    * app under test crashed during the test, the error message and the stack
    * trace content can be recorded here to assist debugging.  - In response:
    * present if set by create or update - In create/update request: optional
    */
  var testIssues: js.UndefOr[js.Array[SchemaTestIssue]] = js.native
  /**
    * List of test suite overview contents. This could be parsed from xUnit XML
    * log by server, or uploaded directly by user. This references should only
    * be called when test suites are fully parsed or uploaded.  The maximum
    * allowed number of test suite overviews per step is 1000.  - In response:
    * always set - In create request: optional - In update request: never (use
    * publishXunitXmlFiles custom method instead)
    */
  var testSuiteOverviews: js.UndefOr[js.Array[SchemaTestSuiteOverview]] = js.native
  /**
    * The timing break down of the test execution.  - In response: present if
    * set by create or update - In create/update request: optional
    */
  var testTiming: js.UndefOr[SchemaTestTiming] = js.native
  /**
    * Represents the execution of the test runner.  The exit code of this tool
    * will be used to determine if the test passed.  - In response: always set
    * - In create/update request: optional
    */
  var toolExecution: js.UndefOr[SchemaToolExecution] = js.native
}

object SchemaTestExecutionStep {
  @scala.inline
  def apply(): SchemaTestExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestExecutionStep]
  }
  @scala.inline
  implicit class SchemaTestExecutionStepOps[Self <: SchemaTestExecutionStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestIssues(value: js.Array[SchemaTestIssue]): Self = {
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
    def withTestSuiteOverviews(value: js.Array[SchemaTestSuiteOverview]): Self = {
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
    def withTestTiming(value: SchemaTestTiming): Self = {
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
    def withToolExecution(value: SchemaToolExecution): Self = {
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

