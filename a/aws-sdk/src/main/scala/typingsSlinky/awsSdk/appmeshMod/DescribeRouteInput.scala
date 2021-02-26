package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRouteInput extends StObject {
  
  /**
    * The name of the service mesh that the route resides in.
    */
  var meshName: ResourceName = js.native
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The name of the route to describe.
    */
  var routeName: ResourceName = js.native
  
  /**
    * The name of the virtual router that the route is associated with.
    */
  var virtualRouterName: ResourceName = js.native
}
object DescribeRouteInput {
  
  @scala.inline
  def apply(meshName: ResourceName, routeName: ResourceName, virtualRouterName: ResourceName): DescribeRouteInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRouteInput]
  }
  
  @scala.inline
  implicit class DescribeRouteInputMutableBuilder[Self <: DescribeRouteInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
    
    @scala.inline
    def setRouteName(value: ResourceName): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualRouterName(value: ResourceName): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
  }
}
