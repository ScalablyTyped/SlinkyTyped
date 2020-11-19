package typingsSlinky.nivoLine.mod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.nivoAxes.mod.AxisProps
import typingsSlinky.nivoAxes.mod.GridValues
import typingsSlinky.nivoColors.mod.OrdinalColorsInstruction
import typingsSlinky.nivoCore.mod.Box
import typingsSlinky.nivoCore.mod.CartesianMarkerProps
import typingsSlinky.nivoCore.mod.DataFormatter
import typingsSlinky.nivoCore.mod.Theme
import typingsSlinky.nivoLegends.mod.LegendProps
import typingsSlinky.nivoLine.anon.ReadonlyPointSymbolProps
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineProps extends js.Object {
  
  var areaBaselineValue: js.UndefOr[DatumValue] = js.native
  
  var areaOpacity: js.UndefOr[Double] = js.native
  
  var axisBottom: js.UndefOr[AxisProps | Null] = js.native
  
  var axisLeft: js.UndefOr[AxisProps | Null] = js.native
  
  var axisRight: js.UndefOr[AxisProps | Null] = js.native
  
  var axisTop: js.UndefOr[AxisProps | Null] = js.native
  
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.native
  
  var crosshairType: js.UndefOr[CrosshairType] = js.native
  
  var curve: js.UndefOr[
    basis | cardinal | catmullRom | linear | monotoneX | monotoneY | natural | step | stepAfter | stepBefore
  ] = js.native
  
  var data: js.Array[Serie] = js.native
  
  var debugMesh: js.UndefOr[Boolean] = js.native
  
  var debugSlices: js.UndefOr[Boolean] = js.native
  
  var enableArea: js.UndefOr[Boolean] = js.native
  
  var enableCrosshair: js.UndefOr[Boolean] = js.native
  
  var enableGridX: js.UndefOr[Boolean] = js.native
  
  var enableGridY: js.UndefOr[Boolean] = js.native
  
  var enablePoints: js.UndefOr[Boolean] = js.native
  
  var enableSlices: js.UndefOr[x | y | `false`] = js.native
  
  var gridXValues: js.UndefOr[GridValues[DatumValue]] = js.native
  
  var gridYValues: js.UndefOr[GridValues[DatumValue]] = js.native
  
  var isInteractive: js.UndefOr[Boolean] = js.native
  
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  
  var legends: js.UndefOr[js.Array[LegendProps]] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var margin: js.UndefOr[Box] = js.native
  
  var markers: js.UndefOr[js.Array[CartesianMarkerProps]] = js.native
  
  var onClick: js.UndefOr[PointMouseHandler] = js.native
  
  var onMouseEnter: js.UndefOr[PointMouseHandler] = js.native
  
  var onMouseLeave: js.UndefOr[PointMouseHandler] = js.native
  
  var onMouseMove: js.UndefOr[PointMouseHandler] = js.native
  
  var pointBorderColor: js.UndefOr[js.Any] = js.native
  
  var pointBorderWidth: js.UndefOr[Double] = js.native
  
  var pointColor: js.UndefOr[js.Any] = js.native
  
  var pointSize: js.UndefOr[Double] = js.native
  
  var pointSymbol: js.UndefOr[js.Function1[/* props */ ReadonlyPointSymbolProps, ReactElement]] = js.native
  
  var sliceTooltip: js.UndefOr[ReactComponentClass[SliceTooltipProps]] = js.native
  
  var theme: js.UndefOr[Theme] = js.native
  
  var tooltip: js.UndefOr[ReactComponentClass[PointTooltipProps]] = js.native
  
  var tooltipFormat: js.UndefOr[DataFormatter | String] = js.native
  
  var xFormat: js.UndefOr[String | DataFormatter] = js.native
  
  var xScale: js.UndefOr[Scale] = js.native
  
  var yFormat: js.UndefOr[String | DataFormatter] = js.native
  
  var yScale: js.UndefOr[Scale] = js.native
}
object LineProps {
  
  @scala.inline
  def apply(data: js.Array[Serie]): LineProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
  
  @scala.inline
  implicit class LinePropsOps[Self <: LineProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataVarargs(value: Serie*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Serie]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaBaselineValueDate(value: js.Date): Self = this.set("areaBaselineValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaBaselineValue(value: DatumValue): Self = this.set("areaBaselineValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaBaselineValue: Self = this.set("areaBaselineValue", js.undefined)
    
    @scala.inline
    def setAreaOpacity(value: Double): Self = this.set("areaOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaOpacity: Self = this.set("areaOpacity", js.undefined)
    
    @scala.inline
    def setAxisBottom(value: AxisProps): Self = this.set("axisBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisBottom: Self = this.set("axisBottom", js.undefined)
    
    @scala.inline
    def setAxisBottomNull: Self = this.set("axisBottom", null)
    
    @scala.inline
    def setAxisLeft(value: AxisProps): Self = this.set("axisLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLeft: Self = this.set("axisLeft", js.undefined)
    
    @scala.inline
    def setAxisLeftNull: Self = this.set("axisLeft", null)
    
    @scala.inline
    def setAxisRight(value: AxisProps): Self = this.set("axisRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisRight: Self = this.set("axisRight", js.undefined)
    
    @scala.inline
    def setAxisRightNull: Self = this.set("axisRight", null)
    
    @scala.inline
    def setAxisTop(value: AxisProps): Self = this.set("axisTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisTop: Self = this.set("axisTop", js.undefined)
    
    @scala.inline
    def setAxisTopNull: Self = this.set("axisTop", null)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColorsFunction1(value: _ => String): Self = this.set("colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColors(value: OrdinalColorsInstruction[_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setCrosshairType(value: CrosshairType): Self = this.set("crosshairType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairType: Self = this.set("crosshairType", js.undefined)
    
    @scala.inline
    def setCurve(
      value: basis | cardinal | catmullRom | linear | monotoneX | monotoneY | natural | step | stepAfter | stepBefore
    ): Self = this.set("curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    
    @scala.inline
    def setDebugMesh(value: Boolean): Self = this.set("debugMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugMesh: Self = this.set("debugMesh", js.undefined)
    
    @scala.inline
    def setDebugSlices(value: Boolean): Self = this.set("debugSlices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugSlices: Self = this.set("debugSlices", js.undefined)
    
    @scala.inline
    def setEnableArea(value: Boolean): Self = this.set("enableArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableArea: Self = this.set("enableArea", js.undefined)
    
    @scala.inline
    def setEnableCrosshair(value: Boolean): Self = this.set("enableCrosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCrosshair: Self = this.set("enableCrosshair", js.undefined)
    
    @scala.inline
    def setEnableGridX(value: Boolean): Self = this.set("enableGridX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGridX: Self = this.set("enableGridX", js.undefined)
    
    @scala.inline
    def setEnableGridY(value: Boolean): Self = this.set("enableGridY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableGridY: Self = this.set("enableGridY", js.undefined)
    
    @scala.inline
    def setEnablePoints(value: Boolean): Self = this.set("enablePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePoints: Self = this.set("enablePoints", js.undefined)
    
    @scala.inline
    def setEnableSlices(value: typingsSlinky.nivoLine.nivoLineStrings.x | y | `false`): Self = this.set("enableSlices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSlices: Self = this.set("enableSlices", js.undefined)
    
    @scala.inline
    def setGridXValuesVarargs(value: (js.Date | Double | String)*): Self = this.set("gridXValues", js.Array(value :_*))
    
    @scala.inline
    def setGridXValues(value: GridValues[DatumValue]): Self = this.set("gridXValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridXValues: Self = this.set("gridXValues", js.undefined)
    
    @scala.inline
    def setGridYValuesVarargs(value: (js.Date | Double | String)*): Self = this.set("gridYValues", js.Array(value :_*))
    
    @scala.inline
    def setGridYValues(value: GridValues[DatumValue]): Self = this.set("gridYValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridYValues: Self = this.set("gridYValues", js.undefined)
    
    @scala.inline
    def setIsInteractive(value: Boolean): Self = this.set("isInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInteractive: Self = this.set("isInteractive", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setLegendsVarargs(value: LegendProps*): Self = this.set("legends", js.Array(value :_*))
    
    @scala.inline
    def setLegends(value: js.Array[LegendProps]): Self = this.set("legends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegends: Self = this.set("legends", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setMargin(value: Box): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMarkersVarargs(value: CartesianMarkerProps*): Self = this.set("markers", js.Array(value :_*))
    
    @scala.inline
    def setMarkers(value: js.Array[CartesianMarkerProps]): Self = this.set("markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* point */ Point, /* event */ SyntheticMouseEvent[Element]) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: (/* point */ Point, /* event */ SyntheticMouseEvent[Element]) => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: (/* point */ Point, /* event */ SyntheticMouseEvent[Element]) => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: (/* point */ Point, /* event */ SyntheticMouseEvent[Element]) => Unit): Self = this.set("onMouseMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setPointBorderColor(value: js.Any): Self = this.set("pointBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointBorderColor: Self = this.set("pointBorderColor", js.undefined)
    
    @scala.inline
    def setPointBorderWidth(value: Double): Self = this.set("pointBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointBorderWidth: Self = this.set("pointBorderWidth", js.undefined)
    
    @scala.inline
    def setPointColor(value: js.Any): Self = this.set("pointColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointColor: Self = this.set("pointColor", js.undefined)
    
    @scala.inline
    def setPointSize(value: Double): Self = this.set("pointSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointSize: Self = this.set("pointSize", js.undefined)
    
    @scala.inline
    def setPointSymbol(value: /* props */ ReadonlyPointSymbolProps => ReactElement): Self = this.set("pointSymbol", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePointSymbol: Self = this.set("pointSymbol", js.undefined)
    
    @scala.inline
    def setSliceTooltip(value: ReactComponentClass[SliceTooltipProps]): Self = this.set("sliceTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSliceTooltip: Self = this.set("sliceTooltip", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltip(value: ReactComponentClass[PointTooltipProps]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipFormatFunction1(value: /* value */ typingsSlinky.nivoCore.mod.DatumValue => String | Double): Self = this.set("tooltipFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipFormat(value: DataFormatter | String): Self = this.set("tooltipFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipFormat: Self = this.set("tooltipFormat", js.undefined)
    
    @scala.inline
    def setXFormatFunction1(value: /* value */ typingsSlinky.nivoCore.mod.DatumValue => String | Double): Self = this.set("xFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXFormat(value: String | DataFormatter): Self = this.set("xFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXFormat: Self = this.set("xFormat", js.undefined)
    
    @scala.inline
    def setXScale(value: Scale): Self = this.set("xScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXScale: Self = this.set("xScale", js.undefined)
    
    @scala.inline
    def setYFormatFunction1(value: /* value */ typingsSlinky.nivoCore.mod.DatumValue => String | Double): Self = this.set("yFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYFormat(value: String | DataFormatter): Self = this.set("yFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYFormat: Self = this.set("yFormat", js.undefined)
    
    @scala.inline
    def setYScale(value: Scale): Self = this.set("yScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYScale: Self = this.set("yScale", js.undefined)
  }
}
