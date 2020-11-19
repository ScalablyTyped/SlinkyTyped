package typingsSlinky.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This provides an abstract view of a diagram as a
  * network (graph) of vertexes and directed edges.
  * The network contains vertexes and edges corresponding to Nodes and Links.
  */
@JSImport("go", "LayoutNetwork")
@js.native
/**
  * This constructs an empty network.
  */
class LayoutNetwork () extends js.Object {
  
  /**
    * Adds a LayoutEdge to the network.
    * @param {LayoutEdge} edge
    */
  def addEdge(edge: LayoutEdge): Unit = js.native
  
  /**
    * This convenience method makes sure there is a LayoutEdge in this network corresponding to a Link.
    * @param {Link} link
    * @param {Link} link
    */
  def addLink(link: Link): LayoutEdge = js.native
  
  /**
    * This convenience method makes sure there is a LayoutVertex in this network corresponding to a Node.
    * @param {Node} node
    */
  def addNode(node: Node): LayoutVertex = js.native
  
  /**
    * Creates a network of LayoutVertexes and LayoutEdges corresponding to the given Nodes and Links.
    * @param {Iterable<Part>} parts A collection of Nodes or Links.
    * @param {boolean=} toplevelonly whether to skip Parts in the given collection that are contained by Groups; default is false.
    * @param {function(Part):boolean|null=} pred optional predicate to apply to each Part --
    *        if it returns false do not include Vertex or Edge in the network for that Part;
    *        default ignores link label nodes or links connecting with them
    */
  def addParts(parts: Iterable[Part]): Unit = js.native
  def addParts(
    parts: Iterable[Part],
    toplevelonly: js.UndefOr[scala.Nothing],
    pred: js.Function1[/* part */ Part, Boolean]
  ): Unit = js.native
  def addParts(parts: Iterable[Part], toplevelonly: Boolean): Unit = js.native
  def addParts(parts: Iterable[Part], toplevelonly: Boolean, pred: js.Function1[/* part */ Part, Boolean]): Unit = js.native
  
  /**
    * Adds a LayoutVertex to the network.
    * @param {LayoutVertex} vertex
    */
  def addVertex(vertex: LayoutVertex): Unit = js.native
  
  /**
    * Allocate a new instance of LayoutEdge.
    */
  def createEdge(): LayoutEdge = js.native
  
  /**
    * Allocate a new instance of LayoutVertex.
    */
  def createVertex(): LayoutVertex = js.native
  
  /**
    * Deletes all vertexes and edges that have no Part associated with them.
    */
  def deleteArtificialVertexes(): Unit = js.native
  
  /**
    * Removes a LayoutEdge from the network.
    * @param {LayoutEdge} edge
    */
  def deleteEdge(edge: LayoutEdge): Unit = js.native
  
  /**
    * This convenience method deletes from this network any LayoutEdge corresponding to a Link.
    * @param {Link} link
    */
  def deleteLink(link: Link): Unit = js.native
  
  /**
    * This convenience method deletes any LayoutVertex corresponding to a Node.
    * @param {Node} node
    */
  def deleteNode(node: Node): Unit = js.native
  
  /**
    * Deletes all LayoutEdges whose "to vertex" and "from vertex" are the same vertex.
    */
  def deleteSelfEdges(): Unit = js.native
  
  /**
    * Removes a LayoutVertex from the network.
    * @param {LayoutVertex} vertex
    */
  def deleteVertex(vertex: LayoutVertex): Unit = js.native
  
  /**Gets a collection of all of the LayoutEdges in this network.*/
  var edges: Set[LayoutEdge] = js.native
  
  /**
    * Retrieve all of the Nodes and Links from the LayoutVertexes and LayoutEdges that are in this network.
    */
  def findAllParts(): Set[Part] = js.native
  
  /**
    * Returns the LayoutEdge that was constructed for the Link.
    * @param {Link} link
    */
  def findEdge(link: Link): LayoutEdge = js.native
  
  /**
    * Returns the LayoutVertex that was constructed for the Node.
    * @param {Node} node
    */
  def findVertex(node: Node): LayoutVertex = js.native
  
  /**This read-only property returns the Layout that uses this network of LayoutVertexes and LayoutEdges.*/
  var layout: Layout = js.native
  
  /**
    * Links two vertexes already in the network and returns the created LayoutEdge.
    * @param {LayoutVertex} fromVertex
    * @param {LayoutVertex} toVertex
    * @param {Link} link
    */
  def linkVertexes(fromVertex: LayoutVertex, toVertex: LayoutVertex, link: Link): LayoutEdge = js.native
  
  /**
    * Reverses the direction of a LayoutEdge in the network.
    * @param {LayoutEdge} edge
    */
  def reverseEdge(edge: LayoutEdge): Unit = js.native
  
  /**
    * Modify this network by splitting it up into separate subnetworks, each of which has all of its vertexes connected to each other, but not to any vertexes in any other subnetworks.
    */
  def splitIntoSubNetworks(): List[LayoutNetwork] = js.native
  
  /**Gets a collection of all of the LayoutVertexes in this network.*/
  var vertexes: Set[LayoutVertex] = js.native
}
