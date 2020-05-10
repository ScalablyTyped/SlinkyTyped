package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterSnapshotScheduleMessage extends js.Object {
  /**
    * A unique identifier for the cluster whose snapshot schedule you want to modify. 
    */
  var ClusterIdentifier: String = js.native
  /**
    * A boolean to indicate whether to remove the assoiciation between the cluster and the schedule.
    */
  var DisassociateSchedule: js.UndefOr[BooleanOptional] = js.native
  /**
    * A unique alphanumeric identifier for the schedule that you want to associate with the cluster.
    */
  var ScheduleIdentifier: js.UndefOr[String] = js.native
}

object ModifyClusterSnapshotScheduleMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): ModifyClusterSnapshotScheduleMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSnapshotScheduleMessage]
  }
  @scala.inline
  implicit class ModifyClusterSnapshotScheduleMessageOps[Self <: ModifyClusterSnapshotScheduleMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisassociateSchedule(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociateSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisassociateSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisassociateSchedule")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduleIdentifier")(js.undefined)
        ret
    }
  }
  
}

