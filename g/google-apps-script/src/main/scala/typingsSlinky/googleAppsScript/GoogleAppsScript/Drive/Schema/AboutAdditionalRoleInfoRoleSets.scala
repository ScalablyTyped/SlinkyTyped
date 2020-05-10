package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AboutAdditionalRoleInfoRoleSets extends js.Object {
  var additionalRoles: js.UndefOr[js.Array[String]] = js.native
  var primaryRole: js.UndefOr[String] = js.native
}

object AboutAdditionalRoleInfoRoleSets {
  @scala.inline
  def apply(): AboutAdditionalRoleInfoRoleSets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AboutAdditionalRoleInfoRoleSets]
  }
  @scala.inline
  implicit class AboutAdditionalRoleInfoRoleSetsOps[Self <: AboutAdditionalRoleInfoRoleSets] (val x: Self) extends AnyVal {
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
    def withPrimaryRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryRole")(js.undefined)
        ret
    }
  }
  
}

