package typingsSlinky.cytoscape.mod.Css

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These properties specify the gradient colouration of an edge's line:
  *
  * https://js.cytoscape.org/#style/gradient
  */
@js.native
trait Gradient extends StObject {
  
  /**
    * The colors of the gradient stops.
    */
  var `line-gradient-stop-colors`: js.UndefOr[js.Array[PropertyValueEdge[Colour]]] = js.native
  
  /**
    * The positions of the gradient stops.
    * If not specified (or invalid), the stops will divide equally.
    */
  var `line-gradient-stop-positions`: js.UndefOr[js.Array[PropertyValueEdge[Double]]] = js.native
}
object Gradient {
  
  @scala.inline
  def apply(): Gradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gradient]
  }
  
  @scala.inline
  implicit class GradientMutableBuilder[Self <: Gradient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setLine-gradient-stop-colors`(value: js.Array[PropertyValueEdge[Colour]]): Self = StObject.set(x, "line-gradient-stop-colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-gradient-stop-colorsUndefined`: Self = StObject.set(x, "line-gradient-stop-colors", js.undefined)
    
    @scala.inline
    def `setLine-gradient-stop-colorsVarargs`(value: PropertyValueEdge[Colour]*): Self = StObject.set(x, "line-gradient-stop-colors", js.Array(value :_*))
    
    @scala.inline
    def `setLine-gradient-stop-positions`(value: js.Array[PropertyValueEdge[Double]]): Self = StObject.set(x, "line-gradient-stop-positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLine-gradient-stop-positionsUndefined`: Self = StObject.set(x, "line-gradient-stop-positions", js.undefined)
    
    @scala.inline
    def `setLine-gradient-stop-positionsVarargs`(value: PropertyValueEdge[Double]*): Self = StObject.set(x, "line-gradient-stop-positions", js.Array(value :_*))
  }
}
