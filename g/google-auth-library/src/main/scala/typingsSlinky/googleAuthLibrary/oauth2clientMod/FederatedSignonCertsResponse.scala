package typingsSlinky.googleAuthLibrary.oauth2clientMod

import typingsSlinky.gaxios.commonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FederatedSignonCertsResponse extends js.Object {
  var certs: Certificates = js.native
  var format: CertificateFormat = js.native
  var res: js.UndefOr[GaxiosResponse[Unit] | Null] = js.native
}

object FederatedSignonCertsResponse {
  @scala.inline
  def apply(certs: Certificates, format: CertificateFormat): FederatedSignonCertsResponse = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedSignonCertsResponse]
  }
  @scala.inline
  implicit class FederatedSignonCertsResponseOps[Self <: FederatedSignonCertsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCerts(value: Certificates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: CertificateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: GaxiosResponse[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(js.undefined)
        ret
    }
    @scala.inline
    def withResNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(null)
        ret
    }
  }
  
}

