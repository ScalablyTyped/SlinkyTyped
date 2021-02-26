package typingsSlinky.reactLeaflet.mod

import slinky.core.facade.ReactElement
import typingsSlinky.leaflet.mod.ImageOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet */ @js.native
trait SVGOverlayProps extends ImageOverlayOptions {
  
  var children: js.UndefOr[Children] = js.native
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
}
object SVGOverlayProps {
  
  @scala.inline
  def apply(): SVGOverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGOverlayProps]
  }
  
  @scala.inline
  implicit class SVGOverlayPropsMutableBuilder[Self <: SVGOverlayProps] (val x: Self) extends AnyVal {
    
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
  }
}
