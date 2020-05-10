package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationDetailResponse extends js.Object {
  /**
    * The name of a domain.
    */
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.DomainName] = js.native
  /**
    * Detailed information on the status including possible errors.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The identifier for the operation.
    */
  var OperationId: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.OperationId] = js.native
  /**
    * The current status of the requested operation in the system.
    */
  var Status: js.UndefOr[OperationStatus] = js.native
  /**
    * The date when the request was submitted.
    */
  var SubmittedDate: js.UndefOr[js.Date] = js.native
  /**
    * The type of operation that was requested.
    */
  var Type: js.UndefOr[OperationType] = js.native
}

object GetOperationDetailResponse {
  @scala.inline
  def apply(): GetOperationDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationDetailResponse]
  }
  @scala.inline
  implicit class GetOperationDetailResponseOps[Self <: GetOperationDetailResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationId(value: OperationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: OperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmittedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmittedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: OperationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

