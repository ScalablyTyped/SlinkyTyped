package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTarget extends js.Object {
  /**
    * The cluster version for the new maintenance track.
    */
  var DatabaseVersion: js.UndefOr[String] = js.native
  /**
    * The name of the new maintenance track.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  /**
    * A list of operations supported by the maintenance track.
    */
  var SupportedOperations: js.UndefOr[SupportedOperationList] = js.native
}

object UpdateTarget {
  @scala.inline
  def apply(): UpdateTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTarget]
  }
  @scala.inline
  implicit class UpdateTargetOps[Self <: UpdateTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabaseVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DatabaseVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceTrackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceTrackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceTrackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceTrackName")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedOperations(value: SupportedOperationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedOperations")(js.undefined)
        ret
    }
  }
  
}

