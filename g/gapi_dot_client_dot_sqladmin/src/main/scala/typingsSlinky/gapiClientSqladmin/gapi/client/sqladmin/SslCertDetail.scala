package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslCertDetail extends js.Object {
  /** The public information about the cert. */
  var certInfo: js.UndefOr[SslCert] = js.native
  /** The private key for the client cert, in pem format. Keep private in order to protect your security. */
  var certPrivateKey: js.UndefOr[String] = js.native
}

object SslCertDetail {
  @scala.inline
  def apply(): SslCertDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertDetail]
  }
  @scala.inline
  implicit class SslCertDetailOps[Self <: SslCertDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertInfo(value: SslCert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCertPrivateKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certPrivateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certPrivateKey")(js.undefined)
        ret
    }
  }
  
}

