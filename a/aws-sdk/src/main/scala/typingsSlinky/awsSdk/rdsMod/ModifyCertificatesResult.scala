package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyCertificatesResult extends js.Object {
  var Certificate: js.UndefOr[typingsSlinky.awsSdk.rdsMod.Certificate] = js.native
}

object ModifyCertificatesResult {
  @scala.inline
  def apply(): ModifyCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCertificatesResult]
  }
  @scala.inline
  implicit class ModifyCertificatesResultOps[Self <: ModifyCertificatesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificate(value: Certificate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Certificate")(js.undefined)
        ret
    }
  }
  
}

