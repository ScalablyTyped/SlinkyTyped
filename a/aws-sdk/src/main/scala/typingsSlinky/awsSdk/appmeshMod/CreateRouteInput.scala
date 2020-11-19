package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRouteInput extends js.Object {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the service mesh to create the route in.
    */
  var meshName: ResourceName = js.native
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then
    the account that you specify must share the mesh with your account before you can create 
    the resource in the service mesh. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The name to use for the route.
    */
  var routeName: ResourceName = js.native
  
  /**
    * The route specification to apply.
    */
  var spec: RouteSpec = js.native
  
  /**
    * Optional metadata that you can apply to the route to assist with categorization and
    organization. Each tag consists of a key and an optional value, both of which you define.
    Tag keys can have a maximum character length of 128 characters, and tag values can have
    a maximum length of 256 characters.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The name of the virtual router in which to create the route. If the virtual router is in
    a shared mesh, then you must be the owner of the virtual router resource.
    */
  var virtualRouterName: ResourceName = js.native
}
object CreateRouteInput {
  
  @scala.inline
  def apply(meshName: ResourceName, routeName: ResourceName, spec: RouteSpec, virtualRouterName: ResourceName): CreateRouteInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRouteInput]
  }
  
  @scala.inline
  implicit class CreateRouteInputOps[Self <: CreateRouteInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = this.set("meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteName(value: ResourceName): Self = this.set("routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: RouteSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualRouterName(value: ResourceName): Self = this.set("virtualRouterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setMeshOwner(value: AccountId): Self = this.set("meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshOwner: Self = this.set("meshOwner", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagRef*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
