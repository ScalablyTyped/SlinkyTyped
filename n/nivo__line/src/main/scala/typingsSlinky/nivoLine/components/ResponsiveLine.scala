package typingsSlinky.nivoLine.components

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoAxes.mod.GridValues
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.anon.Dictkey
import typingsSlinky.nivoCore.anon.Id
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.DataFormatter
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoLine.anon.ReadonlyPointSymbolProps
import typingsSlinky.nivoLine.anon.XFormatted
import typingsSlinky.nivoLine.mod.AccessorFunc
import typingsSlinky.nivoLine.mod.Datum
import typingsSlinky.nivoLine.mod.DatumValue
import typingsSlinky.nivoLine.mod.Layer
import typingsSlinky.nivoLine.mod.LineSvgProps
import typingsSlinky.nivoLine.mod.Point
import typingsSlinky.nivoLine.mod.PointTooltipProps
import typingsSlinky.nivoLine.mod.Serie
import typingsSlinky.nivoLine.mod.SliceTooltipProps
import typingsSlinky.nivoLine.nivoLineBooleans.`false`
import typingsSlinky.nivoLine.nivoLineStrings.basis
import typingsSlinky.nivoLine.nivoLineStrings.cardinal
import typingsSlinky.nivoLine.nivoLineStrings.catmullRom
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

object ResponsiveLine {
  @JSImport("@nivo/line", "ResponsiveLine")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.nivoLine.mod.ResponsiveLine] {
    @scala.inline
    def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def areaBaselineValueDate(value: js.Date): this.type = set("areaBaselineValue", value.asInstanceOf[js.Any])
    @scala.inline
    def areaBaselineValue(value: DatumValue): this.type = set("areaBaselineValue", value.asInstanceOf[js.Any])
    @scala.inline
    def areaBlendMode(value: String): this.type = set("areaBlendMode", value.asInstanceOf[js.Any])
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
    def colorsVarargs(value: String*): this.type = set("colors", js.Array(value :_*))
    @scala.inline
    def colorsFunction1(value: _ => String): this.type = set("colors", js.Any.fromFunction1(value))
    @scala.inline
    def colors(value: OrdinalColorsInstruction[_]): this.type = set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def crosshairType(value: CrosshairType): this.type = set("crosshairType", value.asInstanceOf[js.Any])
    @scala.inline
    def curve(
      value: basis | cardinal | catmullRom | linear | monotoneX | monotoneY | natural | step | stepAfter | stepBefore
    ): this.type = set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def debugMesh(value: Boolean): this.type = set("debugMesh", value.asInstanceOf[js.Any])
    @scala.inline
    def debugSlices(value: Boolean): this.type = set("debugSlices", value.asInstanceOf[js.Any])
    @scala.inline
    def defsVarargs(value: Dictkey*): this.type = set("defs", js.Array(value :_*))
    @scala.inline
    def defs(value: js.Array[Dictkey]): this.type = set("defs", value.asInstanceOf[js.Any])
    @scala.inline
    def enableArea(value: Boolean): this.type = set("enableArea", value.asInstanceOf[js.Any])
    @scala.inline
    def enableCrosshair(value: Boolean): this.type = set("enableCrosshair", value.asInstanceOf[js.Any])
    @scala.inline
    def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    @scala.inline
    def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    @scala.inline
    def enablePointLabel(value: Boolean): this.type = set("enablePointLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def enablePoints(value: Boolean): this.type = set("enablePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def enableSlices(value: x | y | `false`): this.type = set("enableSlices", value.asInstanceOf[js.Any])
    @scala.inline
    def fillVarargs(value: Id[Datum]*): this.type = set("fill", js.Array(value :_*))
    @scala.inline
    def fill(value: js.Array[Id[Datum]]): this.type = set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def gridXValuesVarargs(value: (js.Date | Double | String)*): this.type = set("gridXValues", js.Array(value :_*))
    @scala.inline
    def gridXValues(value: GridValues[DatumValue]): this.type = set("gridXValues", value.asInstanceOf[js.Any])
    @scala.inline
    def gridYValuesVarargs(value: (js.Date | Double | String)*): this.type = set("gridYValues", js.Array(value :_*))
    @scala.inline
    def gridYValues(value: GridValues[DatumValue]): this.type = set("gridYValues", value.asInstanceOf[js.Any])
    @scala.inline
    def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    @scala.inline
    def layersVarargs(value: Layer*): this.type = set("layers", js.Array(value :_*))
    @scala.inline
    def layers(value: js.Array[Layer]): this.type = set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value :_*))
    @scala.inline
    def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def lineWidth(value: Double): this.type = set("lineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def markersVarargs(value: CartesianMarkerProps*): this.type = set("markers", js.Array(value :_*))
    @scala.inline
    def markers(value: js.Array[CartesianMarkerProps]): this.type = set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def motionDamping(value: Double): this.type = set("motionDamping", value.asInstanceOf[js.Any])
    @scala.inline
    def motionStiffness(value: Double): this.type = set("motionStiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* point */ Point, /* event */ SyntheticMouseEvent[Element]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseEnter(value: (/* point */ Point, /* event */ SyntheticMouseEvent[Element]) => Unit): this.type = set("onMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseLeave(value: (/* point */ Point, /* event */ SyntheticMouseEvent[Element]) => Unit): this.type = set("onMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseMove(value: (/* point */ Point, /* event */ SyntheticMouseEvent[Element]) => Unit): this.type = set("onMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def pointBorderColor(value: js.Any): this.type = set("pointBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def pointBorderWidth(value: Double): this.type = set("pointBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def pointColor(value: js.Any): this.type = set("pointColor", value.asInstanceOf[js.Any])
    @scala.inline
    def pointLabelFunction1(value: /* datum */ XFormatted => String): this.type = set("pointLabel", js.Any.fromFunction1(value))
    @scala.inline
    def pointLabel(value: String | AccessorFunc): this.type = set("pointLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def pointLabelYOffset(value: Double): this.type = set("pointLabelYOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def pointSize(value: Double): this.type = set("pointSize", value.asInstanceOf[js.Any])
    @scala.inline
    def pointSymbol(value: /* props */ ReadonlyPointSymbolProps => ReactElement): this.type = set("pointSymbol", js.Any.fromFunction1(value))
    @scala.inline
    def sliceTooltip(value: ReactComponentClass[SliceTooltipProps]): this.type = set("sliceTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: ReactComponentClass[PointTooltipProps]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipFormatFunction1(value: /* value */ typingsSlinky.nivoCore.mod.DatumValue => String | Double): this.type = set("tooltipFormat", js.Any.fromFunction1(value))
    @scala.inline
    def tooltipFormat(value: DataFormatter | String): this.type = set("tooltipFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def useMesh(value: Boolean): this.type = set("useMesh", value.asInstanceOf[js.Any])
    @scala.inline
    def xFormatFunction1(value: /* value */ typingsSlinky.nivoCore.mod.DatumValue => String | Double): this.type = set("xFormat", js.Any.fromFunction1(value))
    @scala.inline
    def xFormat(value: String | DataFormatter): this.type = set("xFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def xScale(value: Scale): this.type = set("xScale", value.asInstanceOf[js.Any])
    @scala.inline
    def yFormatFunction1(value: /* value */ typingsSlinky.nivoCore.mod.DatumValue => String | Double): this.type = set("yFormat", js.Any.fromFunction1(value))
    @scala.inline
    def yFormat(value: String | DataFormatter): this.type = set("yFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def yScale(value: Scale): this.type = set("yScale", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineSvgProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Array[Serie]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineSvgProps]))
  }
}

