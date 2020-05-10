package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var clients: ClientsResource = js.native
  var creatives: CreativesResource = js.native
  var filterSets: FilterSetsResource = js.native
}

object AccountsResource {
  @scala.inline
  def apply(clients: ClientsResource, creatives: CreativesResource, filterSets: FilterSetsResource): AccountsResource = {
    val __obj = js.Dynamic.literal(clients = clients.asInstanceOf[js.Any], creatives = creatives.asInstanceOf[js.Any], filterSets = filterSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClients(value: ClientsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatives(value: CreativesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterSets(value: FilterSetsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

