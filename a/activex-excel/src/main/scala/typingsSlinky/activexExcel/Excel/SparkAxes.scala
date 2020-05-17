package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkAxes extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.SparkAxes_typekey")
  var ExcelDotSparkAxes_typekey: SparkAxes = js.native
  val Horizontal: SparkHorizontalAxis = js.native
  val Parent: js.Any = js.native
  val Vertical: SparkVerticalAxis = js.native
}

object SparkAxes {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotSparkAxes_typekey: SparkAxes,
    Horizontal: SparkHorizontalAxis,
    Parent: js.Any,
    Vertical: SparkVerticalAxis
  ): SparkAxes = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Horizontal = Horizontal.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Vertical = Vertical.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkAxes_typekey")(ExcelDotSparkAxes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkAxes]
  }
  @scala.inline
  implicit class SparkAxesOps[Self <: SparkAxes] (val x: Self) extends AnyVal {
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
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotSparkAxes_typekey(value: SparkAxes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.SparkAxes_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontal(value: SparkHorizontalAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Horizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertical(value: SparkVerticalAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vertical")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

