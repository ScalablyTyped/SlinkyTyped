package typingsSlinky.activexExcel

import typingsSlinky.activexExcel.Excel.Application
import typingsSlinky.activexExcel.Excel.Chart
import typingsSlinky.activexExcel.Excel.ControlFormat
import typingsSlinky.activexExcel.Excel.EventHelperTypes.ApplicationInvokeArgNames
import typingsSlinky.activexExcel.Excel.EventHelperTypes.ApplicationInvokeParameter
import typingsSlinky.activexExcel.Excel.EventHelperTypes.ChartInvokeArgNames
import typingsSlinky.activexExcel.Excel.EventHelperTypes.ChartInvokeParameter
import typingsSlinky.activexExcel.Excel.EventHelperTypes.OLEObjectInvokeArgNames
import typingsSlinky.activexExcel.Excel.EventHelperTypes.OLEObjectInvokeParameter
import typingsSlinky.activexExcel.Excel.EventHelperTypes.QueryTableInvokeArgNames
import typingsSlinky.activexExcel.Excel.EventHelperTypes.QueryTableInvokeParameter
import typingsSlinky.activexExcel.Excel.EventHelperTypes.WorkbookInvokeArgNames
import typingsSlinky.activexExcel.Excel.EventHelperTypes.WorkbookInvokeParameter
import typingsSlinky.activexExcel.Excel.EventHelperTypes.WorksheetInvokeArgNames
import typingsSlinky.activexExcel.Excel.EventHelperTypes.WorksheetInvokeParameter
import typingsSlinky.activexExcel.Excel.OLEObject
import typingsSlinky.activexExcel.Excel.PageSetup
import typingsSlinky.activexExcel.Excel.PivotField
import typingsSlinky.activexExcel.Excel.PivotFieldSubtotal
import typingsSlinky.activexExcel.Excel.QueryTable
import typingsSlinky.activexExcel.Excel.Range
import typingsSlinky.activexExcel.Excel.Workbook
import typingsSlinky.activexExcel.Excel.Worksheet
import typingsSlinky.activexExcel.Excel.XlAxisGroup
import typingsSlinky.activexExcel.Excel.XlAxisType
import typingsSlinky.activexExcel.Excel.XlRangeValueDataType
import typingsSlinky.activexExcel.activexExcelStrings.Activate
import typingsSlinky.activexExcel.activexExcelStrings.AddRef
import typingsSlinky.activexExcel.activexExcelStrings.AddinInstall
import typingsSlinky.activexExcel.activexExcelStrings.AddinUninstall
import typingsSlinky.activexExcel.activexExcelStrings.AfterCalculate
import typingsSlinky.activexExcel.activexExcelStrings.AfterRefresh
import typingsSlinky.activexExcel.activexExcelStrings.AfterSave
import typingsSlinky.activexExcel.activexExcelStrings.AfterXmlExport
import typingsSlinky.activexExcel.activexExcelStrings.AfterXmlImport
import typingsSlinky.activexExcel.activexExcelStrings.Arg1
import typingsSlinky.activexExcel.activexExcelStrings.Arg2
import typingsSlinky.activexExcel.activexExcelStrings.BeforeClose
import typingsSlinky.activexExcel.activexExcelStrings.BeforeDoubleClick
import typingsSlinky.activexExcel.activexExcelStrings.BeforePrint
import typingsSlinky.activexExcel.activexExcelStrings.BeforeRefresh
import typingsSlinky.activexExcel.activexExcelStrings.BeforeRightClick
import typingsSlinky.activexExcel.activexExcelStrings.BeforeSave
import typingsSlinky.activexExcel.activexExcelStrings.BeforeXmlExport
import typingsSlinky.activexExcel.activexExcelStrings.BeforeXmlImport
import typingsSlinky.activexExcel.activexExcelStrings.Button
import typingsSlinky.activexExcel.activexExcelStrings.Calculate
import typingsSlinky.activexExcel.activexExcelStrings.Cancel
import typingsSlinky.activexExcel.activexExcelStrings.Ch
import typingsSlinky.activexExcel.activexExcelStrings.Change
import typingsSlinky.activexExcel.activexExcelStrings.Colors
import typingsSlinky.activexExcel.activexExcelStrings.Deactivate
import typingsSlinky.activexExcel.activexExcelStrings.Description
import typingsSlinky.activexExcel.activexExcelStrings.DragOver
import typingsSlinky.activexExcel.activexExcelStrings.DragPlot
import typingsSlinky.activexExcel.activexExcelStrings.ElementID
import typingsSlinky.activexExcel.activexExcelStrings.FollowHyperlink
import typingsSlinky.activexExcel.activexExcelStrings.GetIDsOfNames
import typingsSlinky.activexExcel.activexExcelStrings.GetTypeInfo
import typingsSlinky.activexExcel.activexExcelStrings.GetTypeInfoCount
import typingsSlinky.activexExcel.activexExcelStrings.GotFocus
import typingsSlinky.activexExcel.activexExcelStrings.HasAxis
import typingsSlinky.activexExcel.activexExcelStrings.Invoke
import typingsSlinky.activexExcel.activexExcelStrings.IsRefresh
import typingsSlinky.activexExcel.activexExcelStrings.List
import typingsSlinky.activexExcel.activexExcelStrings.LostFocus
import typingsSlinky.activexExcel.activexExcelStrings.Map
import typingsSlinky.activexExcel.activexExcelStrings.MouseDown
import typingsSlinky.activexExcel.activexExcelStrings.MouseMove
import typingsSlinky.activexExcel.activexExcelStrings.MouseUp
import typingsSlinky.activexExcel.activexExcelStrings.NewChart
import typingsSlinky.activexExcel.activexExcelStrings.NewSheet
import typingsSlinky.activexExcel.activexExcelStrings.NewWorkbook
import typingsSlinky.activexExcel.activexExcelStrings.Open
import typingsSlinky.activexExcel.activexExcelStrings.PivotTableAfterValueChange
import typingsSlinky.activexExcel.activexExcelStrings.PivotTableBeforeAllocateChanges
import typingsSlinky.activexExcel.activexExcelStrings.PivotTableBeforeCommitChanges
import typingsSlinky.activexExcel.activexExcelStrings.PivotTableBeforeDiscardChanges
import typingsSlinky.activexExcel.activexExcelStrings.PivotTableChangeSync
import typingsSlinky.activexExcel.activexExcelStrings.PivotTableCloseConnection
import typingsSlinky.activexExcel.activexExcelStrings.PivotTableOpenConnection
import typingsSlinky.activexExcel.activexExcelStrings.PivotTableUpdate
import typingsSlinky.activexExcel.activexExcelStrings.PointIndex
import typingsSlinky.activexExcel.activexExcelStrings.PrintQuality
import typingsSlinky.activexExcel.activexExcelStrings.ProtectedViewWindowActivate
import typingsSlinky.activexExcel.activexExcelStrings.ProtectedViewWindowBeforeClose
import typingsSlinky.activexExcel.activexExcelStrings.ProtectedViewWindowBeforeEdit
import typingsSlinky.activexExcel.activexExcelStrings.ProtectedViewWindowDeactivate
import typingsSlinky.activexExcel.activexExcelStrings.ProtectedViewWindowOpen
import typingsSlinky.activexExcel.activexExcelStrings.ProtectedViewWindowResize
import typingsSlinky.activexExcel.activexExcelStrings.Pvw
import typingsSlinky.activexExcel.activexExcelStrings.QueryInterface
import typingsSlinky.activexExcel.activexExcelStrings.Reason
import typingsSlinky.activexExcel.activexExcelStrings.Release
import typingsSlinky.activexExcel.activexExcelStrings.Resize
import typingsSlinky.activexExcel.activexExcelStrings.Result
import typingsSlinky.activexExcel.activexExcelStrings.RowsetComplete
import typingsSlinky.activexExcel.activexExcelStrings.SaveAsUI
import typingsSlinky.activexExcel.activexExcelStrings.Select
import typingsSlinky.activexExcel.activexExcelStrings.SelectionChange
import typingsSlinky.activexExcel.activexExcelStrings.SeriesChange
import typingsSlinky.activexExcel.activexExcelStrings.SeriesIndex
import typingsSlinky.activexExcel.activexExcelStrings.Sh
import typingsSlinky.activexExcel.activexExcelStrings.Sheet
import typingsSlinky.activexExcel.activexExcelStrings.SheetActivate
import typingsSlinky.activexExcel.activexExcelStrings.SheetBeforeDoubleClick
import typingsSlinky.activexExcel.activexExcelStrings.SheetBeforeRightClick
import typingsSlinky.activexExcel.activexExcelStrings.SheetCalculate
import typingsSlinky.activexExcel.activexExcelStrings.SheetChange
import typingsSlinky.activexExcel.activexExcelStrings.SheetDeactivate
import typingsSlinky.activexExcel.activexExcelStrings.SheetFollowHyperlink
import typingsSlinky.activexExcel.activexExcelStrings.SheetPivotTableAfterValueChange
import typingsSlinky.activexExcel.activexExcelStrings.SheetPivotTableBeforeAllocateChanges
import typingsSlinky.activexExcel.activexExcelStrings.SheetPivotTableBeforeCommitChanges
import typingsSlinky.activexExcel.activexExcelStrings.SheetPivotTableBeforeDiscardChanges
import typingsSlinky.activexExcel.activexExcelStrings.SheetPivotTableChangeSync
import typingsSlinky.activexExcel.activexExcelStrings.SheetPivotTableUpdate
import typingsSlinky.activexExcel.activexExcelStrings.SheetSelectionChange
import typingsSlinky.activexExcel.activexExcelStrings.Shift
import typingsSlinky.activexExcel.activexExcelStrings.Subtotals
import typingsSlinky.activexExcel.activexExcelStrings.Success
import typingsSlinky.activexExcel.activexExcelStrings.Sync
import typingsSlinky.activexExcel.activexExcelStrings.SyncEventType
import typingsSlinky.activexExcel.activexExcelStrings.Target
import typingsSlinky.activexExcel.activexExcelStrings.TargetPivotTable
import typingsSlinky.activexExcel.activexExcelStrings.TargetRange
import typingsSlinky.activexExcel.activexExcelStrings.Url
import typingsSlinky.activexExcel.activexExcelStrings.Value
import typingsSlinky.activexExcel.activexExcelStrings.ValueChangeEnd
import typingsSlinky.activexExcel.activexExcelStrings.ValueChangeStart
import typingsSlinky.activexExcel.activexExcelStrings.Wb
import typingsSlinky.activexExcel.activexExcelStrings.WindowActivate
import typingsSlinky.activexExcel.activexExcelStrings.WindowDeactivate
import typingsSlinky.activexExcel.activexExcelStrings.WindowResize
import typingsSlinky.activexExcel.activexExcelStrings.Wn
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookActivate
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookAddinInstall
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookAddinUninstall
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookAfterSave
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookAfterXmlExport
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookAfterXmlImport
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookBeforeClose
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookBeforePrint
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookBeforeSave
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookBeforeXmlExport
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookBeforeXmlImport
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookDeactivate
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookNewChart
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookNewSheet
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookOpen
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookPivotTableCloseConnection
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookPivotTableOpenConnection
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookRowsetComplete
import typingsSlinky.activexExcel.activexExcelStrings.WorkbookSync
import typingsSlinky.activexExcel.activexExcelStrings.cNames
import typingsSlinky.activexExcel.activexExcelStrings.itinfo
import typingsSlinky.activexExcel.activexExcelStrings.lcid
import typingsSlinky.activexExcel.activexExcelStrings.pctinfo
import typingsSlinky.activexExcel.activexExcelStrings.pptinfo
import typingsSlinky.activexExcel.activexExcelStrings.ppvObj
import typingsSlinky.activexExcel.activexExcelStrings.rgdispid
import typingsSlinky.activexExcel.activexExcelStrings.rgszNames
import typingsSlinky.activexExcel.activexExcelStrings.riid
import typingsSlinky.activexExcel.activexExcelStrings.x
import typingsSlinky.activexExcel.activexExcelStrings.y
import typingsSlinky.activexExcel.anon.CNames
import typingsSlinky.activexExcel.anon.CancelBoolean
import typingsSlinky.activexExcel.anon.CancelIsRefresh
import typingsSlinky.activexExcel.anon.CancelMap
import typingsSlinky.activexExcel.anon.CancelPvw
import typingsSlinky.activexExcel.anon.CancelSaveAsUI
import typingsSlinky.activexExcel.anon.CancelTarget
import typingsSlinky.activexExcel.anon.CancelTargetPivotTable
import typingsSlinky.activexExcel.anon.CancelWb
import typingsSlinky.activexExcel.anon.ChChart
import typingsSlinky.activexExcel.anon.IsRefreshMap
import typingsSlinky.activexExcel.anon.Itinfo
import typingsSlinky.activexExcel.anon.MapUrl
import typingsSlinky.activexExcel.anon.Pctinfo
import typingsSlinky.activexExcel.anon.PpvObj
import typingsSlinky.activexExcel.anon.ShTarget
import typingsSlinky.activexExcel.anon.ShWb
import typingsSlinky.activexExcel.anon.ShWorksheet
import typingsSlinky.activexExcel.anon.ShWorksheetTargetPivotTable
import typingsSlinky.activexExcel.anon.SuccessBoolean
import typingsSlinky.activexExcel.anon.SyncEventTypeMsoSyncEventType
import typingsSlinky.activexExcel.anon.TargetHyperlink
import typingsSlinky.activexExcel.anon.TargetPivotTableTargetRange
import typingsSlinky.activexExcel.anon.TargetPivotTableValueChangeEnd
import typingsSlinky.activexExcel.anon.TargetWb
import typingsSlinky.activexExcel.anon.WnWindow
import typingsSlinky.activexExcel.anon.`0`
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: Application,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewWorkbook,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[Pvw, Reason, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[Pvw, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowResize,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetActivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetBeforeDoubleClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Target, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Target, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetCalculate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetDeactivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ShWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexExcel.anon.TargetPivotTable, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexExcel.anon.ValueChangeEnd, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexExcel.anon.ValueChangeEnd, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexExcel.anon.ValueChangeStart, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableUpdate,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ShWorksheetTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetSelectionChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowResize,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookActivate,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAddinInstall,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAddinUninstall,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterSave,
    argNames: js.Tuple2[Wb, Success],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexExcel.anon.Success, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Map, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlImport,
    argNames: js.Tuple4[Wb, Map, IsRefresh, Result],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexExcel.anon.IsRefresh, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeClose,
    argNames: js.Tuple2[Wb, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforePrint,
    argNames: js.Tuple2[Wb, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeSave,
    argNames: js.Tuple3[Wb, SaveAsUI, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexExcel.anon.SaveAsUI, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Url, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlImport,
    argNames: js.Tuple5[Wb, Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelIsRefresh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookDeactivate,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewChart,
    argNames: js.Tuple2[Wb, Ch],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Ch, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewSheet,
    argNames: js.Tuple2[Wb, Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ShWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookOpen,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexExcel.anon.Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookPivotTableCloseConnection,
    argNames: js.Tuple2[Wb, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ TargetWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookPivotTableOpenConnection,
    argNames: js.Tuple2[Wb, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ TargetWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookRowsetComplete,
    argNames: js.Tuple4[Wb, Description, Sheet, Success],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexExcel.anon.Description, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookSync,
    argNames: js.Tuple2[Wb, SyncEventType],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexExcel.anon.SyncEventType, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeDoubleClick,
    argNames: js.Tuple4[ElementID, Arg1, Arg2, Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ typingsSlinky.activexExcel.anon.Arg1, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeRightClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ typingsSlinky.activexExcel.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ typingsSlinky.activexExcel.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ typingsSlinky.activexExcel.anon.Button, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: Select,
    argNames: js.Tuple3[ElementID, Arg1, Arg2],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ typingsSlinky.activexExcel.anon.Arg2, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: SeriesChange,
    argNames: js.Tuple2[SeriesIndex, PointIndex],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ typingsSlinky.activexExcel.anon.PointIndex, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: AfterRefresh,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ SuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: BeforeRefresh,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterSave,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ SuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlExport,
    argNames: js.Tuple3[Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ typingsSlinky.activexExcel.anon.Result, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlImport,
    argNames: js.Tuple3[Map, IsRefresh, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ IsRefreshMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeClose,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforePrint,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeSave,
    argNames: js.Tuple2[SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ CancelSaveAsUI, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlExport,
    argNames: js.Tuple3[Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ CancelMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlImport,
    argNames: js.Tuple4[Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ MapUrl, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: NewChart,
    argNames: js.Array[Ch],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ ChChart, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: NewSheet,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ typingsSlinky.activexExcel.anon.Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: PivotTableCloseConnection,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: PivotTableOpenConnection,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: RowsetComplete,
    argNames: js.Tuple3[Description, Sheet, Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ typingsSlinky.activexExcel.anon.Sheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetActivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ typingsSlinky.activexExcel.anon.Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetBeforeDoubleClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ typingsSlinky.activexExcel.anon.Target, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ typingsSlinky.activexExcel.anon.Target, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetCalculate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ typingsSlinky.activexExcel.anon.Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetDeactivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ typingsSlinky.activexExcel.anon.Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ ShWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[
      /* this */ Workbook, 
      /* parameter */ typingsSlinky.activexExcel.anon.TargetPivotTable, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[
      /* this */ Workbook, 
      /* parameter */ typingsSlinky.activexExcel.anon.ValueChangeEnd, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[
      /* this */ Workbook, 
      /* parameter */ typingsSlinky.activexExcel.anon.ValueChangeEnd, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[
      /* this */ Workbook, 
      /* parameter */ typingsSlinky.activexExcel.anon.ValueChangeStart, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableChangeSync,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ ShWorksheetTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableUpdate,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ ShWorksheetTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetSelectionChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: Sync,
    argNames: js.Array[SyncEventType],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ SyncEventTypeMsoSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowActivate,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ WnWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowDeactivate,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ WnWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowResize,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ WnWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: BeforeDoubleClick,
    argNames: js.Tuple2[Target, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ CancelTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: BeforeRightClick,
    argNames: js.Tuple2[Target, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ CancelTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: Change,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[
      /* this */ Worksheet, 
      /* parameter */ typingsSlinky.activexExcel.anon.TargetRange, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: FollowHyperlink,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ TargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableAfterValueChange,
    argNames: js.Tuple2[TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ TargetPivotTableTargetRange, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeAllocateChanges,
    argNames: js.Tuple4[TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ CancelTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeCommitChanges,
    argNames: js.Tuple4[TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ CancelTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeDiscardChanges,
    argNames: js.Tuple3[TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ TargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableChangeSync,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableUpdate,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ `0`, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: SelectionChange,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[
      /* this */ Worksheet, 
      /* parameter */ typingsSlinky.activexExcel.anon.TargetRange, 
      Unit
    ]
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
    argNames: ApplicationInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ApplicationInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Chart,
    event: Invoke,
    argNames: ChartInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ ChartInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: OLEObject,
    event: Invoke,
    argNames: OLEObjectInvokeArgNames,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ OLEObjectInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: QueryTable,
    event: Invoke,
    argNames: QueryTableInvokeArgNames,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ QueryTableInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Workbook,
    event: Invoke,
    argNames: WorkbookInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ WorkbookInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Worksheet,
    event: Invoke,
    argNames: WorksheetInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ WorksheetInvokeParameter, Unit]
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
