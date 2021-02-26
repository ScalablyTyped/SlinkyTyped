package typingsSlinky.devtoolsProtocol.mod.Protocol.Overlay

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightNodeRequest extends StObject {
  
  /**
    * Identifier of the backend node to highlight.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  
  /**
    * A descriptor for the highlight appearance.
    */
  var highlightConfig: HighlightConfig = js.native
  
  /**
    * Identifier of the node to highlight.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
  
  /**
    * JavaScript object id of the node to be highlighted.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  
  /**
    * Selectors to highlight relevant nodes.
    */
  var selector: js.UndefOr[String] = js.native
}
object HighlightNodeRequest {
  
  @scala.inline
  def apply(highlightConfig: HighlightConfig): HighlightNodeRequest = {
    val __obj = js.Dynamic.literal(highlightConfig = highlightConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightNodeRequest]
  }
  
  @scala.inline
  implicit class HighlightNodeRequestMutableBuilder[Self <: HighlightNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    @scala.inline
    def setHighlightConfig(value: HighlightConfig): Self = StObject.set(x, "highlightConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
