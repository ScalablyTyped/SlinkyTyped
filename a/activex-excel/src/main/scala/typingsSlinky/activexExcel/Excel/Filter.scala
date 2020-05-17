package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Criteria1: js.Any = js.native
  val Criteria2: js.Any = js.native
  @JSName("Excel.Filter_typekey")
  var ExcelDotFilter_typekey: Filter = js.native
  val On: Boolean = js.native
  var Operator: XlAutoFilterOperator = js.native
  val Parent: js.Any = js.native
  val _Operator: XlAutoFilterOperator = js.native
}

object Filter {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: XlCreator,
    Criteria1: js.Any,
    Criteria2: js.Any,
    ExcelDotFilter_typekey: Filter,
    On: Boolean,
    Operator: XlAutoFilterOperator,
    Parent: js.Any,
    _Operator: XlAutoFilterOperator
  ): Filter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Criteria1 = Criteria1.asInstanceOf[js.Any], Criteria2 = Criteria2.asInstanceOf[js.Any], On = On.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], _Operator = _Operator.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Filter_typekey")(ExcelDotFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
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
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCriteria1(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Criteria1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCriteria2(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Criteria2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotFilter_typekey(value: Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Filter_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("On")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: XlAutoFilterOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Operator(value: XlAutoFilterOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Operator")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

