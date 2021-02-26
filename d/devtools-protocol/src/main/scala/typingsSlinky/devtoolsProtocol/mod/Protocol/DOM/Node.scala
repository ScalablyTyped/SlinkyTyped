package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.FrameId
import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends StObject {
  
  /**
    * Attributes of the `Element` node in the form of flat array `[name1, value1, name2, value2]`.
    */
  var attributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The BackendNodeId for this node.
    */
  var backendNodeId: BackendNodeId = js.native
  
  /**
    * Base URL that `Document` or `FrameOwner` node uses for URL completion.
    */
  var baseURL: js.UndefOr[String] = js.native
  
  /**
    * Child count for `Container` nodes.
    */
  var childNodeCount: js.UndefOr[integer] = js.native
  
  /**
    * Child nodes of this node when requested with children.
    */
  var children: js.UndefOr[js.Array[Node]] = js.native
  
  /**
    * Content document for frame owner elements.
    */
  var contentDocument: js.UndefOr[Node] = js.native
  
  /**
    * Distributed nodes for given insertion point.
    */
  var distributedNodes: js.UndefOr[js.Array[BackendNode]] = js.native
  
  /**
    * Document URL that `Document` or `FrameOwner` node points to.
    */
  var documentURL: js.UndefOr[String] = js.native
  
  /**
    * Frame ID for frame owner elements.
    */
  var frameId: js.UndefOr[FrameId] = js.native
  
  /**
    * Import document for the HTMLImport links.
    */
  var importedDocument: js.UndefOr[Node] = js.native
  
  /**
    * `DocumentType`'s internalSubset.
    */
  var internalSubset: js.UndefOr[String] = js.native
  
  /**
    * Whether the node is SVG.
    */
  var isSVG: js.UndefOr[Boolean] = js.native
  
  /**
    * `Node`'s localName.
    */
  var localName: String = js.native
  
  /**
    * `Attr`'s name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Node identifier that is passed into the rest of the DOM messages as the `nodeId`. Backend
    * will only push node with given `id` once. It is aware of all requested nodes and will only
    * fire DOM events for nodes known to the client.
    */
  var nodeId: NodeId = js.native
  
  /**
    * `Node`'s nodeName.
    */
  var nodeName: String = js.native
  
  /**
    * `Node`'s nodeType.
    */
  var nodeType: integer = js.native
  
  /**
    * `Node`'s nodeValue.
    */
  var nodeValue: String = js.native
  
  /**
    * The id of the parent node if any.
    */
  var parentId: js.UndefOr[NodeId] = js.native
  
  /**
    * Pseudo elements associated with this node.
    */
  var pseudoElements: js.UndefOr[js.Array[Node]] = js.native
  
  /**
    * Pseudo element type for this node.
    */
  var pseudoType: js.UndefOr[PseudoType] = js.native
  
  /**
    * `DocumentType`'s publicId.
    */
  var publicId: js.UndefOr[String] = js.native
  
  /**
    * Shadow root type.
    */
  var shadowRootType: js.UndefOr[ShadowRootType] = js.native
  
  /**
    * Shadow root list for given element host.
    */
  var shadowRoots: js.UndefOr[js.Array[Node]] = js.native
  
  /**
    * `DocumentType`'s systemId.
    */
  var systemId: js.UndefOr[String] = js.native
  
  /**
    * Content document fragment for template elements.
    */
  var templateContent: js.UndefOr[Node] = js.native
  
  /**
    * `Attr`'s value.
    */
  var value: js.UndefOr[String] = js.native
  
  /**
    * `Document`'s XML version in case of XML documents.
    */
  var xmlVersion: js.UndefOr[String] = js.native
}
object Node {
  
  @scala.inline
  def apply(
    backendNodeId: BackendNodeId,
    localName: String,
    nodeId: NodeId,
    nodeName: String,
    nodeType: integer,
    nodeValue: String
  ): Node = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    @scala.inline
    def setChildNodeCount(value: integer): Self = StObject.set(x, "childNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodeCountUndefined: Self = StObject.set(x, "childNodeCount", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setContentDocument(value: Node): Self = StObject.set(x, "contentDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDocumentUndefined: Self = StObject.set(x, "contentDocument", js.undefined)
    
    @scala.inline
    def setDistributedNodes(value: js.Array[BackendNode]): Self = StObject.set(x, "distributedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributedNodesUndefined: Self = StObject.set(x, "distributedNodes", js.undefined)
    
    @scala.inline
    def setDistributedNodesVarargs(value: BackendNode*): Self = StObject.set(x, "distributedNodes", js.Array(value :_*))
    
    @scala.inline
    def setDocumentURL(value: String): Self = StObject.set(x, "documentURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentURLUndefined: Self = StObject.set(x, "documentURL", js.undefined)
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    @scala.inline
    def setImportedDocument(value: Node): Self = StObject.set(x, "importedDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedDocumentUndefined: Self = StObject.set(x, "importedDocument", js.undefined)
    
    @scala.inline
    def setInternalSubset(value: String): Self = StObject.set(x, "internalSubset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalSubsetUndefined: Self = StObject.set(x, "internalSubset", js.undefined)
    
    @scala.inline
    def setIsSVG(value: Boolean): Self = StObject.set(x, "isSVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSVGUndefined: Self = StObject.set(x, "isSVG", js.undefined)
    
    @scala.inline
    def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: integer): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: NodeId): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setPseudoElements(value: js.Array[Node]): Self = StObject.set(x, "pseudoElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoElementsUndefined: Self = StObject.set(x, "pseudoElements", js.undefined)
    
    @scala.inline
    def setPseudoElementsVarargs(value: Node*): Self = StObject.set(x, "pseudoElements", js.Array(value :_*))
    
    @scala.inline
    def setPseudoType(value: PseudoType): Self = StObject.set(x, "pseudoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoTypeUndefined: Self = StObject.set(x, "pseudoType", js.undefined)
    
    @scala.inline
    def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
    
    @scala.inline
    def setShadowRootType(value: ShadowRootType): Self = StObject.set(x, "shadowRootType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRootTypeUndefined: Self = StObject.set(x, "shadowRootType", js.undefined)
    
    @scala.inline
    def setShadowRoots(value: js.Array[Node]): Self = StObject.set(x, "shadowRoots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRootsUndefined: Self = StObject.set(x, "shadowRoots", js.undefined)
    
    @scala.inline
    def setShadowRootsVarargs(value: Node*): Self = StObject.set(x, "shadowRoots", js.Array(value :_*))
    
    @scala.inline
    def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemIdUndefined: Self = StObject.set(x, "systemId", js.undefined)
    
    @scala.inline
    def setTemplateContent(value: Node): Self = StObject.set(x, "templateContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateContentUndefined: Self = StObject.set(x, "templateContent", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setXmlVersion(value: String): Self = StObject.set(x, "xmlVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlVersionUndefined: Self = StObject.set(x, "xmlVersion", js.undefined)
  }
}
