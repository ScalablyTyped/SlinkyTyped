package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendViewModelProperties extends js.Object {
  /**
    * Collection of [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) objects used by the legend view to display data in the legend. Use this property to hide or display the layer's symbols in the legend when an [ActiveLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html) is removed from or added to this collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#activeLayerInfos)
    */
  var activeLayerInfos: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.native
  /**
    * Indicates whether to show the [Basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html) layers in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#basemapLegendVisible)
    *
    * @default filterBasemaps
    */
  var basemapLegendVisible: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a subset of the layers in the map to display in the legend. If this property is not set, all operational layers in the map will display in the legend. This property can be used to control layer display order in the legend. Objects in this array are defined with the properties listed below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LegendViewModelLayerInfos]] = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object LegendViewModelProperties {
  @scala.inline
  def apply(): LegendViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendViewModelProperties]
  }
  @scala.inline
  implicit class LegendViewModelPropertiesOps[Self <: LegendViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveLayerInfos(value: CollectionProperties[ActiveLayerInfoProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLayerInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveLayerInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLayerInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withBasemapLegendVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapLegendVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasemapLegendVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basemapLegendVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerInfos(value: js.Array[LegendViewModelLayerInfos]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: MapViewProperties | SceneViewProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

