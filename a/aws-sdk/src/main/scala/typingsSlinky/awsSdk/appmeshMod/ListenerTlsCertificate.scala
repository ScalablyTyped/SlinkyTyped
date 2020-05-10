package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerTlsCertificate extends js.Object {
  /**
    * A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[ListenerTlsAcmCertificate] = js.native
  /**
    * A reference to an object that represents a local file certificate.
    */
  var file: js.UndefOr[ListenerTlsFileCertificate] = js.native
}

object ListenerTlsCertificate {
  @scala.inline
  def apply(): ListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerTlsCertificate]
  }
  @scala.inline
  implicit class ListenerTlsCertificateOps[Self <: ListenerTlsCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcm(value: ListenerTlsAcmCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acm")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: ListenerTlsFileCertificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
  }
  
}

