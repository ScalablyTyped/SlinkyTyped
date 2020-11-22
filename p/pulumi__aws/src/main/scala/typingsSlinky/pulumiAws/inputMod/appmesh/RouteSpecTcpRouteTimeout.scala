package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecTcpRouteTimeout extends js.Object {
  
  /**
    * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
    */
  var idle: js.UndefOr[Input[RouteSpecTcpRouteTimeoutIdle]] = js.native
}
object RouteSpecTcpRouteTimeout {
  
  @scala.inline
  def apply(): RouteSpecTcpRouteTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecTcpRouteTimeout]
  }
  
  @scala.inline
  implicit class RouteSpecTcpRouteTimeoutOps[Self <: RouteSpecTcpRouteTimeout] (val x: Self) extends AnyVal {
    
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
    def setIdle(value: Input[RouteSpecTcpRouteTimeoutIdle]): Self = this.set("idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdle: Self = this.set("idle", js.undefined)
  }
}
