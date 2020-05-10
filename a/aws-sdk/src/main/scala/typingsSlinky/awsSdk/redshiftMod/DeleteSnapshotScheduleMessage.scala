package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSnapshotScheduleMessage extends js.Object {
  /**
    * A unique identifier of the snapshot schedule to delete.
    */
  var ScheduleIdentifier: String = js.native
}

object DeleteSnapshotScheduleMessage {
  @scala.inline
  def apply(ScheduleIdentifier: String): DeleteSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ScheduleIdentifier = ScheduleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotScheduleMessage]
  }
  @scala.inline
  implicit class DeleteSnapshotScheduleMessageOps[Self <: DeleteSnapshotScheduleMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheduleIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

