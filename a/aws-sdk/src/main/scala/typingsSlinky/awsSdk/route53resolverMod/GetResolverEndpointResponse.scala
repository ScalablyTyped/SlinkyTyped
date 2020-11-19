package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverEndpointResponse extends js.Object {
  
  /**
    * Information about the resolver endpoint that you specified in a GetResolverEndpoint request.
    */
  var ResolverEndpoint: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.ResolverEndpoint] = js.native
}
object GetResolverEndpointResponse {
  
  @scala.inline
  def apply(): GetResolverEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverEndpointResponse]
  }
  
  @scala.inline
  implicit class GetResolverEndpointResponseOps[Self <: GetResolverEndpointResponse] (val x: Self) extends AnyVal {
    
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
    def setResolverEndpoint(value: ResolverEndpoint): Self = this.set("ResolverEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverEndpoint: Self = this.set("ResolverEndpoint", js.undefined)
  }
}
