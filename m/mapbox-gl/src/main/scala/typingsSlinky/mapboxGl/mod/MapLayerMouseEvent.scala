package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.mapboxGl.mapboxGlStrings.click
import typingsSlinky.mapboxGl.mapboxGlStrings.contextmenu
import typingsSlinky.mapboxGl.mapboxGlStrings.dblclick
import typingsSlinky.mapboxGl.mapboxGlStrings.mousedown
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseenter
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseleave
import typingsSlinky.mapboxGl.mapboxGlStrings.mousemove
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseout
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseover
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mapbox-gl.mapbox-gl.MapMouseEvent & {  features :std.Array<mapbox-gl.mapbox-gl.MapboxGeoJSONFeature> | undefined} */
@js.native
trait MapLayerMouseEvent extends StObject {
  
  var defaultPrevented: Boolean = js.native
  
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.native
  
  var lngLat: LngLat = js.native
  
  var originalEvent: MouseEvent = js.native
  
  var point: Point = js.native
  
  def preventDefault(): Unit = js.native
  
  var target: Map = js.native
  
  var `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu = js.native
}
object MapLayerMouseEvent {
  
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    lngLat: LngLat,
    originalEvent: MouseEvent,
    point: Point,
    preventDefault: () => Unit,
    target: Map,
    `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu
  ): MapLayerMouseEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerMouseEvent]
  }
  
  @scala.inline
  implicit class MapLayerMouseEventMutableBuilder[Self <: MapLayerMouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatures(value: js.Array[MapboxGeoJSONFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: MapboxGeoJSONFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setLngLat(value: LngLat): Self = StObject.set(x, "lngLat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: Map): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
