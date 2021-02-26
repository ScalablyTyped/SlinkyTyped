package typingsSlinky.amapJsSdk.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.amapJsSdk.AMap.DrivingPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extensions extends StObject {
  
  var extensions: js.UndefOr[String] = js.native
  
  var hideMarkers: js.UndefOr[Boolean] = js.native
  
  var map: js.UndefOr[typingsSlinky.amapJsSdk.AMap.Map] = js.native
  
  var panel: js.UndefOr[String | HTMLElement] = js.native
  
  var policy: js.UndefOr[DrivingPolicy] = js.native
  
  var showTraffic: js.UndefOr[Boolean] = js.native
}
object Extensions {
  
  @scala.inline
  def apply(): Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensions]
  }
  
  @scala.inline
  implicit class ExtensionsMutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setHideMarkers(value: Boolean): Self = StObject.set(x, "hideMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideMarkersUndefined: Self = StObject.set(x, "hideMarkers", js.undefined)
    
    @scala.inline
    def setMap(value: typingsSlinky.amapJsSdk.AMap.Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setPanel(value: String | HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelHTMLElement(value: HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    @scala.inline
    def setPolicy(value: DrivingPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setShowTraffic(value: Boolean): Self = StObject.set(x, "showTraffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTrafficUndefined: Self = StObject.set(x, "showTraffic", js.undefined)
  }
}
