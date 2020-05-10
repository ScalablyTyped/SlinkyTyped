package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAliasDescription extends js.Object {
  /**
    * The UNIX timestamp of when the role alias was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The number of seconds for which the credential is valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.native
  /**
    * The UNIX timestamp of when the role alias was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The role alias owner.
    */
  var owner: js.UndefOr[AwsAccountId] = js.native
  /**
    * The role alias.
    */
  var roleAlias: js.UndefOr[RoleAlias] = js.native
  /**
    * The ARN of the role alias.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.native
  /**
    * The role ARN.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object RoleAliasDescription {
  @scala.inline
  def apply(): RoleAliasDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleAliasDescription]
  }
  @scala.inline
  implicit class RoleAliasDescriptionOps[Self <: RoleAliasDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
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
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
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

