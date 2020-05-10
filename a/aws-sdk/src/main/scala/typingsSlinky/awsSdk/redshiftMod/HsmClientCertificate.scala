package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HsmClientCertificate extends js.Object {
  /**
    * The identifier of the HSM client certificate.
    */
  var HsmClientCertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The public key that the Amazon Redshift cluster will use to connect to the HSM. You must register the public key in the HSM.
    */
  var HsmClientCertificatePublicKey: js.UndefOr[String] = js.native
  /**
    * The list of tags for the HSM client certificate.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object HsmClientCertificate {
  @scala.inline
  def apply(): HsmClientCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmClientCertificate]
  }
  @scala.inline
  implicit class HsmClientCertificateOps[Self <: HsmClientCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHsmClientCertificateIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmClientCertificateIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmClientCertificateIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmClientCertificateIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmClientCertificatePublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmClientCertificatePublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmClientCertificatePublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmClientCertificatePublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

