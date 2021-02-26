package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualRouterRef extends StObject {
  
  /**
    * The full Amazon Resource Name (ARN) for the virtual router.
    */
  var arn: Arn = js.native
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: js.Date = js.native
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was last updated.
    */
  var lastUpdatedAt: js.Date = js.native
  
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName = js.native
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: AccountId = js.native
  
  /**
    * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the mesh owner or of another account that the mesh is shared with. For more information about mesh sharing, see Working with shared meshes.
    */
  var resourceOwner: AccountId = js.native
  
  /**
    * The version of the resource. Resources are created at version 1, and this version is incremented each time that they're updated.
    */
  var version: Long = js.native
  
  /**
    * The name of the virtual router.
    */
  var virtualRouterName: ResourceName = js.native
}
object VirtualRouterRef {
  
  @scala.inline
  def apply(
    arn: Arn,
    createdAt: js.Date,
    lastUpdatedAt: js.Date,
    meshName: ResourceName,
    meshOwner: AccountId,
    resourceOwner: AccountId,
    version: Long,
    virtualRouterName: ResourceName
  ): VirtualRouterRef = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], meshOwner = meshOwner.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterRef]
  }
  
  @scala.inline
  implicit class VirtualRouterRefMutableBuilder[Self <: VirtualRouterRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwner(value: AccountId): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Long): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualRouterName(value: ResourceName): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
  }
}
