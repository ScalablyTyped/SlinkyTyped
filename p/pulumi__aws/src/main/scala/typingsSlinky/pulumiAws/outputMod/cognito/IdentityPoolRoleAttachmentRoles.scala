package typingsSlinky.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolRoleAttachmentRoles extends js.Object {
  var authenticated: js.UndefOr[String] = js.native
  var unauthenticated: js.UndefOr[String] = js.native
}

object IdentityPoolRoleAttachmentRoles {
  @scala.inline
  def apply(): IdentityPoolRoleAttachmentRoles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoles]
  }
  @scala.inline
  implicit class IdentityPoolRoleAttachmentRolesOps[Self <: IdentityPoolRoleAttachmentRoles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticated")(js.undefined)
        ret
    }
    @scala.inline
    def withUnauthenticated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unauthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnauthenticated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unauthenticated")(js.undefined)
        ret
    }
  }
  
}

