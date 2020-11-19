package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CubeField extends js.Object {
  
  def AddMemberPropertyField(Property: String): Unit = js.native
  def AddMemberPropertyField(
    Property: String,
    PropertyOrder: js.UndefOr[scala.Nothing],
    PropertyDisplayedIn: XlPropertyDisplayedIn
  ): Unit = js.native
  def AddMemberPropertyField(Property: String, PropertyOrder: Double): Unit = js.native
  def AddMemberPropertyField(Property: String, PropertyOrder: Double, PropertyDisplayedIn: XlPropertyDisplayedIn): Unit = js.native
  
  val AllItemsVisible: Boolean = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  var Caption: String = js.native
  
  def ClearManualFilter(): Unit = js.native
  
  def CreatePivotFields(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  val CubeFieldSubType: XlCubeFieldSubType = js.native
  
  val CubeFieldType: XlCubeFieldType = js.native
  
  var CurrentPageName: String = js.native
  
  def Delete(): Unit = js.native
  
  var DragToColumn: Boolean = js.native
  
  var DragToData: Boolean = js.native
  
  var DragToHide: Boolean = js.native
  
  var DragToPage: Boolean = js.native
  
  var DragToRow: Boolean = js.native
  
  var EnableMultiplePageItems: Boolean = js.native
  
  @JSName("Excel.CubeField_typekey")
  var ExcelDotCubeField_typekey: CubeField = js.native
  
  var FlattenHierarchies: Boolean = js.native
  
  val HasMemberProperties: Boolean = js.native
  
  var HiddenLevels: Double = js.native
  
  var HierarchizeDistinct: Boolean = js.native
  
  var IncludeNewItemsInFilter: Boolean = js.native
  
  val IsDate: Boolean = js.native
  
  var LayoutForm: XlLayoutFormType = js.native
  
  var LayoutSubtotalLocation: XlSubtototalLocationType = js.native
  
  val Name: String = js.native
  
  var Orientation: XlPivotFieldOrientation = js.native
  
  val Parent: js.Any = js.native
  
  val PivotFields: typingsSlinky.activexExcel.Excel.PivotFields = js.native
  
  var Position: Double = js.native
  
  var ShowInFieldList: Boolean = js.native
  
  val TreeviewControl: typingsSlinky.activexExcel.Excel.TreeviewControl = js.native
  
  val Value: String = js.native
  
  def _AddMemberPropertyField(Property: String): Unit = js.native
  def _AddMemberPropertyField(Property: String, PropertyOrder: js.Any): Unit = js.native
  
  val _Caption: String = js.native
}
