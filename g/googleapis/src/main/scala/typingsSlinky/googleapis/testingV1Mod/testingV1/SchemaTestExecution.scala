package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a single test to be executed in a single environment.
  */
@js.native
trait SchemaTestExecution extends js.Object {
  /**
    * Output only. How the host machine(s) are configured.
    */
  var environment: js.UndefOr[SchemaEnvironment] = js.native
  /**
    * Output only. Unique id set by the backend.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. Id of the containing TestMatrix.
    */
  var matrixId: js.UndefOr[String] = js.native
  /**
    * Output only. The cloud project that owns the test execution.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Output only. Indicates the current progress of the test execution (e.g.,
    * FINISHED).
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. Additional details about the running test.
    */
  var testDetails: js.UndefOr[SchemaTestDetails] = js.native
  /**
    * Output only. How to run the test.
    */
  var testSpecification: js.UndefOr[SchemaTestSpecification] = js.native
  /**
    * Output only. The time this test execution was initially created.
    */
  var timestamp: js.UndefOr[String] = js.native
  /**
    * Output only. Where the results for this execution are written.
    */
  var toolResultsStep: js.UndefOr[SchemaToolResultsStep] = js.native
}

object SchemaTestExecution {
  @scala.inline
  def apply(): SchemaTestExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestExecution]
  }
  @scala.inline
  implicit class SchemaTestExecutionOps[Self <: SchemaTestExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironment(value: SchemaEnvironment): Self = {
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
    def withTestDetails(value: SchemaTestDetails): Self = {
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
    def withTestSpecification(value: SchemaTestSpecification): Self = {
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
    def withToolResultsStep(value: SchemaToolResultsStep): Self = {
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

