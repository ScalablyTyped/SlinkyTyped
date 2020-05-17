package typingsSlinky.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inherited extends js.Object {
  /** Whether this permission is inherited. This field is always populated. This is an output-only field. */
  var inherited: js.UndefOr[Boolean] = js.native
  /** The ID of the item from which this permission is inherited. This is an output-only field and is only populated for members of the Team Drive. */
  var inheritedFrom: js.UndefOr[String] = js.native
  /**
    * The primary role for this user. While new values may be added in the future, the following are currently possible:
    * - organizer
    * - writer
    * - commenter
    * - reader
    */
  var role: js.UndefOr[String] = js.native
  /**
    * The Team Drive permission type for this user. While new values may be added in future, the following are currently possible:
    * - file
    * - member
    */
  var teamDrivePermissionType: js.UndefOr[String] = js.native
}

object Inherited {
  @scala.inline
  def apply(): Inherited = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inherited]
  }
  @scala.inline
  implicit class InheritedOps[Self <: Inherited] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInherited(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInherited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inherited")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritedFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritedFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamDrivePermissionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrivePermissionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamDrivePermissionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamDrivePermissionType")(js.undefined)
        ret
    }
  }
  
}

