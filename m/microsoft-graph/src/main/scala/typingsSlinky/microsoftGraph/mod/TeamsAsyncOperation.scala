package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsAsyncOperation extends Entity {
  var attemptsCount: js.UndefOr[Double] = js.native
  var createdDateTime: js.UndefOr[String] = js.native
  var error: js.UndefOr[OperationError] = js.native
  var lastActionDateTime: js.UndefOr[String] = js.native
  var operationType: js.UndefOr[TeamsAsyncOperationType] = js.native
  var status: js.UndefOr[TeamsAsyncOperationStatus] = js.native
  var targetResourceId: js.UndefOr[String] = js.native
  var targetResourceLocation: js.UndefOr[String] = js.native
}

object TeamsAsyncOperation {
  @scala.inline
  def apply(): TeamsAsyncOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamsAsyncOperation]
  }
  @scala.inline
  implicit class TeamsAsyncOperationOps[Self <: TeamsAsyncOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: OperationError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withLastActionDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastActionDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastActionDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastActionDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationType(value: TeamsAsyncOperationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TeamsAsyncOperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetResourceLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResourceLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetResourceLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResourceLocation")(js.undefined)
        ret
    }
  }
  
}

