package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotFilter extends StObject {
  
  val Active: Boolean = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  val DataCubeField: CubeField = js.native
  
  val DataField: typingsSlinky.activexExcel.Excel.PivotField = js.native
  
  def Delete(): Unit = js.native
  
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
  implicit class PivotFilterMutableBuilder[Self <: PivotFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCubeField(value: CubeField): Self = StObject.set(x, "DataCubeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataField(value: PivotField): Self = StObject.set(x, "DataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotPivotFilter_typekey(value: PivotFilter): Self = StObject.set(x, "Excel.PivotFilter_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterType(value: XlPivotFilterType): Self = StObject.set(x, "FilterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberPropertyFilter(value: Boolean): Self = StObject.set(x, "IsMemberPropertyFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberPropertyField(value: PivotField): Self = StObject.set(x, "MemberPropertyField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotField(value: PivotField): Self = StObject.set(x, "PivotField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue1(value: js.Any): Self = StObject.set(x, "Value1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue2(value: js.Any): Self = StObject.set(x, "Value2", value.asInstanceOf[js.Any])
  }
}
