package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BiddersResource extends StObject {
  
  var accounts: AccountsResource = js.native
  
  var filterSets: FilterSetsResource = js.native
}
object BiddersResource {
  
  @scala.inline
  def apply(accounts: AccountsResource, filterSets: FilterSetsResource): BiddersResource = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], filterSets = filterSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiddersResource]
  }
  
  @scala.inline
  implicit class BiddersResourceMutableBuilder[Self <: BiddersResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: AccountsResource): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSets(value: FilterSetsResource): Self = StObject.set(x, "filterSets", value.asInstanceOf[js.Any])
  }
}
