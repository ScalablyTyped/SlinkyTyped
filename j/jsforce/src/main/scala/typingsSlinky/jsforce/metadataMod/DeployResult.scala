package typingsSlinky.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeployResult extends js.Object {
  var checkOnly: Boolean = js.native
  var completedDate: String = js.native
  var createdDate: String = js.native
  var details: js.UndefOr[js.Array[js.Object]] = js.native
  var done: Boolean = js.native
  var errorMessage: js.UndefOr[String] = js.native
  var errorStatusCode: js.UndefOr[String] = js.native
  var id: String = js.native
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  var lastModifiedDate: String = js.native
  var numberComponentErrors: Double = js.native
  var numberComponentsDeployed: Double = js.native
  var numberComponentsTotal: Double = js.native
  var numberTestErrors: Double = js.native
  var numberTestsCompleted: Double = js.native
  var numberTestsTotal: Double = js.native
  var rollbackOnError: js.UndefOr[Boolean] = js.native
  var startDate: String = js.native
  var status: String = js.native
  var success: Boolean = js.native
}

object DeployResult {
  @scala.inline
  def apply(
    checkOnly: Boolean,
    completedDate: String,
    createdDate: String,
    done: Boolean,
    id: String,
    lastModifiedDate: String,
    numberComponentErrors: Double,
    numberComponentsDeployed: Double,
    numberComponentsTotal: Double,
    numberTestErrors: Double,
    numberTestsCompleted: Double,
    numberTestsTotal: Double,
    startDate: String,
    status: String,
    success: Boolean
  ): DeployResult = {
    val __obj = js.Dynamic.literal(checkOnly = checkOnly.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], numberComponentErrors = numberComponentErrors.asInstanceOf[js.Any], numberComponentsDeployed = numberComponentsDeployed.asInstanceOf[js.Any], numberComponentsTotal = numberComponentsTotal.asInstanceOf[js.Any], numberTestErrors = numberTestErrors.asInstanceOf[js.Any], numberTestsCompleted = numberTestsCompleted.asInstanceOf[js.Any], numberTestsTotal = numberTestsTotal.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployResult]
  }
  @scala.inline
  implicit class DeployResultOps[Self <: DeployResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberComponentErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberComponentErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberComponentsDeployed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberComponentsDeployed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberComponentsTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberComponentsTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberTestErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberTestErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberTestsCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberTestsCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberTestsTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberTestsTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorStatusCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorStatusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withRollbackOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollbackOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollbackOnError")(js.undefined)
        ret
    }
  }
  
}

