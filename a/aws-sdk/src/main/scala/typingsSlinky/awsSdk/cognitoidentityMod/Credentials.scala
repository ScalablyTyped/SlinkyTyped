package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  /**
    * The Access Key portion of the credentials.
    */
  var AccessKeyId: js.UndefOr[AccessKeyString] = js.native
  /**
    * The date at which these credentials will expire.
    */
  var Expiration: js.UndefOr[js.Date] = js.native
  /**
    * The Secret Access Key portion of the credentials
    */
  var SecretKey: js.UndefOr[SecretKeyString] = js.native
  /**
    * The Session Token portion of the credentials
    */
  var SessionToken: js.UndefOr[SessionTokenString] = js.native
}

object Credentials {
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials]
  }
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyId(value: AccessKeyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretKey(value: SecretKeyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionToken(value: SessionTokenString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionToken")(js.undefined)
        ret
    }
  }
  
}

