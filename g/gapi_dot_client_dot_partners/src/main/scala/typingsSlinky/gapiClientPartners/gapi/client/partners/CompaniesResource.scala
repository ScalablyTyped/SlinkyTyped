package typingsSlinky.gapiClientPartners.gapi.client.partners

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientPartners.AnonAddress
import typingsSlinky.gapiClientPartners.AnonCompanyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompaniesResource extends js.Object {
  var leads: LeadsResource = js.native
  /** Gets a company. */
  def get(request: AnonAddress): Request_[GetCompanyResponse] = js.native
  /** Lists companies. */
  def list(request: AnonCompanyName): Request_[ListCompaniesResponse] = js.native
}

object CompaniesResource {
  @scala.inline
  def apply(
    get: AnonAddress => Request_[GetCompanyResponse],
    leads: LeadsResource,
    list: AnonCompanyName => Request_[ListCompaniesResponse]
  ): CompaniesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), leads = leads.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CompaniesResource]
  }
  @scala.inline
  implicit class CompaniesResourceOps[Self <: CompaniesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonAddress => Request_[GetCompanyResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLeads(value: LeadsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonCompanyName => Request_[ListCompaniesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

