package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecGrpcRouteMatchMetadata extends js.Object {
  
  /**
    * If `true`, the match is on the opposite of the `match` criteria. Default is `false`.
    */
  var invert: js.UndefOr[Boolean] = js.native
  
  /**
    * The data to match from the request.
    */
  var `match`: js.UndefOr[RouteSpecGrpcRouteMatchMetadataMatch] = js.native
  
  /**
    * The name of the route. Must be between 1 and 50 characters in length.
    */
  var name: String = js.native
}
object RouteSpecGrpcRouteMatchMetadata {
  
  @scala.inline
  def apply(name: String): RouteSpecGrpcRouteMatchMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRouteMatchMetadata]
  }
  
  @scala.inline
  implicit class RouteSpecGrpcRouteMatchMetadataOps[Self <: RouteSpecGrpcRouteMatchMetadata] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    
    @scala.inline
    def setMatch(value: RouteSpecGrpcRouteMatchMetadataMatch): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
  }
}
