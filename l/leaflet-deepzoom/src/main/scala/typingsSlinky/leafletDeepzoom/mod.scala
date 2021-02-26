package typingsSlinky.leafletDeepzoom

import typingsSlinky.leafletDeepzoom.mod.TileLayer_.DeepZoom
import typingsSlinky.leafletDeepzoom.mod.TileLayer_.DeepZoomOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object TileLayer_ {
    
    @JSImport("leaflet", "TileLayer.DeepZoom")
    @js.native
    class DeepZoom protected ()
      extends typingsSlinky.leaflet.mod.TileLayer_ {
      def this(urlTemplate: String) = this()
      def this(urlTemplate: String, options: DeepZoomOptions) = this()
    }
    
    @js.native
    trait DeepZoomOptions extends StObject {
      
      var height: js.UndefOr[Double] = js.native
      
      var imageFormat: js.UndefOr[String] = js.native
      
      var maxZoom: js.UndefOr[Double] = js.native
      
      var tileSize: js.UndefOr[Double] = js.native
      
      var width: js.UndefOr[Double] = js.native
    }
    object DeepZoomOptions {
      
      @scala.inline
      def apply(): DeepZoomOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DeepZoomOptions]
      }
      
      @scala.inline
      implicit class DeepZoomOptionsMutableBuilder[Self <: DeepZoomOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setImageFormat(value: String): Self = StObject.set(x, "imageFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageFormatUndefined: Self = StObject.set(x, "imageFormat", js.undefined)
        
        @scala.inline
        def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
        
        @scala.inline
        def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
  }
  
  object tileLayer {
    
    @JSImport("leaflet", "tileLayer.deepzoom")
    @js.native
    def deepzoom(urlTemplate: String): DeepZoom = js.native
    @JSImport("leaflet", "tileLayer.deepzoom")
    @js.native
    def deepzoom(urlTemplate: String, options: DeepZoomOptions): DeepZoom = js.native
  }
}
