package typingsSlinky.awsSdkTypes.credentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  /**
    * AWS access key ID
    */
  val accessKeyId: String = js.native
  /**
    * UNIX epoch timestamp (seconds since 1 January, 1970 00:00:00 GMT) when
    * these credentials will no longer be accepted.
    */
  val expiration: js.UndefOr[Double] = js.native
  /**
    * AWS secret access key
    */
  val secretAccessKey: String = js.native
  /**
    * A security or session token to use with these credentials. Usually
    * present for temporary credentials.
    */
  val sessionToken: js.UndefOr[String] = js.native
}

object Credentials {
  @scala.inline
  def apply(accessKeyId: String, secretAccessKey: String): Credentials = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretAccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(js.undefined)
        ret
    }
  }
  
}

