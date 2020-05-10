package typingsSlinky.intercomClient

import typingsSlinky.intercomClient.companyMod.CompanyIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompanyid extends CompanyIdentifier {
  var company_id: String = js.native
}

object AnonCompanyid {
  @scala.inline
  def apply(company_id: String): AnonCompanyid = {
    val __obj = js.Dynamic.literal(company_id = company_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompanyid]
  }
  @scala.inline
  implicit class AnonCompanyidOps[Self <: AnonCompanyid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompany_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

