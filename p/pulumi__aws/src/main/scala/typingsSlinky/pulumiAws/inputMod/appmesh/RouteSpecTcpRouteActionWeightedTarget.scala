package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecTcpRouteActionWeightedTarget extends js.Object {
  
  /**
    * The virtual node to associate with the weighted target.
    */
  var virtualNode: Input[String] = js.native
  
  /**
    * The relative weight of the weighted target. An integer between 0 and 100.
    */
  var weight: Input[Double] = js.native
}
object RouteSpecTcpRouteActionWeightedTarget {
  
  @scala.inline
  def apply(virtualNode: Input[String], weight: Input[Double]): RouteSpecTcpRouteActionWeightedTarget = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecTcpRouteActionWeightedTarget]
  }
  
  @scala.inline
  implicit class RouteSpecTcpRouteActionWeightedTargetOps[Self <: RouteSpecTcpRouteActionWeightedTarget] (val x: Self) extends AnyVal {
    
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
    def setVirtualNode(value: Input[String]): Self = this.set("virtualNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Input[Double]): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
}
