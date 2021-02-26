package typingsSlinky.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRangeProperty extends StObject {
  
  /**
    * The container details for the node range.
    */
  var container: js.UndefOr[ContainerProperties] = js.native
  
  /**
    * The range of nodes, using node index values. A range of 0:3 indicates nodes with index values of 0 through 3. If the starting range value is omitted (:n), then 0 is used to start the range. If the ending range value is omitted (n:), then the highest possible node index is used to end the range. Your accumulative node ranges must account for all nodes (0:n). You may nest node ranges, for example 0:10 and 4:5, in which case the 4:5 range properties override the 0:10 properties.
    */
  var targetNodes: String = js.native
}
object NodeRangeProperty {
  
  @scala.inline
  def apply(targetNodes: String): NodeRangeProperty = {
    val __obj = js.Dynamic.literal(targetNodes = targetNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRangeProperty]
  }
  
  @scala.inline
  implicit class NodeRangePropertyMutableBuilder[Self <: NodeRangeProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: ContainerProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setTargetNodes(value: String): Self = StObject.set(x, "targetNodes", value.asInstanceOf[js.Any])
  }
}
