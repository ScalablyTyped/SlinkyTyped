package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVirtualNodeInput extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName = js.native
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The new virtual node specification to apply. This overwrites the existing data.
    */
  var spec: VirtualNodeSpec = js.native
  
  /**
    * The name of the virtual node to update.
    */
  var virtualNodeName: ResourceName = js.native
}
object UpdateVirtualNodeInput {
  
  @scala.inline
  def apply(meshName: ResourceName, spec: VirtualNodeSpec, virtualNodeName: ResourceName): UpdateVirtualNodeInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualNodeInput]
  }
  
  @scala.inline
  implicit class UpdateVirtualNodeInputMutableBuilder[Self <: UpdateVirtualNodeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
    
    @scala.inline
    def setSpec(value: VirtualNodeSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNodeName(value: ResourceName): Self = StObject.set(x, "virtualNodeName", value.asInstanceOf[js.Any])
  }
}
