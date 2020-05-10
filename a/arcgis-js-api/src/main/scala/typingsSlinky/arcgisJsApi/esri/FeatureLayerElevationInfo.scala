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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerElevationInfo extends Object {
  /**
    * This object contains information about setting a custom z-value on the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo)
    */
  var featureExpressionInfo: js.UndefOr[FeatureLayerElevationInfoFeatureExpressionInfo] = js.native
  /**
    * Defines how the feature is placed with respect to the terrain surface or 3D objects in the scene. If the geometry consists of multiple points (e.g. lines or polygons), the elevation is evaluated separately for each point. See the table below for a list of possible values.  ![elevation-info](https://developers.arcgis.com/javascript/assets/img/apiref/layers/elevation-info.png)
    *
    * Mode | Description
    * ------|------------
    * on-the-ground | Features are aligned to the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html). If the scene contains an [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html), then features are aligned to the [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html). If features have z-values, then the z-values are ignored in this mode. Features with 2D symbols are draped on the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) or [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html). This is the default mode for layers without z-values containing [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) features or [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) features rendered with [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).
    * absolute-height | Features are placed at an absolute elevation (z-value) above sea level. This z-value is determined by the geometry's z-value (if present). If `featureExpressionInfo` is defined, the result of the expression is used instead of the geometry’s z-value. This mode doesn't take the elevation of the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) or any other layers into account. This is the default value of features with any geometry type where [hasZ](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#hasZ) is `true`.
    * relative-to-ground | Features are placed at an elevation relative to the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) or [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html). The feature's elevation is determined by summing up the elevation of the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) or [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html) and the geometry's z-value (if present). If `featureExpressionInfo` is defined, the result of the expression is used instead of the geometry’s z-value. If the geometries don't have z-values, `relative-to-ground` is the default value for [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries rendered with [IconSymbol3DLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html).
    * relative-to-scene | Features are aligned to [extruded polygons](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html), 3D Object [SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) or [BuildingSceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html), depending on which one has higher elevation. If the feature is not directly above a building or any other feature, it is aligned to the elevation of the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) or the [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html). If present, the geometry's z-value is added to the elevation. If `featureExpressionInfo` is defined, the result of the expression is used instead of the geometry’s z-value.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo)
    */
  var mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene` = js.native
  /**
    * An elevation offset, which is added to the vertical position of the feature. If `unit` is not defined, the offset is in `meters`. When `mode = "on-the-ground"`, this property has no effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo)
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The unit for `featureExpressionInfo` and `offset` values. It doesn't apply to z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo)
    */
  var unit: js.UndefOr[feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards] = js.native
}

object FeatureLayerElevationInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureLayerElevationInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureLayerElevationInfo]
  }
  @scala.inline
  implicit class FeatureLayerElevationInfoOps[Self <: FeatureLayerElevationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatureExpressionInfo(value: FeatureLayerElevationInfoFeatureExpressionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureExpressionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureExpressionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureExpressionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

