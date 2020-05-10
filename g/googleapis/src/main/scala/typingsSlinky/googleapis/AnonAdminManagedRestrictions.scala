package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdminManagedRestrictions extends js.Object {
  var adminManagedRestrictions: js.UndefOr[Boolean] = js.native
  var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  var domainUsersOnly: js.UndefOr[Boolean] = js.native
  var teamMembersOnly: js.UndefOr[Boolean] = js.native
}

object AnonAdminManagedRestrictions {
  @scala.inline
  def apply(): AnonAdminManagedRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdminManagedRestrictions]
  }
  @scala.inline
  implicit class AnonAdminManagedRestrictionsOps[Self <: AnonAdminManagedRestrictions] (val x: Self) extends AnyVal {
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
    def withTeamMembersOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamMembersOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamMembersOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamMembersOnly")(js.undefined)
        ret
    }
  }
  
}

