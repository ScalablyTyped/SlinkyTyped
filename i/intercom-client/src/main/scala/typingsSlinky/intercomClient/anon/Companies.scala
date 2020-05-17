package typingsSlinky.intercomClient.anon

import typingsSlinky.intercomClient.companyMod.Company
import typingsSlinky.intercomClient.intercomClientStrings.companyDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Companies extends js.Object {
  var companies: js.Array[Company] = js.native
  var `type`: companyDotlist = js.native
}

object Companies {
  @scala.inline
  def apply(companies: js.Array[Company], `type`: companyDotlist): Companies = {
    val __obj = js.Dynamic.literal(companies = companies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Companies]
  }
  @scala.inline
  implicit class CompaniesOps[Self <: Companies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanies(value: js.Array[Company]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: companyDotlist): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

