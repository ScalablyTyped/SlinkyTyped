package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.closenessCentrality
  */
@js.native
trait SearchClosenessCentralityOptions extends StObject {
  
  /**
    * A boolean indicating whether the directed indegree and outdegree centrality is calculated (true) or
    * whether the undirected centrality is calculated (false, default).
    */
  var directed: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean indicating whether the algorithm calculates the
    * harmonic mean (true, default) or the arithmetic mean (false) of distances.
    * The harmonic mean is very useful for graphs that are not strongly connected.
    */
  var harmonic: js.UndefOr[Boolean] = js.native
  
  /**
    * The root node (selector or collection) for which the
    * centrality calculation is made.
    */
  var root: NodeSingular | Selector = js.native
  
  /**  A function that returns the weight for the edge. */
  var weight: js.UndefOr[js.Function1[/* edge */ EdgeSingular, Double]] = js.native
}
object SearchClosenessCentralityOptions {
  
  @scala.inline
  def apply(root: NodeSingular | Selector): SearchClosenessCentralityOptions = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchClosenessCentralityOptions]
  }
  
  @scala.inline
  implicit class SearchClosenessCentralityOptionsMutableBuilder[Self <: SearchClosenessCentralityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
    
    @scala.inline
    def setHarmonic(value: Boolean): Self = StObject.set(x, "harmonic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHarmonicUndefined: Self = StObject.set(x, "harmonic", js.undefined)
    
    @scala.inline
    def setRoot(value: NodeSingular | Selector): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: /* edge */ EdgeSingular => Double): Self = StObject.set(x, "weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
