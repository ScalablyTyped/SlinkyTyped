package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.LatLngBoundsExpression
import typingsSlinky.leaflet.mod.LatLngTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.leaflet.mod.LayerOptions because Already inherited
- typingsSlinky.leaflet.mod.InteractiveLayerOptions because Already inherited
- typingsSlinky.leaflet.mod.PathOptions because Already inherited
- typingsSlinky.leaflet.mod.PolylineOptions because var conflicts: attribution, bubblingMouseEvents, className, color, dashArray, dashOffset, fill, fillColor, fillOpacity, fillRule, interactive, lineCap, lineJoin, opacity, pane, renderer, stroke, weight. Inlined noClip, smoothFactor */ @js.native
trait RectangleProps extends PathProps {
  
  var bounds: LatLngBoundsExpression = js.native
  
  var noClip: js.UndefOr[Boolean] = js.native
  
  var smoothFactor: js.UndefOr[Double] = js.native
}
object RectangleProps {
  
  @scala.inline
  def apply(bounds: LatLngBoundsExpression): RectangleProps = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleProps]
  }
  
  @scala.inline
  implicit class RectanglePropsMutableBuilder[Self <: RectangleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    @scala.inline
    def setNoClip(value: Boolean): Self = StObject.set(x, "noClip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoClipUndefined: Self = StObject.set(x, "noClip", js.undefined)
    
    @scala.inline
    def setSmoothFactor(value: Double): Self = StObject.set(x, "smoothFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothFactorUndefined: Self = StObject.set(x, "smoothFactor", js.undefined)
  }
}
