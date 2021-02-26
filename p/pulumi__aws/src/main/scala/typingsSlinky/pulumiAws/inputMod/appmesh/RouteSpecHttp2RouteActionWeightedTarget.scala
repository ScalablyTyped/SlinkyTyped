package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttp2RouteActionWeightedTarget extends StObject {
  
  /**
    * The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
    */
  var virtualNode: Input[String] = js.native
  
  /**
    * The relative weight of the weighted target. An integer between 0 and 100.
    */
  var weight: Input[Double] = js.native
}
object RouteSpecHttp2RouteActionWeightedTarget {
  
  @scala.inline
  def apply(virtualNode: Input[String], weight: Input[Double]): RouteSpecHttp2RouteActionWeightedTarget = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2RouteActionWeightedTarget]
  }
  
  @scala.inline
  implicit class RouteSpecHttp2RouteActionWeightedTargetMutableBuilder[Self <: RouteSpecHttp2RouteActionWeightedTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualNode(value: Input[String]): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Input[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
