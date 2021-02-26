package typingsSlinky.reactLeaflet.mod

import slinky.core.facade.ReactElement
import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leaflet.mod.MarkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typingsSlinky.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ @js.native
trait MarkerProps
  extends MarkerOptions
     with MarkerEvents {
  
  var children: js.UndefOr[Children] = js.native
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
  var position: LatLngExpression = js.native
}
object MarkerProps {
  
  @scala.inline
  def apply(position: LatLngExpression): MarkerProps = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
  
  @scala.inline
  implicit class MarkerPropsMutableBuilder[Self <: MarkerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    @scala.inline
    def setPosition(value: LatLngExpression): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
