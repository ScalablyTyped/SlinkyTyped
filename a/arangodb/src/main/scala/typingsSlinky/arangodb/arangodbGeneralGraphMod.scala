package typingsSlinky.arangodb

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.arangodb.ArangoDB.Document
import typingsSlinky.arangodb.ArangoDB.Edge
import typingsSlinky.arangodb.ArangoDB.EdgeDirection
import typingsSlinky.arangodb.anon.Dictkey
import typingsSlinky.arangodb.anon.GraphkeystringCollectiona
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arangodbGeneralGraphMod {
  
  @JSImport("@arangodb/general-graph", "_graph")
  @js.native
  def _graph(name: String): GraphkeystringCollectiona = js.native
  
  @JSImport("@arangodb/general-graph", "_create")
  @js.native
  def create(name: String): GraphkeystringCollectiona = js.native
  @JSImport("@arangodb/general-graph", "_create")
  @js.native
  def create(name: String, edgeDefinitions: js.UndefOr[scala.Nothing], orphanCollections: js.Array[String]): GraphkeystringCollectiona = js.native
  @JSImport("@arangodb/general-graph", "_create")
  @js.native
  def create(name: String, edgeDefinitions: js.Array[EdgeDefinition]): GraphkeystringCollectiona = js.native
  @JSImport("@arangodb/general-graph", "_create")
  @js.native
  def create(name: String, edgeDefinitions: js.Array[EdgeDefinition], orphanCollections: js.Array[String]): GraphkeystringCollectiona = js.native
  
  @JSImport("@arangodb/general-graph", "_drop")
  @js.native
  def drop(name: String): Boolean = js.native
  @JSImport("@arangodb/general-graph", "_drop")
  @js.native
  def drop(name: String, dropCollections: Boolean): Boolean = js.native
  
  @JSImport("@arangodb/general-graph", "_edgeDefinitions")
  @js.native
  def edgeDefinitions(relations: EdgeDefinition*): js.Array[EdgeDefinition] = js.native
  
  @JSImport("@arangodb/general-graph", "_extendEdgeDefinitions")
  @js.native
  def extendEdgeDefinitions(edgeDefinitions: js.Array[EdgeDefinition], relations: EdgeDefinition*): js.Array[EdgeDefinition] = js.native
  
  @JSImport("@arangodb/general-graph", "_list")
  @js.native
  def list(): js.Array[String] = js.native
  
  @JSImport("@arangodb/general-graph", "_relation")
  @js.native
  def relation(name: String, fromVertexCollections: String, toVertexCollections: String): EdgeDefinition = js.native
  @JSImport("@arangodb/general-graph", "_relation")
  @js.native
  def relation(name: String, fromVertexCollections: String, toVertexCollections: js.Array[String]): EdgeDefinition = js.native
  @JSImport("@arangodb/general-graph", "_relation")
  @js.native
  def relation(name: String, fromVertexCollections: js.Array[String], toVertexCollections: String): EdgeDefinition = js.native
  @JSImport("@arangodb/general-graph", "_relation")
  @js.native
  def relation(name: String, fromVertexCollections: js.Array[String], toVertexCollections: js.Array[String]): EdgeDefinition = js.native
  
  type Betweenness = Eccentricity
  
  @js.native
  trait BetweennessOptions extends StObject {
    
    var defaultWeight: js.UndefOr[Double] = js.native
    
    var direction: js.UndefOr[EdgeDirection] = js.native
    
    var weight: js.UndefOr[String] = js.native
  }
  object BetweennessOptions {
    
    @scala.inline
    def apply(): BetweennessOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BetweennessOptions]
    }
    
    @scala.inline
    implicit class BetweennessOptionsMutableBuilder[Self <: BetweennessOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultWeight(value: Double): Self = StObject.set(x, "defaultWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultWeightUndefined: Self = StObject.set(x, "defaultWeight", js.undefined)
      
      @scala.inline
      def setDirection(value: EdgeDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  type Closeness = Eccentricity
  
  type ClosenessOptions = ShortestPathOptions
  
  @js.native
  trait CommonNeighbors extends StObject {
    
    var left: String = js.native
    
    var neighbors: js.Array[String] = js.native
    
    var right: String = js.native
  }
  object CommonNeighbors {
    
    @scala.inline
    def apply(left: String, neighbors: js.Array[String], right: String): CommonNeighbors = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], neighbors = neighbors.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonNeighbors]
    }
    
    @scala.inline
    implicit class CommonNeighborsMutableBuilder[Self <: CommonNeighbors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeighbors(value: js.Array[String]): Self = StObject.set(x, "neighbors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeighborsVarargs(value: String*): Self = StObject.set(x, "neighbors", js.Array(value :_*))
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  type CommonProperties = StringDictionary[js.UndefOr[js.Array[Dictkey]]]
  
  @js.native
  trait CommonPropertiesOptions extends StObject {
    
    var ignoredProperties: js.UndefOr[js.Array[String] | String] = js.native
    
    var vertex1CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
    
    var vertex2CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  }
  object CommonPropertiesOptions {
    
    @scala.inline
    def apply(): CommonPropertiesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonPropertiesOptions]
    }
    
    @scala.inline
    implicit class CommonPropertiesOptionsMutableBuilder[Self <: CommonPropertiesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoredProperties(value: js.Array[String] | String): Self = StObject.set(x, "ignoredProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredPropertiesUndefined: Self = StObject.set(x, "ignoredProperties", js.undefined)
      
      @scala.inline
      def setIgnoredPropertiesVarargs(value: String*): Self = StObject.set(x, "ignoredProperties", js.Array(value :_*))
      
      @scala.inline
      def setVertex1CollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "vertex1CollectionRestriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertex1CollectionRestrictionUndefined: Self = StObject.set(x, "vertex1CollectionRestriction", js.undefined)
      
      @scala.inline
      def setVertex1CollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "vertex1CollectionRestriction", js.Array(value :_*))
      
      @scala.inline
      def setVertex2CollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "vertex2CollectionRestriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertex2CollectionRestrictionUndefined: Self = StObject.set(x, "vertex2CollectionRestriction", js.undefined)
      
      @scala.inline
      def setVertex2CollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "vertex2CollectionRestriction", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ConnectingEdgesOptions extends StObject {
    
    var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
    
    var edgeExamples: js.UndefOr[Example] = js.native
    
    var vertex1CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
    
    var vertex2CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  }
  object ConnectingEdgesOptions {
    
    @scala.inline
    def apply(): ConnectingEdgesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectingEdgesOptions]
    }
    
    @scala.inline
    implicit class ConnectingEdgesOptionsMutableBuilder[Self <: ConnectingEdgesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdgeCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "edgeCollectionRestriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeCollectionRestrictionUndefined: Self = StObject.set(x, "edgeCollectionRestriction", js.undefined)
      
      @scala.inline
      def setEdgeCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "edgeCollectionRestriction", js.Array(value :_*))
      
      @scala.inline
      def setEdgeExamples(value: Example): Self = StObject.set(x, "edgeExamples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeExamplesNull: Self = StObject.set(x, "edgeExamples", null)
      
      @scala.inline
      def setEdgeExamplesUndefined: Self = StObject.set(x, "edgeExamples", js.undefined)
      
      @scala.inline
      def setEdgeExamplesVarargs(value: (js.Object | String)*): Self = StObject.set(x, "edgeExamples", js.Array(value :_*))
      
      @scala.inline
      def setVertex1CollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "vertex1CollectionRestriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertex1CollectionRestrictionUndefined: Self = StObject.set(x, "vertex1CollectionRestriction", js.undefined)
      
      @scala.inline
      def setVertex1CollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "vertex1CollectionRestriction", js.Array(value :_*))
      
      @scala.inline
      def setVertex2CollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "vertex2CollectionRestriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertex2CollectionRestrictionUndefined: Self = StObject.set(x, "vertex2CollectionRestriction", js.undefined)
      
      @scala.inline
      def setVertex2CollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "vertex2CollectionRestriction", js.Array(value :_*))
    }
  }
  
  type CountCommonNeighbors = StringDictionary[js.UndefOr[js.Array[StringDictionary[js.UndefOr[Double]]]]]
  
  type CountCommonProperties = StringDictionary[js.UndefOr[Double]]
  
  type DiameterOptions = BetweennessOptions
  
  @js.native
  trait Distance extends StObject {
    
    var distance: Double = js.native
    
    var startVertex: String = js.native
    
    var vertex: String = js.native
  }
  object Distance {
    
    @scala.inline
    def apply(distance: Double, startVertex: String, vertex: String): Distance = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], startVertex = startVertex.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Distance]
    }
    
    @scala.inline
    implicit class DistanceMutableBuilder[Self <: Distance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartVertex(value: String): Self = StObject.set(x, "startVertex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    }
  }
  
  type Eccentricity = StringDictionary[js.UndefOr[Double]]
  
  type EccentricityOptions = ShortestPathOptions
  
  @js.native
  trait EdgeDefinition extends StObject {
    
    var collection: String = js.native
    
    var from: js.Array[String] = js.native
    
    var to: js.Array[String] = js.native
  }
  object EdgeDefinition {
    
    @scala.inline
    def apply(collection: String, from: js.Array[String], to: js.Array[String]): EdgeDefinition = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeDefinition]
    }
    
    @scala.inline
    implicit class EdgeDefinitionMutableBuilder[Self <: EdgeDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: js.Array[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromVarargs(value: String*): Self = StObject.set(x, "from", js.Array(value :_*))
      
      @scala.inline
      def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
    }
  }
  
  type Example = (js.Array[js.Object | String]) | js.Object | String | Null
  
  @js.native
  trait Graph extends StObject {
    
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
  
  @js.native
  trait NeighborsOptions extends StObject {
    
    var direction: js.UndefOr[EdgeDirection] = js.native
    
    var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
    
    var edgeExamples: js.UndefOr[Example] = js.native
    
    var maxDepth: js.UndefOr[Double] = js.native
    
    var minDepth: js.UndefOr[Double] = js.native
    
    var neighborExamples: js.UndefOr[Example] = js.native
    
    var vertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  }
  object NeighborsOptions {
    
    @scala.inline
    def apply(): NeighborsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NeighborsOptions]
    }
    
    @scala.inline
    implicit class NeighborsOptionsMutableBuilder[Self <: NeighborsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: EdgeDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEdgeCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "edgeCollectionRestriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeCollectionRestrictionUndefined: Self = StObject.set(x, "edgeCollectionRestriction", js.undefined)
      
      @scala.inline
      def setEdgeCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "edgeCollectionRestriction", js.Array(value :_*))
      
      @scala.inline
      def setEdgeExamples(value: Example): Self = StObject.set(x, "edgeExamples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeExamplesNull: Self = StObject.set(x, "edgeExamples", null)
      
      @scala.inline
      def setEdgeExamplesUndefined: Self = StObject.set(x, "edgeExamples", js.undefined)
      
      @scala.inline
      def setEdgeExamplesVarargs(value: (js.Object | String)*): Self = StObject.set(x, "edgeExamples", js.Array(value :_*))
      
      @scala.inline
      def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      @scala.inline
      def setMinDepth(value: Double): Self = StObject.set(x, "minDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDepthUndefined: Self = StObject.set(x, "minDepth", js.undefined)
      
      @scala.inline
      def setNeighborExamples(value: Example): Self = StObject.set(x, "neighborExamples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeighborExamplesNull: Self = StObject.set(x, "neighborExamples", null)
      
      @scala.inline
      def setNeighborExamplesUndefined: Self = StObject.set(x, "neighborExamples", js.undefined)
      
      @scala.inline
      def setNeighborExamplesVarargs(value: (js.Object | String)*): Self = StObject.set(x, "neighborExamples", js.Array(value :_*))
      
      @scala.inline
      def setVertexCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "vertexCollectionRestriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexCollectionRestrictionUndefined: Self = StObject.set(x, "vertexCollectionRestriction", js.undefined)
      
      @scala.inline
      def setVertexCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "vertexCollectionRestriction", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Path[A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */] extends StObject {
    
    var destination: Document[B] = js.native
    
    var edges: js.Array[Edge[E]] = js.native
    
    var source: Document[A] = js.native
    
    var vertice: js.Array[Document[A | B | V]] = js.native
  }
  object Path {
    
    @scala.inline
    def apply[A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */](
      destination: Document[B],
      edges: js.Array[Edge[E]],
      source: Document[A],
      vertice: js.Array[Document[A | B | V]]
    ): Path[A, B, E, V] = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], vertice = vertice.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path[A, B, E, V]]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path[_, _, _, _], A /* <: js.Object */, B /* <: js.Object */, E /* <: js.Object */, V /* <: js.Object */] (val x: Self with (Path[A, B, E, V])) extends AnyVal {
      
      @scala.inline
      def setDestination(value: Document[B]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdges(value: js.Array[Edge[E]]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesVarargs(value: Edge[E]*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: Document[A]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertice(value: js.Array[Document[A | B | V]]): Self = StObject.set(x, "vertice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticeVarargs(value: (Document[A | B | V])*): Self = StObject.set(x, "vertice", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PathsOptions extends StObject {
    
    var direction: js.UndefOr[EdgeDirection] = js.native
    
    var followCycles: js.UndefOr[Boolean] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var minLength: js.UndefOr[Double] = js.native
  }
  object PathsOptions {
    
    @scala.inline
    def apply(): PathsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathsOptions]
    }
    
    @scala.inline
    implicit class PathsOptionsMutableBuilder[Self <: PathsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: EdgeDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFollowCycles(value: Boolean): Self = StObject.set(x, "followCycles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowCyclesUndefined: Self = StObject.set(x, "followCycles", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    }
  }
  
  type RadiusOptions = BetweennessOptions
  
  @js.native
  trait ShortestPath[T /* <: js.Object */] extends StObject {
    
    var distance: Double = js.native
    
    var edges: js.Array[Edge[T]] = js.native
    
    var vertices: js.Array[String] = js.native
  }
  object ShortestPath {
    
    @scala.inline
    def apply[T /* <: js.Object */](distance: Double, edges: js.Array[Edge[T]], vertices: js.Array[String]): ShortestPath[T] = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShortestPath[T]]
    }
    
    @scala.inline
    implicit class ShortestPathMutableBuilder[Self <: ShortestPath[_], T /* <: js.Object */] (val x: Self with ShortestPath[T]) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdges(value: js.Array[Edge[T]]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesVarargs(value: Edge[T]*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      @scala.inline
      def setVertices(value: js.Array[String]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticesVarargs(value: String*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ShortestPathOptions extends StObject {
    
    var defaultWeight: js.UndefOr[Double] = js.native
    
    var direction: js.UndefOr[EdgeDirection] = js.native
    
    var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
    
    var endVertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
    
    var startVertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
    
    var weight: js.UndefOr[String] = js.native
  }
  object ShortestPathOptions {
    
    @scala.inline
    def apply(): ShortestPathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShortestPathOptions]
    }
    
    @scala.inline
    implicit class ShortestPathOptionsMutableBuilder[Self <: ShortestPathOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultWeight(value: Double): Self = StObject.set(x, "defaultWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultWeightUndefined: Self = StObject.set(x, "defaultWeight", js.undefined)
      
      @scala.inline
      def setDirection(value: EdgeDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEdgeCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "edgeCollectionRestriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeCollectionRestrictionUndefined: Self = StObject.set(x, "edgeCollectionRestriction", js.undefined)
      
      @scala.inline
      def setEdgeCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "edgeCollectionRestriction", js.Array(value :_*))
      
      @scala.inline
      def setEndVertexCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "endVertexCollectionRestriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndVertexCollectionRestrictionUndefined: Self = StObject.set(x, "endVertexCollectionRestriction", js.undefined)
      
      @scala.inline
      def setEndVertexCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "endVertexCollectionRestriction", js.Array(value :_*))
      
      @scala.inline
      def setStartVertexCollectionRestriction(value: js.Array[String] | String): Self = StObject.set(x, "startVertexCollectionRestriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartVertexCollectionRestrictionUndefined: Self = StObject.set(x, "startVertexCollectionRestriction", js.undefined)
      
      @scala.inline
      def setStartVertexCollectionRestrictionVarargs(value: String*): Self = StObject.set(x, "startVertexCollectionRestriction", js.Array(value :_*))
      
      @scala.inline
      def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
}
