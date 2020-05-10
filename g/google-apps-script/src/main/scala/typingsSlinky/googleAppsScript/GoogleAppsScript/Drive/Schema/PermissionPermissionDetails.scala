package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionPermissionDetails extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[String]] = js.native
  var inherited: js.UndefOr[Boolean] = js.native
  var inheritedFrom: js.UndefOr[String] = js.native
  var permissionType: js.UndefOr[String] = js.native
  var role: js.UndefOr[String] = js.native
}

object PermissionPermissionDetails {
  @scala.inline
  def apply(): PermissionPermissionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionPermissionDetails]
  }
  @scala.inline
  implicit class PermissionPermissionDetailsOps[Self <: PermissionPermissionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalRoles")(js.undefined)
        ret
    }
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
    def withPermissionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionType")(js.undefined)
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
  }
  
}

