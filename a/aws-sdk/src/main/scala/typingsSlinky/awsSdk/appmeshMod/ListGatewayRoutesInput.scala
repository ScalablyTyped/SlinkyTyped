package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGatewayRoutesInput extends StObject {
  
  /**
    * The maximum number of results returned by ListGatewayRoutes in paginated output. When you use this parameter, ListGatewayRoutes returns only limit results in a single page along with a nextToken response element. You can see the remaining results of the initial request by sending another ListGatewayRoutes request with the returned nextToken value. This value can be between 1 and 100. If you don't use this parameter, ListGatewayRoutes returns up to 100 results and a nextToken value if applicable.
    */
  var limit: js.UndefOr[ListGatewayRoutesLimit] = js.native
  
  /**
    * The name of the service mesh to list gateway routes in.
    */
  var meshName: ResourceName = js.native
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The nextToken value returned from a previous paginated ListGatewayRoutes request where limit was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the virtual gateway to list gateway routes in.
    */
  var virtualGatewayName: ResourceName = js.native
}
object ListGatewayRoutesInput {
  
  @scala.inline
  def apply(meshName: ResourceName, virtualGatewayName: ResourceName): ListGatewayRoutesInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGatewayRoutesInput]
  }
  
  @scala.inline
  implicit class ListGatewayRoutesInputMutableBuilder[Self <: ListGatewayRoutesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: ListGatewayRoutesLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setVirtualGatewayName(value: ResourceName): Self = StObject.set(x, "virtualGatewayName", value.asInstanceOf[js.Any])
  }
}
