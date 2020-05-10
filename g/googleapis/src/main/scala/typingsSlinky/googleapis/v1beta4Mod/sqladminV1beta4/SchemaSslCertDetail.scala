package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SslCertDetail.
  */
@js.native
trait SchemaSslCertDetail extends js.Object {
  /**
    * The public information about the cert.
    */
  var certInfo: js.UndefOr[SchemaSslCert] = js.native
  /**
    * The private key for the client cert, in pem format. Keep private in order
    * to protect your security.
    */
  var certPrivateKey: js.UndefOr[String] = js.native
}

object SchemaSslCertDetail {
  @scala.inline
  def apply(): SchemaSslCertDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertDetail]
  }
  @scala.inline
  implicit class SchemaSslCertDetailOps[Self <: SchemaSslCertDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertInfo(value: SchemaSslCert): Self = {
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

