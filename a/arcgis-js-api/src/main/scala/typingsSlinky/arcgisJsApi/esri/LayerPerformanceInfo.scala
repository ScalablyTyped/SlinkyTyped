package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class contains performance information like memory usage and number of features for a specific layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html)
  */
@js.native
trait LayerPerformanceInfo extends js.Object {
  /**
    * The number of features displayed in the SceneView. This property is only available for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [point SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#displayedNumberOfFeatures)
    */
  var displayedNumberOfFeatures: Double = js.native
  /**
    * The layer corresponding to the memory usage information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#layer)
    */
  var layer: Layer = js.native
  /**
    * The maximum number of features that can be displayed in the layer.  This number depends on the symbol complexity and [qualityProfile](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#qualityProfile) of the SceneView. If you want to increase it manually, set the [maximumNumberOfFeatures](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#maximumNumberOfFeatures) property. This property is only available for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [point SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: Double = js.native
  /**
    * An estimate of the memory currently in use by the layer, in bytes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#memory)
    */
  var memory: Double = js.native
  /**
    * The total number of features contained in the layer. This property is only available for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [point SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#totalNumberOfFeatures)
    */
  var totalNumberOfFeatures: Double = js.native
}

object LayerPerformanceInfo {
  @scala.inline
  def apply(
    displayedNumberOfFeatures: Double,
    layer: Layer,
    maximumNumberOfFeatures: Double,
    memory: Double,
    totalNumberOfFeatures: Double
  ): LayerPerformanceInfo = {
    val __obj = js.Dynamic.literal(displayedNumberOfFeatures = displayedNumberOfFeatures.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], maximumNumberOfFeatures = maximumNumberOfFeatures.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], totalNumberOfFeatures = totalNumberOfFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPerformanceInfo]
  }
  @scala.inline
  implicit class LayerPerformanceInfoOps[Self <: LayerPerformanceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayedNumberOfFeatures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayedNumberOfFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayer(value: Layer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumNumberOfFeatures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumNumberOfFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalNumberOfFeatures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalNumberOfFeatures")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

