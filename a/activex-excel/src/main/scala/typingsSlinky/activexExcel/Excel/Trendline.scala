package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trendline extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var Backward: Double = js.native
  var Backward2: Double = js.native
  val Border: typingsSlinky.activexExcel.Excel.Border = js.native
  val Creator: XlCreator = js.native
  val DataLabel: typingsSlinky.activexExcel.Excel.DataLabel = js.native
  var DisplayEquation: Boolean = js.native
  var DisplayRSquared: Boolean = js.native
  @JSName("Excel.Trendline_typekey")
  var ExcelDotTrendline_typekey: Trendline = js.native
  val Format: ChartFormat = js.native
  var Forward: Double = js.native
  var Forward2: Double = js.native
  val Index: Double = js.native
  var Intercept: Double = js.native
  var InterceptIsAuto: Boolean = js.native
  var Name: String = js.native
  var NameIsAuto: Boolean = js.native
  var Order: Double = js.native
  val Parent: js.Any = js.native
  var Period: Double = js.native
  var Type: XlTrendlineType = js.native
  def ClearFormats(): js.Any = js.native
  def Delete(): js.Any = js.native
  def Select(): js.Any = js.native
}

object Trendline {
  @scala.inline
  def apply(
    Application: Application,
    Backward: Double,
    Backward2: Double,
    Border: Border,
    ClearFormats: () => js.Any,
    Creator: XlCreator,
    DataLabel: DataLabel,
    Delete: () => js.Any,
    DisplayEquation: Boolean,
    DisplayRSquared: Boolean,
    ExcelDotTrendline_typekey: Trendline,
    Format: ChartFormat,
    Forward: Double,
    Forward2: Double,
    Index: Double,
    Intercept: Double,
    InterceptIsAuto: Boolean,
    Name: String,
    NameIsAuto: Boolean,
    Order: Double,
    Parent: js.Any,
    Period: Double,
    Select: () => js.Any,
    Type: XlTrendlineType
  ): Trendline = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Backward = Backward.asInstanceOf[js.Any], Backward2 = Backward2.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], DataLabel = DataLabel.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DisplayEquation = DisplayEquation.asInstanceOf[js.Any], DisplayRSquared = DisplayRSquared.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any], Forward2 = Forward2.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Intercept = Intercept.asInstanceOf[js.Any], InterceptIsAuto = InterceptIsAuto.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameIsAuto = NameIsAuto.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Trendline_typekey")(ExcelDotTrendline_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trendline]
  }
  @scala.inline
  implicit class TrendlineOps[Self <: Trendline] (val x: Self) extends AnyVal {
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
    def withBackward(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Backward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackward2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Backward2")(value.asInstanceOf[js.Any])
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
    def withDataLabel(value: DataLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayEquation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayEquation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayRSquared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayRSquared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotTrendline_typekey(value: Trendline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Trendline_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: ChartFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForward(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Forward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForward2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Forward2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntercept(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Intercept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterceptIsAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InterceptIsAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameIsAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NameIsAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: XlTrendlineType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

