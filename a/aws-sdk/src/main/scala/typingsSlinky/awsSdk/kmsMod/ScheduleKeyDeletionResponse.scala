package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleKeyDeletionResponse extends js.Object {
  /**
    * The date and time after which AWS KMS deletes the customer master key (CMK).
    */
  var DeletionDate: js.UndefOr[js.Date] = js.native
  /**
    * The unique identifier of the customer master key (CMK) for which deletion is scheduled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
}

object ScheduleKeyDeletionResponse {
  @scala.inline
  def apply(): ScheduleKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleKeyDeletionResponse]
  }
  @scala.inline
  implicit class ScheduleKeyDeletionResponseOps[Self <: ScheduleKeyDeletionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyId(value: KeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(js.undefined)
        ret
    }
  }
  
}

