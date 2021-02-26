package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDomainsForPackageRequest extends StObject {
  
  /**
    * Limits results to a maximum number of domains.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.esMod.MaxResults] = js.native
  
  /**
    * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided, returns results for the next page.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.esMod.NextToken] = js.native
  
  /**
    * The package for which to list domains.
    */
  var PackageID: typingsSlinky.awsSdk.esMod.PackageID = js.native
}
object ListDomainsForPackageRequest {
  
  @scala.inline
  def apply(PackageID: PackageID): ListDomainsForPackageRequest = {
    val __obj = js.Dynamic.literal(PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsForPackageRequest]
  }
  
  @scala.inline
  implicit class ListDomainsForPackageRequestMutableBuilder[Self <: ListDomainsForPackageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
  }
}
