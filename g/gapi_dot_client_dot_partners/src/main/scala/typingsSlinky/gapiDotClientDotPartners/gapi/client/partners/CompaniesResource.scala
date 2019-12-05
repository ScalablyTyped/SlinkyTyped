package typingsSlinky.gapiDotClientDotPartners.gapi.client.partners

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotPartners.Anon_AccesstokenAddress
import typingsSlinky.gapiDotClientDotPartners.Anon_AccesstokenAddressAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompaniesResource extends js.Object {
  var leads: LeadsResource
  /** Gets a company. */
  def get(request: Anon_AccesstokenAddress): Request[GetCompanyResponse]
  /** Lists companies. */
  def list(request: Anon_AccesstokenAddressAlt): Request[ListCompaniesResponse]
}

object CompaniesResource {
  @scala.inline
  def apply(
    get: Anon_AccesstokenAddress => Request[GetCompanyResponse],
    leads: LeadsResource,
    list: Anon_AccesstokenAddressAlt => Request[ListCompaniesResponse]
  ): CompaniesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), leads = leads.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CompaniesResource]
  }
}

