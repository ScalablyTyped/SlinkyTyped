package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetail extends js.Object {
  var Detail: js.Array[LicenseDetailItem] = js.native
  var Domain: String = js.native
}

object AnonDetail {
  @scala.inline
  def apply(Detail: js.Array[LicenseDetailItem], Domain: String): AnonDetail = {
    val __obj = js.Dynamic.literal(Detail = Detail.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetail]
  }
  @scala.inline
  implicit class AnonDetailOps[Self <: AnonDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetail(value: js.Array[LicenseDetailItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

