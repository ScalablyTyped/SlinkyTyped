package typingsSlinky.leafletAreaselect

import typingsSlinky.leaflet.mod.LatLngBounds_
import typingsSlinky.leaflet.mod.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", "areaSelect")
  @js.native
  def areaSelect(box: AreaSelectOptions): AreaSelect_ = js.native
  
  @js.native
  trait AreaSelectOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var keepAspectRatio: js.UndefOr[Boolean] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object AreaSelectOptions {
    
    @scala.inline
    def apply(): AreaSelectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AreaSelectOptions]
    }
    
    @scala.inline
    implicit class AreaSelectOptionsMutableBuilder[Self <: AreaSelectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setKeepAspectRatio(value: Boolean): Self = StObject.set(x, "keepAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAspectRatioUndefined: Self = StObject.set(x, "keepAspectRatio", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait AreaSelect_ extends StObject {
    
    def addTo(map: Map_): Map_ = js.native
    
    def getBounds(): LatLngBounds_ = js.native
    
    def remove(): Unit = js.native
    
    def setDimensions(dim: Dimension): Unit = js.native
  }
  object AreaSelect_ {
    
    @scala.inline
    def apply(
      addTo: Map_ => Map_,
      getBounds: () => LatLngBounds_,
      remove: () => Unit,
      setDimensions: Dimension => Unit
    ): AreaSelect_ = {
      val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction1(addTo), getBounds = js.Any.fromFunction0(getBounds), remove = js.Any.fromFunction0(remove), setDimensions = js.Any.fromFunction1(setDimensions))
      __obj.asInstanceOf[AreaSelect_]
    }
    
    @scala.inline
    implicit class AreaSelect_MutableBuilder[Self <: AreaSelect_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddTo(value: Map_ => Map_): Self = StObject.set(x, "addTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBounds(value: () => LatLngBounds_): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetDimensions(value: Dimension => Unit): Self = StObject.set(x, "setDimensions", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Dimension extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Dimension {
    
    @scala.inline
    def apply(height: Double, width: Double): Dimension = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimension]
    }
    
    @scala.inline
    implicit class DimensionMutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
