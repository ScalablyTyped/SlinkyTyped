package typingsSlinky.firefoxWebextBrowser.browser.webRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the security properties of the request (ie. SSL/TLS information). */
@js.native
trait SecurityInfo extends js.Object {
  /**
    * Certificate transparency compliance per RFC 6962\. See `https://www.certificate-transparency.org/what-is-ct`
    * for more information.
    */
  var certificateTransparencyStatus: js.UndefOr[CertificateTransparencyStatus] = js.native
  /**
    * Certificate data if state is "secure". Will only contain one entry unless `certificateChain` is passed as an
    * option.
    */
  var certificates: js.Array[CertificateInfo] = js.native
  /** The cipher suite used in this request if state is "secure". */
  var cipherSuite: js.UndefOr[String] = js.native
  /** Error message if state is "broken" */
  var errorMessage: js.UndefOr[String] = js.native
  /** True if host uses Public Key Pinning and state is "secure". */
  var hpkp: js.UndefOr[String] = js.native
  /** True if host uses Strict Transport Security and state is "secure". */
  var hsts: js.UndefOr[Boolean] = js.native
  /** The domain name does not match the certificate domain. */
  var isDomainMismatch: js.UndefOr[Boolean] = js.native
  var isExtendedValidation: js.UndefOr[Boolean] = js.native
  /**
    * The certificate is either expired or is not yet valid. See `CertificateInfo.validity` for start and end
    * dates.
    */
  var isNotValidAtThisTime: js.UndefOr[Boolean] = js.native
  var isUntrusted: js.UndefOr[Boolean] = js.native
  /** The key exchange algorithm used in this request if state is "secure". */
  var keaGroupName: js.UndefOr[String] = js.native
  /** Protocol version if state is "secure" */
  var protocolVersion: js.UndefOr[SecurityInfoProtocolVersion] = js.native
  /** The signature scheme used in this request if state is "secure". */
  var signatureSchemeName: js.UndefOr[String] = js.native
  var state: SecurityInfoState = js.native
  /** list of reasons that cause the request to be considered weak, if state is "weak" */
  var weaknessReasons: js.UndefOr[js.Array[TransportWeaknessReasons]] = js.native
}

object SecurityInfo {
  @scala.inline
  def apply(certificates: js.Array[CertificateInfo], state: SecurityInfoState): SecurityInfo = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityInfo]
  }
  @scala.inline
  implicit class SecurityInfoOps[Self <: SecurityInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificates(value: js.Array[CertificateInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: SecurityInfoState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateTransparencyStatus(value: CertificateTransparencyStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateTransparencyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateTransparencyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateTransparencyStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCipherSuite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipherSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCipherSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipherSuite")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withHpkp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpkp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHpkp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hpkp")(js.undefined)
        ret
    }
    @scala.inline
    def withHsts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hsts")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDomainMismatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDomainMismatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDomainMismatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDomainMismatch")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExtendedValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExtendedValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExtendedValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExtendedValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNotValidAtThisTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNotValidAtThisTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNotValidAtThisTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNotValidAtThisTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUntrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUntrusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUntrusted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUntrusted")(js.undefined)
        ret
    }
    @scala.inline
    def withKeaGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keaGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeaGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keaGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolVersion(value: SecurityInfoProtocolVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureSchemeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureSchemeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureSchemeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureSchemeName")(js.undefined)
        ret
    }
    @scala.inline
    def withWeaknessReasons(value: js.Array[TransportWeaknessReasons]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weaknessReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeaknessReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weaknessReasons")(js.undefined)
        ret
    }
  }
  
}

