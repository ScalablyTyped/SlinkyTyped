package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotArea extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Border: typingsSlinky.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.PlotArea_typekey")
  var ExcelDotPlotArea_typekey: PlotArea = js.native
  val Fill: ChartFillFormat = js.native
  val Format: ChartFormat = js.native
  var Height: Double = js.native
  var InsideHeight: Double = js.native
  var InsideLeft: Double = js.native
  var InsideTop: Double = js.native
  var InsideWidth: Double = js.native
  val Interior: typingsSlinky.activexExcel.Excel.Interior = js.native
  var Left: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  var Position: XlChartElementPosition = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  val _InsideHeight: Double = js.native
  val _InsideLeft: Double = js.native
  val _InsideTop: Double = js.native
  val _InsideWidth: Double = js.native
  def ClearFormats(): js.Any = js.native
  def Select(): js.Any = js.native
}

object PlotArea {
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    ClearFormats: () => js.Any,
    Creator: XlCreator,
    ExcelDotPlotArea_typekey: PlotArea,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Height: Double,
    InsideHeight: Double,
    InsideLeft: Double,
    InsideTop: Double,
    InsideWidth: Double,
    Interior: Interior,
    Left: Double,
    Name: String,
    Parent: js.Any,
    Position: XlChartElementPosition,
    Select: () => js.Any,
    Top: Double,
    Width: Double,
    _InsideHeight: Double,
    _InsideLeft: Double,
    _InsideTop: Double,
    _InsideWidth: Double
  ): PlotArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], InsideHeight = InsideHeight.asInstanceOf[js.Any], InsideLeft = InsideLeft.asInstanceOf[js.Any], InsideTop = InsideTop.asInstanceOf[js.Any], InsideWidth = InsideWidth.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], _InsideHeight = _InsideHeight.asInstanceOf[js.Any], _InsideLeft = _InsideLeft.asInstanceOf[js.Any], _InsideTop = _InsideTop.asInstanceOf[js.Any], _InsideWidth = _InsideWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PlotArea_typekey")(ExcelDotPlotArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotArea]
  }
  @scala.inline
  implicit class PlotAreaOps[Self <: PlotArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: Border): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearFormats(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearFormats")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotPlotArea_typekey(value: PlotArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.PlotArea_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: ChartFillFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: ChartFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsideHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsideLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsideTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsideWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsideWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterior(value: Interior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: XlChartElementPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_InsideHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_InsideHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_InsideLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_InsideLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_InsideTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_InsideTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_InsideWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_InsideWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

