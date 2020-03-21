package typingsSlinky.activexAccess

import typingsSlinky.activexAccess.AccWizObjects.EventHelperTypes.FieldListDragOverArgNames
import typingsSlinky.activexAccess.AccWizObjects.EventHelperTypes.FieldListDragOverParameter
import typingsSlinky.activexAccess.AccWizObjects.EventHelperTypes.FieldListFldListDragDropArgNames
import typingsSlinky.activexAccess.AccWizObjects.EventHelperTypes.FieldListFldListDragDropParameter
import typingsSlinky.activexAccess.AccWizObjects.EventHelperTypes.FieldListFldListDragOverArgNames
import typingsSlinky.activexAccess.AccWizObjects.EventHelperTypes.FieldListFldListDragOverParameter
import typingsSlinky.activexAccess.AccWizObjects.FieldList
import typingsSlinky.activexAccess.AccWizObjects.ImexGrid
import typingsSlinky.activexAccess.Access.Attachment
import typingsSlinky.activexAccess.Access.BoundObjectFrame
import typingsSlinky.activexAccess.Access.CheckBox
import typingsSlinky.activexAccess.Access.CheckBoxInOption
import typingsSlinky.activexAccess.Access.ChildLabel
import typingsSlinky.activexAccess.Access.Class
import typingsSlinky.activexAccess.Access.ComboBox
import typingsSlinky.activexAccess.Access.CommandButton
import typingsSlinky.activexAccess.Access.Control
import typingsSlinky.activexAccess.Access.ControlInReportEvents
import typingsSlinky.activexAccess.Access.CustomControl
import typingsSlinky.activexAccess.Access.CustomControlInReport
import typingsSlinky.activexAccess.Access.EmptyCell
import typingsSlinky.activexAccess.Access.EventHelperTypes.WebBrowserControlBeforeNavigate2ArgNames
import typingsSlinky.activexAccess.Access.EventHelperTypes.WebBrowserControlBeforeNavigate2Parameter
import typingsSlinky.activexAccess.Access.Form
import typingsSlinky.activexAccess.Access.Image
import typingsSlinky.activexAccess.Access.Label
import typingsSlinky.activexAccess.Access.ListBox
import typingsSlinky.activexAccess.Access.NavigationButton
import typingsSlinky.activexAccess.Access.NavigationControl
import typingsSlinky.activexAccess.Access.ObjectFrame
import typingsSlinky.activexAccess.Access.OptionButton
import typingsSlinky.activexAccess.Access.OptionButtonInOption
import typingsSlinky.activexAccess.Access.OptionGroup
import typingsSlinky.activexAccess.Access.PageHdrFtrInReport
import typingsSlinky.activexAccess.Access.PaletteButton
import typingsSlinky.activexAccess.Access.Rectangle
import typingsSlinky.activexAccess.Access.References
import typingsSlinky.activexAccess.Access.Report
import typingsSlinky.activexAccess.Access.Section
import typingsSlinky.activexAccess.Access.SectionInReport
import typingsSlinky.activexAccess.Access.SubForm
import typingsSlinky.activexAccess.Access.SubReport
import typingsSlinky.activexAccess.Access.TabControl
import typingsSlinky.activexAccess.Access.TextBox
import typingsSlinky.activexAccess.Access.ToggleButton
import typingsSlinky.activexAccess.Access.ToggleButtonInOption
import typingsSlinky.activexAccess.Access.WebBrowserControl
import typingsSlinky.activexAccess.activexAccessStrings.Activate
import typingsSlinky.activexAccess.activexAccessStrings.AfterDelConfirm
import typingsSlinky.activexAccess.activexAccessStrings.AfterFinalRender
import typingsSlinky.activexAccess.activexAccessStrings.AfterInsert
import typingsSlinky.activexAccess.activexAccessStrings.AfterLayout
import typingsSlinky.activexAccess.activexAccessStrings.AfterRender
import typingsSlinky.activexAccess.activexAccessStrings.AfterStartup
import typingsSlinky.activexAccess.activexAccessStrings.AfterUpdate
import typingsSlinky.activexAccess.activexAccessStrings.ApplyFilter
import typingsSlinky.activexAccess.activexAccessStrings.ApplyType
import typingsSlinky.activexAccess.activexAccessStrings.AttachmentCurrent
import typingsSlinky.activexAccess.activexAccessStrings.BeforeDelConfirm
import typingsSlinky.activexAccess.activexAccessStrings.BeforeInsert
import typingsSlinky.activexAccess.activexAccessStrings.BeforeNavigate2
import typingsSlinky.activexAccess.activexAccessStrings.BeforeQuery
import typingsSlinky.activexAccess.activexAccessStrings.BeforeRender
import typingsSlinky.activexAccess.activexAccessStrings.BeforeScreenTip
import typingsSlinky.activexAccess.activexAccessStrings.BeforeUpdate
import typingsSlinky.activexAccess.activexAccessStrings.BeginBatchEdit
import typingsSlinky.activexAccess.activexAccessStrings.Button
import typingsSlinky.activexAccess.activexAccessStrings.Cancel
import typingsSlinky.activexAccess.activexAccessStrings.Change
import typingsSlinky.activexAccess.activexAccessStrings.Checked
import typingsSlinky.activexAccess.activexAccessStrings.Click
import typingsSlinky.activexAccess.activexAccessStrings.Close
import typingsSlinky.activexAccess.activexAccessStrings.Code
import typingsSlinky.activexAccess.activexAccessStrings.Column
import typingsSlinky.activexAccess.activexAccessStrings.ColumnCreated
import typingsSlinky.activexAccess.activexAccessStrings.ColumnDeleted
import typingsSlinky.activexAccess.activexAccessStrings.ColumnSelected
import typingsSlinky.activexAccess.activexAccessStrings.ColumnSized
import typingsSlinky.activexAccess.activexAccessStrings.Columns
import typingsSlinky.activexAccess.activexAccessStrings.Command
import typingsSlinky.activexAccess.activexAccessStrings.CommandBeforeExecute
import typingsSlinky.activexAccess.activexAccessStrings.CommandChecked
import typingsSlinky.activexAccess.activexAccessStrings.CommandEnabled
import typingsSlinky.activexAccess.activexAccessStrings.CommandExecute
import typingsSlinky.activexAccess.activexAccessStrings.Count
import typingsSlinky.activexAccess.activexAccessStrings.Current
import typingsSlinky.activexAccess.activexAccessStrings.DataChange
import typingsSlinky.activexAccess.activexAccessStrings.DataErr
import typingsSlinky.activexAccess.activexAccessStrings.DataSetChange
import typingsSlinky.activexAccess.activexAccessStrings.DblClick
import typingsSlinky.activexAccess.activexAccessStrings.Deactivate
import typingsSlinky.activexAccess.activexAccessStrings.Delete
import typingsSlinky.activexAccess.activexAccessStrings.Dirty
import typingsSlinky.activexAccess.activexAccessStrings.DocumentComplete
import typingsSlinky.activexAccess.activexAccessStrings.DragDrop
import typingsSlinky.activexAccess.activexAccessStrings.DragOver
import typingsSlinky.activexAccess.activexAccessStrings.Enabled
import typingsSlinky.activexAccess.activexAccessStrings.Enter
import typingsSlinky.activexAccess.activexAccessStrings.Error
import typingsSlinky.activexAccess.activexAccessStrings.Exit
import typingsSlinky.activexAccess.activexAccessStrings.FieldListIndex
import typingsSlinky.activexAccess.activexAccessStrings.Filter
import typingsSlinky.activexAccess.activexAccessStrings.FilterType
import typingsSlinky.activexAccess.activexAccessStrings.FldListCheckItem
import typingsSlinky.activexAccess.activexAccessStrings.FldListClick
import typingsSlinky.activexAccess.activexAccessStrings.FldListDblClick
import typingsSlinky.activexAccess.activexAccessStrings.FldListDragDrop
import typingsSlinky.activexAccess.activexAccessStrings.FldListDragOver
import typingsSlinky.activexAccess.activexAccessStrings.FldListGotFocus
import typingsSlinky.activexAccess.activexAccessStrings.FldListHdrDblClick
import typingsSlinky.activexAccess.activexAccessStrings.FldListKeyDown
import typingsSlinky.activexAccess.activexAccessStrings.FldListKeyPress
import typingsSlinky.activexAccess.activexAccessStrings.FldListKeyUp
import typingsSlinky.activexAccess.activexAccessStrings.FldListLostFocus
import typingsSlinky.activexAccess.activexAccessStrings.FldListMouseDown
import typingsSlinky.activexAccess.activexAccessStrings.FldListMouseMove
import typingsSlinky.activexAccess.activexAccessStrings.FldListMouseUp
import typingsSlinky.activexAccess.activexAccessStrings.Format
import typingsSlinky.activexAccess.activexAccessStrings.FormatCount
import typingsSlinky.activexAccess.activexAccessStrings.GotFocus
import typingsSlinky.activexAccess.activexAccessStrings.Initialize
import typingsSlinky.activexAccess.activexAccessStrings.ItemAdded
import typingsSlinky.activexAccess.activexAccessStrings.ItemRemoved
import typingsSlinky.activexAccess.activexAccessStrings.KeyAscii
import typingsSlinky.activexAccess.activexAccessStrings.KeyCode
import typingsSlinky.activexAccess.activexAccessStrings.KeyDown
import typingsSlinky.activexAccess.activexAccessStrings.KeyPress
import typingsSlinky.activexAccess.activexAccessStrings.KeyUp
import typingsSlinky.activexAccess.activexAccessStrings.Load
import typingsSlinky.activexAccess.activexAccessStrings.LostFocus
import typingsSlinky.activexAccess.activexAccessStrings.MouseDown
import typingsSlinky.activexAccess.activexAccessStrings.MouseMove
import typingsSlinky.activexAccess.activexAccessStrings.MouseUp
import typingsSlinky.activexAccess.activexAccessStrings.MouseWheel
import typingsSlinky.activexAccess.activexAccessStrings.NavigateError
import typingsSlinky.activexAccess.activexAccessStrings.NewData
import typingsSlinky.activexAccess.activexAccessStrings.NoData
import typingsSlinky.activexAccess.activexAccessStrings.NotInList
import typingsSlinky.activexAccess.activexAccessStrings.OnConnect
import typingsSlinky.activexAccess.activexAccessStrings.OnDisconnect
import typingsSlinky.activexAccess.activexAccessStrings.Open
import typingsSlinky.activexAccess.activexAccessStrings.Page
import typingsSlinky.activexAccess.activexAccessStrings.Paint
import typingsSlinky.activexAccess.activexAccessStrings.PivotTableChange
import typingsSlinky.activexAccess.activexAccessStrings.Print
import typingsSlinky.activexAccess.activexAccessStrings.PrintCount
import typingsSlinky.activexAccess.activexAccessStrings.Progress
import typingsSlinky.activexAccess.activexAccessStrings.ProgressChange
import typingsSlinky.activexAccess.activexAccessStrings.ProgressMax
import typingsSlinky.activexAccess.activexAccessStrings.Query
import typingsSlinky.activexAccess.activexAccessStrings.Reason
import typingsSlinky.activexAccess.activexAccessStrings.RecordExit
import typingsSlinky.activexAccess.activexAccessStrings.Reference
import typingsSlinky.activexAccess.activexAccessStrings.Resize
import typingsSlinky.activexAccess.activexAccessStrings.Response
import typingsSlinky.activexAccess.activexAccessStrings.Retreat
import typingsSlinky.activexAccess.activexAccessStrings.RowText
import typingsSlinky.activexAccess.activexAccessStrings.ScreenTipText
import typingsSlinky.activexAccess.activexAccessStrings.Selected
import typingsSlinky.activexAccess.activexAccessStrings.SelectionChange
import typingsSlinky.activexAccess.activexAccessStrings.Shift
import typingsSlinky.activexAccess.activexAccessStrings.SourceCtlName
import typingsSlinky.activexAccess.activexAccessStrings.SourceFieldList
import typingsSlinky.activexAccess.activexAccessStrings.SourceObject
import typingsSlinky.activexAccess.activexAccessStrings.SourceRow
import typingsSlinky.activexAccess.activexAccessStrings.Status
import typingsSlinky.activexAccess.activexAccessStrings.StatusCode
import typingsSlinky.activexAccess.activexAccessStrings.TargetFrameName
import typingsSlinky.activexAccess.activexAccessStrings.Terminate
import typingsSlinky.activexAccess.activexAccessStrings.Timer
import typingsSlinky.activexAccess.activexAccessStrings.URL
import typingsSlinky.activexAccess.activexAccessStrings.Undo
import typingsSlinky.activexAccess.activexAccessStrings.UndoBatchEdit
import typingsSlinky.activexAccess.activexAccessStrings.Unload
import typingsSlinky.activexAccess.activexAccessStrings.Updated
import typingsSlinky.activexAccess.activexAccessStrings.ViewChange
import typingsSlinky.activexAccess.activexAccessStrings.X
import typingsSlinky.activexAccess.activexAccessStrings.Y
import typingsSlinky.activexAccess.activexAccessStrings.accName
import typingsSlinky.activexAccess.activexAccessStrings.accValue
import typingsSlinky.activexAccess.activexAccessStrings.chartObject
import typingsSlinky.activexAccess.activexAccessStrings.drawObject
import typingsSlinky.activexAccess.activexAccessStrings.pDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: FieldList,
    event: DragDrop,
    argNames: js.Tuple5[SourceCtlName, SourceFieldList, SourceRow, X, Y],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonSourceCtlName, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListCheckItem,
    argNames: js.Array[typingsSlinky.activexAccess.activexAccessStrings.FieldList],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldList, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListClick,
    argNames: js.Array[typingsSlinky.activexAccess.activexAccessStrings.FieldList],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldList, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListDblClick,
    argNames: js.Array[typingsSlinky.activexAccess.activexAccessStrings.FieldList],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldList, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListGotFocus,
    argNames: js.Array[FieldListIndex],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldListIndex, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListHdrDblClick,
    argNames: js.Array[typingsSlinky.activexAccess.activexAccessStrings.FieldList],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldList, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListKeyDown,
    argNames: js.Tuple3[typingsSlinky.activexAccess.activexAccessStrings.FieldList, KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonShift, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListKeyPress,
    argNames: js.Tuple2[typingsSlinky.activexAccess.activexAccessStrings.FieldList, KeyAscii],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldListKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListKeyUp,
    argNames: js.Tuple3[typingsSlinky.activexAccess.activexAccessStrings.FieldList, KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonShift, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListLostFocus,
    argNames: js.Array[FieldListIndex],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonFieldListIndex, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListMouseDown,
    argNames: js.Tuple5[typingsSlinky.activexAccess.activexAccessStrings.FieldList, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonX, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListMouseMove,
    argNames: js.Tuple5[typingsSlinky.activexAccess.activexAccessStrings.FieldList, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonX, Unit]
  ): Unit = js.native
  def on(
    obj: FieldList,
    event: FldListMouseUp,
    argNames: js.Tuple5[typingsSlinky.activexAccess.activexAccessStrings.FieldList, Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ AnonX, Unit]
  ): Unit = js.native
  def on(
    obj: ImexGrid,
    event: ColumnCreated,
    argNames: js.Array[Column],
    handler: js.ThisFunction1[/* this */ ImexGrid, /* parameter */ AnonColumn, Unit]
  ): Unit = js.native
  def on(
    obj: ImexGrid,
    event: ColumnDeleted,
    argNames: js.Array[Column],
    handler: js.ThisFunction1[/* this */ ImexGrid, /* parameter */ AnonColumn, Unit]
  ): Unit = js.native
  def on(
    obj: ImexGrid,
    event: ColumnSelected,
    argNames: js.Array[Column],
    handler: js.ThisFunction1[/* this */ ImexGrid, /* parameter */ AnonColumn, Unit]
  ): Unit = js.native
  def on(
    obj: ImexGrid,
    event: ColumnSized,
    argNames: js.Array[Column],
    handler: js.ThisFunction1[/* this */ ImexGrid, /* parameter */ AnonColumn, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: Dirty,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Attachment,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: BoundObjectFrame,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ AnonCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBoxInOption,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CheckBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: Dirty,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: NotInList,
    argNames: js.Tuple2[NewData, Response],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonNewData, Unit]
  ): Unit = js.native
  def on(
    obj: ComboBox,
    event: Undo,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CommandButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: CustomControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ CustomControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: CustomControl,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[/* this */ CustomControl, /* parameter */ AnonCode, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: BeforeInsert | BeforeUpdate | BeginBatchEdit | DblClick | Delete | Dirty | Open | RecordExit | Undo | UndoBatchEdit | Unload,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: Activate | AfterInsert | AfterUpdate | BeforeQuery | Click | Close | Current | DataSetChange | Deactivate | GotFocus | Load | LostFocus | OnConnect | OnDisconnect | Query | Resize | SelectionChange | Timer,
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: AfterDelConfirm,
    argNames: js.Array[Status],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: AfterFinalRender,
    argNames: js.Array[drawObject],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonDrawObject, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: AfterLayout,
    argNames: js.Array[drawObject],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonDrawObject, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: AfterRender,
    argNames: js.Tuple2[drawObject, chartObject],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonChartObject, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: ApplyFilter,
    argNames: js.Tuple2[Cancel, ApplyType],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonApplyType, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: BeforeDelConfirm,
    argNames: js.Tuple2[Cancel, Response],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonResponse, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: BeforeRender,
    argNames: js.Tuple3[drawObject, chartObject, Cancel],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonCancelChartObject, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: BeforeScreenTip,
    argNames: js.Tuple2[ScreenTipText, SourceObject],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonScreenTipText, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandBeforeExecute,
    argNames: js.Tuple2[Command, Cancel],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonCommand, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandChecked,
    argNames: js.Tuple2[Command, Checked],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonChecked, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandEnabled,
    argNames: js.Tuple2[Command, Enabled],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonEnabled, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: CommandExecute,
    argNames: js.Array[Command],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonCommandAny, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: DataChange,
    argNames: js.Array[Reason],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonReason, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: Error,
    argNames: js.Tuple2[DataErr, Response],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonDataErr, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: Filter,
    argNames: js.Tuple2[Cancel, FilterType],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonFilterType, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: MouseWheel,
    argNames: js.Tuple2[Page, Count],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonCount, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: PivotTableChange,
    argNames: js.Array[Reason],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonReason, Unit]
  ): Unit = js.native
  def on(
    obj: Form,
    event: ViewChange,
    argNames: js.Array[Reason],
    handler: js.ThisFunction1[/* this */ Form, /* parameter */ AnonReason, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Image,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Label,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ListBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: Dirty,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: NavigationControl,
    event: Undo,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ObjectFrame,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ AnonCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButtonInOption,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: OptionGroup,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: Format,
    argNames: js.Tuple2[Cancel, FormatCount],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonFormatCount, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PageHdrFtrInReport,
    event: Print,
    argNames: js.Tuple2[Cancel, PrintCount],
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ AnonPrintCount, Unit]
  ): Unit = js.native
  def on(
    obj: typingsSlinky.activexAccess.Access.Page,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ typingsSlinky.activexAccess.Access.Page, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: typingsSlinky.activexAccess.Access.Page,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ typingsSlinky.activexAccess.Access.Page, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: typingsSlinky.activexAccess.Access.Page,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ typingsSlinky.activexAccess.Access.Page, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: typingsSlinky.activexAccess.Access.Page,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ typingsSlinky.activexAccess.Access.Page, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: PaletteButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Rectangle,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Rectangle, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Rectangle,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Rectangle, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Rectangle,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Rectangle, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Rectangle,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Rectangle, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ AnonReference, Unit]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ AnonReference, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Activate | Click | Close | Current | Deactivate | GotFocus | Load | LostFocus | Page | Resize | Timer,
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: ApplyFilter,
    argNames: js.Tuple2[Cancel, ApplyType],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonApplyType, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Error,
    argNames: js.Tuple2[DataErr, Response],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonDataErr, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Filter,
    argNames: js.Tuple2[Cancel, FilterType],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonFilterType, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: MouseWheel,
    argNames: js.Tuple2[Page, Count],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonCount, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: NoData,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Open,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Report,
    event: Unload,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Report, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: Format,
    argNames: js.Tuple2[Cancel, FormatCount],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonFormatCount, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: SectionInReport,
    event: Print,
    argNames: js.Tuple2[Cancel, PrintCount],
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ AnonPrintCount, Unit]
  ): Unit = js.native
  def on(
    obj: Section,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Section,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Section,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Section,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: SubForm,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SubForm, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: SubReport,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ SubReport, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TabControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: Dirty,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: TextBox,
    event: Undo,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButtonInOption,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: ToggleButton,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: BeforeUpdate,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: DblClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: Dirty,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: DocumentComplete,
    argNames: js.Tuple2[pDisp, URL],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonPDisp, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: Exit,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: KeyDown,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: KeyPress,
    argNames: js.Array[KeyAscii],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonKeyAscii, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: KeyUp,
    argNames: js.Tuple2[KeyCode, Shift],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonKeyCode, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, X, Y],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: NavigateError,
    argNames: js.Tuple5[pDisp, URL, TargetFrameName, StatusCode, Cancel],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonStatusCode, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: ProgressChange,
    argNames: js.Tuple2[Progress, ProgressMax],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonProgress, Unit]
  ): Unit = js.native
  def on(
    obj: WebBrowserControl,
    event: Updated,
    argNames: js.Array[Code],
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ AnonCode, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterStartup(
    obj: FieldList,
    event: AfterStartup,
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: Attachment,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: BoundObjectFrame,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: CheckBoxInOption,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: CheckBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: ComboBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: ListBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: NavigationControl,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OptionButtonInOption,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OptionButton,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: OptionGroup,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: PaletteButton,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: TextBox,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: ToggleButtonInOption,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: ToggleButton,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterUpdate(
    obj: WebBrowserControl,
    event: AfterUpdate,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AttachmentCurrent(
    obj: Attachment,
    event: AttachmentCurrent,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_BeforeNavigate2(
    obj: WebBrowserControl,
    event: BeforeNavigate2,
    argNames: WebBrowserControlBeforeNavigate2ArgNames,
    handler: js.ThisFunction1[
      /* this */ WebBrowserControl, 
      /* parameter */ WebBrowserControlBeforeNavigate2Parameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: Attachment,
    event: Change,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: ComboBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: NavigationControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: TabControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: TextBox,
    event: Change,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Change(
    obj: WebBrowserControl,
    event: Change,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Attachment,
    event: Click,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: BoundObjectFrame,
    event: Click,
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: CheckBoxInOption,
    event: Click,
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: CheckBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ComboBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: CommandButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Image,
    event: Click,
    handler: js.ThisFunction1[/* this */ Image, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Label,
    event: Click,
    handler: js.ThisFunction1[/* this */ Label, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ListBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: NavigationButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: NavigationControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ObjectFrame,
    event: Click,
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OptionButtonInOption,
    event: Click,
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OptionButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: OptionGroup,
    event: Click,
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: PageHdrFtrInReport,
    event: Click,
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: typingsSlinky.activexAccess.Access.Page,
    event: Click,
    handler: js.ThisFunction1[/* this */ typingsSlinky.activexAccess.Access.Page, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: PaletteButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Rectangle,
    event: Click,
    handler: js.ThisFunction1[/* this */ Rectangle, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: SectionInReport,
    event: Click,
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: Section,
    event: Click,
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: TabControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ TabControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: TextBox,
    event: Click,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ToggleButtonInOption,
    event: Click,
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: ToggleButton,
    event: Click,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Click(
    obj: WebBrowserControl,
    event: Click,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DragOver(
    obj: FieldList,
    event: DragOver,
    argNames: FieldListDragOverArgNames,
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ FieldListDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: Attachment,
    event: Enter,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: BoundObjectFrame,
    event: Enter,
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: CheckBoxInOption,
    event: Enter,
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: CheckBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: ComboBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: CommandButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: CustomControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ CustomControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: ListBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: NavigationButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: NavigationControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: ObjectFrame,
    event: Enter,
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OptionButtonInOption,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OptionButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: OptionGroup,
    event: Enter,
    handler: js.ThisFunction1[/* this */ OptionGroup, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: PaletteButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: SubForm,
    event: Enter,
    handler: js.ThisFunction1[/* this */ SubForm, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: SubReport,
    event: Enter,
    handler: js.ThisFunction1[/* this */ SubReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: TextBox,
    event: Enter,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: ToggleButtonInOption,
    event: Enter,
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: ToggleButton,
    event: Enter,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Enter(
    obj: WebBrowserControl,
    event: Enter,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FldListDragDrop(
    obj: FieldList,
    event: FldListDragDrop,
    argNames: FieldListFldListDragDropArgNames,
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ FieldListFldListDragDropParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_FldListDragOver(
    obj: FieldList,
    event: FldListDragOver,
    argNames: FieldListFldListDragOverArgNames,
    handler: js.ThisFunction1[/* this */ FieldList, /* parameter */ FieldListFldListDragOverParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: Attachment,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: BoundObjectFrame,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: CheckBoxInOption,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: CheckBox,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: ComboBox,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: CommandButton,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: CustomControl,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ CustomControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: ListBox,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: NavigationButton,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: NavigationControl,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: ObjectFrame,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: OptionButtonInOption,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: OptionButton,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: PaletteButton,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: TextBox,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: ToggleButtonInOption,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: ToggleButton,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: WebBrowserControl,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Initialize(
    obj: Class,
    event: Initialize,
    handler: js.ThisFunction1[/* this */ Class, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: Attachment,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ Attachment, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: BoundObjectFrame,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ BoundObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: CheckBoxInOption,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ CheckBoxInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: CheckBox,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ CheckBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: ComboBox,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ ComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: CommandButton,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ CommandButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: CustomControl,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ CustomControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: ListBox,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ ListBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: NavigationButton,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ NavigationButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: NavigationControl,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ NavigationControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: ObjectFrame,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ ObjectFrame, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: OptionButtonInOption,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ OptionButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: OptionButton,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ OptionButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: PaletteButton,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ PaletteButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: TextBox,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ TextBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: ToggleButtonInOption,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ ToggleButtonInOption, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: ToggleButton,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ ToggleButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: WebBrowserControl,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ WebBrowserControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Paint(
    obj: PageHdrFtrInReport,
    event: Paint,
    handler: js.ThisFunction1[/* this */ PageHdrFtrInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Paint(
    obj: SectionInReport,
    event: Paint,
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Paint(
    obj: Section,
    event: Paint,
    handler: js.ThisFunction1[/* this */ Section, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Retreat(
    obj: SectionInReport,
    event: Retreat,
    handler: js.ThisFunction1[/* this */ SectionInReport, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Terminate(
    obj: Class,
    event: Terminate,
    handler: js.ThisFunction1[/* this */ Class, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_Columns(obj: ImexGrid, propertyName: Columns, parameterTypes: js.Array[Double], newValue: js.Any): Unit = js.native
  @JSName("set")
  def set_RowText(obj: ImexGrid, propertyName: RowText, parameterTypes: js.Array[Double], newValue: String): Unit = js.native
  @JSName("set")
  def set_Selected(obj: ComboBox, propertyName: Selected, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_Selected(
    obj: ControlInReportEvents,
    propertyName: Selected,
    parameterTypes: js.Array[Double],
    newValue: Double
  ): Unit = js.native
  @JSName("set")
  def set_Selected(obj: Control, propertyName: Selected, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_Selected(obj: ListBox, propertyName: Selected, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_accName(
    obj: CheckBoxInOption | ChildLabel | CustomControlInReport | OptionButtonInOption | ToggleButtonInOption | Attachment | BoundObjectFrame | CheckBox | ComboBox | CommandButton | CustomControl | EmptyCell | Form | Label | ListBox | NavigationButton | NavigationControl | ObjectFrame | OptionButton | OptionGroup | typingsSlinky.activexAccess.Access.Page | SubForm | TabControl | TextBox | ToggleButton | WebBrowserControl,
    propertyName: accName,
    parameterTypes: js.Array[_],
    newValue: String
  ): Unit = js.native
  @JSName("set")
  def set_accValue(
    obj: CheckBoxInOption | ChildLabel | CustomControlInReport | OptionButtonInOption | ToggleButtonInOption | Attachment | BoundObjectFrame | CheckBox | ComboBox | CommandButton | CustomControl | EmptyCell | Form | Label | ListBox | NavigationButton | NavigationControl | ObjectFrame | OptionButton | OptionGroup | typingsSlinky.activexAccess.Access.Page | SubForm | TabControl | TextBox | ToggleButton | WebBrowserControl,
    propertyName: accValue,
    parameterTypes: js.Array[_],
    newValue: String
  ): Unit = js.native
}

