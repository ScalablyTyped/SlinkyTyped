package typingsSlinky.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOrganizationPortfolioAccessOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * Displays information about the organization nodes.
    */
  var OrganizationNodes: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.OrganizationNodes] = js.native
}
object ListOrganizationPortfolioAccessOutput {
  
  @scala.inline
  def apply(): ListOrganizationPortfolioAccessOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationPortfolioAccessOutput]
  }
  
  @scala.inline
  implicit class ListOrganizationPortfolioAccessOutputMutableBuilder[Self <: ListOrganizationPortfolioAccessOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setOrganizationNodes(value: OrganizationNodes): Self = StObject.set(x, "OrganizationNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationNodesUndefined: Self = StObject.set(x, "OrganizationNodes", js.undefined)
    
    @scala.inline
    def setOrganizationNodesVarargs(value: OrganizationNode*): Self = StObject.set(x, "OrganizationNodes", js.Array(value :_*))
  }
}
