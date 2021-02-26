package typingsSlinky.reactNativeMaps.mod

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapPolygonProps extends ViewProps {
  
  var coordinates: js.Array[LatLng] = js.native
  
  var fillColor: js.UndefOr[String] = js.native
  
  var geodesic: js.UndefOr[Boolean] = js.native
  
  var holes: js.UndefOr[js.Array[js.Array[LatLng]]] = js.native
  
  var lineCap: js.UndefOr[LineCapType] = js.native
  
  var lineDashPattern: js.UndefOr[js.Array[Double]] = js.native
  
  var lineDashPhase: js.UndefOr[Double] = js.native
  
  var lineJoin: js.UndefOr[LineJoinType] = js.native
  
  var miterLimit: js.UndefOr[Double] = js.native
  
  var onPress: js.UndefOr[
    js.Function1[
      SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate], 
      Unit
    ]
  ] = js.native
  
  var strokeColor: js.UndefOr[String] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
  
  var tappable: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object MapPolygonProps {
  
  @scala.inline
  def apply(coordinates: js.Array[LatLng]): MapPolygonProps = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPolygonProps]
  }
  
  @scala.inline
  implicit class MapPolygonPropsMutableBuilder[Self <: MapPolygonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[LatLng]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: LatLng*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
    
    @scala.inline
    def setHoles(value: js.Array[js.Array[LatLng]]): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolesUndefined: Self = StObject.set(x, "holes", js.undefined)
    
    @scala.inline
    def setHolesVarargs(value: js.Array[LatLng]*): Self = StObject.set(x, "holes", js.Array(value :_*))
    
    @scala.inline
    def setLineCap(value: LineCapType): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    @scala.inline
    def setLineDashPattern(value: js.Array[Double]): Self = StObject.set(x, "lineDashPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashPatternUndefined: Self = StObject.set(x, "lineDashPattern", js.undefined)
    
    @scala.inline
    def setLineDashPatternVarargs(value: Double*): Self = StObject.set(x, "lineDashPattern", js.Array(value :_*))
    
    @scala.inline
    def setLineDashPhase(value: Double): Self = StObject.set(x, "lineDashPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashPhaseUndefined: Self = StObject.set(x, "lineDashPhase", js.undefined)
    
    @scala.inline
    def setLineJoin(value: LineJoinType): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    @scala.inline
    def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
    
    @scala.inline
    def setOnPress(
      value: SyntheticEvent[NodeHandle, js.Object with typingsSlinky.reactNativeMaps.anon.Coordinate] => Unit
    ): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setTappable(value: Boolean): Self = StObject.set(x, "tappable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTappableUndefined: Self = StObject.set(x, "tappable", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
