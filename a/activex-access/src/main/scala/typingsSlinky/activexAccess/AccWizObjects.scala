package typingsSlinky.activexAccess

import typingsSlinky.activexAccess.activexAccessNumbers.`0`
import typingsSlinky.activexAccess.activexAccessNumbers.`10`
import typingsSlinky.activexAccess.activexAccessNumbers.`11`
import typingsSlinky.activexAccess.activexAccessNumbers.`16`
import typingsSlinky.activexAccess.activexAccessNumbers.`17`
import typingsSlinky.activexAccess.activexAccessNumbers.`18`
import typingsSlinky.activexAccess.activexAccessNumbers.`19`
import typingsSlinky.activexAccess.activexAccessNumbers.`1`
import typingsSlinky.activexAccess.activexAccessNumbers.`20`
import typingsSlinky.activexAccess.activexAccessNumbers.`21`
import typingsSlinky.activexAccess.activexAccessNumbers.`22`
import typingsSlinky.activexAccess.activexAccessNumbers.`23`
import typingsSlinky.activexAccess.activexAccessNumbers.`24`
import typingsSlinky.activexAccess.activexAccessNumbers.`25`
import typingsSlinky.activexAccess.activexAccessNumbers.`26`
import typingsSlinky.activexAccess.activexAccessNumbers.`27`
import typingsSlinky.activexAccess.activexAccessNumbers.`2`
import typingsSlinky.activexAccess.activexAccessNumbers.`3`
import typingsSlinky.activexAccess.activexAccessNumbers.`4`
import typingsSlinky.activexAccess.activexAccessNumbers.`5`
import typingsSlinky.activexAccess.activexAccessNumbers.`6`
import typingsSlinky.activexAccess.activexAccessNumbers.`7`
import typingsSlinky.activexAccess.activexAccessNumbers.`8`
import typingsSlinky.activexAccess.activexAccessNumbers.`9`
import typingsSlinky.activexAccess.activexAccessStrings.SourceCtlName
import typingsSlinky.activexAccess.activexAccessStrings.SourceFieldList
import typingsSlinky.activexAccess.activexAccessStrings.SourceRow
import typingsSlinky.activexAccess.activexAccessStrings.State
import typingsSlinky.activexAccess.activexAccessStrings.TargetCtlName
import typingsSlinky.activexAccess.activexAccessStrings.TargetFieldList
import typingsSlinky.activexAccess.activexAccessStrings.TargetRow
import typingsSlinky.activexAccess.activexAccessStrings.X
import typingsSlinky.activexAccess.activexAccessStrings.Y
import typingsSlinky.activexStdole.stdole.IFontDisp
import typingsSlinky.activexStdole.stdole.IPictureDisp
import typingsSlinky.activexStdole.stdole.OLE_COLOR
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccWizObjects {
  
  object EventHelperTypes {
    
    type FieldListDragOverArgNames = js.Tuple6[SourceCtlName, SourceFieldList, SourceRow, State, X, Y]
    
    @js.native
    trait FieldListDragOverParameter extends StObject {
      
      val SourceCtlName: String = js.native
      
      val SourceFieldList: Double = js.native
      
      val SourceRow: Double = js.native
      
      val State: Double = js.native
      
      val X: Double = js.native
      
      val Y: Double = js.native
    }
    object FieldListDragOverParameter {
      
      @scala.inline
      def apply(
        SourceCtlName: String,
        SourceFieldList: Double,
        SourceRow: Double,
        State: Double,
        X: Double,
        Y: Double
      ): FieldListDragOverParameter = {
        val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
        __obj.asInstanceOf[FieldListDragOverParameter]
      }
      
      @scala.inline
      implicit class FieldListDragOverParameterMutableBuilder[Self <: FieldListDragOverParameter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSourceCtlName(value: String): Self = StObject.set(x, "SourceCtlName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceFieldList(value: Double): Self = StObject.set(x, "SourceFieldList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceRow(value: Double): Self = StObject.set(x, "SourceRow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
      }
    }
    
    type FieldListFldListDragDropArgNames = js.Tuple6[SourceCtlName, SourceFieldList, SourceRow, TargetCtlName, TargetFieldList, TargetRow]
    
    @js.native
    trait FieldListFldListDragDropParameter extends StObject {
      
      val SourceCtlName: String = js.native
      
      val SourceFieldList: Double = js.native
      
      val SourceRow: Double = js.native
      
      val TargetCtlName: String = js.native
      
      val TargetFieldList: Double = js.native
      
      val TargetRow: Double = js.native
    }
    object FieldListFldListDragDropParameter {
      
      @scala.inline
      def apply(
        SourceCtlName: String,
        SourceFieldList: Double,
        SourceRow: Double,
        TargetCtlName: String,
        TargetFieldList: Double,
        TargetRow: Double
      ): FieldListFldListDragDropParameter = {
        val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], TargetCtlName = TargetCtlName.asInstanceOf[js.Any], TargetFieldList = TargetFieldList.asInstanceOf[js.Any], TargetRow = TargetRow.asInstanceOf[js.Any])
        __obj.asInstanceOf[FieldListFldListDragDropParameter]
      }
      
      @scala.inline
      implicit class FieldListFldListDragDropParameterMutableBuilder[Self <: FieldListFldListDragDropParameter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSourceCtlName(value: String): Self = StObject.set(x, "SourceCtlName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceFieldList(value: Double): Self = StObject.set(x, "SourceFieldList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceRow(value: Double): Self = StObject.set(x, "SourceRow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetCtlName(value: String): Self = StObject.set(x, "TargetCtlName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetFieldList(value: Double): Self = StObject.set(x, "TargetFieldList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetRow(value: Double): Self = StObject.set(x, "TargetRow", value.asInstanceOf[js.Any])
      }
    }
    
    type FieldListFldListDragOverArgNames = js.Tuple7[SourceCtlName, SourceFieldList, SourceRow, TargetCtlName, TargetFieldList, TargetRow, State]
    
    @js.native
    trait FieldListFldListDragOverParameter extends StObject {
      
      val SourceCtlName: String = js.native
      
      val SourceFieldList: Double = js.native
      
      val SourceRow: Double = js.native
      
      val State: Double = js.native
      
      val TargetCtlName: String = js.native
      
      val TargetFieldList: Double = js.native
      
      val TargetRow: Double = js.native
    }
    object FieldListFldListDragOverParameter {
      
      @scala.inline
      def apply(
        SourceCtlName: String,
        SourceFieldList: Double,
        SourceRow: Double,
        State: Double,
        TargetCtlName: String,
        TargetFieldList: Double,
        TargetRow: Double
      ): FieldListFldListDragOverParameter = {
        val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], TargetCtlName = TargetCtlName.asInstanceOf[js.Any], TargetFieldList = TargetFieldList.asInstanceOf[js.Any], TargetRow = TargetRow.asInstanceOf[js.Any])
        __obj.asInstanceOf[FieldListFldListDragOverParameter]
      }
      
      @scala.inline
      implicit class FieldListFldListDragOverParameterMutableBuilder[Self <: FieldListFldListDragOverParameter] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSourceCtlName(value: String): Self = StObject.set(x, "SourceCtlName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceFieldList(value: Double): Self = StObject.set(x, "SourceFieldList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceRow(value: Double): Self = StObject.set(x, "SourceRow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setState(value: Double): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetCtlName(value: String): Self = StObject.set(x, "TargetCtlName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetFieldList(value: Double): Self = StObject.set(x, "TargetFieldList", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetRow(value: Double): Self = StObject.set(x, "TargetRow", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /** Field List Control */
  @js.native
  trait FieldList extends StObject {
    
    @JSName("AccWizObjects.FieldList_typekey")
    var AccWizObjectsDotFieldList_typekey: FieldList = js.native
    
    def AddFieldList(
      bstrCaption: String,
      nLeft: Double,
      nTop: Double,
      nWidth: Double,
      nHeight: Double,
      nMultiSelectType: Double,
      cCols: Double,
      fShowPictures: Boolean
    ): Unit = js.native
    
    def AddJoinLine(
      IFieldList: Double,
      iField: Double,
      iForeignFieldList: Double,
      iForeignField: Double,
      lAttribs: Double
    ): Unit = js.native
    
    def DeleteFieldList(IFieldList: Double): Unit = js.native
    
    def DeleteJoinLine(IJoinLine: Double): Unit = js.native
    
    val FieldListCount: Double = js.native
    
    def FieldLists(IFieldList: Double): js.Any = js.native
    
    var HScrollPos: Double = js.native
    
    val JoinLineCount: Double = js.native
    
    def JoinLines(IJoinLine: Double): js.Any = js.native
    
    var PersistentHighlight: Boolean = js.native
    
    var Picture: IPictureDisp = js.native
    
    var PictureCols: Double = js.native
    
    var PictureRows: Double = js.native
    
    var ScrollBars: Double = js.native
    
    var SelectedFieldListIndex: Double = js.native
    
    def SetCursor(nCursorID: Double): Unit = js.native
    
    var VScrollPos: Double = js.native
  }
  object FieldList {
    
    @scala.inline
    def apply(
      AccWizObjectsDotFieldList_typekey: FieldList,
      AddFieldList: (String, Double, Double, Double, Double, Double, Double, Boolean) => Unit,
      AddJoinLine: (Double, Double, Double, Double, Double) => Unit,
      DeleteFieldList: Double => Unit,
      DeleteJoinLine: Double => Unit,
      FieldListCount: Double,
      FieldLists: Double => js.Any,
      HScrollPos: Double,
      JoinLineCount: Double,
      JoinLines: Double => js.Any,
      PersistentHighlight: Boolean,
      Picture: IPictureDisp,
      PictureCols: Double,
      PictureRows: Double,
      ScrollBars: Double,
      SelectedFieldListIndex: Double,
      SetCursor: Double => Unit,
      VScrollPos: Double
    ): FieldList = {
      val __obj = js.Dynamic.literal(AddFieldList = js.Any.fromFunction8(AddFieldList), AddJoinLine = js.Any.fromFunction5(AddJoinLine), DeleteFieldList = js.Any.fromFunction1(DeleteFieldList), DeleteJoinLine = js.Any.fromFunction1(DeleteJoinLine), FieldListCount = FieldListCount.asInstanceOf[js.Any], FieldLists = js.Any.fromFunction1(FieldLists), HScrollPos = HScrollPos.asInstanceOf[js.Any], JoinLineCount = JoinLineCount.asInstanceOf[js.Any], JoinLines = js.Any.fromFunction1(JoinLines), PersistentHighlight = PersistentHighlight.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureCols = PictureCols.asInstanceOf[js.Any], PictureRows = PictureRows.asInstanceOf[js.Any], ScrollBars = ScrollBars.asInstanceOf[js.Any], SelectedFieldListIndex = SelectedFieldListIndex.asInstanceOf[js.Any], SetCursor = js.Any.fromFunction1(SetCursor), VScrollPos = VScrollPos.asInstanceOf[js.Any])
      __obj.updateDynamic("AccWizObjects.FieldList_typekey")(AccWizObjectsDotFieldList_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldList]
    }
    
    @scala.inline
    implicit class FieldListMutableBuilder[Self <: FieldList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccWizObjectsDotFieldList_typekey(value: FieldList): Self = StObject.set(x, "AccWizObjects.FieldList_typekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddFieldList(value: (String, Double, Double, Double, Double, Double, Double, Boolean) => Unit): Self = StObject.set(x, "AddFieldList", js.Any.fromFunction8(value))
      
      @scala.inline
      def setAddJoinLine(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "AddJoinLine", js.Any.fromFunction5(value))
      
      @scala.inline
      def setDeleteFieldList(value: Double => Unit): Self = StObject.set(x, "DeleteFieldList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteJoinLine(value: Double => Unit): Self = StObject.set(x, "DeleteJoinLine", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFieldListCount(value: Double): Self = StObject.set(x, "FieldListCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldLists(value: Double => js.Any): Self = StObject.set(x, "FieldLists", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHScrollPos(value: Double): Self = StObject.set(x, "HScrollPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinLineCount(value: Double): Self = StObject.set(x, "JoinLineCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinLines(value: Double => js.Any): Self = StObject.set(x, "JoinLines", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPersistentHighlight(value: Boolean): Self = StObject.set(x, "PersistentHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicture(value: IPictureDisp): Self = StObject.set(x, "Picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPictureCols(value: Double): Self = StObject.set(x, "PictureCols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPictureRows(value: Double): Self = StObject.set(x, "PictureRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollBars(value: Double): Self = StObject.set(x, "ScrollBars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedFieldListIndex(value: Double): Self = StObject.set(x, "SelectedFieldListIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetCursor(value: Double => Unit): Self = StObject.set(x, "SetCursor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVScrollPos(value: Double): Self = StObject.set(x, "VScrollPos", value.asInstanceOf[js.Any])
    }
  }
  
  /** ImexGrid Control */
  @js.native
  trait ImexGrid extends StObject {
    
    @JSName("AccWizObjects.ImexGrid_typekey")
    var AccWizObjectsDotImexGrid_typekey: ImexGrid = js.native
    
    def AddColumn(ColumnCaption: String, ColumnWidth: Double, Index: Double): Unit = js.native
    
    def AddRow(RowText: String, Index: Double): Unit = js.native
    
    var AllowColumnSizing: Boolean = js.native
    
    var BackColor: OLE_COLOR = js.native
    
    def CalcBestColumns(): Unit = js.native
    
    var Caption: String = js.native
    
    def ClearColumns(): Unit = js.native
    
    def ClearRows(): Unit = js.native
    
    var ColumnClickBehavior: Double = js.native
    
    val ColumnCount: Double = js.native
    
    var ColumnState: js.Any = js.native
    
    def Columns(ColumnNumber: Double): js.Any = js.native
    
    def DeleteColumn(Index: Double): Unit = js.native
    
    def DeleteRow(Index: Double): Unit = js.native
    
    var Delimiters: String = js.native
    
    var DrawTextLogicalOrder: Boolean = js.native
    
    var FirstRowNumber: Double = js.native
    
    var Font: IFontDisp = js.native
    
    var GridBackColor: OLE_COLOR = js.native
    
    var GridFont: IFontDisp = js.native
    
    var GridHeader: Double = js.native
    
    var Painting: Boolean = js.native
    
    def Refresh(): Unit = js.native
    
    def ResetHScrollPos(): Unit = js.native
    
    def ResetVScrollPos(): Unit = js.native
    
    val RowCount: Double = js.native
    
    def RowText(RowNumber: Double): String = js.native
    
    var ShowColLines: Boolean = js.native
    
    var ShowRowHeaders: Boolean = js.native
    
    var StringDelimiters: String = js.native
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
    implicit class ImexGridMutableBuilder[Self <: ImexGrid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccWizObjectsDotImexGrid_typekey(value: ImexGrid): Self = StObject.set(x, "AccWizObjects.ImexGrid_typekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddColumn(value: (String, Double, Double) => Unit): Self = StObject.set(x, "AddColumn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddRow(value: (String, Double) => Unit): Self = StObject.set(x, "AddRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAllowColumnSizing(value: Boolean): Self = StObject.set(x, "AllowColumnSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackColor(value: OLE_COLOR): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalcBestColumns(value: () => Unit): Self = StObject.set(x, "CalcBestColumns", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearColumns(value: () => Unit): Self = StObject.set(x, "ClearColumns", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearRows(value: () => Unit): Self = StObject.set(x, "ClearRows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setColumnClickBehavior(value: Double): Self = StObject.set(x, "ColumnClickBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnCount(value: Double): Self = StObject.set(x, "ColumnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnState(value: js.Any): Self = StObject.set(x, "ColumnState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumns(value: Double => js.Any): Self = StObject.set(x, "Columns", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteColumn(value: Double => Unit): Self = StObject.set(x, "DeleteColumn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteRow(value: Double => Unit): Self = StObject.set(x, "DeleteRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDelimiters(value: String): Self = StObject.set(x, "Delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawTextLogicalOrder(value: Boolean): Self = StObject.set(x, "DrawTextLogicalOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstRowNumber(value: Double): Self = StObject.set(x, "FirstRowNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont(value: IFontDisp): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridBackColor(value: OLE_COLOR): Self = StObject.set(x, "GridBackColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridFont(value: IFontDisp): Self = StObject.set(x, "GridFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridHeader(value: Double): Self = StObject.set(x, "GridHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPainting(value: Boolean): Self = StObject.set(x, "Painting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetHScrollPos(value: () => Unit): Self = StObject.set(x, "ResetHScrollPos", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetVScrollPos(value: () => Unit): Self = StObject.set(x, "ResetVScrollPos", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "RowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowText(value: Double => String): Self = StObject.set(x, "RowText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowColLines(value: Boolean): Self = StObject.set(x, "ShowColLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRowHeaders(value: Boolean): Self = StObject.set(x, "ShowRowHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringDelimiters(value: String): Self = StObject.set(x, "StringDelimiters", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.activexAccess.activexAccessNumbers.`26`
    - typingsSlinky.activexAccess.activexAccessNumbers.`10`
    - typingsSlinky.activexAccess.activexAccessNumbers.`25`
    - typingsSlinky.activexAccess.activexAccessNumbers.`23`
    - typingsSlinky.activexAccess.activexAccessNumbers.`22`
    - typingsSlinky.activexAccess.activexAccessNumbers.`24`
    - typingsSlinky.activexAccess.activexAccessNumbers.`3`
    - typingsSlinky.activexAccess.activexAccessNumbers.`0`
    - typingsSlinky.activexAccess.activexAccessNumbers.`16`
    - typingsSlinky.activexAccess.activexAccessNumbers.`17`
    - typingsSlinky.activexAccess.activexAccessNumbers.`6`
    - typingsSlinky.activexAccess.activexAccessNumbers.`20`
    - typingsSlinky.activexAccess.activexAccessNumbers.`19`
    - typingsSlinky.activexAccess.activexAccessNumbers.`18`
    - typingsSlinky.activexAccess.activexAccessNumbers.`5`
    - typingsSlinky.activexAccess.activexAccessNumbers.`4`
    - typingsSlinky.activexAccess.activexAccessNumbers.`27`
    - typingsSlinky.activexAccess.activexAccessNumbers.`2`
    - typingsSlinky.activexAccess.activexAccessNumbers.`8`
    - typingsSlinky.activexAccess.activexAccessNumbers.`9`
    - typingsSlinky.activexAccess.activexAccessNumbers.`11`
    - typingsSlinky.activexAccess.activexAccessNumbers.`7`
    - typingsSlinky.activexAccess.activexAccessNumbers.`21`
  */
  trait WIZ_CSIDL_FLAGS extends StObject
  object WIZ_CSIDL_FLAGS {
    
    @scala.inline
    def WIZ_CSIDL_APPDATA: `26` = 26.asInstanceOf[`26`]
    
    @scala.inline
    def WIZ_CSIDL_BITBUCKET: `10` = 10.asInstanceOf[`10`]
    
    @scala.inline
    def WIZ_CSIDL_COMMON_DESKTOPDIRECTORY: `25` = 25.asInstanceOf[`25`]
    
    @scala.inline
    def WIZ_CSIDL_COMMON_PROGRAMS: `23` = 23.asInstanceOf[`23`]
    
    @scala.inline
    def WIZ_CSIDL_COMMON_STARTMENU: `22` = 22.asInstanceOf[`22`]
    
    @scala.inline
    def WIZ_CSIDL_COMMON_STARTUP: `24` = 24.asInstanceOf[`24`]
    
    @scala.inline
    def WIZ_CSIDL_CONTROLS: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def WIZ_CSIDL_DESKTOP: `0` = 0.asInstanceOf[`0`]
    
    @scala.inline
    def WIZ_CSIDL_DESKTOPDIRECTORY: `16` = 16.asInstanceOf[`16`]
    
    @scala.inline
    def WIZ_CSIDL_DRIVES: `17` = 17.asInstanceOf[`17`]
    
    @scala.inline
    def WIZ_CSIDL_FAVORITES: `6` = 6.asInstanceOf[`6`]
    
    @scala.inline
    def WIZ_CSIDL_FONTS: `20` = 20.asInstanceOf[`20`]
    
    @scala.inline
    def WIZ_CSIDL_NETHOOD: `19` = 19.asInstanceOf[`19`]
    
    @scala.inline
    def WIZ_CSIDL_NETWORK: `18` = 18.asInstanceOf[`18`]
    
    @scala.inline
    def WIZ_CSIDL_PERSONAL: `5` = 5.asInstanceOf[`5`]
    
    @scala.inline
    def WIZ_CSIDL_PRINTERS: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def WIZ_CSIDL_PRINTHOOD: `27` = 27.asInstanceOf[`27`]
    
    @scala.inline
    def WIZ_CSIDL_PROGRAMS: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def WIZ_CSIDL_RECENT: `8` = 8.asInstanceOf[`8`]
    
    @scala.inline
    def WIZ_CSIDL_SENDTO: `9` = 9.asInstanceOf[`9`]
    
    @scala.inline
    def WIZ_CSIDL_STARTMENU: `11` = 11.asInstanceOf[`11`]
    
    @scala.inline
    def WIZ_CSIDL_STARTUP: `7` = 7.asInstanceOf[`7`]
    
    @scala.inline
    def WIZ_CSIDL_TEMPLATES: `21` = 21.asInstanceOf[`21`]
  }
  
  @js.native
  trait WIZ_FILETIME extends StObject {
    
    val dwHighDateTime: Double = js.native
    
    val dwLowDateTime: Double = js.native
  }
  object WIZ_FILETIME {
    
    @scala.inline
    def apply(dwHighDateTime: Double, dwLowDateTime: Double): WIZ_FILETIME = {
      val __obj = js.Dynamic.literal(dwHighDateTime = dwHighDateTime.asInstanceOf[js.Any], dwLowDateTime = dwLowDateTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[WIZ_FILETIME]
    }
    
    @scala.inline
    implicit class WIZ_FILETIMEMutableBuilder[Self <: WIZ_FILETIME] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDwHighDateTime(value: Double): Self = StObject.set(x, "dwHighDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDwLowDateTime(value: Double): Self = StObject.set(x, "dwLowDateTime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.activexAccess.activexAccessNumbers.`1`
    - typingsSlinky.activexAccess.activexAccessNumbers.`2`
  */
  trait WIZ_SLGP_FLAGS extends StObject
  object WIZ_SLGP_FLAGS {
    
    @scala.inline
    def WIZ_SLGP_SHORTPATH: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def WIZ_SLGP_UNCPRIORITY: `2` = 2.asInstanceOf[`2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.activexAccess.activexAccessNumbers.`2`
    - typingsSlinky.activexAccess.activexAccessNumbers.`1`
    - typingsSlinky.activexAccess.activexAccessNumbers.`4`
  */
  trait WIZ_SLR_FLAGS extends StObject
  object WIZ_SLR_FLAGS {
    
    @scala.inline
    def WIZ_SLR_ANY_MATCH: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def WIZ_SLR_NO_UI: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def WIZ_SLR_UPDATE: `4` = 4.asInstanceOf[`4`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.activexAccess.activexAccessNumbers.`3`
    - typingsSlinky.activexAccess.activexAccessNumbers.`7`
    - typingsSlinky.activexAccess.activexAccessNumbers.`5`
  */
  trait WIZ_SW_FLAGS extends StObject
  object WIZ_SW_FLAGS {
    
    @scala.inline
    def WIZ_SW_MAXIMIZE: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def WIZ_SW_MINIMIZE: `7` = 7.asInstanceOf[`7`]
    
    @scala.inline
    def WIZ_SW_NORMAL: `5` = 5.asInstanceOf[`5`]
  }
  
  @js.native
  trait WIZ_WIN32_FIND_DATA extends StObject {
    
    val cAlternate: SafeArray[Double] = js.native
    
    val cFileName: SafeArray[Double] = js.native
    
    val dwFileAttributes: Double = js.native
    
    val dwReserved0: Double = js.native
    
    val dwReserved1: Double = js.native
    
    val ftCreationTime: WIZ_FILETIME = js.native
    
    val ftLastAccessTime: WIZ_FILETIME = js.native
    
    val ftLastWriteTime: WIZ_FILETIME = js.native
    
    val nFileSizeHigh: Double = js.native
    
    val nFileSizeLow: Double = js.native
  }
  object WIZ_WIN32_FIND_DATA {
    
    @scala.inline
    def apply(
      cAlternate: SafeArray[Double],
      cFileName: SafeArray[Double],
      dwFileAttributes: Double,
      dwReserved0: Double,
      dwReserved1: Double,
      ftCreationTime: WIZ_FILETIME,
      ftLastAccessTime: WIZ_FILETIME,
      ftLastWriteTime: WIZ_FILETIME,
      nFileSizeHigh: Double,
      nFileSizeLow: Double
    ): WIZ_WIN32_FIND_DATA = {
      val __obj = js.Dynamic.literal(cAlternate = cAlternate.asInstanceOf[js.Any], cFileName = cFileName.asInstanceOf[js.Any], dwFileAttributes = dwFileAttributes.asInstanceOf[js.Any], dwReserved0 = dwReserved0.asInstanceOf[js.Any], dwReserved1 = dwReserved1.asInstanceOf[js.Any], ftCreationTime = ftCreationTime.asInstanceOf[js.Any], ftLastAccessTime = ftLastAccessTime.asInstanceOf[js.Any], ftLastWriteTime = ftLastWriteTime.asInstanceOf[js.Any], nFileSizeHigh = nFileSizeHigh.asInstanceOf[js.Any], nFileSizeLow = nFileSizeLow.asInstanceOf[js.Any])
      __obj.asInstanceOf[WIZ_WIN32_FIND_DATA]
    }
    
    @scala.inline
    implicit class WIZ_WIN32_FIND_DATAMutableBuilder[Self <: WIZ_WIN32_FIND_DATA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCAlternate(value: SafeArray[Double]): Self = StObject.set(x, "cAlternate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCFileName(value: SafeArray[Double]): Self = StObject.set(x, "cFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDwFileAttributes(value: Double): Self = StObject.set(x, "dwFileAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDwReserved0(value: Double): Self = StObject.set(x, "dwReserved0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDwReserved1(value: Double): Self = StObject.set(x, "dwReserved1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFtCreationTime(value: WIZ_FILETIME): Self = StObject.set(x, "ftCreationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFtLastAccessTime(value: WIZ_FILETIME): Self = StObject.set(x, "ftLastAccessTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFtLastWriteTime(value: WIZ_FILETIME): Self = StObject.set(x, "ftLastWriteTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNFileSizeHigh(value: Double): Self = StObject.set(x, "nFileSizeHigh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNFileSizeLow(value: Double): Self = StObject.set(x, "nFileSizeLow", value.asInstanceOf[js.Any])
    }
  }
  
  /** WizShellLinkA Class */
  @js.native
  trait WizShellLinkA extends StObject {
    
    @JSName("AccWizObjects.WizShellLinkA_typekey")
    var AccWizObjectsDotWizShellLinkA_typekey: WizShellLinkA = js.native
    
    /** GetArguments */
    def GetArguments(pszArgs: String, cchMaxPath: Double): Unit = js.native
    
    /** GetDescription */
    def GetDescription(pszName: String, cchMaxName: Double): Unit = js.native
    
    /** GetHotkey */
    def GetHotkey(pwHotkey: Double): Unit = js.native
    
    /** GetIDList */
    def GetIDList(ppidl: WIZ_CSIDL_FLAGS): Unit = js.native
    
    /** GetIconLocation */
    def GetIconLocation(pszIconPath: String, cchIconPath: Double, piIcon: Double): Unit = js.native
    
    /** GetPath */
    def GetPath(pszFile: String, cchMaxPath: Double, pfd: WIZ_WIN32_FIND_DATA, fflags: Double): Unit = js.native
    
    /** GetShowCmd */
    def GetShowCmd(piShowCmd: WIZ_SW_FLAGS): Unit = js.native
    
    /** GetWorkingDirectory */
    def GetWorkingDirectory(pszDir: String, cchMaxPath: Double): Unit = js.native
    
    /** Resolve */
    def Resolve(hWnd: Double, fflags: Double): Unit = js.native
    
    /** SetArguments */
    def SetArguments(pszArgs: String): Unit = js.native
    
    /** SetDescription */
    def SetDescription(pszName: String): Unit = js.native
    
    /** SetHotkey */
    def SetHotkey(wHotkey: Double): Unit = js.native
    
    /** SetIDList */
    def SetIDList(pidl: WIZ_CSIDL_FLAGS): Unit = js.native
    
    /** SetIconLocation */
    def SetIconLocation(pszIconPath: String, iIcon: Double): Unit = js.native
    
    /** SetPath */
    def SetPath(pszFile: String): Unit = js.native
    
    /** SetRelativePath */
    def SetRelativePath(pszPathRel: String, dwReserved: Double): Unit = js.native
    
    /** SetShowCmd */
    def SetShowCmd(iShowCmd: WIZ_SW_FLAGS): Unit = js.native
    
    /** SetWorkingDirectory */
    def SetWorkingDirectory(pszDir: String): Unit = js.native
  }
  object WizShellLinkA {
    
    @scala.inline
    def apply(
      AccWizObjectsDotWizShellLinkA_typekey: WizShellLinkA,
      GetArguments: (String, Double) => Unit,
      GetDescription: (String, Double) => Unit,
      GetHotkey: Double => Unit,
      GetIDList: WIZ_CSIDL_FLAGS => Unit,
      GetIconLocation: (String, Double, Double) => Unit,
      GetPath: (String, Double, WIZ_WIN32_FIND_DATA, Double) => Unit,
      GetShowCmd: WIZ_SW_FLAGS => Unit,
      GetWorkingDirectory: (String, Double) => Unit,
      Resolve: (Double, Double) => Unit,
      SetArguments: String => Unit,
      SetDescription: String => Unit,
      SetHotkey: Double => Unit,
      SetIDList: WIZ_CSIDL_FLAGS => Unit,
      SetIconLocation: (String, Double) => Unit,
      SetPath: String => Unit,
      SetRelativePath: (String, Double) => Unit,
      SetShowCmd: WIZ_SW_FLAGS => Unit,
      SetWorkingDirectory: String => Unit
    ): WizShellLinkA = {
      val __obj = js.Dynamic.literal(GetArguments = js.Any.fromFunction2(GetArguments), GetDescription = js.Any.fromFunction2(GetDescription), GetHotkey = js.Any.fromFunction1(GetHotkey), GetIDList = js.Any.fromFunction1(GetIDList), GetIconLocation = js.Any.fromFunction3(GetIconLocation), GetPath = js.Any.fromFunction4(GetPath), GetShowCmd = js.Any.fromFunction1(GetShowCmd), GetWorkingDirectory = js.Any.fromFunction2(GetWorkingDirectory), Resolve = js.Any.fromFunction2(Resolve), SetArguments = js.Any.fromFunction1(SetArguments), SetDescription = js.Any.fromFunction1(SetDescription), SetHotkey = js.Any.fromFunction1(SetHotkey), SetIDList = js.Any.fromFunction1(SetIDList), SetIconLocation = js.Any.fromFunction2(SetIconLocation), SetPath = js.Any.fromFunction1(SetPath), SetRelativePath = js.Any.fromFunction2(SetRelativePath), SetShowCmd = js.Any.fromFunction1(SetShowCmd), SetWorkingDirectory = js.Any.fromFunction1(SetWorkingDirectory))
      __obj.updateDynamic("AccWizObjects.WizShellLinkA_typekey")(AccWizObjectsDotWizShellLinkA_typekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizShellLinkA]
    }
    
    @scala.inline
    implicit class WizShellLinkAMutableBuilder[Self <: WizShellLinkA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccWizObjectsDotWizShellLinkA_typekey(value: WizShellLinkA): Self = StObject.set(x, "AccWizObjects.WizShellLinkA_typekey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetArguments(value: (String, Double) => Unit): Self = StObject.set(x, "GetArguments", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDescription(value: (String, Double) => Unit): Self = StObject.set(x, "GetDescription", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetHotkey(value: Double => Unit): Self = StObject.set(x, "GetHotkey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetIDList(value: WIZ_CSIDL_FLAGS => Unit): Self = StObject.set(x, "GetIDList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetIconLocation(value: (String, Double, Double) => Unit): Self = StObject.set(x, "GetIconLocation", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetPath(value: (String, Double, WIZ_WIN32_FIND_DATA, Double) => Unit): Self = StObject.set(x, "GetPath", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGetShowCmd(value: WIZ_SW_FLAGS => Unit): Self = StObject.set(x, "GetShowCmd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetWorkingDirectory(value: (String, Double) => Unit): Self = StObject.set(x, "GetWorkingDirectory", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolve(value: (Double, Double) => Unit): Self = StObject.set(x, "Resolve", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetArguments(value: String => Unit): Self = StObject.set(x, "SetArguments", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDescription(value: String => Unit): Self = StObject.set(x, "SetDescription", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHotkey(value: Double => Unit): Self = StObject.set(x, "SetHotkey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIDList(value: WIZ_CSIDL_FLAGS => Unit): Self = StObject.set(x, "SetIDList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIconLocation(value: (String, Double) => Unit): Self = StObject.set(x, "SetIconLocation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetPath(value: String => Unit): Self = StObject.set(x, "SetPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRelativePath(value: (String, Double) => Unit): Self = StObject.set(x, "SetRelativePath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetShowCmd(value: WIZ_SW_FLAGS => Unit): Self = StObject.set(x, "SetShowCmd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWorkingDirectory(value: String => Unit): Self = StObject.set(x, "SetWorkingDirectory", js.Any.fromFunction1(value))
    }
  }
}
