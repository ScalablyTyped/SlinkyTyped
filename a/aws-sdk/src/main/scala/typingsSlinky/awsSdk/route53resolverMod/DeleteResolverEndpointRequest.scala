package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteResolverEndpointRequest extends js.Object {
  
  /**
    * The ID of the Resolver endpoint that you want to delete.
    */
  var ResolverEndpointId: ResourceId = js.native
}
object DeleteResolverEndpointRequest {
  
  @scala.inline
  def apply(ResolverEndpointId: ResourceId): DeleteResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResolverEndpointRequest]
  }
  
  @scala.inline
  implicit class DeleteResolverEndpointRequestOps[Self <: DeleteResolverEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResolverEndpointId(value: ResourceId): Self = this.set("ResolverEndpointId", value.asInstanceOf[js.Any])
  }
}
