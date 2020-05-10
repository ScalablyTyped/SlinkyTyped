package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.AnonComponents
import typingsSlinky.cytoscape.AnonComponentsCut
import typingsSlinky.cytoscape.AnonCut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  * trivial
  */
@js.native
trait CollectionAlgorithms extends js.Object {
  /**
    * Perform the A* search algorithm on the elements in the collection.
    * This finds the shortest path from the root node to the goal node.
    * http://js.cytoscape.org/#eles.aStar
    */
  def aStar(options: SearchAStarOptions): SearchAStarResult = js.native
  /**
    * Perform the Bellman-Ford search algorithm on the elements in the collection.
    * This finds the shortest path from the starting node to all other nodes in the collection.
    * http://js.cytoscape.org/#eles.bellmanFord
    */
  def bellmanFord(options: SearchBellmanFordOptions): SearchBellmanFordResult = js.native
  /**
    * Considering only the elements in the calling collection,
    * calculate the betweenness centrality of the nodes.
    * http://js.cytoscape.org/#eles.betweennessCentrality
    */
  def betweennessCentrality(options: SearchBetweennessOptions): SearchBetweennessResult = js.native
  def bfs(options: SearchFirstOptions): SearchFirstResult = js.native
  /**
    * Perform a breadth-first search within the elements in the collection.
    * @param options
    * http://js.cytoscape.org/#eles.breadthFirstSearch
    * @alias bfs
    */
  def breadthFirstSearch(options: SearchFirstOptions): SearchFirstResult = js.native
  /**
    * Considering only the elements in the calling collection,
    * calculate the closeness centrality of the specified root node.
    * http://js.cytoscape.org/#eles.closenessCentrality
    */
  def closenessCentrality(options: SearchClosenessCentralityOptions): Double = js.native
  /**
    * Considering only the elements in the calling collection,
    * calculate the closeness centrality of the nodes.
    * http://js.cytoscape.org/#eles.closenessCentralityNormalized
    */
  def closenessCentralityNormalized(options: SearchClosenessCentralityNormalizedOptions): SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected = js.native
  /**
    * Considering only the elements in the calling collection,
    * calculate the degree centrality of the specified root node.
    * http://js.cytoscape.org/#eles.degreeCentrality
    */
  def degreeCentrality(options: SearchDegreeCentralityOptions): SearchDegreeCentralityResultDirected | SearchDegreeCentralityResultUndirected = js.native
  /**
    * Considering only the elements in the calling collection,
    * calculate the normalised degree centrality of the nodes.
    * http://js.cytoscape.org/#eles.degreeCentralityNormalized
    */
  def degreeCentralityNormalized(options: SearchDegreeCentralityNormalizedOptions): SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected = js.native
  /**
    * Perform a depth-first search within the elements in the collection.
    * http://js.cytoscape.org/#eles.depthFirstSearch
    * @alias dfs
    */
  def depthFirstSearch(options: SearchFirstOptions): SearchFirstResult = js.native
  def dfs(options: SearchFirstOptions): SearchFirstResult = js.native
  /**
    * Perform Dijkstra's algorithm on the elements in the collection.
    * This finds the shortest paths to all other nodes in the collection from the root node.
    * http://js.cytoscape.org/#eles.dijkstra
    */
  def dijkstra(options: SearchDijkstraOptions): SearchDijkstraResult = js.native
  /**
    * Perform the Floyd Warshall search algorithm on the elements in the collection.
    * This finds the shortest path between all pairs of nodes.
    * http://js.cytoscape.org/#eles.floydWarshall
    */
  def floydWarshall(options: SearchFloydWarshallOptions): SearchFloydWarshallResult = js.native
  /**
    * finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def hopcroftTarjanBiconnected(): AnonCut = js.native
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def hopcroftTarjanBiconnectedComponents(): AnonCut = js.native
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def htb(): AnonCut = js.native
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def htbc(): AnonCut = js.native
  /**
    * Finds the minimum cut in a graph using the Karger-Stein algorithm.
    * The optimal result is found with a high probability, but without guarantee.
    * http://js.cytoscape.org/#eles.kargerStein
    */
  def kargerStein(): AnonComponents = js.native
  /**
    * Perform Kruskal's algorithm on the elements in the collection,
    * returning the minimum spanning tree, assuming undirected edges.
    * http://js.cytoscape.org/#eles.kruskal
    */
  def kruskal(handler: js.Function1[/* edge */ EdgeCollection, Double]): CollectionReturnValue = js.native
  /**
    * Rank the nodes in the collection using the Page Rank algorithm.
    * http://js.cytoscape.org/#eles.pageRank
    */
  def pageRank(options: SearchPageRankOptions): SearchPageRankResult = js.native
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tarjanStronglyConnected(): AnonComponentsCut = js.native
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tarjanStronglyConnectedComponents(): AnonComponentsCut = js.native
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tsc(): AnonComponentsCut = js.native
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tscc(): AnonComponentsCut = js.native
}

object CollectionAlgorithms {
  @scala.inline
  def apply(
    aStar: SearchAStarOptions => SearchAStarResult,
    bellmanFord: SearchBellmanFordOptions => SearchBellmanFordResult,
    betweennessCentrality: SearchBetweennessOptions => SearchBetweennessResult,
    bfs: SearchFirstOptions => SearchFirstResult,
    breadthFirstSearch: SearchFirstOptions => SearchFirstResult,
    closenessCentrality: SearchClosenessCentralityOptions => Double,
    closenessCentralityNormalized: SearchClosenessCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected,
    degreeCentrality: SearchDegreeCentralityOptions => SearchDegreeCentralityResultDirected | SearchDegreeCentralityResultUndirected,
    degreeCentralityNormalized: SearchDegreeCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected,
    depthFirstSearch: SearchFirstOptions => SearchFirstResult,
    dfs: SearchFirstOptions => SearchFirstResult,
    dijkstra: SearchDijkstraOptions => SearchDijkstraResult,
    floydWarshall: SearchFloydWarshallOptions => SearchFloydWarshallResult,
    hopcroftTarjanBiconnected: () => AnonCut,
    hopcroftTarjanBiconnectedComponents: () => AnonCut,
    htb: () => AnonCut,
    htbc: () => AnonCut,
    kargerStein: () => AnonComponents,
    kruskal: js.Function1[/* edge */ EdgeCollection, Double] => CollectionReturnValue,
    pageRank: SearchPageRankOptions => SearchPageRankResult,
    tarjanStronglyConnected: () => AnonComponentsCut,
    tarjanStronglyConnectedComponents: () => AnonComponentsCut,
    tsc: () => AnonComponentsCut,
    tscc: () => AnonComponentsCut
  ): CollectionAlgorithms = {
    val __obj = js.Dynamic.literal(aStar = js.Any.fromFunction1(aStar), bellmanFord = js.Any.fromFunction1(bellmanFord), betweennessCentrality = js.Any.fromFunction1(betweennessCentrality), bfs = js.Any.fromFunction1(bfs), breadthFirstSearch = js.Any.fromFunction1(breadthFirstSearch), closenessCentrality = js.Any.fromFunction1(closenessCentrality), closenessCentralityNormalized = js.Any.fromFunction1(closenessCentralityNormalized), degreeCentrality = js.Any.fromFunction1(degreeCentrality), degreeCentralityNormalized = js.Any.fromFunction1(degreeCentralityNormalized), depthFirstSearch = js.Any.fromFunction1(depthFirstSearch), dfs = js.Any.fromFunction1(dfs), dijkstra = js.Any.fromFunction1(dijkstra), floydWarshall = js.Any.fromFunction1(floydWarshall), hopcroftTarjanBiconnected = js.Any.fromFunction0(hopcroftTarjanBiconnected), hopcroftTarjanBiconnectedComponents = js.Any.fromFunction0(hopcroftTarjanBiconnectedComponents), htb = js.Any.fromFunction0(htb), htbc = js.Any.fromFunction0(htbc), kargerStein = js.Any.fromFunction0(kargerStein), kruskal = js.Any.fromFunction1(kruskal), pageRank = js.Any.fromFunction1(pageRank), tarjanStronglyConnected = js.Any.fromFunction0(tarjanStronglyConnected), tarjanStronglyConnectedComponents = js.Any.fromFunction0(tarjanStronglyConnectedComponents), tsc = js.Any.fromFunction0(tsc), tscc = js.Any.fromFunction0(tscc))
    __obj.asInstanceOf[CollectionAlgorithms]
  }
  @scala.inline
  implicit class CollectionAlgorithmsOps[Self <: CollectionAlgorithms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAStar(value: SearchAStarOptions => SearchAStarResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aStar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBellmanFord(value: SearchBellmanFordOptions => SearchBellmanFordResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bellmanFord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBetweennessCentrality(value: SearchBetweennessOptions => SearchBetweennessResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betweennessCentrality")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBfs(value: SearchFirstOptions => SearchFirstResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bfs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBreadthFirstSearch(value: SearchFirstOptions => SearchFirstResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadthFirstSearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClosenessCentrality(value: SearchClosenessCentralityOptions => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closenessCentrality")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClosenessCentralityNormalized(
      value: SearchClosenessCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closenessCentralityNormalized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDegreeCentrality(
      value: SearchDegreeCentralityOptions => SearchDegreeCentralityResultDirected | SearchDegreeCentralityResultUndirected
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degreeCentrality")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDegreeCentralityNormalized(
      value: SearchDegreeCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degreeCentralityNormalized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDepthFirstSearch(value: SearchFirstOptions => SearchFirstResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthFirstSearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDfs(value: SearchFirstOptions => SearchFirstResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dfs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDijkstra(value: SearchDijkstraOptions => SearchDijkstraResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dijkstra")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFloydWarshall(value: SearchFloydWarshallOptions => SearchFloydWarshallResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floydWarshall")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHopcroftTarjanBiconnected(value: () => AnonCut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hopcroftTarjanBiconnected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHopcroftTarjanBiconnectedComponents(value: () => AnonCut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hopcroftTarjanBiconnectedComponents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHtb(value: () => AnonCut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htb")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHtbc(value: () => AnonCut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htbc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKargerStein(value: () => AnonComponents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kargerStein")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKruskal(value: js.Function1[/* edge */ EdgeCollection, Double] => CollectionReturnValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kruskal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPageRank(value: SearchPageRankOptions => SearchPageRankResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageRank")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTarjanStronglyConnected(value: () => AnonComponentsCut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tarjanStronglyConnected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarjanStronglyConnectedComponents(value: () => AnonComponentsCut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tarjanStronglyConnectedComponents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTsc(value: () => AnonComponentsCut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTscc(value: () => AnonComponentsCut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tscc")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

