package typingsSlinky.pulumiAws.getCertificateAuthorityMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.acmpca.GetCertificateAuthorityRevocationConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityResult extends js.Object {
  val arn: String = js.native
  /**
    * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificate: String = js.native
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificateChain: String = js.native
  /**
    * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
    */
  val certificateSigningRequest: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notAfter: String = js.native
  /**
    * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notBefore: String = js.native
  /**
    * Nested attribute containing revocation configuration.
    * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
    * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
    * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
    * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
    * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
    */
  val revocationConfigurations: js.Array[GetCertificateAuthorityRevocationConfiguration] = js.native
  /**
    * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
    */
  val serial: String = js.native
  /**
    * Status of the certificate authority.
    */
  val status: String = js.native
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The type of the certificate authority.
    */
  val `type`: String = js.native
}

object GetCertificateAuthorityResult {
  @scala.inline
  def apply(
    arn: String,
    certificate: String,
    certificateChain: String,
    certificateSigningRequest: String,
    id: String,
    notAfter: String,
    notBefore: String,
    revocationConfigurations: js.Array[GetCertificateAuthorityRevocationConfiguration],
    serial: String,
    status: String,
    tags: StringDictionary[js.Any],
    `type`: String
  ): GetCertificateAuthorityResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], certificateChain = certificateChain.asInstanceOf[js.Any], certificateSigningRequest = certificateSigningRequest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any], revocationConfigurations = revocationConfigurations.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityResult]
  }
  @scala.inline
  implicit class GetCertificateAuthorityResultOps[Self <: GetCertificateAuthorityResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateChain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateSigningRequest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateSigningRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevocationConfigurations(value: js.Array[GetCertificateAuthorityRevocationConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revocationConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

