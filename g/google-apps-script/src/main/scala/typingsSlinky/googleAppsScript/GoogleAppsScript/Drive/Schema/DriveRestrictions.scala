package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveRestrictions extends js.Object {
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.native
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  var domainUsersOnly: js.UndefOr[Boolean] = js.native
  var driveMembersOnly: js.UndefOr[Boolean] = js.native
}

object DriveRestrictions {
  @scala.inline
  def apply(): DriveRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveRestrictions]
  }
  @scala.inline
  implicit class DriveRestrictionsOps[Self <: DriveRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminManagedRestrictions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminManagedRestrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminManagedRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminManagedRestrictions")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyRequiresWriterPermission(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyRequiresWriterPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyRequiresWriterPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyRequiresWriterPermission")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainUsersOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainUsersOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainUsersOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainUsersOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withDriveMembersOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveMembersOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveMembersOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveMembersOnly")(js.undefined)
        ret
    }
  }
  
}

