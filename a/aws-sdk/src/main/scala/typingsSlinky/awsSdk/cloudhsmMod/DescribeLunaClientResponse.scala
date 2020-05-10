package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLunaClientResponse extends js.Object {
  /**
    * The certificate installed on the HSMs used by this client.
    */
  var Certificate: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.Certificate] = js.native
  /**
    * The certificate fingerprint.
    */
  var CertificateFingerprint: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.CertificateFingerprint] = js.native
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.ClientArn] = js.native
  /**
    * The label of the client.
    */
  var Label: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.Label] = js.native
  /**
    * The date and time the client was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.native
}

object DescribeLunaClientResponse {
  @scala.inline
  def apply(): DescribeLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLunaClientResponse]
  }
  @scala.inline
  implicit class DescribeLunaClientResponseOps[Self <: DescribeLunaClientResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateFingerprint(value: CertificateFingerprint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateFingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateFingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withClientArn(value: ClientArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Label")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTimestamp(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTimestamp")(js.undefined)
        ret
    }
  }
  
}

