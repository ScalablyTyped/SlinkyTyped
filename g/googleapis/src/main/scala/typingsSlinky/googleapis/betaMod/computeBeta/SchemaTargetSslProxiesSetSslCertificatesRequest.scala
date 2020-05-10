package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetSslProxiesSetSslCertificatesRequest extends js.Object {
  /**
    * New set of URLs to SslCertificate resources to associate with this
    * TargetSslProxy. Currently exactly one ssl certificate must be specified.
    */
  var sslCertificates: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTargetSslProxiesSetSslCertificatesRequest {
  @scala.inline
  def apply(): SchemaTargetSslProxiesSetSslCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetSslProxiesSetSslCertificatesRequest]
  }
  @scala.inline
  implicit class SchemaTargetSslProxiesSetSslCertificatesRequestOps[Self <: SchemaTargetSslProxiesSetSslCertificatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSslCertificates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCertificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslCertificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslCertificates")(js.undefined)
        ret
    }
  }
  
}

