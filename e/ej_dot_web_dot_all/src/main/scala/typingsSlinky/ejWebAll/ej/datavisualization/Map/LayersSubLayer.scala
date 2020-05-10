package typingsSlinky.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersSubLayer extends js.Object {
  /** to get the type of bing map.
    * @Default {aerial}
    */
  var bingMapType: js.UndefOr[BingMapType | String] = js.native
  /** Specifies the bubble settings for map
    */
  var bubbleSettings: js.UndefOr[LayersSubLayersBubbleSettings] = js.native
  /** Specifies the datasource for the shape layer
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Enables or disables the shape mouse hover
    * @Default {false}
    */
  var enableMouseHover: js.UndefOr[Boolean] = js.native
  /** Enables or disables the shape selection
    * @Default {true}
    */
  var enableSelection: js.UndefOr[Boolean] = js.native
  /** Specifies the map view type.
    * @Default {'geographic'}
    */
  var geometryType: js.UndefOr[GeometryType | String] = js.native
  /** to get the key of bing map
    * @Default {null}
    */
  var key: js.UndefOr[String] = js.native
  /** Options for enabling and configuring labelSettings labelPath, smartLabelSize, labelLength etc.,
    */
  var labelSettings: js.UndefOr[LayersSubLayersLabelSettings] = js.native
  /** Specifies the map type.
    * @Default {'geometry'}
    */
  var layerType: js.UndefOr[LayerType | String] = js.native
  /** Options for enabling and configuring legendSettings position, height, width, mode, type etc.,
    */
  var legendSettings: js.UndefOr[LayersSubLayersLegendSettings] = js.native
  /** Specifies the map items template for shapes.
    */
  var mapItemsTemplate: js.UndefOr[String] = js.native
  /** Specifies the map marker template for map layer.
    * @Default {null}
    */
  var markerTemplate: js.UndefOr[String] = js.native
  /** Specify markers for shape layer.
    */
  var markers: js.UndefOr[js.Array[_]] = js.native
  /** Specify selectedMapShapes for shape layer
    * @Default {[]}
    */
  var selectedMapShapes: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the selection mode of the map. Accepted selection mode values are Default and Multiple.
    * @Default {default}
    */
  var selectionMode: js.UndefOr[SelectionMode | String] = js.native
  /** Specifies the shape data for the shape layer
    */
  var shapeData: js.UndefOr[js.Any] = js.native
  /** Specifies the data path of shape
    */
  var shapeDataPath: js.UndefOr[String] = js.native
  /** Specifies the data path of shape
    */
  var shapePropertyPath: js.UndefOr[String] = js.native
  /** Specifies the shape settings of map layer
    */
  var shapeSettings: js.UndefOr[LayersSubLayersShapeSettings] = js.native
  /** Shows or hides the map items.
    * @Default {false}
    */
  var showMapItems: js.UndefOr[Boolean] = js.native
  /** Shows or hides the tooltip for shapes
    * @Default {false}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies the tooltip template for shapes.
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the URL template for the OSM type map.
    * @Default {'http://a.tile.openstreetmap.org/level/tileX/tileY.png'}
    */
  var urlTemplate: js.UndefOr[String] = js.native
}

object LayersSubLayer {
  @scala.inline
  def apply(): LayersSubLayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersSubLayer]
  }
  @scala.inline
  implicit class LayersSubLayerOps[Self <: LayersSubLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBingMapType(value: BingMapType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bingMapType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBingMapType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bingMapType")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleSettings(value: LayersSubLayersBubbleSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMouseHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMouseHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseHover")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryType(value: GeometryType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryType")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelSettings(value: LayersSubLayersLabelSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerType(value: LayerType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerType")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendSettings(value: LayersSubLayersLegendSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withMapItemsTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapItemsTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapItemsTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapItemsTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedMapShapes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMapShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedMapShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMapShapes")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: SelectionMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeData")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeDataPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeDataPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeDataPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeDataPath")(js.undefined)
        ret
    }
    @scala.inline
    def withShapePropertyPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapePropertyPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapePropertyPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapePropertyPath")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeSettings(value: LayersSubLayersShapeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMapItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMapItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMapItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMapItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTemplate")(js.undefined)
        ret
    }
  }
  
}

