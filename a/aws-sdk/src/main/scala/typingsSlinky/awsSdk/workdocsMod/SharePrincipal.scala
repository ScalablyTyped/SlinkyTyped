package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharePrincipal extends js.Object {
  /**
    * The ID of the recipient.
    */
  var Id: IdType = js.native
  /**
    * The role of the recipient.
    */
  var Role: RoleType = js.native
  /**
    * The type of the recipient.
    */
  var Type: PrincipalType = js.native
}

object SharePrincipal {
  @scala.inline
  def apply(Id: IdType, Role: RoleType, Type: PrincipalType): SharePrincipal = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePrincipal]
  }
  @scala.inline
  implicit class SharePrincipalOps[Self <: SharePrincipal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: IdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: RoleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PrincipalType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

