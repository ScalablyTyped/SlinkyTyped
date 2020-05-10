package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistryCredential extends js.Object {
  /** A public key certificate used to verify the device credentials. */
  var publicKeyCertificate: js.UndefOr[PublicKeyCertificate] = js.native
}

object RegistryCredential {
  @scala.inline
  def apply(): RegistryCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryCredential]
  }
  @scala.inline
  implicit class RegistryCredentialOps[Self <: RegistryCredential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicKeyCertificate(value: PublicKeyCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKeyCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyCertificate")(js.undefined)
        ret
    }
  }
  
}

