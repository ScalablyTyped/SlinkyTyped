package typingsSlinky.reactLeaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapComponentProps extends StObject {
  
  var leaflet: js.UndefOr[LeafletContext] = js.native
  
  var pane: js.UndefOr[String] = js.native
}
object MapComponentProps {
  
  @scala.inline
  def apply(): MapComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapComponentProps]
  }
  
  @scala.inline
  implicit class MapComponentPropsMutableBuilder[Self <: MapComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
  }
}
