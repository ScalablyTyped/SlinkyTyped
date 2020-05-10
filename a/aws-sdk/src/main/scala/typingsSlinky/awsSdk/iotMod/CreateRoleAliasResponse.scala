package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoleAliasResponse extends js.Object {
  /**
    * The role alias.
    */
  var roleAlias: js.UndefOr[RoleAlias] = js.native
  /**
    * The role alias ARN.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.native
}

object CreateRoleAliasResponse {
  @scala.inline
  def apply(): CreateRoleAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoleAliasResponse]
  }
  @scala.inline
  implicit class CreateRoleAliasResponseOps[Self <: CreateRoleAliasResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoleAlias(value: RoleAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleAliasArn(value: RoleAliasArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAliasArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleAliasArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAliasArn")(js.undefined)
        ret
    }
  }
  
}

