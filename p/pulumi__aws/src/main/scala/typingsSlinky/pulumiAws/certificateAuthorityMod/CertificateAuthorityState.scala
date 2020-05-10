package typingsSlinky.pulumiAws.certificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.acmpca.CertificateAuthorityCertificateAuthorityConfiguration
import typingsSlinky.pulumiAws.inputMod.acmpca.CertificateAuthorityRevocationConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the certificate authority.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificate: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument containing algorithms and certificate subject information. Defined below.
    */
  val certificateAuthorityConfiguration: js.UndefOr[Input[CertificateAuthorityCertificateAuthorityConfiguration]] = js.native
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificateChain: js.UndefOr[Input[String]] = js.native
  /**
    * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
    */
  val certificateSigningRequest: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notAfter: js.UndefOr[Input[String]] = js.native
  /**
    * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notBefore: js.UndefOr[Input[String]] = js.native
  /**
    * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
    */
  val permanentDeletionTimeInDays: js.UndefOr[Input[Double]] = js.native
  /**
    * Nested argument containing revocation configuration. Defined below.
    */
  val revocationConfiguration: js.UndefOr[Input[CertificateAuthorityRevocationConfiguration]] = js.native
  /**
    * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
    */
  val serial: js.UndefOr[Input[String]] = js.native
  /**
    * Status of the certificate authority.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object CertificateAuthorityState {
  @scala.inline
  def apply(): CertificateAuthorityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthorityState]
  }
  @scala.inline
  implicit class CertificateAuthorityStateOps[Self <: CertificateAuthorityState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificate(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateAuthorityConfiguration(value: Input[CertificateAuthorityCertificateAuthorityConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAuthorityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthorityConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAuthorityConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateChain(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateChain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChain")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateSigningRequest(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateSigningRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateSigningRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateSigningRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNotAfter(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withNotBefore(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withPermanentDeletionTimeInDays(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanentDeletionTimeInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermanentDeletionTimeInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permanentDeletionTimeInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withRevocationConfiguration(value: Input[CertificateAuthorityRevocationConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevocationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withSerial(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

