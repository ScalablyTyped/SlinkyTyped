package typingsSlinky.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateAuthorityConfiguration extends js.Object {
  /**
    * Type of the public key algorithm and size, in bits, of the key pair that your CA creates when it issues a certificate. When you create a subordinate CA, you must use a key algorithm supported by the parent CA.
    */
  var KeyAlgorithm: typingsSlinky.awsSdk.acmpcaMod.KeyAlgorithm = js.native
  /**
    * Name of the algorithm your private CA uses to sign certificate requests.
    */
  var SigningAlgorithm: typingsSlinky.awsSdk.acmpcaMod.SigningAlgorithm = js.native
  /**
    * Structure that contains X.500 distinguished name information for your private CA.
    */
  var Subject: ASN1Subject = js.native
}

object CertificateAuthorityConfiguration {
  @scala.inline
  def apply(KeyAlgorithm: KeyAlgorithm, SigningAlgorithm: SigningAlgorithm, Subject: ASN1Subject): CertificateAuthorityConfiguration = {
    val __obj = js.Dynamic.literal(KeyAlgorithm = KeyAlgorithm.asInstanceOf[js.Any], SigningAlgorithm = SigningAlgorithm.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAuthorityConfiguration]
  }
  @scala.inline
  implicit class CertificateAuthorityConfigurationOps[Self <: CertificateAuthorityConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyAlgorithm(value: KeyAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningAlgorithm(value: SigningAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SigningAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: ASN1Subject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

