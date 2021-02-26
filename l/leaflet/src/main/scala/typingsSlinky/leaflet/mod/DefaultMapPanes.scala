package typingsSlinky.leaflet.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultMapPanes extends StObject {
  
  var mapPane: HTMLElement = js.native
  
  var markerPane: HTMLElement = js.native
  
  var overlayPane: HTMLElement = js.native
  
  var popupPane: HTMLElement = js.native
  
  var shadowPane: HTMLElement = js.native
  
  var tilePane: HTMLElement = js.native
  
  var tooltipPane: HTMLElement = js.native
}
object DefaultMapPanes {
  
  @scala.inline
  def apply(
    mapPane: HTMLElement,
    markerPane: HTMLElement,
    overlayPane: HTMLElement,
    popupPane: HTMLElement,
    shadowPane: HTMLElement,
    tilePane: HTMLElement,
    tooltipPane: HTMLElement
  ): DefaultMapPanes = {
    val __obj = js.Dynamic.literal(mapPane = mapPane.asInstanceOf[js.Any], markerPane = markerPane.asInstanceOf[js.Any], overlayPane = overlayPane.asInstanceOf[js.Any], popupPane = popupPane.asInstanceOf[js.Any], shadowPane = shadowPane.asInstanceOf[js.Any], tilePane = tilePane.asInstanceOf[js.Any], tooltipPane = tooltipPane.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultMapPanes]
  }
  
  @scala.inline
  implicit class DefaultMapPanesMutableBuilder[Self <: DefaultMapPanes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapPane(value: HTMLElement): Self = StObject.set(x, "mapPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerPane(value: HTMLElement): Self = StObject.set(x, "markerPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayPane(value: HTMLElement): Self = StObject.set(x, "overlayPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupPane(value: HTMLElement): Self = StObject.set(x, "popupPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowPane(value: HTMLElement): Self = StObject.set(x, "shadowPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilePane(value: HTMLElement): Self = StObject.set(x, "tilePane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipPane(value: HTMLElement): Self = StObject.set(x, "tooltipPane", value.asInstanceOf[js.Any])
  }
}
