package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitytoolkitRelyingpartySendVerificationCodeResponse extends js.Object {
  /** Encrypted session information */
  var sessionInfo: js.UndefOr[String] = js.native
}

object IdentitytoolkitRelyingpartySendVerificationCodeResponse {
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartySendVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  }
  @scala.inline
  implicit class IdentitytoolkitRelyingpartySendVerificationCodeResponseOps[Self <: IdentitytoolkitRelyingpartySendVerificationCodeResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionInfo")(js.undefined)
        ret
    }
  }
  
}

