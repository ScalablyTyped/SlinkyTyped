package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCertificateResponse extends js.Object {
  /**
    * String that contains the ARN of the issued certificate. This must be of the form:  arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012 
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
}

object RequestCertificateResponse {
  @scala.inline
  def apply(): RequestCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestCertificateResponse]
  }
  @scala.inline
  implicit class RequestCertificateResponseOps[Self <: RequestCertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CertificateArn")(js.undefined)
        ret
    }
  }
  
}

