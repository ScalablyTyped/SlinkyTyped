package typingsSlinky.pkijs.basicOCSPResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateStatusResult extends js.Object {
  var isForCertificate: Boolean = js.native
  /**
    * 0 = good, 1 = revoked, 2 = unknown
    *
    * @type {number}
    * @memberOf GetCertificateStatusResult
    */
  var status: Double = js.native
}

object GetCertificateStatusResult {
  @scala.inline
  def apply(isForCertificate: Boolean, status: Double): GetCertificateStatusResult = {
    val __obj = js.Dynamic.literal(isForCertificate = isForCertificate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateStatusResult]
  }
  @scala.inline
  implicit class GetCertificateStatusResultOps[Self <: GetCertificateStatusResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsForCertificate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isForCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

