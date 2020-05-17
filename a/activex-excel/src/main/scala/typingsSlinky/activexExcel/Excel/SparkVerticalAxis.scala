package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkVerticalAxis extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var CustomMaxScaleValue: js.Any = js.native
  var CustomMinScaleValue: js.Any = js.native
  @JSName("Excel.SparkVerticalAxis_typekey")
  var ExcelDotSparkVerticalAxis_typekey: SparkVerticalAxis = js.native
  var MaxScaleType: XlSparkScale = js.native
  var MinScaleType: XlSparkScale = js.native
  val Parent: js.Any = js.native
}

object SparkVerticalAxis {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    CustomMaxScaleValue: js.Any,
    CustomMinScaleValue: js.Any,
    ExcelDotSparkVerticalAxis_typekey: SparkVerticalAxis,
    MaxScaleType: XlSparkScale,
    MinScaleType: XlSparkScale,
    Parent: js.Any
  ): SparkVerticalAxis = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], CustomMaxScaleValue = CustomMaxScaleValue.asInstanceOf[js.Any], CustomMinScaleValue = CustomMinScaleValue.asInstanceOf[js.Any], MaxScaleType = MaxScaleType.asInstanceOf[js.Any], MinScaleType = MinScaleType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkVerticalAxis_typekey")(ExcelDotSparkVerticalAxis_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkVerticalAxis]
  }
  @scala.inline
  implicit class SparkVerticalAxisOps[Self <: SparkVerticalAxis] (val x: Self) extends AnyVal {
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
    def withCustomMaxScaleValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMaxScaleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomMinScaleValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMinScaleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotSparkVerticalAxis_typekey(value: SparkVerticalAxis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.SparkVerticalAxis_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxScaleType(value: XlSparkScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxScaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinScaleType(value: XlSparkScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinScaleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

