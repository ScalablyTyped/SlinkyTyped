package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRoleAliasRequest extends js.Object {
  /**
    * The number of seconds the credential will be valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.native
  /**
    * The role alias to update.
    */
  var roleAlias: RoleAlias = js.native
  /**
    * The role ARN.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object UpdateRoleAliasRequest {
  @scala.inline
  def apply(roleAlias: RoleAlias): UpdateRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoleAliasRequest]
  }
  @scala.inline
  implicit class UpdateRoleAliasRequestOps[Self <: UpdateRoleAliasRequest] (val x: Self) extends AnyVal {
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
    def withCredentialDurationSeconds(value: CredentialDurationSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialDurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentialDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentialDurationSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
  }
  
}

