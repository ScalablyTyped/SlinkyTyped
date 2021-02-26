package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.capture
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.live
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordinateConversionViewModelProperties extends GoToProperties {
  
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Conversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html) that the widget is currently displaying.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#conversions)
    */
  var conversions: js.UndefOr[CollectionProperties[ConversionProperties]] = js.native
  
  /**
    * Describes the location of the coordinates currently displayed by the widget as a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#currentLocation)
    */
  var currentLocation: js.UndefOr[PointProperties] = js.native
  
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) containing every [Format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html) that the widget is capable of displaying.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#formats)
    */
  var formats: js.UndefOr[CollectionProperties[FormatProperties]] = js.native
  
  /**
    * This symbol is used to visualize the location currently described by the widget when `capture` mode is active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#locationSymbol)
    */
  var locationSymbol: js.UndefOr[SimpleMarkerSymbolProperties | PictureMarkerSymbolProperties] = js.native
  
  /**
    * Describes the current mode of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#mode)
    */
  var mode: js.UndefOr[live | capture] = js.native
  
  /**
    * The number of milliseconds of delay before conversion requests will be sent to the [GeometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#requestDelay)
    */
  var requestDelay: js.UndefOr[Double] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-CoordinateConversionViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}
object CoordinateConversionViewModelProperties {
  
  @scala.inline
  def apply(): CoordinateConversionViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordinateConversionViewModelProperties]
  }
  
  @scala.inline
  implicit class CoordinateConversionViewModelPropertiesMutableBuilder[Self <: CoordinateConversionViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversions(value: CollectionProperties[ConversionProperties]): Self = StObject.set(x, "conversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionsUndefined: Self = StObject.set(x, "conversions", js.undefined)
    
    @scala.inline
    def setConversionsVarargs(value: ConversionProperties*): Self = StObject.set(x, "conversions", js.Array(value :_*))
    
    @scala.inline
    def setCurrentLocation(value: PointProperties): Self = StObject.set(x, "currentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentLocationUndefined: Self = StObject.set(x, "currentLocation", js.undefined)
    
    @scala.inline
    def setFormats(value: CollectionProperties[FormatProperties]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setFormatsVarargs(value: FormatProperties*): Self = StObject.set(x, "formats", js.Array(value :_*))
    
    @scala.inline
    def setLocationSymbol(value: SimpleMarkerSymbolProperties | PictureMarkerSymbolProperties): Self = StObject.set(x, "locationSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationSymbolUndefined: Self = StObject.set(x, "locationSymbol", js.undefined)
    
    @scala.inline
    def setMode(value: live | capture): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setRequestDelay(value: Double): Self = StObject.set(x, "requestDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestDelayUndefined: Self = StObject.set(x, "requestDelay", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
