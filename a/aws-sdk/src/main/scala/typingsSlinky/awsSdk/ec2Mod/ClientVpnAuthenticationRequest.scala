package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientVpnAuthenticationRequest extends js.Object {
  /**
    * Information about the Active Directory to be used, if applicable. You must provide this information if Type is directory-service-authentication.
    */
  var ActiveDirectory: js.UndefOr[DirectoryServiceAuthenticationRequest] = js.native
  /**
    * Information about the authentication certificates to be used, if applicable. You must provide this information if Type is certificate-authentication.
    */
  var MutualAuthentication: js.UndefOr[CertificateAuthenticationRequest] = js.native
  /**
    * The type of client authentication to be used. Specify certificate-authentication to use certificate-based authentication, or directory-service-authentication to use Active Directory authentication.
    */
  var Type: js.UndefOr[ClientVpnAuthenticationType] = js.native
}

object ClientVpnAuthenticationRequest {
  @scala.inline
  def apply(): ClientVpnAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnAuthenticationRequest]
  }
  @scala.inline
  implicit class ClientVpnAuthenticationRequestOps[Self <: ClientVpnAuthenticationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveDirectory(value: DirectoryServiceAuthenticationRequest): Self = {
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
    def withMutualAuthentication(value: CertificateAuthenticationRequest): Self = {
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

