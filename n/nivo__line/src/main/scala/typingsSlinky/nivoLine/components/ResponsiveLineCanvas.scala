package typingsSlinky.nivoLine.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoLine.mod.DataFormatter
import typingsSlinky.nivoLine.mod.Layer
import typingsSlinky.nivoLine.mod.LineCanvasProps
import typingsSlinky.nivoLine.mod.LineSerieData
import typingsSlinky.nivoLine.mod.LineSliceData
import typingsSlinky.nivoLine.mod.LineTooltipProps
import typingsSlinky.nivoLine.mod.LineValue
import typingsSlinky.nivoLine.mod.TooltipFormatter
import typingsSlinky.nivoLine.nivoLineBooleans.`false`
import typingsSlinky.nivoLine.nivoLineStrings.linear
import typingsSlinky.nivoLine.nivoLineStrings.monotoneX
import typingsSlinky.nivoLine.nivoLineStrings.monotoneY
import typingsSlinky.nivoLine.nivoLineStrings.natural
import typingsSlinky.nivoLine.nivoLineStrings.step
import typingsSlinky.nivoLine.nivoLineStrings.stepAfter
import typingsSlinky.nivoLine.nivoLineStrings.stepBefore
import typingsSlinky.nivoLine.nivoLineStrings.x
import typingsSlinky.nivoLine.nivoLineStrings.y
import typingsSlinky.nivoScales.mod.Scale
import typingsSlinky.nivoTooltip.mod.CrosshairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveLineCanvas {
  @JSImport("@nivo/line", "ResponsiveLineCanvas")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoLine.mod.ResponsiveLineCanvas] {
    @scala.inline
    def areaBaselineValueDate(value: js.Date): this.type = set("areaBaselineValue", value.asInstanceOf[js.Any])
    @scala.inline
    def areaBaselineValue(value: LineValue): this.type = set("areaBaselineValue", value.asInstanceOf[js.Any])
    @scala.inline
    def areaOpacity(value: Double): this.type = set("areaOpacity", value.asInstanceOf[js.Any])
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
    def colorsFunction1(value: _ => String): this.type = set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def colors(value: OrdinalColorsInstruction[_]): this.type = set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def crosshairType(value: CrosshairType): this.type = set("crosshairType", value.asInstanceOf[js.Any])
    @scala.inline
    def curve(value: linear | monotoneX | monotoneY | natural | stepBefore | step | stepAfter): this.type = set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def debugMesh(value: Boolean): this.type = set("debugMesh", value.asInstanceOf[js.Any])
    @scala.inline
    def debugSlices(value: Boolean): this.type = set("debugSlices", value.asInstanceOf[js.Any])
    @scala.inline
    def enableArea(value: Boolean): this.type = set("enableArea", value.asInstanceOf[js.Any])
    @scala.inline
    def enableCrosshair(value: Boolean): this.type = set("enableCrosshair", value.asInstanceOf[js.Any])
    @scala.inline
    def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    @scala.inline
    def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    @scala.inline
    def enablePoints(value: Boolean): this.type = set("enablePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def enableSlices(value: x | y | `false`): this.type = set("enableSlices", value.asInstanceOf[js.Any])
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def layers(value: js.Array[Layer]): this.type = set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def lineWidth(value: Double): this.type = set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def markers(value: js.Array[CartesianMarkerProps]): this.type = set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def pointBorderColor(value: js.Any): this.type = set("pointBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def pointBorderWidth(value: Double): this.type = set("pointBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def pointColor(value: js.Any): this.type = set("pointColor", value.asInstanceOf[js.Any])
    @scala.inline
    def pointSize(value: Double): this.type = set("pointSize", value.asInstanceOf[js.Any])
    @scala.inline
    def sliceTooltip(value: /* data */ LineSliceData => TagMod[Any]): this.type = set("sliceTooltip", js.Any.fromFunction1(value))
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: ReactComponentClass[LineTooltipProps]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipFormatFunction1(value: /* value */ LineValue => TagMod[Any]): this.type = set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def tooltipFormat(value: TooltipFormatter | String): this.type = set("tooltipFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def xFormatFunction1(value: /* value */ LineValue => String | Double): this.type = set("xFormat", js.Any.fromFunction1(value))
    @scala.inline
    def xFormat(value: String | DataFormatter): this.type = set("xFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def xScale(value: Scale): this.type = set("xScale", value.asInstanceOf[js.Any])
    @scala.inline
    def yFormatFunction1(value: /* value */ LineValue => String | Double): this.type = set("yFormat", js.Any.fromFunction1(value))
    @scala.inline
    def yFormat(value: String | DataFormatter): this.type = set("yFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def yScale(value: Scale): this.type = set("yScale", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineCanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[LineSerieData]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineCanvasProps]))
  }
}

