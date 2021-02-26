package typingsSlinky.nodeRedRuntime.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flow extends StObject {
  
  /** the flow identifier */
  var id: String = js.native
  
  /** a label for the flow */
  var label: String = js.native
  
  /** an array of node configuration objects */
  var nodes: js.Array[js.Object] = js.native
}
object Flow {
  
  @scala.inline
  def apply(id: String, label: String, nodes: js.Array[js.Object]): Flow = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  implicit class FlowMutableBuilder[Self <: Flow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
