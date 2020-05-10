package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPolicyOperation extends Entity {
  /**
    * Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format. For
    * example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Null until the operation completes.
    */
  var completedDateTime: js.UndefOr[String] = js.native
  // Specifies the progress of an operation.
  var progress: js.UndefOr[Double] = js.native
  // Possible values are: notStarted, running, complete, failed, unknownFutureValue.
  var status: js.UndefOr[DataPolicyOperationStatus] = js.native
  // The URL location to where data is being exported for export requests.
  var storageLocation: js.UndefOr[String] = js.native
  /**
    * Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var submittedDateTime: js.UndefOr[String] = js.native
  // The id for the user on whom the operation is performed.
  var userId: js.UndefOr[String] = js.native
}

object DataPolicyOperation {
  @scala.inline
  def apply(): DataPolicyOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPolicyOperation]
  }
  @scala.inline
  implicit class DataPolicyOperationOps[Self <: DataPolicyOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DataPolicyOperationStatus): Self = {
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
    def withStorageLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmittedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

