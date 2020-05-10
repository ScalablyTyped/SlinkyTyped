package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestExecution extends js.Object {
  /**
    * How the host machine(s) are configured.
    * @OutputOnly
    */
  var environment: js.UndefOr[Environment] = js.native
  /**
    * Unique id set by the backend.
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Id of the containing TestMatrix.
    * @OutputOnly
    */
  var matrixId: js.UndefOr[String] = js.native
  /**
    * The cloud project that owns the test execution.
    * @OutputOnly
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Indicates the current progress of the test execution (e.g., FINISHED).
    * @OutputOnly
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Additional details about the running test.
    * @OutputOnly
    */
  var testDetails: js.UndefOr[TestDetails] = js.native
  /**
    * How to run the test.
    * @OutputOnly
    */
  var testSpecification: js.UndefOr[TestSpecification] = js.native
  /**
    * The time this test execution was initially created.
    * @OutputOnly
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Where the results for this execution are written.
    * @OutputOnly
    */
  var toolResultsStep: js.UndefOr[ToolResultsStep] = js.native
}

object TestExecution {
  @scala.inline
  def apply(): TestExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestExecution]
  }
  @scala.inline
  implicit class TestExecutionOps[Self <: TestExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironment(value: Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMatrixId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatrixId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrixId")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withTestDetails(value: TestDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withTestSpecification(value: TestSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withToolResultsStep(value: ToolResultsStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolResultsStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolResultsStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolResultsStep")(js.undefined)
        ret
    }
  }
  
}

