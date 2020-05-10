package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQualificationScoreRequest extends js.Object {
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: EntityId = js.native
  /**
    * The ID of the Worker whose Qualification is being updated.
    */
  var WorkerId: CustomerId = js.native
}

object GetQualificationScoreRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId, WorkerId: CustomerId): GetQualificationScoreRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQualificationScoreRequest]
  }
  @scala.inline
  implicit class GetQualificationScoreRequestOps[Self <: GetQualificationScoreRequest] (val x: Self) extends AnyVal {
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
  }
  
}

