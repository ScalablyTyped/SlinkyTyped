package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpec extends js.Object {
  
  /**
    * The HTTP routing information for the route.
    */
  var httpRoute: js.UndefOr[Input[RouteSpecHttpRoute]] = js.native
  
  /**
    * The priority for the route, between `0` and `1000`.
    * Routes are matched based on the specified value, where `0` is the highest priority.
    */
  var priority: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The TCP routing information for the route.
    */
  var tcpRoute: js.UndefOr[Input[RouteSpecTcpRoute]] = js.native
}
object RouteSpec {
  
  @scala.inline
  def apply(): RouteSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpec]
  }
  
  @scala.inline
  implicit class RouteSpecOps[Self <: RouteSpec] (val x: Self) extends AnyVal {
    
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
    def setHttpRoute(value: Input[RouteSpecHttpRoute]): Self = this.set("httpRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpRoute: Self = this.set("httpRoute", js.undefined)
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setTcpRoute(value: Input[RouteSpecTcpRoute]): Self = this.set("tcpRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTcpRoute: Self = this.set("tcpRoute", js.undefined)
  }
}
