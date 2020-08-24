package typingsSlinky.nivoHeatmap.components

import org.scalajs.dom.raw.HTMLCanvasElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.canvas.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoColors.mod.InheritedColorProp
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.Colors
import typingsSlinky.nivoCore.mod.Dimensions
import typingsSlinky.nivoCore.mod.GetColor
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoHeatmap.mod.HeatMapCanvasProps
import typingsSlinky.nivoHeatmap.mod.HeatMapDatum
import typingsSlinky.nivoHeatmap.mod.HeatMapDatumWithColor
import typingsSlinky.nivoHeatmap.mod.IndexByFunc
import typingsSlinky.nivoHeatmap.mod.NodeData
import typingsSlinky.nivoHeatmap.mod.ValueFormatter
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.auto
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.cell
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.circle
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.column
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.rect
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.row
import typingsSlinky.nivoHeatmap.nivoHeatmapStrings.rowColumn
import typingsSlinky.nivoTooltip.mod.BasicTooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeatMapCanvas {
  @JSImport("@nivo/heatmap", "HeatMapCanvas")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoHeatmap.mod.HeatMapCanvas] {
    @scala.inline
    def axisBottom(value: AxisProps): this.type = set("axisBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def axisBottomNull: this.type = set("axisBottom", null)
    @scala.inline
    def axisLeft(value: AxisProps): this.type = set("axisLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def axisLeftNull: this.type = set("axisLeft", null)
    @scala.inline
    def axisRight(value: AxisProps): this.type = set("axisRight", value.asInstanceOf[js.Any])
    @scala.inline
    def axisRightNull: this.type = set("axisRight", null)
    @scala.inline
    def axisTop(value: AxisProps): this.type = set("axisTop", value.asInstanceOf[js.Any])
    @scala.inline
    def axisTopNull: this.type = set("axisTop", null)
    @scala.inline
    def cellBorderColorFunction1(value: HeatMapDatumWithColor => String): this.type = set("cellBorderColor", js.Any.fromFunction1(value))
    @scala.inline
    def cellBorderColor(value: InheritedColorProp[HeatMapDatumWithColor]): this.type = set("cellBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def cellBorderWidth(value: Double): this.type = set("cellBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def cellHoverOpacity(value: Double): this.type = set("cellHoverOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def cellHoverOthersOpacity(value: Double): this.type = set("cellHoverOthersOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def cellOpacity(value: Double): this.type = set("cellOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def cellShapeFunctionComponent(value: ReactComponentClass[_]): this.type = set("cellShape", value.asInstanceOf[js.Any])
    @scala.inline
    def cellShape(value: rect | circle | ReactComponentClass[_]): this.type = set("cellShape", value.asInstanceOf[js.Any])
    @scala.inline
    def colorByFunction1(value: HeatMapDatum => String): this.type = set("colorBy", js.Any.fromFunction1(value))
    @scala.inline
    def colorBy(value: String | GetColor[HeatMapDatum]): this.type = set("colorBy", value.asInstanceOf[js.Any])
    @scala.inline
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    @scala.inline
    def colors(value: Colors): this.type = set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    @scala.inline
    def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    @scala.inline
    def enableLabels(value: Boolean): this.type = set("enableLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def forceSquare(value: Boolean): this.type = set("forceSquare", value.asInstanceOf[js.Any])
    @scala.inline
    def hoverTarget(value: cell | row | column | rowColumn): this.type = set("hoverTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def indexByFunction1(value: /* datum */ HeatMapDatum => String | Double): this.type = set("indexBy", js.Any.fromFunction1(value))
    @scala.inline
    def indexBy(value: String | IndexByFunc): this.type = set("indexBy", value.asInstanceOf[js.Any])
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def keysVarargs(value: String*): this.type = set("keys", js.Array(value :_*))
    @scala.inline
    def keys(value: js.Array[String]): this.type = set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def labelTextColorFunction1(value: HeatMapDatumWithColor => String): this.type = set("labelTextColor", js.Any.fromFunction1(value))
    @scala.inline
    def labelTextColor(value: InheritedColorProp[HeatMapDatumWithColor]): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def maxValue(value: Double | auto): this.type = set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def minValue(value: Double | auto): this.type = set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* datum */ NodeData, /* event */ SyntheticMouseEvent[HTMLCanvasElement]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def sizeVariation(value: Double): this.type = set("sizeVariation", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: ReactComponentClass[BasicTooltipProps with NodeData]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipFormatFunction1(value: /* value */ Double => String | Double): this.type = set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def tooltipFormat(value: String | ValueFormatter): this.type = set("tooltipFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HeatMapCanvasProps with Dimensions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[HeatMapDatum], height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HeatMapCanvasProps with Dimensions]))
  }
}

