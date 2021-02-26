package typingsSlinky.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClampToGround extends StObject {
  
  var clampToGround: js.UndefOr[Boolean] = js.native
  
  var fill: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  
  var markerColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  
  var markerSize: js.UndefOr[Double] = js.native
  
  var markerSymbol: js.UndefOr[String] = js.native
  
  var sourceUri: js.UndefOr[String] = js.native
  
  var stroke: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
}
object ClampToGround {
  
  @scala.inline
  def apply(): ClampToGround = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClampToGround]
  }
  
  @scala.inline
  implicit class ClampToGroundMutableBuilder[Self <: ClampToGround] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClampToGround(value: Boolean): Self = StObject.set(x, "clampToGround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClampToGroundUndefined: Self = StObject.set(x, "clampToGround", js.undefined)
    
    @scala.inline
    def setFill(value: typingsSlinky.cesium.mod.Color): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setMarkerColor(value: typingsSlinky.cesium.mod.Color): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
    
    @scala.inline
    def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    @scala.inline
    def setMarkerSymbol(value: String): Self = StObject.set(x, "markerSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSymbolUndefined: Self = StObject.set(x, "markerSymbol", js.undefined)
    
    @scala.inline
    def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    
    @scala.inline
    def setStroke(value: typingsSlinky.cesium.mod.Color): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
