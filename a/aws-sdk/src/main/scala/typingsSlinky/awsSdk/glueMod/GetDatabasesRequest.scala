package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDatabasesRequest extends StObject {
  
  /**
    * The ID of the Data Catalog from which to retrieve Databases. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The maximum number of databases to return in one response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * Allows you to specify that you want to list the databases shared with your account. The allowable values are FOREIGN or ALL.    If set to FOREIGN, will list the databases shared with your account.    If set to ALL, will list the databases shared with your account, as well as the databases in yor local account.   
    */
  var ResourceShareType: js.UndefOr[typingsSlinky.awsSdk.glueMod.ResourceShareType] = js.native
}
object GetDatabasesRequest {
  
  @scala.inline
  def apply(): GetDatabasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabasesRequest]
  }
  
  @scala.inline
  implicit class GetDatabasesRequestMutableBuilder[Self <: GetDatabasesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceShareType(value: ResourceShareType): Self = StObject.set(x, "ResourceShareType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareTypeUndefined: Self = StObject.set(x, "ResourceShareType", js.undefined)
  }
}
