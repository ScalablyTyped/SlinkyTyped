package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationSummary extends js.Object {
  /**
    * Identifier returned to track the requested action.
    */
  var OperationId: typingsSlinky.awsSdk.route53domainsMod.OperationId = js.native
  /**
    * The current status of the requested operation in the system.
    */
  var Status: OperationStatus = js.native
  /**
    * The date when the request was submitted.
    */
  var SubmittedDate: js.Date = js.native
  /**
    * Type of the action requested.
    */
  var Type: OperationType = js.native
}

object OperationSummary {
  @scala.inline
  def apply(OperationId: OperationId, Status: OperationStatus, SubmittedDate: js.Date, Type: OperationType): OperationSummary = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], SubmittedDate = SubmittedDate.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationSummary]
  }
  @scala.inline
  implicit class OperationSummaryOps[Self <: OperationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationId(value: OperationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: OperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmittedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: OperationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

