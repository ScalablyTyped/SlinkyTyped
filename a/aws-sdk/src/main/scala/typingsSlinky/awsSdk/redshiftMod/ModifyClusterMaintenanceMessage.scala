package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterMaintenanceMessage extends js.Object {
  /**
    * A unique identifier for the cluster.
    */
  var ClusterIdentifier: String = js.native
  /**
    * A boolean indicating whether to enable the deferred maintenance window. 
    */
  var DeferMaintenance: js.UndefOr[BooleanOptional] = js.native
  /**
    * An integer indicating the duration of the maintenance window in days. If you specify a duration, you can't specify an end time. The duration must be 45 days or less.
    */
  var DeferMaintenanceDuration: js.UndefOr[IntegerOptional] = js.native
  /**
    * A timestamp indicating end time for the deferred maintenance window. If you specify an end time, you can't specify a duration.
    */
  var DeferMaintenanceEndTime: js.UndefOr[js.Date] = js.native
  /**
    * A unique identifier for the deferred maintenance window.
    */
  var DeferMaintenanceIdentifier: js.UndefOr[String] = js.native
  /**
    * A timestamp indicating the start time for the deferred maintenance window.
    */
  var DeferMaintenanceStartTime: js.UndefOr[js.Date] = js.native
}

object ModifyClusterMaintenanceMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): ModifyClusterMaintenanceMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterMaintenanceMessage]
  }
  @scala.inline
  implicit class ModifyClusterMaintenanceMessageOps[Self <: ModifyClusterMaintenanceMessage] (val x: Self) extends AnyVal {
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
    def withDeferMaintenance(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferMaintenance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenance")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferMaintenanceDuration(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferMaintenanceDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferMaintenanceEndTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferMaintenanceEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceEndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferMaintenanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferMaintenanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferMaintenanceStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferMaintenanceStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferMaintenanceStartTime")(js.undefined)
        ret
    }
  }
  
}

