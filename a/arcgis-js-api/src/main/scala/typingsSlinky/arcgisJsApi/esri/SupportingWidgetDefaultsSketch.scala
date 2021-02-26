package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportingWidgetDefaultsSketch extends Object {
  
  /**
    * An object containing the `defaultUpdateOptions` for the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var defaultUpdateOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * The marker symbol used to symbolize any point feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var markerSymbol: js.UndefOr[SimpleMarkerSymbol] = js.native
  
  /**
    * The polygon symbol used to symbolize any polygon feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbol] = js.native
  
  /**
    * The line symbol used to symbolize any line feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polylineSymbol: js.UndefOr[SimpleLineSymbol] = js.native
}
object SupportingWidgetDefaultsSketch {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SupportingWidgetDefaultsSketch = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SupportingWidgetDefaultsSketch]
  }
  
  @scala.inline
  implicit class SupportingWidgetDefaultsSketchMutableBuilder[Self <: SupportingWidgetDefaultsSketch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultUpdateOptions(value: js.Any): Self = StObject.set(x, "defaultUpdateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUpdateOptionsUndefined: Self = StObject.set(x, "defaultUpdateOptions", js.undefined)
    
    @scala.inline
    def setMarkerSymbol(value: SimpleMarkerSymbol): Self = StObject.set(x, "markerSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSymbolUndefined: Self = StObject.set(x, "markerSymbol", js.undefined)
    
    @scala.inline
    def setPolygonSymbol(value: SimpleFillSymbol): Self = StObject.set(x, "polygonSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonSymbolUndefined: Self = StObject.set(x, "polygonSymbol", js.undefined)
    
    @scala.inline
    def setPolylineSymbol(value: SimpleLineSymbol): Self = StObject.set(x, "polylineSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineSymbolUndefined: Self = StObject.set(x, "polylineSymbol", js.undefined)
  }
}
