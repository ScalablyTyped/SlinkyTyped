package typingsSlinky.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slicer extends StObject {
  
  val ActiveItem: SlicerItem = js.native
  
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  
  var Caption: String = js.native
  
  var ColumnWidth: Double = js.native
  
  def Copy(): Unit = js.native
  
  val Creator: XlCreator = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
  var DisableMoveResizeUI: Boolean = js.native
  
  var DisplayHeader: Boolean = js.native
  
  @JSName("Excel.Slicer_typekey")
  var ExcelDotSlicer_typekey: Slicer = js.native
  
  var Height: Double = js.native
  
  var Left: Double = js.native
  
  var Locked: Boolean = js.native
  
  var Name: String = js.native
  
  var NumberOfColumns: Double = js.native
  
  val Parent: js.Any = js.native
  
  var RowHeight: Double = js.native
  
  val Shape: typingsSlinky.activexExcel.Excel.Shape = js.native
  
  val SlicerCache: typingsSlinky.activexExcel.Excel.SlicerCache = js.native
  
  val SlicerCacheLevel: typingsSlinky.activexExcel.Excel.SlicerCacheLevel = js.native
  
  var Style: js.Any = js.native
  
  var Top: Double = js.native
  
  var Width: Double = js.native
}
object Slicer {
  
  @scala.inline
  def apply(
    ActiveItem: SlicerItem,
    Application: Application,
    Caption: String,
    ColumnWidth: Double,
    Copy: () => Unit,
    Creator: XlCreator,
    Cut: () => Unit,
    Delete: () => Unit,
    DisableMoveResizeUI: Boolean,
    DisplayHeader: Boolean,
    ExcelDotSlicer_typekey: Slicer,
    Height: Double,
    Left: Double,
    Locked: Boolean,
    Name: String,
    NumberOfColumns: Double,
    Parent: js.Any,
    RowHeight: Double,
    Shape: Shape,
    SlicerCache: SlicerCache,
    SlicerCacheLevel: SlicerCacheLevel,
    Style: js.Any,
    Top: Double,
    Width: Double
  ): Slicer = {
    val __obj = js.Dynamic.literal(ActiveItem = ActiveItem.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], ColumnWidth = ColumnWidth.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), DisableMoveResizeUI = DisableMoveResizeUI.asInstanceOf[js.Any], DisplayHeader = DisplayHeader.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberOfColumns = NumberOfColumns.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RowHeight = RowHeight.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], SlicerCache = SlicerCache.asInstanceOf[js.Any], SlicerCacheLevel = SlicerCacheLevel.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Slicer_typekey")(ExcelDotSlicer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slicer]
  }
  
  @scala.inline
  implicit class SlicerMutableBuilder[Self <: Slicer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveItem(value: SlicerItem): Self = StObject.set(x, "ActiveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidth(value: Double): Self = StObject.set(x, "ColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableMoveResizeUI(value: Boolean): Self = StObject.set(x, "DisableMoveResizeUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayHeader(value: Boolean): Self = StObject.set(x, "DisplayHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSlicer_typekey(value: Slicer): Self = StObject.set(x, "Excel.Slicer_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfColumns(value: Double): Self = StObject.set(x, "NumberOfColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeight(value: Double): Self = StObject.set(x, "RowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: Shape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicerCache(value: SlicerCache): Self = StObject.set(x, "SlicerCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicerCacheLevel(value: SlicerCacheLevel): Self = StObject.set(x, "SlicerCacheLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: js.Any): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
