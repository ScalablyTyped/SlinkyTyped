package typingsSlinky.reactLeaflet.mod

import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.facade.ReactElement
import typingsSlinky.leaflet.mod.ImageOverlayOptions
import typingsSlinky.leaflet.mod.LatLngBoundsExpression
import typingsSlinky.leaflet.mod.LatLngTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typingsSlinky.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ @js.native
trait ImageOverlayProps extends ImageOverlayOptions {
  
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.native
  
  var children: js.UndefOr[Children] = js.native
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
  var url: String | HTMLImageElement = js.native
}
object ImageOverlayProps {
  
  @scala.inline
  def apply(url: String | HTMLImageElement): ImageOverlayProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOverlayProps]
  }
  
  @scala.inline
  implicit class ImageOverlayPropsMutableBuilder[Self <: ImageOverlayProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
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
    def setUrl(value: String | HTMLImageElement): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
