package typingsSlinky.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.arangodb.ArangoDB.Collection
import typingsSlinky.arangodb.ArangoDB.Document
import typingsSlinky.arangodb.ArangoDB.Edge
import typingsSlinky.arangodb.arangodbGeneralGraphMod.Betweenness
import typingsSlinky.arangodb.arangodbGeneralGraphMod.BetweennessOptions
import typingsSlinky.arangodb.arangodbGeneralGraphMod.Closeness
import typingsSlinky.arangodb.arangodbGeneralGraphMod.ClosenessOptions
import typingsSlinky.arangodb.arangodbGeneralGraphMod.CommonNeighbors
import typingsSlinky.arangodb.arangodbGeneralGraphMod.CommonProperties
import typingsSlinky.arangodb.arangodbGeneralGraphMod.CommonPropertiesOptions
import typingsSlinky.arangodb.arangodbGeneralGraphMod.ConnectingEdgesOptions
import typingsSlinky.arangodb.arangodbGeneralGraphMod.CountCommonNeighbors
import typingsSlinky.arangodb.arangodbGeneralGraphMod.CountCommonProperties
import typingsSlinky.arangodb.arangodbGeneralGraphMod.DiameterOptions
import typingsSlinky.arangodb.arangodbGeneralGraphMod.Distance
import typingsSlinky.arangodb.arangodbGeneralGraphMod.Eccentricity
import typingsSlinky.arangodb.arangodbGeneralGraphMod.EccentricityOptions
import typingsSlinky.arangodb.arangodbGeneralGraphMod.EdgeDefinition
import typingsSlinky.arangodb.arangodbGeneralGraphMod.Example
import typingsSlinky.arangodb.arangodbGeneralGraphMod.NeighborsOptions
import typingsSlinky.arangodb.arangodbGeneralGraphMod.Path
import typingsSlinky.arangodb.arangodbGeneralGraphMod.PathsOptions
import typingsSlinky.arangodb.arangodbGeneralGraphMod.RadiusOptions
import typingsSlinky.arangodb.arangodbGeneralGraphMod.ShortestPath
import typingsSlinky.arangodb.arangodbGeneralGraphMod.ShortestPathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined arangodb.@arangodb/general-graph.Graph & {[key: string] : arangodb.ArangoDB.Collection<any> | undefined} */
@js.native
trait GraphkeystringCollectiona
  extends /* key */ StringDictionary[js.UndefOr[Collection[_]]] {
  def _absoluteBetweenness(vertexExample: Example): Betweenness = js.native
  def _absoluteBetweenness(vertexExample: Example, options: BetweennessOptions): Betweenness = js.native
  def _absoluteCloseness(vertexExample: Example): Closeness = js.native
  def _absoluteCloseness(vertexExample: Example, options: ClosenessOptions): Closeness = js.native
  def _absoluteEccentricity(vertexExample: Example): Eccentricity = js.native
  def _absoluteEccentricity(vertexExample: Example, options: EccentricityOptions): Eccentricity = js.native
  def _addVertexCollection(orphanCollectionName: String): Unit = js.native
  def _addVertexCollection(orphanCollectionName: String, createCollection: Boolean): Unit = js.native
  def _betweenness(vertexExample: Example): Betweenness = js.native
  def _betweenness(vertexExample: Example, options: BetweennessOptions): Betweenness = js.native
  def _closeness(vertexExample: Example): Closeness = js.native
  def _closeness(vertexExample: Example, options: ClosenessOptions): Closeness = js.native
  def _commonNeighbors(vertex1Example: Example, vertex2Example: Example): js.Array[CommonNeighbors] = js.native
  def _commonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: js.UndefOr[scala.Nothing],
    vertex2Options: NeighborsOptions
  ): js.Array[CommonNeighbors] = js.native
  def _commonNeighbors(vertex1Example: Example, vertex2Example: Example, vertex1Options: NeighborsOptions): js.Array[CommonNeighbors] = js.native
  def _commonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: NeighborsOptions,
    vertex2Options: NeighborsOptions
  ): js.Array[CommonNeighbors] = js.native
  def _commonProperties(vertexExample1: Example, vertex2Example: Example): js.Array[CommonProperties] = js.native
  def _commonProperties(vertexExample1: Example, vertex2Example: Example, options: CommonPropertiesOptions): js.Array[CommonProperties] = js.native
  def _countCommonNeighbors(vertex1Example: Example, vertex2Example: Example): js.Array[CountCommonNeighbors] = js.native
  def _countCommonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: js.UndefOr[scala.Nothing],
    vertex2Options: NeighborsOptions
  ): js.Array[CountCommonNeighbors] = js.native
  def _countCommonNeighbors(vertex1Example: Example, vertex2Example: Example, vertex1Options: NeighborsOptions): js.Array[CountCommonNeighbors] = js.native
  def _countCommonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: NeighborsOptions,
    vertex2Options: NeighborsOptions
  ): js.Array[CountCommonNeighbors] = js.native
  def _countCommonProperties(vertex1Example: Example, vertex2Example: Example): js.Array[CountCommonProperties] = js.native
  def _countCommonProperties(vertex1Example: Example, vertex2Example: Example, options: CommonPropertiesOptions): js.Array[CountCommonProperties] = js.native
  def _deleteEdgeDefinition(edgeCollectionName: String): Unit = js.native
  def _deleteEdgeDefinition(edgeCollectionName: String, dropCollection: Boolean): Unit = js.native
  def _diameter(vertexExample: Example): Double = js.native
  def _diameter(vertexExample: Example, options: DiameterOptions): Double = js.native
  def _distanceTo(startVertexExample: Example, endVertexExample: Example): js.Array[Distance] = js.native
  def _distanceTo(startVertexExample: Example, endVertexExample: Example, options: ShortestPathOptions): js.Array[Distance] = js.native
  def _eccentricity(vertexExample: Example): Eccentricity = js.native
  def _eccentricity(vertexExample: Example, options: EccentricityOptions): Eccentricity = js.native
  def _editEdgeDefinitions(edgeDefinition: EdgeDefinition): Unit = js.native
  def _extendEdgeDefinitions(edgeDefinition: EdgeDefinition): Unit = js.native
  def _fromVertex(edgeId: String): Document[_] = js.native
  def _getConnectingEdges(vertexExample1: Example, vertexExample2: Example, options: ConnectingEdgesOptions): Edge[_] = js.native
  def _neighbors(vertexExample: Example): js.Array[String] = js.native
  def _neighbors(vertexExample: Example, options: NeighborsOptions): js.Array[String] = js.native
  def _orphanCollections(): js.Array[String] = js.native
  def _paths(): js.Array[Path[_, _, _, scala.Nothing]] = js.native
  def _paths(options: PathsOptions): js.Array[Path[_, _, _, scala.Nothing]] = js.native
  def _radius(vertexExample: Example): Double = js.native
  def _radius(vertexExample: Example, options: RadiusOptions): Double = js.native
  def _removeVertexCollection(orphanCollectionName: String): Unit = js.native
  def _removeVertexCollection(orphanCollectionName: String, dropCollection: Boolean): Unit = js.native
  def _shortestPath(startVertexExample: Example, endVertexExample: Example): js.Array[ShortestPath[_]] = js.native
  def _shortestPath(startVertexExample: Example, endVertexExample: Example, options: ShortestPathOptions): js.Array[ShortestPath[_]] = js.native
  def _toVertex(edgeId: String): Document[_] = js.native
}

