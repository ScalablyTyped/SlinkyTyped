package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotFilter extends js.Object {
  val Active: Boolean = js.native
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  val DataCubeField: CubeField = js.native
  val DataField: typingsSlinky.activexExcel.Excel.PivotField = js.native
  val Description: String = js.native
  @JSName("Excel.PivotFilter_typekey")
  var ExcelDotPivotFilter_typekey: PivotFilter = js.native
  val FilterType: XlPivotFilterType = js.native
  val IsMemberPropertyFilter: Boolean = js.native
  val MemberPropertyField: typingsSlinky.activexExcel.Excel.PivotField = js.native
  val Name: String = js.native
  var Order: Double = js.native
  val Parent: js.Any = js.native
  val PivotField: typingsSlinky.activexExcel.Excel.PivotField = js.native
  val Value1: js.Any = js.native
  val Value2: js.Any = js.native
  def Delete(): Unit = js.native
}

object PivotFilter {
  @scala.inline
  def apply(
    Active: Boolean,
    Application: Application,
    Creator: XlCreator,
    DataCubeField: CubeField,
    DataField: PivotField,
    Delete: () => Unit,
    Description: String,
    ExcelDotPivotFilter_typekey: PivotFilter,
    FilterType: XlPivotFilterType,
    IsMemberPropertyFilter: Boolean,
    MemberPropertyField: PivotField,
    Name: String,
    Order: Double,
    Parent: js.Any,
    PivotField: PivotField,
    Value1: js.Any,
    Value2: js.Any
  ): PivotFilter = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DataCubeField = DataCubeField.asInstanceOf[js.Any], DataField = DataField.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Description = Description.asInstanceOf[js.Any], FilterType = FilterType.asInstanceOf[js.Any], IsMemberPropertyFilter = IsMemberPropertyFilter.asInstanceOf[js.Any], MemberPropertyField = MemberPropertyField.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PivotField = PivotField.asInstanceOf[js.Any], Value1 = Value1.asInstanceOf[js.Any], Value2 = Value2.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PivotFilter_typekey")(ExcelDotPivotFilter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotFilter]
  }
  @scala.inline
  implicit class PivotFilterOps[Self <: PivotFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withDataCubeField(value: CubeField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataCubeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataField(value: PivotField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotPivotFilter_typekey(value: PivotFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.PivotFilter_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterType(value: XlPivotFilterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMemberPropertyFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMemberPropertyFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberPropertyField(value: PivotField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberPropertyField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
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
    def withPivotField(value: PivotField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PivotField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue1(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue2(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

