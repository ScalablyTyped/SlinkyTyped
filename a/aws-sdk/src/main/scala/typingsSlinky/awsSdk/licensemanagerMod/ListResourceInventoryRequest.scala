package typingsSlinky.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceInventoryRequest extends StObject {
  
  /**
    * Filters to scope the results. The following filters and logical operators are supported:    account_id - The ID of the AWS account that owns the resource. Logical operators are EQUALS | NOT_EQUALS.    application_name - The name of the application. Logical operators are EQUALS | BEGINS_WITH.    license_included - The type of license included. Logical operators are EQUALS | NOT_EQUALS. Possible values are sql-server-enterprise | sql-server-standard | sql-server-web | windows-server-datacenter.    platform - The platform of the resource. Logical operators are EQUALS | BEGINS_WITH.    resource_id - The ID of the resource. Logical operators are EQUALS | NOT_EQUALS.  
    */
  var Filters: js.UndefOr[InventoryFilterList] = js.native
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.native
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListResourceInventoryRequest {
  
  @scala.inline
  def apply(): ListResourceInventoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceInventoryRequest]
  }
  
  @scala.inline
  implicit class ListResourceInventoryRequestMutableBuilder[Self <: ListResourceInventoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: InventoryFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: InventoryFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: BoxInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
