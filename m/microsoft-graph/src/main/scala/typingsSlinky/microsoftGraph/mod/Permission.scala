package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends Entity {
  // For user type permissions, the details of the users &amp; applications for this permission. Read-only.
  var grantedTo: js.UndefOr[IdentitySet] = js.native
  // Provides a reference to the ancestor of the current permission, if it is inherited from an ancestor. Read-only.
  var inheritedFrom: js.UndefOr[ItemReference] = js.native
  // Details of any associated sharing invitation for this permission. Read-only.
  var invitation: js.UndefOr[SharingInvitation] = js.native
  // Provides the link details of the current permission, if it is a link type permissions. Read-only.
  var link: js.UndefOr[SharingLink] = js.native
  // The type of permission, e.g. read. See below for the full list of roles. Read-only.
  var roles: js.UndefOr[js.Array[String]] = js.native
  // A unique token that can be used to access this shared item via the **shares** API. Read-only.
  var shareId: js.UndefOr[String] = js.native
}

object Permission {
  @scala.inline
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrantedTo(value: IdentitySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantedTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantedTo")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritedFrom(value: ItemReference): Self = {
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
    def withInvitation(value: SharingInvitation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitation")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: SharingLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(js.undefined)
        ret
    }
    @scala.inline
    def withShareId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareId")(js.undefined)
        ret
    }
  }
  
}

