package typingsSlinky.pulumiAws.outputMod.ec2clientvpn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointAuthenticationOptions extends js.Object {
  /**
    * The ID of the Active Directory to be used for authentication if type is `directory-service-authentication`.
    */
  var activeDirectoryId: js.UndefOr[String] = js.native
  /**
    * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM). Only necessary when type is set to `certificate-authentication`.
    */
  var rootCertificateChainArn: js.UndefOr[String] = js.native
  /**
    * The type of client authentication to be used. Specify `certificate-authentication` to use certificate-based authentication, or `directory-service-authentication` to use Active Directory authentication.
    */
  var `type`: String = js.native
}

object EndpointAuthenticationOptions {
  @scala.inline
  def apply(`type`: String): EndpointAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAuthenticationOptions]
  }
  @scala.inline
  implicit class EndpointAuthenticationOptionsOps[Self <: EndpointAuthenticationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveDirectoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withRootCertificateChainArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootCertificateChainArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootCertificateChainArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootCertificateChainArn")(js.undefined)
        ret
    }
  }
  
}

