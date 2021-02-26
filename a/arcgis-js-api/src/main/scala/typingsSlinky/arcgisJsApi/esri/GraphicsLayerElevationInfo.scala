package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`absolute-height`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`on-the-ground`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`relative-to-ground`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`relative-to-scene`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphicsLayerElevationInfo extends Object {
  
  /**
    * This object contains information about setting a custom z-value on the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var featureExpressionInfo: js.UndefOr[GraphicsLayerElevationInfoFeatureExpressionInfo] = js.native
  
  /**
    * Defines how the feature is placed with respect to the terrain surface or 3D objects in the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene` = js.native
  
  /**
    * An elevation offset, which is added to the vertical position of the graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * The unit for `featureExpressionInfo` and `offset` values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
    */
  var unit: js.UndefOr[feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards] = js.native
}
object GraphicsLayerElevationInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GraphicsLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GraphicsLayerElevationInfo]
  }
  
  @scala.inline
  implicit class GraphicsLayerElevationInfoMutableBuilder[Self <: GraphicsLayerElevationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatureExpressionInfo(value: GraphicsLayerElevationInfoFeatureExpressionInfo): Self = StObject.set(x, "featureExpressionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureExpressionInfoUndefined: Self = StObject.set(x, "featureExpressionInfo", js.undefined)
    
    @scala.inline
    def setMode(value: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setUnit(value: feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
