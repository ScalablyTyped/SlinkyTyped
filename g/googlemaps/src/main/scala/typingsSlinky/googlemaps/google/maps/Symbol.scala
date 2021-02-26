package typingsSlinky.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a symbol, which consists of a vector path with styling. A symbol
  * can be used as the icon of a marker, or placed on a polyline.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol Maps JavaScript API}
  */
@js.native
trait Symbol extends StObject {
  
  /**
    * The position of the symbol relative to the marker or polyline. The
    * coordinates of the symbol's path are translated left and up by the
    * anchor's x and y coordinates respectively. The position is expressed in
    * the same coordinate system as the symbol's path.
    * @default new google.maps.Point(0, 0)
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.anchor Maps JavaScript API}
    */
  var anchor: js.UndefOr[Point] = js.native
  
  /**
    * The symbol's fill color. All CSS3 colors are supported except for
    * extended named colors. For symbol markers, this defaults to 'black'.
    * For symbols on polylines, this defaults to the stroke color of the
    * corresponding polyline.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.fillColor Maps JavaScript API}
    */
  var fillColor: js.UndefOr[String] = js.native
  
  /**
    * The symbol's fill opacity.
    * @default 1
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.fillOpacity Maps JavaScript API}
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  
  /**
    * The origin of the label relative to the origin of the path, if label is
    * supplied by the marker. The origin is expressed in the same coordinate
    * system as the symbol's path. This property is unused for symbols on
    * polylines.
    * @default new google.maps.Point(0, 0)
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.labelOrigin Maps JavaScript API}
    */
  var labelOrigin: js.UndefOr[Point] = js.native
  
  /**
    * The symbol's path, which is a built-in symbol path, or a custom path
    * expressed using
    * {@link http://www.w3.org/TR/SVG/paths.html#PathData SVG path notation}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.path Maps JavaScript API}
    */
  var path: SymbolPath | String = js.native
  
  /**
    * The angle by which to rotate the symbol, expressed clockwise in degrees.
    * A symbol in an {@link IconSequence} where
    * {@link IconSequence#fixedRotation fixedRotation} is false is rotated
    * relative to the angle of the edge on which it lies.
    * @default 0
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.rotation Maps JavaScript API}
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * The amount by which the symbol is scaled in size. For symbol markers,
    * this defaults to 1; after scaling, the symbol may be of any size. For
    * symbols on a polyline, this defaults to the stroke weight of the
    * polyline; after scaling, the symbol must lie inside a square 22 pixels in
    * size centered at the symbol's anchor.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.scale Maps JavaScript API}
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * The symbol's stroke color. All CSS3 colors are supported except for
    * extended named colors. For symbol markers, this defaults to 'black'. For
    * symbols on a polyline, this defaults to the stroke color of the polyline.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.strokeColor Maps JavaScript API}
    */
  var strokeColor: js.UndefOr[String] = js.native
  
  /**
    * The symbol's stroke opacity. For symbol markers, this defaults to 1. For
    * symbols on a polyline, this defaults to the stroke opacity of the
    * polyline.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.strokeOpacity Maps JavaScript API}
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
  
  /**
    * The symbol's stroke weight. Defaults to the scale of the symbol.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.strokeWeight Maps JavaScript API}
    */
  var strokeWeight: js.UndefOr[Double] = js.native
}
object Symbol {
  
  @scala.inline
  def apply(path: SymbolPath | String): Symbol = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  
  @scala.inline
  implicit class SymbolMutableBuilder[Self <: Symbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setLabelOrigin(value: Point): Self = StObject.set(x, "labelOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelOriginUndefined: Self = StObject.set(x, "labelOrigin", js.undefined)
    
    @scala.inline
    def setPath(value: SymbolPath | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
  }
}
