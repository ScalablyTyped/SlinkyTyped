package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group of one or more TestExecutions, built by taking a product of values
  * over a pre-defined set of axes.
  */
@js.native
trait SchemaTestMatrix extends js.Object {
  /**
    * Information about the client which invoked the test.
    */
  var clientInfo: js.UndefOr[SchemaClientInfo] = js.native
  /**
    * Required. How the host machine(s) are configured.
    */
  var environmentMatrix: js.UndefOr[SchemaEnvironmentMatrix] = js.native
  /**
    * The number of times a TestExecution should be re-attempted if one or more
    * of its test cases fail for any reason. The maximum number of reruns
    * allowed is 10.  Default is 0, which implies no reruns.
    */
  var flakyTestAttempts: js.UndefOr[Double] = js.native
  /**
    * Output only. Describes why the matrix is considered invalid. Only useful
    * for matrices in the INVALID state.
    */
  var invalidMatrixDetails: js.UndefOr[String] = js.native
  /**
    * The cloud project that owns the test matrix.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Required. Where the results for the matrix are written.
    */
  var resultStorage: js.UndefOr[SchemaResultStorage] = js.native
  /**
    * Output only. Indicates the current progress of the test matrix (e.g.,
    * FINISHED).
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The list of test executions that the service creates for
    * this matrix.
    */
  var testExecutions: js.UndefOr[js.Array[SchemaTestExecution]] = js.native
  /**
    * Output only. Unique id set by the service.
    */
  var testMatrixId: js.UndefOr[String] = js.native
  /**
    * Required. How to run the test.
    */
  var testSpecification: js.UndefOr[SchemaTestSpecification] = js.native
  /**
    * Output only. The time this test matrix was initially created.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object SchemaTestMatrix {
  @scala.inline
  def apply(): SchemaTestMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestMatrix]
  }
  @scala.inline
  implicit class SchemaTestMatrixOps[Self <: SchemaTestMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientInfo(value: SchemaClientInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentMatrix(value: SchemaEnvironmentMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentMatrix")(js.undefined)
        ret
    }
    @scala.inline
    def withFlakyTestAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flakyTestAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlakyTestAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flakyTestAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidMatrixDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMatrixDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidMatrixDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidMatrixDetails")(js.undefined)
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
    def withResultStorage(value: SchemaResultStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultStorage")(js.undefined)
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
    def withTestExecutions(value: js.Array[SchemaTestExecution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withTestMatrixId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMatrixId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestMatrixId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMatrixId")(js.undefined)
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
  }
  
}

