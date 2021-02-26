package typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.CallFrame
import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingHeapProfileNode extends StObject {
  
  /**
    * Function location.
    */
  var callFrame: CallFrame = js.native
  
  /**
    * Child nodes.
    */
  var children: js.Array[SamplingHeapProfileNode] = js.native
  
  /**
    * Node id. Ids are unique across all profiles collected between startSampling and stopSampling.
    */
  var id: integer = js.native
  
  /**
    * Allocations size in bytes for the node excluding children.
    */
  var selfSize: Double = js.native
}
object SamplingHeapProfileNode {
  
  @scala.inline
  def apply(callFrame: CallFrame, children: js.Array[SamplingHeapProfileNode], id: integer, selfSize: Double): SamplingHeapProfileNode = {
    val __obj = js.Dynamic.literal(callFrame = callFrame.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selfSize = selfSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingHeapProfileNode]
  }
  
  @scala.inline
  implicit class SamplingHeapProfileNodeMutableBuilder[Self <: SamplingHeapProfileNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallFrame(value: CallFrame): Self = StObject.set(x, "callFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: js.Array[SamplingHeapProfileNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: SamplingHeapProfileNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setId(value: integer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfSize(value: Double): Self = StObject.set(x, "selfSize", value.asInstanceOf[js.Any])
  }
}
