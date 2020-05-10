package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestMatrix extends js.Object {
  /**
    * Information about the client which invoked the test.
    * Optional
    */
  var clientInfo: js.UndefOr[ClientInfo] = js.native
  /**
    * How the host machine(s) are configured.
    * Required
    */
  var environmentMatrix: js.UndefOr[EnvironmentMatrix] = js.native
  /**
    * Describes why the matrix is considered invalid.
    * Only useful for matrices in the INVALID state.
    * @OutputOnly
    */
  var invalidMatrixDetails: js.UndefOr[String] = js.native
  /**
    * The cloud project that owns the test matrix.
    * @OutputOnly
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Where the results for the matrix are written.
    * Required
    */
  var resultStorage: js.UndefOr[ResultStorage] = js.native
  /**
    * Indicates the current progress of the test matrix (e.g., FINISHED)
    * @OutputOnly
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The list of test executions that the service creates for this matrix.
    * @OutputOnly
    */
  var testExecutions: js.UndefOr[js.Array[TestExecution]] = js.native
  /**
    * Unique id set by the service.
    * @OutputOnly
    */
  var testMatrixId: js.UndefOr[String] = js.native
  /**
    * How to run the test.
    * Required
    */
  var testSpecification: js.UndefOr[TestSpecification] = js.native
  /**
    * The time this test matrix was initially created.
    * @OutputOnly
    */
  var timestamp: js.UndefOr[String] = js.native
}

object TestMatrix {
  @scala.inline
  def apply(): TestMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestMatrix]
  }
  @scala.inline
  implicit class TestMatrixOps[Self <: TestMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientInfo(value: ClientInfo): Self = {
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
    def withEnvironmentMatrix(value: EnvironmentMatrix): Self = {
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
    def withResultStorage(value: ResultStorage): Self = {
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
    def withTestExecutions(value: js.Array[TestExecution]): Self = {
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
  }
  
}

