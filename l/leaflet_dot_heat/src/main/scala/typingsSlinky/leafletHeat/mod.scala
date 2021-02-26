package typingsSlinky.leafletHeat

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.TileLayer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", "heatLayer")
  @js.native
  def heatLayer(latlngs: js.Array[LatLng_ | HeatLatLngTuple], options: HeatMapOptions): HeatLayer_ = js.native
  
  type ColorGradientConfig = NumberDictionary[String]
  
  type HeatLatLngTuple = js.Tuple3[Double, Double, Double]
  
  @js.native
  trait HeatLayer_ extends TileLayer_ {
    
    def addLatLng(latlng: LatLng_): HeatLayer_ = js.native
    def addLatLng(latlng: HeatLatLngTuple): HeatLayer_ = js.native
    
    def setLatLngs(latlngs: js.Array[LatLng_ | HeatLatLngTuple]): HeatLayer_ = js.native
    
    def setOptions(options: HeatMapOptions): HeatLayer_ = js.native
  }
  
  @js.native
  trait HeatMapOptions extends StObject {
    
    var blur: js.UndefOr[Double] = js.native
    
    var gradient: js.UndefOr[ColorGradientConfig] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minOpacity: js.UndefOr[Double] = js.native
    
    var radius: js.UndefOr[Double] = js.native
  }
  object HeatMapOptions {
    
    @scala.inline
    def apply(): HeatMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeatMapOptions]
    }
    
    @scala.inline
    implicit class HeatMapOptionsMutableBuilder[Self <: HeatMapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setGradient(value: ColorGradientConfig): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinOpacity(value: Double): Self = StObject.set(x, "minOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinOpacityUndefined: Self = StObject.set(x, "minOpacity", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
}
