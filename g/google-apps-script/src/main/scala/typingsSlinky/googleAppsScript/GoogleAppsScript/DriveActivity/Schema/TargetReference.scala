package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetReference extends js.Object {
  var driveItem: js.UndefOr[DriveItemReference] = js.native
  var teamDrive: js.UndefOr[TeamDriveReference] = js.native
}

object TargetReference {
  @scala.inline
  def apply(): TargetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetReference]
  }
  @scala.inline
  implicit class TargetReferenceOps[Self <: TargetReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveItem(value: DriveItemReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamDrive(value: TeamDriveReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamDrive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrive")(js.undefined)
        ret
    }
  }
  
}

