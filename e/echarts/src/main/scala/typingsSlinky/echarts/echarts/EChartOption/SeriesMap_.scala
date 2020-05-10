package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.AnonAnimationAnimationDelay
import typingsSlinky.echarts.AnonAreaColorEmphasis
import typingsSlinky.echarts.AnonBorderWidth
import typingsSlinky.echarts.AnonExtraCssText
import typingsSlinky.echarts.AnonMin
import typingsSlinky.echarts.AnonPrecision
import typingsSlinky.echarts.AnonSymbolSize
import typingsSlinky.echarts.echarts.EChartOption.SeriesMap.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Map.**
  *
  * Map is maily used in the visulization of geographic area data, which
  * can be used with
  * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
  * component to visualize the datas such as population distribution
  * density in diffrent areas.
  *
  * Series of same
  * [map type](https://echarts.apache.org/en/option.html#series-map.map)
  * will show in one map.
  * At this point, the configuration of the first series will be used
  * for the map configuration.
  *
  * **Example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-map)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-map
  */
@js.native
trait SeriesMap_ extends js.Object {
  /**
    * Used to scale aspect of geo.
    *
    * The final aspect is calculated by: `geoBoundingRect.width
    * / geoBoundingRect.height * aspectScale`.
    *
    *
    * @default
    * 0.75
    * @see https://echarts.apache.org/en/option.html#series-map.aspectScale
    */
  var aspectScale: js.UndefOr[Double] = js.native
  /**
    * Distance between component and the bottom side of the container.
    *
    * `bottom` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-map.bottom
    */
  var bottom: js.UndefOr[Double | String] = js.native
  /**
    * Two dimension array.
    * Define coord of left-top, right-bottom in layout box.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.boundingCoords
    */
  var boundingCoords: js.UndefOr[js.Array[_]] = js.native
  /**
    * Center of current view-port, in longitude and latitude.
    *
    * Example:
    *
    * ```
    * center: [115.97, 29.71]
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.center
    */
  var center: js.UndefOr[js.Array[_]] = js.native
  /**
    * Data array of map series, which can be a single data value, like:
    *
    * ```
    * [12, 34, 56, 10, 23]
    *
    * ```
    *
    * Or, if need extra dimensions for components like
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * to map to graphic attributes like color, it can also be in the
    * form of array. For example:
    *
    * ```
    * [[12, 14], [34, 50], [56, 30], [10, 15], [23, 10]]
    *
    * ```
    *
    * In this case, we can assgin the second value in each arrary item
    * to
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * component.
    *
    * More likely, we need to assign name to each data item, in which
    * case each item should be an object:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    * Each data item can be further custerized:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.data
    */
  var data: js.UndefOr[js.Array[Double | DataObject]] = js.native
  /**
    * If
    * [series.data](https://echarts.apache.org/en/option.html#series.data)
    * is not specified, and
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * exists, the series will use `dataset`.
    * `datasetIndex` specifies which dataset will be used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.datasetIndex
    */
  var datasetIndex: js.UndefOr[Double] = js.native
  /**
    * In default case, map series create exclusive `geo` component
    * for themselves.
    * But `geoIndex` can be used to specify an outer
    * [geo component](https://echarts.apache.org/en/option.html#geo)
    * , which can be shared with other series like
    * [pie](https://echarts.apache.org/en/option.html#series-pie)
    * . Moreover, the region color of the outer
    * [geo component](https://echarts.apache.org/en/option.html#geo)
    * can be controlled by the map series (via
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * ).
    *
    * When `geoIndex` specified,
    * [series-map.map](https://echarts.apache.org/en/option.html#series-map.map)
    * other style configurations like
    * [series-map.itemStyle](https://echarts.apache.org/en/option.html#series-map.itemStyle)
    * will not work, but cooresponding configurations in
    * [geo component](https://echarts.apache.org/en/option.html#geo)
    * will be used.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Graphic style of Map Area Border, `emphasis` is the style when
    * it is highlighted, like being hovered by mouse, or highlighted
    * via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.itemStyle
    */
  var itemStyle: js.UndefOr[AnonAreaColorEmphasis] = js.native
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.label
    */
  var label: js.UndefOr[AnonBorderWidth] = js.native
  /**
    * `layoutCenter` and `layoutSize` provides layout strategy other
    * than `left/right/top/bottom/width/height`.
    *
    * When using `left/right/top/bottom/width/height`, it is hard to
    * put the map inside a box area with a fixed width-height ratio.
    * In this case, `layoutCenter` attribute can be used to define
    * the center position of map, and `layoutSize` can be used to define
    * the size of map. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    * After setting these two values, `left/right/top/bottom/width/height`
    * becomes invalid.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.layoutCenter
    */
  var layoutCenter: js.UndefOr[js.Array[_]] = js.native
  /**
    * Size of map, see `layoutCenter` for more information.
    * Percentage relative to screen width, and absolute pixel values
    * are supported.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.layoutSize
    */
  var layoutSize: js.UndefOr[Double | String] = js.native
  /**
    * Distance between component and the left side of the container.
    *
    * `left` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`;
    * and it can also be `'left'`, `'center'`, or `'right'`.
    *
    * If the `left` value is set to be `'left'`, `'center'`, or `'right'`,
    * then the component will be aligned automatically based on position.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-map.left
    */
  var left: js.UndefOr[Double | String] = js.native
  /**
    * Map charts.
    *
    * Due to the increase of fineness of map, ECharts 3 doesn't include
    * map data by default for package size consideration.
    * You may find map files you need on
    * [map download page](http://ecomfe.github.io/echarts-builder-web/map3.html
    * )
    * and then include and register them in ECharts.
    *
    * Two formats of map data are provided in ECharts, one of which
    * can be included in `<script>` tag as JavaScript file, and the
    * other of is in JSON format and should be loaded using AJAX.
    * Map name and data will be loaded automatically once the JavaScript
    * file is loaded, while in the JSON form, you have to assign name
    * explicitly.
    *
    * Here are examples of these two types:
    *
    * **JavaScript importing example**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    * **JSON importing example**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-map.map)
    *
    * ECharts uses
    * [geoJSON](http://geojson.org/)
    * format as map outline.
    * Besides the methods introduced above, you can also get
    * [geoJSON](http://geojson.org/)
    * data through in other methods if you like and register it in
    * ECharts. Reference to
    * [USA Population Estimates](https://echarts.apache.org/examples/en/editor.html?c=map-usa)
    * for more information.
    *
    *
    * @default
    * ''
    * @see https://echarts.apache.org/en/option.html#series-map.map
    */
  var map: js.UndefOr[String] = js.native
  /**
    * Value of multiple series with the same
    * [map type](https://echarts.apache.org/en/option.html#series-map.map)
    * can use this option to get a statistical value.
    *
    * Supported statistical methods:
    *
    * + `'sum'`
    * + `'average'`
    * + `'max'`
    * + `'min'`
    *
    *
    * @default
    * "sum"
    * @see https://echarts.apache.org/en/option.html#series-map.mapValueCalculation
    */
  var mapValueCalculation: js.UndefOr[String] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markArea
    */
  var markArea: js.UndefOr[AnonAnimationAnimationDelay] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markLine
    */
  var markLine: js.UndefOr[AnonPrecision] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.markPoint
    */
  var markPoint: js.UndefOr[AnonSymbolSize] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Name mapping for customized areas. For example:
    *
    * ```
    * {
    * 'China' : '中国'
    * }
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.nameMap
    */
  var nameMap: js.UndefOr[js.Object] = js.native
  /**
    * Distance between component and the right side of the container.
    *
    * `right` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`.
    *
    * Adaptive by default.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-map.right
    */
  var right: js.UndefOr[Double | String] = js.native
  /**
    * Whether to enable mouse zooming and translating.
    * `false` by default.
    * If either zooming or translating is wanted, it can be set to
    * `'scale'` or `'move'`.
    * Otherwise, set it to be `true` to enable both.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.roam
    */
  var roam: js.UndefOr[Boolean | String] = js.native
  /**
    * Limit of scaling, with `min` and `max`. `1` by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.scaleLimit
    */
  var scaleLimit: js.UndefOr[AnonMin] = js.native
  /**
    * Selected mode decides whether multiple selecting is supported.
    * By default, `false` is used for disabling selection.
    * Its value can also be `'single'` for selecting single area, or
    * `'multiple'` for selecting multiple areas.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.selectedMode
    */
  var selectedMode: js.UndefOr[Boolean | String] = js.native
  /**
    * When
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * is used, `seriesLayoutBy` specifies whether the column or the
    * row of `dataset` is mapped to the series, namely, the series
    * is "layout" on columns or rows. Optional values:
    *
    * + 'column': by default, the columns of `dataset` are mapped the
    * series. In this case, each column represents a dimension.
    * + 'row'：the rows of `dataset` are mapped to the series.
    * In this case, each row represents a dimension.
    *
    * Check this
    * [example](https://echarts.apache.org/examples/en/editor.html?c=dataset-series-layout-by)
    * .
    *
    *
    * @default
    * "column"
    * @see https://echarts.apache.org/en/option.html#series-map.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[String] = js.native
  /**
    * Show the symbol in related area (dot of series symbol).
    * Available when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * component exists.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.showLegendSymbol
    */
  var showLegendSymbol: js.UndefOr[Boolean] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.native
  /**
    * Distance between component and the top side of the container.
    *
    * `top` value can be instant pixel value like `20`; it can also
    * be percentage value relative to container width like `'20%'`;
    * and it can also be `'top'`, `'middle'`, or `'bottom'`.
    *
    * If the `left` value is set to be `'top'`, `'middle'`, or `'bottom'`,
    * then the component will be aligned automatically based on position.
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-map.top
    */
  var top: js.UndefOr[Double | String] = js.native
  /**
    * @default
    * "map"
    * @see https://echarts.apache.org/en/option.html#series-map.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * `z` value of all graghical elements in , which controls order
    * of drawing graphical components.
    * Components with smaller `z` values may be overwritten by those
    * with larger `z` values.
    *
    * `z` has a lower priority to `zlevel`, and will not create new
    * Canvas.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-map.z
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * `zlevel` value of all graghical elements in .
    *
    * `zlevel` is used to make layers with Canvas.
    * Graphical elements with different `zlevel` values will be placed
    * in different Canvases, which is a common optimization technique.
    * We can put those frequently changed elements (like those with
    * animations) to a seperate `zlevel`.
    * Notice that too many Canvases will increase memory cost, and
    * should be used carefully on mobile phones to avoid crash.
    *
    * Canvases with bigger `zlevel` will be placed on Canvases with
    * smaller `zlevel`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
  /**
    * Zoom rate of current view-port.
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-map.zoom
    */
  var zoom: js.UndefOr[Double] = js.native
}

object SeriesMap_ {
  @scala.inline
  def apply(): SeriesMap_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesMap_]
  }
  @scala.inline
  implicit class SeriesMap_Ops[Self <: SeriesMap_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectScale")(js.undefined)
        ret
    }
    @scala.inline
    def withBottom(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundingCoords(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingCoords")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[Double | DataObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withItemStyle(value: AnonAreaColorEmphasis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: AnonBorderWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutCenter(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withMapValueCalculation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapValueCalculation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapValueCalculation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapValueCalculation")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkArea(value: AnonAnimationAnimationDelay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markArea")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkLine(value: AnonPrecision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markLine")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkPoint(value: AnonSymbolSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameMap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameMap")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withRoam(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roam")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleLimit(value: AnonMin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedMode(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesLayoutBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesLayoutBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesLayoutBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesLayoutBy")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLegendSymbol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegendSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLegendSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLegendSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: AnonExtraCssText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
    @scala.inline
    def withZlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZlevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

