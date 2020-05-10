package typingsSlinky.pulumiAws.websiteCertificateAuthorityAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebsiteCertificateAuthorityAssociationArgs extends js.Object {
  /**
    * The root certificate of the Certificate Authority.
    */
  val certificate: Input[String] = js.native
  /**
    * The certificate name to display.
    */
  val displayName: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the fleet.
    */
  val fleetArn: Input[String] = js.native
}

object WebsiteCertificateAuthorityAssociationArgs {
  @scala.inline
  def apply(certificate: Input[String], fleetArn: Input[String]): WebsiteCertificateAuthorityAssociationArgs = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], fleetArn = fleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteCertificateAuthorityAssociationArgs]
  }
  @scala.inline
  implicit class WebsiteCertificateAuthorityAssociationArgsOps[Self <: WebsiteCertificateAuthorityAssociationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFleetArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fleetArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
  }
  
}

