package typingsSlinky.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationControlOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.native
  
  var enableAutoLocation: js.UndefOr[Boolean] = js.native
  
  var locationIcon: js.UndefOr[Icon] = js.native
  
  var offset: js.UndefOr[Size] = js.native
  
  var showAddressBar: js.UndefOr[Boolean] = js.native
}
object GeolocationControlOptions {
  
  @scala.inline
  def apply(): GeolocationControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationControlOptions]
  }
  
  @scala.inline
  implicit class GeolocationControlOptionsMutableBuilder[Self <: GeolocationControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setEnableAutoLocation(value: Boolean): Self = StObject.set(x, "enableAutoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoLocationUndefined: Self = StObject.set(x, "enableAutoLocation", js.undefined)
    
    @scala.inline
    def setLocationIcon(value: Icon): Self = StObject.set(x, "locationIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIconUndefined: Self = StObject.set(x, "locationIcon", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setShowAddressBar(value: Boolean): Self = StObject.set(x, "showAddressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAddressBarUndefined: Self = StObject.set(x, "showAddressBar", js.undefined)
  }
}
