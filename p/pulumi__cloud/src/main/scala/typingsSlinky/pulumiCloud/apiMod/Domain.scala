package typingsSlinky.pulumiCloud.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends js.Object {
  /**
    * An SSL/TLS certficicate issued for this domain (`cert.pem`).
    */
  var certificateBody: String = js.native
  /**
    * The certificate chain for the SSL/TLS certificate provided for this
    * domain (`chain.pem`).
    */
  var certificateChain: String = js.native
  /**
    * An SSL/TLS private key issued for thie domain (`privkey.pem`).
    */
  var certificatePrivateKey: String = js.native
  /**
    * The domain name to associate with the API.
    */
  var domainName: String = js.native
}

object Domain {
  @scala.inline
  def apply(
    certificateBody: String,
    certificateChain: String,
    certificatePrivateKey: String,
    domainName: String
  ): Domain = {
    val __obj = js.Dynamic.literal(certificateBody = certificateBody.asInstanceOf[js.Any], certificateChain = certificateChain.asInstanceOf[js.Any], certificatePrivateKey = certificatePrivateKey.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateChain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificatePrivateKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificatePrivateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

