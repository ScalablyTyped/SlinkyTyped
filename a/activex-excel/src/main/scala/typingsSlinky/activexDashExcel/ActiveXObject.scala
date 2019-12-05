package typingsSlinky.activexDashExcel

import typingsSlinky.activexDashExcel.Excel.Application
import typingsSlinky.activexDashExcel.Excel.Chart
import typingsSlinky.activexDashExcel.Excel.ControlFormat
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.Application_Invoke_ArgNames
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.Application_Invoke_Parameter
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.Chart_Invoke_ArgNames
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.Chart_Invoke_Parameter
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.OLEObject_Invoke_ArgNames
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.OLEObject_Invoke_Parameter
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.QueryTable_Invoke_ArgNames
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.QueryTable_Invoke_Parameter
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.Workbook_Invoke_ArgNames
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.Workbook_Invoke_Parameter
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.Worksheet_Invoke_ArgNames
import typingsSlinky.activexDashExcel.Excel.EventHelperTypes.Worksheet_Invoke_Parameter
import typingsSlinky.activexDashExcel.Excel.OLEObject
import typingsSlinky.activexDashExcel.Excel.PageSetup
import typingsSlinky.activexDashExcel.Excel.PivotField
import typingsSlinky.activexDashExcel.Excel.PivotFieldSubtotal
import typingsSlinky.activexDashExcel.Excel.QueryTable
import typingsSlinky.activexDashExcel.Excel.Range
import typingsSlinky.activexDashExcel.Excel.Workbook
import typingsSlinky.activexDashExcel.Excel.Worksheet
import typingsSlinky.activexDashExcel.Excel.XlAxisGroup
import typingsSlinky.activexDashExcel.Excel.XlAxisType
import typingsSlinky.activexDashExcel.Excel.XlRangeValueDataType
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Activate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.AddRef
import typingsSlinky.activexDashExcel.activexDashExcelStrings.AddinInstall
import typingsSlinky.activexDashExcel.activexDashExcelStrings.AddinUninstall
import typingsSlinky.activexDashExcel.activexDashExcelStrings.AfterCalculate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.AfterRefresh
import typingsSlinky.activexDashExcel.activexDashExcelStrings.AfterSave
import typingsSlinky.activexDashExcel.activexDashExcelStrings.AfterXmlExport
import typingsSlinky.activexDashExcel.activexDashExcelStrings.AfterXmlImport
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Arg1
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Arg2
import typingsSlinky.activexDashExcel.activexDashExcelStrings.BeforeClose
import typingsSlinky.activexDashExcel.activexDashExcelStrings.BeforeDoubleClick
import typingsSlinky.activexDashExcel.activexDashExcelStrings.BeforePrint
import typingsSlinky.activexDashExcel.activexDashExcelStrings.BeforeRefresh
import typingsSlinky.activexDashExcel.activexDashExcelStrings.BeforeRightClick
import typingsSlinky.activexDashExcel.activexDashExcelStrings.BeforeSave
import typingsSlinky.activexDashExcel.activexDashExcelStrings.BeforeXmlExport
import typingsSlinky.activexDashExcel.activexDashExcelStrings.BeforeXmlImport
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Button
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Calculate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Cancel
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Ch
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Change
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Colors
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Deactivate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Description
import typingsSlinky.activexDashExcel.activexDashExcelStrings.DragOver
import typingsSlinky.activexDashExcel.activexDashExcelStrings.DragPlot
import typingsSlinky.activexDashExcel.activexDashExcelStrings.ElementID
import typingsSlinky.activexDashExcel.activexDashExcelStrings.FollowHyperlink
import typingsSlinky.activexDashExcel.activexDashExcelStrings.GetIDsOfNames
import typingsSlinky.activexDashExcel.activexDashExcelStrings.GetTypeInfo
import typingsSlinky.activexDashExcel.activexDashExcelStrings.GetTypeInfoCount
import typingsSlinky.activexDashExcel.activexDashExcelStrings.GotFocus
import typingsSlinky.activexDashExcel.activexDashExcelStrings.HasAxis
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Invoke
import typingsSlinky.activexDashExcel.activexDashExcelStrings.IsRefresh
import typingsSlinky.activexDashExcel.activexDashExcelStrings.List
import typingsSlinky.activexDashExcel.activexDashExcelStrings.LostFocus
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Map
import typingsSlinky.activexDashExcel.activexDashExcelStrings.MouseDown
import typingsSlinky.activexDashExcel.activexDashExcelStrings.MouseMove
import typingsSlinky.activexDashExcel.activexDashExcelStrings.MouseUp
import typingsSlinky.activexDashExcel.activexDashExcelStrings.NewChart
import typingsSlinky.activexDashExcel.activexDashExcelStrings.NewSheet
import typingsSlinky.activexDashExcel.activexDashExcelStrings.NewWorkbook
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Open
import typingsSlinky.activexDashExcel.activexDashExcelStrings.PivotTableAfterValueChange
import typingsSlinky.activexDashExcel.activexDashExcelStrings.PivotTableBeforeAllocateChanges
import typingsSlinky.activexDashExcel.activexDashExcelStrings.PivotTableBeforeCommitChanges
import typingsSlinky.activexDashExcel.activexDashExcelStrings.PivotTableBeforeDiscardChanges
import typingsSlinky.activexDashExcel.activexDashExcelStrings.PivotTableChangeSync
import typingsSlinky.activexDashExcel.activexDashExcelStrings.PivotTableCloseConnection
import typingsSlinky.activexDashExcel.activexDashExcelStrings.PivotTableOpenConnection
import typingsSlinky.activexDashExcel.activexDashExcelStrings.PivotTableUpdate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.PointIndex
import typingsSlinky.activexDashExcel.activexDashExcelStrings.PrintQuality
import typingsSlinky.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowActivate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowBeforeClose
import typingsSlinky.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowBeforeEdit
import typingsSlinky.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowDeactivate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowOpen
import typingsSlinky.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowResize
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Pvw
import typingsSlinky.activexDashExcel.activexDashExcelStrings.QueryInterface
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Reason
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Release
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Resize
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Result
import typingsSlinky.activexDashExcel.activexDashExcelStrings.RowsetComplete
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SaveAsUI
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Select
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SelectionChange
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SeriesChange
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SeriesIndex
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Sh
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Sheet
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetActivate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetBeforeDoubleClick
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetBeforeRightClick
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetCalculate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetChange
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetDeactivate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetFollowHyperlink
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetPivotTableAfterValueChange
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetPivotTableBeforeAllocateChanges
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetPivotTableBeforeCommitChanges
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetPivotTableBeforeDiscardChanges
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetPivotTableChangeSync
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetPivotTableUpdate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SheetSelectionChange
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Shift
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Subtotals
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Success
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Sync
import typingsSlinky.activexDashExcel.activexDashExcelStrings.SyncEventType
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Target
import typingsSlinky.activexDashExcel.activexDashExcelStrings.TargetPivotTable
import typingsSlinky.activexDashExcel.activexDashExcelStrings.TargetRange
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Url
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Value
import typingsSlinky.activexDashExcel.activexDashExcelStrings.ValueChangeEnd
import typingsSlinky.activexDashExcel.activexDashExcelStrings.ValueChangeStart
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Wb
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WindowActivate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WindowDeactivate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WindowResize
import typingsSlinky.activexDashExcel.activexDashExcelStrings.Wn
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookActivate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookAddinInstall
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookAddinUninstall
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookAfterSave
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookAfterXmlExport
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookAfterXmlImport
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookBeforeClose
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookBeforePrint
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookBeforeSave
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookBeforeXmlExport
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookBeforeXmlImport
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookDeactivate
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookNewChart
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookNewSheet
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookOpen
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookPivotTableCloseConnection
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookPivotTableOpenConnection
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookRowsetComplete
import typingsSlinky.activexDashExcel.activexDashExcelStrings.WorkbookSync
import typingsSlinky.activexDashExcel.activexDashExcelStrings.cNames
import typingsSlinky.activexDashExcel.activexDashExcelStrings.itinfo
import typingsSlinky.activexDashExcel.activexDashExcelStrings.lcid
import typingsSlinky.activexDashExcel.activexDashExcelStrings.pctinfo
import typingsSlinky.activexDashExcel.activexDashExcelStrings.pptinfo
import typingsSlinky.activexDashExcel.activexDashExcelStrings.ppvObj
import typingsSlinky.activexDashExcel.activexDashExcelStrings.rgdispid
import typingsSlinky.activexDashExcel.activexDashExcelStrings.rgszNames
import typingsSlinky.activexDashExcel.activexDashExcelStrings.riid
import typingsSlinky.activexDashExcel.activexDashExcelStrings.x
import typingsSlinky.activexDashExcel.activexDashExcelStrings.y
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Application,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewWorkbook,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[Pvw, Reason, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[Pvw, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowResize,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetActivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetBeforeDoubleClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetCalculate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetDeactivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableUpdate,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTargetPivotTableWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetSelectionChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_WbWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_WbWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowResize,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_WbWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookActivate,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAddinInstall,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAddinUninstall,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterSave,
    argNames: js.Tuple2[Wb, Success],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Success, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Map, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlImport,
    argNames: js.Tuple4[Wb, Map, IsRefresh, Result],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_IsRefresh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeClose,
    argNames: js.Tuple2[Wb, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforePrint,
    argNames: js.Tuple2[Wb, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeSave,
    argNames: js.Tuple3[Wb, SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSaveAsUI, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelMap, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlImport,
    argNames: js.Tuple5[Wb, Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelIsRefresh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookDeactivate,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewChart,
    argNames: js.Tuple2[Wb, Ch],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Ch, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewSheet,
    argNames: js.Tuple2[Wb, Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookOpen,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookPivotTableCloseConnection,
    argNames: js.Tuple2[Wb, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Target, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookPivotTableOpenConnection,
    argNames: js.Tuple2[Wb, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Target, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookRowsetComplete,
    argNames: js.Tuple4[Wb, Description, Sheet, Success],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Description, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookSync,
    argNames: js.Tuple2[Wb, SyncEventType],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_SyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeDoubleClick,
    argNames: js.Tuple4[ElementID, Arg1, Arg2, Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Arg1, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeRightClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: Select,
    argNames: js.Tuple3[ElementID, Arg1, Arg2],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Arg1Arg2, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: SeriesChange,
    argNames: js.Tuple2[SeriesIndex, PointIndex],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_PointIndex, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: AfterRefresh,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_SuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: BeforeRefresh,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterSave,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_SuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlExport,
    argNames: js.Tuple3[Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_MapResult, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlImport,
    argNames: js.Tuple3[Map, IsRefresh, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_IsRefreshMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeClose,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforePrint,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeSave,
    argNames: js.Tuple2[SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelSaveAsUIBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlExport,
    argNames: js.Tuple3[Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelMapUrl, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlImport,
    argNames: js.Tuple4[Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelIsRefreshMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: NewChart,
    argNames: js.Array[Ch],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ChChart, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: NewSheet,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: PivotTableCloseConnection,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_TargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: PivotTableOpenConnection,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_TargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: RowsetComplete,
    argNames: js.Tuple3[Description, Sheet, Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_DescriptionSheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetActivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetBeforeDoubleClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetCalculate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetDeactivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableChangeSync,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTargetPivotTableWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableUpdate,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTargetPivotTableWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetSelectionChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: Sync,
    argNames: js.Array[SyncEventType],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_SyncEventTypeMsoSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowActivate,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowDeactivate,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowResize,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: BeforeDoubleClick,
    argNames: js.Tuple2[Target, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_CancelTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: BeforeRightClick,
    argNames: js.Tuple2[Target, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_CancelTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: Change,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetRange, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: FollowHyperlink,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableAfterValueChange,
    argNames: js.Tuple2[TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetPivotTableTargetRange, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeAllocateChanges,
    argNames: js.Tuple4[TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_CancelTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeCommitChanges,
    argNames: js.Tuple4[TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_CancelTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeDiscardChanges,
    argNames: js.Tuple3[TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableChangeSync,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableUpdate,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: SelectionChange,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetRange, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Chart,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Workbook,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Worksheet,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Application,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Chart,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: OLEObject,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: QueryTable,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Workbook,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Worksheet,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddinInstall(
    obj: Workbook,
    event: AddinInstall,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddinUninstall(
    obj: Workbook,
    event: AddinUninstall,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterCalculate(
    obj: Application,
    event: AfterCalculate,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Calculate(
    obj: Chart,
    event: Calculate,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Calculate(
    obj: Worksheet,
    event: Calculate,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Chart,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Workbook,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Worksheet,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DragOver(
    obj: Chart,
    event: DragOver,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DragPlot(
    obj: Chart,
    event: DragPlot,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: OLEObject,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Application,
    event: Invoke,
    argNames: Application_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Application_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Chart,
    event: Invoke,
    argNames: Chart_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Chart_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: OLEObject,
    event: Invoke,
    argNames: OLEObject_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ OLEObject_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: QueryTable,
    event: Invoke,
    argNames: QueryTable_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ QueryTable_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Workbook,
    event: Invoke,
    argNames: Workbook_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Workbook_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Worksheet,
    event: Invoke,
    argNames: Worksheet_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Worksheet_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: OLEObject,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Open(
    obj: Workbook,
    event: Open,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Application,
    event: Release,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Chart,
    event: Release,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: OLEObject,
    event: Release,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: QueryTable,
    event: Release,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Workbook,
    event: Release,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Worksheet,
    event: Release,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Resize(
    obj: Chart,
    event: Resize,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_Colors(obj: Workbook, propertyName: Colors, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_HasAxis(
    obj: Chart,
    propertyName: HasAxis,
    parameterTypes: js.Tuple2[js.UndefOr[XlAxisType], js.UndefOr[XlAxisGroup]],
    newValue: Boolean
  ): Unit = js.native
  @JSName("set")
  def set_List(obj: ControlFormat, propertyName: List, parameterTypes: js.Array[Double], newValue: String): Unit = js.native
  @JSName("set")
  def set_List(
    obj: ControlFormat,
    propertyName: List,
    parameterTypes: js.Array[scala.Nothing],
    newValue: SafeArray[String]
  ): Unit = js.native
  @JSName("set")
  def set_PrintQuality(obj: PageSetup, propertyName: PrintQuality, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_Subtotals(
    obj: PivotField,
    propertyName: Subtotals,
    parameterTypes: js.Array[PivotFieldSubtotal],
    newValue: Boolean
  ): Unit = js.native
  @JSName("set")
  def set_Value(obj: Range, propertyName: Value, parameterTypes: js.Array[XlRangeValueDataType], newValue: js.Any): Unit = js.native
}

