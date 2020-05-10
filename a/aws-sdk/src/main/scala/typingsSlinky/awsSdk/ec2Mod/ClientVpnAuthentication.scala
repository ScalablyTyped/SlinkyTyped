package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnAuthentication extends js.Object {
  /**
    * Information about the Active Directory, if applicable.
    */
  var ActiveDirectory: js.UndefOr[DirectoryServiceAuthentication] = js.native
  /**
    * Information about the authentication certificates, if applicable.
    */
  var MutualAuthentication: js.UndefOr[CertificateAuthentication] = js.native
  /**
    * The authentication type used.
    */
  var Type: js.UndefOr[ClientVpnAuthenticationType] = js.native
}

object ClientVpnAuthentication {
  @scala.inline
  def apply(): ClientVpnAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnAuthentication]
  }
  @scala.inline
  implicit class ClientVpnAuthenticationOps[Self <: ClientVpnAuthentication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveDirectory(value: DirectoryServiceAuthentication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withMutualAuthentication(value: CertificateAuthentication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MutualAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutualAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MutualAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ClientVpnAuthenticationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

