package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAuthConfigInfo extends js.Object {
  /**
    * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
    */
  var AuthScheme: js.UndefOr[typingsSlinky.awsSdk.rdsMod.AuthScheme] = js.native
  /**
    * A user-specified description about the authentication used by a proxy to log in as a specific database user.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
    */
  var IAMAuth: js.UndefOr[IAMAuthMode] = js.native
  /**
    * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
    */
  var SecretArn: js.UndefOr[String] = js.native
  /**
    * The name of the database user to which the proxy connects.
    */
  var UserName: js.UndefOr[String] = js.native
}

object UserAuthConfigInfo {
  @scala.inline
  def apply(): UserAuthConfigInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAuthConfigInfo]
  }
  @scala.inline
  implicit class UserAuthConfigInfoOps[Self <: UserAuthConfigInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthScheme(value: AuthScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withIAMAuth(value: IAMAuthMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIAMAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMAuth")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretArn")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(js.undefined)
        ret
    }
  }
  
}

