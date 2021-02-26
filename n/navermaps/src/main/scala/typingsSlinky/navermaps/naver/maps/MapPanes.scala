package typingsSlinky.navermaps.naver.maps

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapPanes extends StObject {
  
  var floatPane: HTMLElement = js.native
  
  var overlayImage: HTMLElement = js.native
  
  var overlayLayer: HTMLElement = js.native
}
object MapPanes {
  
  @scala.inline
  def apply(floatPane: HTMLElement, overlayImage: HTMLElement, overlayLayer: HTMLElement): MapPanes = {
    val __obj = js.Dynamic.literal(floatPane = floatPane.asInstanceOf[js.Any], overlayImage = overlayImage.asInstanceOf[js.Any], overlayLayer = overlayLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanes]
  }
  
  @scala.inline
  implicit class MapPanesMutableBuilder[Self <: MapPanes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloatPane(value: HTMLElement): Self = StObject.set(x, "floatPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayImage(value: HTMLElement): Self = StObject.set(x, "overlayImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayLayer(value: HTMLElement): Self = StObject.set(x, "overlayLayer", value.asInstanceOf[js.Any])
  }
}
