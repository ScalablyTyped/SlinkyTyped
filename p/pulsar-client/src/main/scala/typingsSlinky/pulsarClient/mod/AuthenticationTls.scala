package typingsSlinky.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticationTls extends js.Object {
  var certificatePath: String = js.native
  var privateKeyPath: String = js.native
}

object AuthenticationTls {
  @scala.inline
  def apply(certificatePath: String, privateKeyPath: String): AuthenticationTls = {
    val __obj = js.Dynamic.literal(certificatePath = certificatePath.asInstanceOf[js.Any], privateKeyPath = privateKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTls]
  }
  @scala.inline
  implicit class AuthenticationTlsOps[Self <: AuthenticationTls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificatePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKeyPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

