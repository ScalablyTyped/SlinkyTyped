package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkPoints extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  @JSName("Excel.SparkPoints_typekey")
  var ExcelDotSparkPoints_typekey: SparkPoints = js.native
  val Firstpoint: SparkColor = js.native
  val Highpoint: SparkColor = js.native
  val Lastpoint: SparkColor = js.native
  val Lowpoint: SparkColor = js.native
  val Markers: SparkColor = js.native
  val Negative: SparkColor = js.native
  val Parent: js.Any = js.native
}

object SparkPoints {
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotSparkPoints_typekey: SparkPoints,
    Firstpoint: SparkColor,
    Highpoint: SparkColor,
    Lastpoint: SparkColor,
    Lowpoint: SparkColor,
    Markers: SparkColor,
    Negative: SparkColor,
    Parent: js.Any
  ): SparkPoints = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Firstpoint = Firstpoint.asInstanceOf[js.Any], Highpoint = Highpoint.asInstanceOf[js.Any], Lastpoint = Lastpoint.asInstanceOf[js.Any], Lowpoint = Lowpoint.asInstanceOf[js.Any], Markers = Markers.asInstanceOf[js.Any], Negative = Negative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkPoints_typekey")(ExcelDotSparkPoints_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkPoints]
  }
  @scala.inline
  implicit class SparkPointsOps[Self <: SparkPoints] (val x: Self) extends AnyVal {
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
    def withExcelDotSparkPoints_typekey(value: SparkPoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.SparkPoints_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstpoint(value: SparkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Firstpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighpoint(value: SparkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Highpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastpoint(value: SparkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lastpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowpoint(value: SparkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Lowpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarkers(value: SparkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegative(value: SparkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Negative")(value.asInstanceOf[js.Any])
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

