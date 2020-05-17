package typingsSlinky.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slicer extends js.Object {
  val ActiveItem: SlicerItem = js.native
  val Application: typingsSlinky.activexExcel.Excel.Application = js.native
  var Caption: String = js.native
  var ColumnWidth: Double = js.native
  val Creator: XlCreator = js.native
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
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
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
  implicit class SlicerOps[Self <: Slicer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveItem(value: SlicerItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreator(value: XlCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCut(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisableMoveResizeUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableMoveResizeUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcelDotSlicer_typekey(value: Slicer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Excel.Slicer_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlicerCache(value: SlicerCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlicerCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlicerCacheLevel(value: SlicerCacheLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlicerCacheLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

