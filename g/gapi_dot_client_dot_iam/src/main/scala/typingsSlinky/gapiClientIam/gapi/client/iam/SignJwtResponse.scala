package typingsSlinky.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignJwtResponse extends js.Object {
  /** The id of the key used to sign the JWT. */
  var keyId: js.UndefOr[String] = js.native
  /** The signed JWT. */
  var signedJwt: js.UndefOr[String] = js.native
}

object SignJwtResponse {
  @scala.inline
  def apply(): SignJwtResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignJwtResponse]
  }
  @scala.inline
  implicit class SignJwtResponseOps[Self <: SignJwtResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(js.undefined)
        ret
    }
    @scala.inline
    def withSignedJwt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedJwt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedJwt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedJwt")(js.undefined)
        ret
    }
  }
  
}

