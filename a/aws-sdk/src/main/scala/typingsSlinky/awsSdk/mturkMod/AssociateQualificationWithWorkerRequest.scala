package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateQualificationWithWorkerRequest extends js.Object {
  /**
    * The value of the Qualification to assign.
    */
  var IntegerValue: js.UndefOr[Integer] = js.native
  /**
    * The ID of the Qualification type to use for the assigned Qualification.
    */
  var QualificationTypeId: EntityId = js.native
  /**
    *  Specifies whether to send a notification email message to the Worker saying that the qualification was assigned to the Worker. Note: this is true by default. 
    */
  var SendNotification: js.UndefOr[Boolean] = js.native
  /**
    *  The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted HIT assignments and Qualification requests. 
    */
  var WorkerId: CustomerId = js.native
}

object AssociateQualificationWithWorkerRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId, WorkerId: CustomerId): AssociateQualificationWithWorkerRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateQualificationWithWorkerRequest]
  }
  @scala.inline
  implicit class AssociateQualificationWithWorkerRequestOps[Self <: AssociateQualificationWithWorkerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQualificationTypeId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QualificationTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerId(value: CustomerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegerValue(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegerValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSendNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SendNotification")(js.undefined)
        ret
    }
  }
  
}

