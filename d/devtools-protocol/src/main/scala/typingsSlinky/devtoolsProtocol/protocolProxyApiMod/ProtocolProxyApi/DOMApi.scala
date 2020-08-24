package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.attributeModified
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.attributeRemoved
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.characterDataModified
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.childNodeCountUpdated
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.childNodeInserted
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.childNodeRemoved
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.distributedNodesUpdated
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.documentUpdated
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.inlineStyleInvalidated
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.pseudoElementAdded
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.pseudoElementRemoved
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.setChildNodes
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.shadowRootPopped
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.shadowRootPushed
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.AttributeModifiedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.AttributeRemovedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.CharacterDataModifiedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.ChildNodeCountUpdatedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.ChildNodeInsertedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.ChildNodeRemovedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.CollectClassNamesFromSubtreeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.CollectClassNamesFromSubtreeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.CopyToRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.CopyToResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.DescribeNodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.DescribeNodeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.DiscardSearchResultsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.DistributedNodesUpdatedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.FocusRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetAttributesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetAttributesResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetBoxModelRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetBoxModelResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetContentQuadsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetContentQuadsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetDocumentRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetDocumentResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetFileInfoRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetFileInfoResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetFlattenedDocumentRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetFlattenedDocumentResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetFrameOwnerRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetFrameOwnerResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetNodeForLocationRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetNodeForLocationResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetNodeStackTracesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetNodeStackTracesResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetOuterHTMLRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetOuterHTMLResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetRelayoutBoundaryRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetRelayoutBoundaryResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetSearchResultsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetSearchResultsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.InlineStyleInvalidatedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.MoveToRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.MoveToResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.PerformSearchRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.PerformSearchResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.PseudoElementAddedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.PseudoElementRemovedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.PushNodeByPathToFrontendRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.PushNodeByPathToFrontendResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.PushNodesByBackendIdsToFrontendRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.PushNodesByBackendIdsToFrontendResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorAllRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorAllResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.RemoveAttributeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.RemoveNodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.RequestChildNodesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.RequestNodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.RequestNodeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.ResolveNodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.ResolveNodeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.ScrollIntoViewIfNeededRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.SetAttributeValueRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.SetAttributesAsTextRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.SetChildNodesEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.SetFileInputFilesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.SetInspectedNodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.SetNodeNameRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.SetNodeNameResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.SetNodeStackTracesEnabledRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.SetNodeValueRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.SetOuterHTMLRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.ShadowRootPoppedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.ShadowRootPushedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMApi extends js.Object {
  /**
    * Collects class names for the node with given id and all of it's child nodes.
    */
  def collectClassNamesFromSubtree(params: CollectClassNamesFromSubtreeRequest): js.Promise[CollectClassNamesFromSubtreeResponse] = js.native
  /**
    * Creates a deep copy of the specified node and places it into the target container before the
    * given anchor.
    */
  def copyTo(params: CopyToRequest): js.Promise[CopyToResponse] = js.native
  /**
    * Describes node given its id, does not require domain to be enabled. Does not start tracking any
    * objects, can be used for automation.
    */
  def describeNode(params: DescribeNodeRequest): js.Promise[DescribeNodeResponse] = js.native
  /**
    * Disables DOM agent for the given page.
    */
  def disable(): js.Promise[Unit] = js.native
  /**
    * Discards search results from the session with the given id. `getSearchResults` should no longer
    * be called for that search.
    */
  def discardSearchResults(params: DiscardSearchResultsRequest): js.Promise[Unit] = js.native
  /**
    * Enables DOM agent for the given page.
    */
  def enable(): js.Promise[Unit] = js.native
  /**
    * Focuses the given element.
    */
  def focus(params: FocusRequest): js.Promise[Unit] = js.native
  /**
    * Returns attributes for the specified node.
    */
  def getAttributes(params: GetAttributesRequest): js.Promise[GetAttributesResponse] = js.native
  /**
    * Returns boxes for the given node.
    */
  def getBoxModel(params: GetBoxModelRequest): js.Promise[GetBoxModelResponse] = js.native
  /**
    * Returns quads that describe node position on the page. This method
    * might return multiple quads for inline nodes.
    */
  def getContentQuads(params: GetContentQuadsRequest): js.Promise[GetContentQuadsResponse] = js.native
  /**
    * Returns the root DOM node (and optionally the subtree) to the caller.
    */
  def getDocument(params: GetDocumentRequest): js.Promise[GetDocumentResponse] = js.native
  /**
    * Returns file information for the given
    * File wrapper.
    */
  def getFileInfo(params: GetFileInfoRequest): js.Promise[GetFileInfoResponse] = js.native
  /**
    * Returns the root DOM node (and optionally the subtree) to the caller.
    */
  def getFlattenedDocument(params: GetFlattenedDocumentRequest): js.Promise[GetFlattenedDocumentResponse] = js.native
  /**
    * Returns iframe node that owns iframe with the given domain.
    */
  def getFrameOwner(params: GetFrameOwnerRequest): js.Promise[GetFrameOwnerResponse] = js.native
  /**
    * Returns node id at given location. Depending on whether DOM domain is enabled, nodeId is
    * either returned or not.
    */
  def getNodeForLocation(params: GetNodeForLocationRequest): js.Promise[GetNodeForLocationResponse] = js.native
  /**
    * Gets stack traces associated with a Node. As of now, only provides stack trace for Node creation.
    */
  def getNodeStackTraces(params: GetNodeStackTracesRequest): js.Promise[GetNodeStackTracesResponse] = js.native
  /**
    * Returns node's HTML markup.
    */
  def getOuterHTML(params: GetOuterHTMLRequest): js.Promise[GetOuterHTMLResponse] = js.native
  /**
    * Returns the id of the nearest ancestor that is a relayout boundary.
    */
  def getRelayoutBoundary(params: GetRelayoutBoundaryRequest): js.Promise[GetRelayoutBoundaryResponse] = js.native
  /**
    * Returns search results from given `fromIndex` to given `toIndex` from the search with the given
    * identifier.
    */
  def getSearchResults(params: GetSearchResultsRequest): js.Promise[GetSearchResultsResponse] = js.native
  /**
    * Hides any highlight.
    */
  def hideHighlight(): js.Promise[Unit] = js.native
  /**
    * Highlights DOM node.
    */
  def highlightNode(): js.Promise[Unit] = js.native
  /**
    * Highlights given rectangle.
    */
  def highlightRect(): js.Promise[Unit] = js.native
  /**
    * Marks last undoable state.
    */
  def markUndoableState(): js.Promise[Unit] = js.native
  /**
    * Moves node into the new container, places it before the given anchor.
    */
  def moveTo(params: MoveToRequest): js.Promise[MoveToResponse] = js.native
  /**
    * Fired when `Element`'s attribute is modified.
    */
  @JSName("on")
  def on_attributeModified(event: attributeModified, listener: js.Function1[/* params */ AttributeModifiedEvent, Unit]): Unit = js.native
  /**
    * Fired when `Element`'s attribute is removed.
    */
  @JSName("on")
  def on_attributeRemoved(event: attributeRemoved, listener: js.Function1[/* params */ AttributeRemovedEvent, Unit]): Unit = js.native
  /**
    * Mirrors `DOMCharacterDataModified` event.
    */
  @JSName("on")
  def on_characterDataModified(
    event: characterDataModified,
    listener: js.Function1[/* params */ CharacterDataModifiedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when `Container`'s child node count has changed.
    */
  @JSName("on")
  def on_childNodeCountUpdated(
    event: childNodeCountUpdated,
    listener: js.Function1[/* params */ ChildNodeCountUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * Mirrors `DOMNodeInserted` event.
    */
  @JSName("on")
  def on_childNodeInserted(event: childNodeInserted, listener: js.Function1[/* params */ ChildNodeInsertedEvent, Unit]): Unit = js.native
  /**
    * Mirrors `DOMNodeRemoved` event.
    */
  @JSName("on")
  def on_childNodeRemoved(event: childNodeRemoved, listener: js.Function1[/* params */ ChildNodeRemovedEvent, Unit]): Unit = js.native
  /**
    * Called when distrubution is changed.
    */
  @JSName("on")
  def on_distributedNodesUpdated(
    event: distributedNodesUpdated,
    listener: js.Function1[/* params */ DistributedNodesUpdatedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when `Document` has been totally updated. Node ids are no longer valid.
    */
  @JSName("on")
  def on_documentUpdated(event: documentUpdated, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when `Element`'s inline style is modified via a CSS property modification.
    */
  @JSName("on")
  def on_inlineStyleInvalidated(
    event: inlineStyleInvalidated,
    listener: js.Function1[/* params */ InlineStyleInvalidatedEvent, Unit]
  ): Unit = js.native
  /**
    * Called when a pseudo element is added to an element.
    */
  @JSName("on")
  def on_pseudoElementAdded(event: pseudoElementAdded, listener: js.Function1[/* params */ PseudoElementAddedEvent, Unit]): Unit = js.native
  /**
    * Called when a pseudo element is removed from an element.
    */
  @JSName("on")
  def on_pseudoElementRemoved(event: pseudoElementRemoved, listener: js.Function1[/* params */ PseudoElementRemovedEvent, Unit]): Unit = js.native
  /**
    * Fired when backend wants to provide client with the missing DOM structure. This happens upon
    * most of the calls requesting node ids.
    */
  @JSName("on")
  def on_setChildNodes(event: setChildNodes, listener: js.Function1[/* params */ SetChildNodesEvent, Unit]): Unit = js.native
  /**
    * Called when shadow root is popped from the element.
    */
  @JSName("on")
  def on_shadowRootPopped(event: shadowRootPopped, listener: js.Function1[/* params */ ShadowRootPoppedEvent, Unit]): Unit = js.native
  /**
    * Called when shadow root is pushed into the element.
    */
  @JSName("on")
  def on_shadowRootPushed(event: shadowRootPushed, listener: js.Function1[/* params */ ShadowRootPushedEvent, Unit]): Unit = js.native
  /**
    * Searches for a given string in the DOM tree. Use `getSearchResults` to access search results or
    * `cancelSearch` to end this search session.
    */
  def performSearch(params: PerformSearchRequest): js.Promise[PerformSearchResponse] = js.native
  /**
    * Requests that the node is sent to the caller given its path. // FIXME, use XPath
    */
  def pushNodeByPathToFrontend(params: PushNodeByPathToFrontendRequest): js.Promise[PushNodeByPathToFrontendResponse] = js.native
  /**
    * Requests that a batch of nodes is sent to the caller given their backend node ids.
    */
  def pushNodesByBackendIdsToFrontend(params: PushNodesByBackendIdsToFrontendRequest): js.Promise[PushNodesByBackendIdsToFrontendResponse] = js.native
  /**
    * Executes `querySelector` on a given node.
    */
  def querySelector(params: QuerySelectorRequest): js.Promise[QuerySelectorResponse] = js.native
  /**
    * Executes `querySelectorAll` on a given node.
    */
  def querySelectorAll(params: QuerySelectorAllRequest): js.Promise[QuerySelectorAllResponse] = js.native
  /**
    * Re-does the last undone action.
    */
  def redo(): js.Promise[Unit] = js.native
  /**
    * Removes attribute with given name from an element with given id.
    */
  def removeAttribute(params: RemoveAttributeRequest): js.Promise[Unit] = js.native
  /**
    * Removes node with given id.
    */
  def removeNode(params: RemoveNodeRequest): js.Promise[Unit] = js.native
  /**
    * Requests that children of the node with given id are returned to the caller in form of
    * `setChildNodes` events where not only immediate children are retrieved, but all children down to
    * the specified depth.
    */
  def requestChildNodes(params: RequestChildNodesRequest): js.Promise[Unit] = js.native
  /**
    * Requests that the node is sent to the caller given the JavaScript node object reference. All
    * nodes that form the path from the node to the root are also sent to the client as a series of
    * `setChildNodes` notifications.
    */
  def requestNode(params: RequestNodeRequest): js.Promise[RequestNodeResponse] = js.native
  /**
    * Resolves the JavaScript node object for a given NodeId or BackendNodeId.
    */
  def resolveNode(params: ResolveNodeRequest): js.Promise[ResolveNodeResponse] = js.native
  /**
    * Scrolls the specified rect of the given node into view if not already visible.
    * Note: exactly one between nodeId, backendNodeId and objectId should be passed
    * to identify the node.
    */
  def scrollIntoViewIfNeeded(params: ScrollIntoViewIfNeededRequest): js.Promise[Unit] = js.native
  /**
    * Sets attribute for an element with given id.
    */
  def setAttributeValue(params: SetAttributeValueRequest): js.Promise[Unit] = js.native
  /**
    * Sets attributes on element with given id. This method is useful when user edits some existing
    * attribute value and types in several attribute name/value pairs.
    */
  def setAttributesAsText(params: SetAttributesAsTextRequest): js.Promise[Unit] = js.native
  /**
    * Sets files for the given file input element.
    */
  def setFileInputFiles(params: SetFileInputFilesRequest): js.Promise[Unit] = js.native
  /**
    * Enables console to refer to the node with given id via $x (see Command Line API for more details
    * $x functions).
    */
  def setInspectedNode(params: SetInspectedNodeRequest): js.Promise[Unit] = js.native
  /**
    * Sets node name for a node with given id.
    */
  def setNodeName(params: SetNodeNameRequest): js.Promise[SetNodeNameResponse] = js.native
  /**
    * Sets if stack traces should be captured for Nodes. See `Node.getNodeStackTraces`. Default is disabled.
    */
  def setNodeStackTracesEnabled(params: SetNodeStackTracesEnabledRequest): js.Promise[Unit] = js.native
  /**
    * Sets node value for a node with given id.
    */
  def setNodeValue(params: SetNodeValueRequest): js.Promise[Unit] = js.native
  /**
    * Sets node HTML markup, returns new node id.
    */
  def setOuterHTML(params: SetOuterHTMLRequest): js.Promise[Unit] = js.native
  /**
    * Undoes the last performed action.
    */
  def undo(): js.Promise[Unit] = js.native
}

