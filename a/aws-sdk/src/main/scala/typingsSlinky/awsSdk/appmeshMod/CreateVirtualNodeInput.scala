package typingsSlinky.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVirtualNodeInput extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the service mesh to create the virtual node in.
    */
  var meshName: ResourceName = js.native
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then the account that you specify must share the mesh with your account before you can create the resource in the service mesh. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The virtual node specification to apply.
    */
  var spec: VirtualNodeSpec = js.native
  
  /**
    * Optional metadata that you can apply to the virtual node to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The name to use for the virtual node.
    */
  var virtualNodeName: ResourceName = js.native
}
object CreateVirtualNodeInput {
  
  @scala.inline
  def apply(meshName: ResourceName, spec: VirtualNodeSpec, virtualNodeName: ResourceName): CreateVirtualNodeInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualNodeInput]
  }
  
  @scala.inline
  implicit class CreateVirtualNodeInputMutableBuilder[Self <: CreateVirtualNodeInput] (val x: Self) extends AnyVal {
    
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
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagRef*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVirtualNodeName(value: ResourceName): Self = StObject.set(x, "virtualNodeName", value.asInstanceOf[js.Any])
  }
}
