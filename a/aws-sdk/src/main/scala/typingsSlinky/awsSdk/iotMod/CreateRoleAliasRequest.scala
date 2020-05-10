package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoleAliasRequest extends js.Object {
  /**
    * How long (in seconds) the credentials will be valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.native
  /**
    * The role alias that points to a role ARN. This allows you to change the role without having to update the device.
    */
  var roleAlias: RoleAlias = js.native
  /**
    * The role ARN.
    */
  var roleArn: RoleArn = js.native
}

object CreateRoleAliasRequest {
  @scala.inline
  def apply(roleAlias: RoleAlias, roleArn: RoleArn): CreateRoleAliasRequest = {
    val __obj = js.Dynamic.literal(roleAlias = roleAlias.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoleAliasRequest]
  }
  @scala.inline
  implicit class CreateRoleAliasRequestOps[Self <: CreateRoleAliasRequest] (val x: Self) extends AnyVal {
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
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
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
  }
  
}

