package typingsSlinky.mkcert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateInfo extends js.Object {
  var caCert: String = js.native
  var caKey: String = js.native
  var domains: js.Array[String] = js.native
  var validityDays: Double = js.native
}

object CertificateInfo {
  @scala.inline
  def apply(caCert: String, caKey: String, domains: js.Array[String], validityDays: Double): CertificateInfo = {
    val __obj = js.Dynamic.literal(caCert = caCert.asInstanceOf[js.Any], caKey = caKey.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], validityDays = validityDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
  @scala.inline
  implicit class CertificateInfoOps[Self <: CertificateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidityDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validityDays")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

