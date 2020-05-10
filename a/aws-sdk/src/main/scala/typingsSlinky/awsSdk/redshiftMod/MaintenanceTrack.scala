package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceTrack extends js.Object {
  /**
    * The version number for the cluster release.
    */
  var DatabaseVersion: js.UndefOr[String] = js.native
  /**
    * The name of the maintenance track. Possible values are current and trailing.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  /**
    * An array of UpdateTarget objects to update with the maintenance track. 
    */
  var UpdateTargets: js.UndefOr[EligibleTracksToUpdateList] = js.native
}

object MaintenanceTrack {
  @scala.inline
  def apply(): MaintenanceTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceTrack]
  }
  @scala.inline
  implicit class MaintenanceTrackOps[Self <: MaintenanceTrack] (val x: Self) extends AnyVal {
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
    def withUpdateTargets(value: EligibleTracksToUpdateList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateTargets")(js.undefined)
        ret
    }
  }
  
}

