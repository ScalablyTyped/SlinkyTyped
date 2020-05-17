package typingsSlinky.activexAccess.AccWizObjects

import typingsSlinky.activexStdole.stdole.IFontDisp
import typingsSlinky.activexStdole.stdole.OLE_COLOR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ImexGrid Control */
@js.native
trait ImexGrid extends js.Object {
  @JSName("AccWizObjects.ImexGrid_typekey")
  var AccWizObjectsDotImexGrid_typekey: ImexGrid = js.native
  var AllowColumnSizing: Boolean = js.native
  var BackColor: OLE_COLOR = js.native
  var Caption: String = js.native
  var ColumnClickBehavior: Double = js.native
  val ColumnCount: Double = js.native
  var ColumnState: js.Any = js.native
  var Delimiters: String = js.native
  var DrawTextLogicalOrder: Boolean = js.native
  var FirstRowNumber: Double = js.native
  var Font: IFontDisp = js.native
  var GridBackColor: OLE_COLOR = js.native
  var GridFont: IFontDisp = js.native
  var GridHeader: Double = js.native
  var Painting: Boolean = js.native
  val RowCount: Double = js.native
  var ShowColLines: Boolean = js.native
  var ShowRowHeaders: Boolean = js.native
  var StringDelimiters: String = js.native
  def AddColumn(ColumnCaption: String, ColumnWidth: Double, Index: Double): Unit = js.native
  def AddRow(RowText: String, Index: Double): Unit = js.native
  def CalcBestColumns(): Unit = js.native
  def ClearColumns(): Unit = js.native
  def ClearRows(): Unit = js.native
  def Columns(ColumnNumber: Double): js.Any = js.native
  def DeleteColumn(Index: Double): Unit = js.native
  def DeleteRow(Index: Double): Unit = js.native
  def Refresh(): Unit = js.native
  def ResetHScrollPos(): Unit = js.native
  def ResetVScrollPos(): Unit = js.native
  def RowText(RowNumber: Double): String = js.native
}

object ImexGrid {
  @scala.inline
  def apply(
    AccWizObjectsDotImexGrid_typekey: ImexGrid,
    AddColumn: (String, Double, Double) => Unit,
    AddRow: (String, Double) => Unit,
    AllowColumnSizing: Boolean,
    BackColor: OLE_COLOR,
    CalcBestColumns: () => Unit,
    Caption: String,
    ClearColumns: () => Unit,
    ClearRows: () => Unit,
    ColumnClickBehavior: Double,
    ColumnCount: Double,
    ColumnState: js.Any,
    Columns: Double => js.Any,
    DeleteColumn: Double => Unit,
    DeleteRow: Double => Unit,
    Delimiters: String,
    DrawTextLogicalOrder: Boolean,
    FirstRowNumber: Double,
    Font: IFontDisp,
    GridBackColor: OLE_COLOR,
    GridFont: IFontDisp,
    GridHeader: Double,
    Painting: Boolean,
    Refresh: () => Unit,
    ResetHScrollPos: () => Unit,
    ResetVScrollPos: () => Unit,
    RowCount: Double,
    RowText: Double => String,
    ShowColLines: Boolean,
    ShowRowHeaders: Boolean,
    StringDelimiters: String
  ): ImexGrid = {
    val __obj = js.Dynamic.literal(AddColumn = js.Any.fromFunction3(AddColumn), AddRow = js.Any.fromFunction2(AddRow), AllowColumnSizing = AllowColumnSizing.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], CalcBestColumns = js.Any.fromFunction0(CalcBestColumns), Caption = Caption.asInstanceOf[js.Any], ClearColumns = js.Any.fromFunction0(ClearColumns), ClearRows = js.Any.fromFunction0(ClearRows), ColumnClickBehavior = ColumnClickBehavior.asInstanceOf[js.Any], ColumnCount = ColumnCount.asInstanceOf[js.Any], ColumnState = ColumnState.asInstanceOf[js.Any], Columns = js.Any.fromFunction1(Columns), DeleteColumn = js.Any.fromFunction1(DeleteColumn), DeleteRow = js.Any.fromFunction1(DeleteRow), Delimiters = Delimiters.asInstanceOf[js.Any], DrawTextLogicalOrder = DrawTextLogicalOrder.asInstanceOf[js.Any], FirstRowNumber = FirstRowNumber.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], GridBackColor = GridBackColor.asInstanceOf[js.Any], GridFont = GridFont.asInstanceOf[js.Any], GridHeader = GridHeader.asInstanceOf[js.Any], Painting = Painting.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), ResetHScrollPos = js.Any.fromFunction0(ResetHScrollPos), ResetVScrollPos = js.Any.fromFunction0(ResetVScrollPos), RowCount = RowCount.asInstanceOf[js.Any], RowText = js.Any.fromFunction1(RowText), ShowColLines = ShowColLines.asInstanceOf[js.Any], ShowRowHeaders = ShowRowHeaders.asInstanceOf[js.Any], StringDelimiters = StringDelimiters.asInstanceOf[js.Any])
    __obj.updateDynamic("AccWizObjects.ImexGrid_typekey")(AccWizObjectsDotImexGrid_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImexGrid]
  }
  @scala.inline
  implicit class ImexGridOps[Self <: ImexGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccWizObjectsDotImexGrid_typekey(value: ImexGrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccWizObjects.ImexGrid_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddColumn(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddColumn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddRow(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAllowColumnSizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowColumnSizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackColor(value: OLE_COLOR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalcBestColumns(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalcBestColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearColumns(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClearRows(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withColumnClickBehavior(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnClickBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteColumn(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteRow(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelimiters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawTextLogicalOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrawTextLogicalOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstRowNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstRowNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: IFontDisp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridBackColor(value: OLE_COLOR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridBackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridFont(value: IFontDisp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridHeader(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GridHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPainting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Painting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetHScrollPos(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetHScrollPos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResetVScrollPos(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResetVScrollPos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowText(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowColLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowColLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRowHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowRowHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringDelimiters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringDelimiters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

