package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tls extends js.Object {
  /**
    * 
    List of ACM Certificate Authority ARNs.
    
    */
  var CertificateAuthorityArnList: js.UndefOr[listOfString] = js.native
}

object Tls {
  @scala.inline
  def apply(): Tls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tls]
  }
  @scala.inline
  implicit class TlsOps[Self <: Tls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateAuthorityArnList(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityArnList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAuthorityArnList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateAuthorityArnList")(js.undefined)
        ret
    }
  }
  
}

