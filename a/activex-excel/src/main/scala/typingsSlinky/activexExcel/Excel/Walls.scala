package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Walls extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Border: typingsSlinky.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.Walls_typekey")
  var ExcelDotWalls_typekey: Walls = js.native
  val Fill: ChartFillFormat = js.native
  val Format: ChartFormat = js.native
  val Interior: typingsSlinky.activexExcel.Excel.Interior = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  var PictureType: XlChartPictureType = js.native
  var PictureUnit: Double = js.native
  var Thickness: Double = js.native
  def ClearFormats(): js.Any = js.native
  def Paste(): Unit = js.native
  def Select(): js.Any = js.native
}

object Walls {
  @scala.inline
  def apply(
    Application: Application,
    Border: Border,
    ClearFormats: () => js.Any,
    Creator: XlCreator,
    ExcelDotWalls_typekey: Walls,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    Paste: () => Unit,
    PictureType: XlChartPictureType,
    PictureUnit: Double,
    Select: () => js.Any,
    Thickness: Double
  ): Walls = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), PictureType = PictureType.asInstanceOf[js.Any], PictureUnit = PictureUnit.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Thickness = Thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Walls_typekey")(ExcelDotWalls_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Walls]
  }
  @scala.inline
  implicit class WallsOps[Self <: Walls] (val x: Self) extends AnyVal {
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
    def withExcelDotWalls_typekey(value: Walls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Walls_typekey")(value.asInstanceOf[js.Any])
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
    def withInterior(value: Interior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interior")(value.asInstanceOf[js.Any])
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
    def withPaste(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Paste")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPictureType(value: XlChartPictureType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPictureUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PictureUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Thickness")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

