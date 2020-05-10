package typingsSlinky.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  /**
    * The access key ID that identifies the temporary security credentials.
    */
  var AccessKeyId: accessKeyIdType = js.native
  /**
    * The date on which the current credentials expire.
    */
  var Expiration: js.Date = js.native
  /**
    * The secret access key that can be used to sign requests.
    */
  var SecretAccessKey: accessKeySecretType = js.native
  /**
    * The token that users must pass to the service API to use the temporary credentials.
    */
  var SessionToken: tokenType = js.native
}

object Credentials {
  @scala.inline
  def apply(
    AccessKeyId: accessKeyIdType,
    Expiration: js.Date,
    SecretAccessKey: accessKeySecretType,
    SessionToken: tokenType
  ): Credentials = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], Expiration = Expiration.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], SessionToken = SessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyId(value: accessKeyIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiration(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretAccessKey(value: accessKeySecretType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretAccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionToken(value: tokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

