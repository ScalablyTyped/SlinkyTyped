package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangNavigationPopupOptions extends js.Object {
  var addButton: js.UndefOr[String] = js.native
  var arrowLine: js.UndefOr[String] = js.native
  var arrowRay: js.UndefOr[String] = js.native
  var arrowSegment: js.UndefOr[String] = js.native
  var background: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var backgroundColors: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var borderRadius: js.UndefOr[String] = js.native
  var borderWidth: js.UndefOr[String] = js.native
  var circle: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var connector: js.UndefOr[String] = js.native
  var crooked3: js.UndefOr[String] = js.native
  var crooked5: js.UndefOr[String] = js.native
  var crosshairX: js.UndefOr[String] = js.native
  var crosshairY: js.UndefOr[String] = js.native
  var editButton: js.UndefOr[String] = js.native
  var elliott3: js.UndefOr[String] = js.native
  var elliott5: js.UndefOr[String] = js.native
  var fibonacci: js.UndefOr[String] = js.native
  var fill: js.UndefOr[String] = js.native
  var flags: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var height: js.UndefOr[String] = js.native
  var horizontalLine: js.UndefOr[String] = js.native
  var infinityLine: js.UndefOr[String] = js.native
  var innerBackground: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var labelOptions: js.UndefOr[String] = js.native
  var labels: js.UndefOr[String] = js.native
  var line: js.UndefOr[String] = js.native
  var lines: js.UndefOr[String] = js.native
  var measure: js.UndefOr[String] = js.native
  var measureX: js.UndefOr[String] = js.native
  var measureXY: js.UndefOr[String] = js.native
  var measureY: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var outerBackground: js.UndefOr[String] = js.native
  var padding: js.UndefOr[String] = js.native
  var parallelChannel: js.UndefOr[String] = js.native
  var pitchfork: js.UndefOr[String] = js.native
  var ray: js.UndefOr[String] = js.native
  var rectangle: js.UndefOr[String] = js.native
  var removeButton: js.UndefOr[String] = js.native
  var saveButton: js.UndefOr[String] = js.native
  var segment: js.UndefOr[String] = js.native
  var series: js.UndefOr[String] = js.native
  var shapeOptions: js.UndefOr[String] = js.native
  var shapes: js.UndefOr[String] = js.native
  var simpleShapes: js.UndefOr[String] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeWidth: js.UndefOr[String] = js.native
  var style: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var tunnel: js.UndefOr[String] = js.native
  var typeOptions: js.UndefOr[String] = js.native
  var verticalArrow: js.UndefOr[String] = js.native
  var verticalCounter: js.UndefOr[String] = js.native
  var verticalLabel: js.UndefOr[String] = js.native
  var verticalLine: js.UndefOr[String] = js.native
  var volume: js.UndefOr[String] = js.native
}

object LangNavigationPopupOptions {
  @scala.inline
  def apply(): LangNavigationPopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangNavigationPopupOptions]
  }
  @scala.inline
  implicit class LangNavigationPopupOptionsOps[Self <: LangNavigationPopupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButton")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLine")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowRay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowRay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowRay")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowSegment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColors")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCircle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withConnector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(js.undefined)
        ret
    }
    @scala.inline
    def withCrooked3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrooked3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked3")(js.undefined)
        ret
    }
    @scala.inline
    def withCrooked5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrooked5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crooked5")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairX")(js.undefined)
        ret
    }
    @scala.inline
    def withCrosshairY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshairY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshairY")(js.undefined)
        ret
    }
    @scala.inline
    def withEditButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editButton")(js.undefined)
        ret
    }
    @scala.inline
    def withElliott3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElliott3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott3")(js.undefined)
        ret
    }
    @scala.inline
    def withElliott5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElliott5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elliott5")(js.undefined)
        ret
    }
    @scala.inline
    def withFibonacci(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fibonacci")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFibonacci: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fibonacci")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalLine")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinityLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinityLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinityLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinityLine")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
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
    def withLabelOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withLines(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasure(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureX")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureXY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureXY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureXY")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureY")(js.undefined)
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
    def withOuterBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchfork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchfork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchfork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchfork")(js.undefined)
        ret
    }
    @scala.inline
    def withRay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ray")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShapes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleShapes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleShapes")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalCounter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalCounter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalCounter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalCounter")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalLine")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

