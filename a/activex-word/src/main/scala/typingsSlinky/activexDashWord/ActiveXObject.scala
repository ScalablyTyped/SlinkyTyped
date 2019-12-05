package typingsSlinky.activexDashWord

import typingsSlinky.activexDashWord.Word.Application
import typingsSlinky.activexDashWord.Word.Document
import typingsSlinky.activexDashWord.Word.EventHelperTypes.Application_EPostageInsertEx_ArgNames
import typingsSlinky.activexDashWord.Word.EventHelperTypes.Application_EPostageInsertEx_Parameter
import typingsSlinky.activexDashWord.Word.EventHelperTypes.Application_Invoke_ArgNames
import typingsSlinky.activexDashWord.Word.EventHelperTypes.Application_Invoke_Parameter
import typingsSlinky.activexDashWord.Word.OLEControl
import typingsSlinky.activexDashWord.Word.System
import typingsSlinky.activexDashWord.Word.WdCompatibility
import typingsSlinky.activexDashWord.activexDashWordStrings.ActiveWritingStyle
import typingsSlinky.activexDashWord.activexDashWordStrings.AddRef
import typingsSlinky.activexDashWord.activexDashWordStrings.BlockType
import typingsSlinky.activexDashWord.activexDashWordStrings.BuildingBlockInsert
import typingsSlinky.activexDashWord.activexDashWordStrings.Cancel
import typingsSlinky.activexDashWord.activexDashWordStrings.Category
import typingsSlinky.activexDashWord.activexDashWordStrings.Close
import typingsSlinky.activexDashWord.activexDashWordStrings.CloseReason
import typingsSlinky.activexDashWord.activexDashWordStrings.Compatibility
import typingsSlinky.activexDashWord.activexDashWordStrings.Content
import typingsSlinky.activexDashWord.activexDashWordStrings.ContentControl
import typingsSlinky.activexDashWord.activexDashWordStrings.ContentControlAfterAdd
import typingsSlinky.activexDashWord.activexDashWordStrings.ContentControlBeforeContentUpdate
import typingsSlinky.activexDashWord.activexDashWordStrings.ContentControlBeforeDelete
import typingsSlinky.activexDashWord.activexDashWordStrings.ContentControlBeforeStoreUpdate
import typingsSlinky.activexDashWord.activexDashWordStrings.ContentControlOnEnter
import typingsSlinky.activexDashWord.activexDashWordStrings.ContentControlOnExit
import typingsSlinky.activexDashWord.activexDashWordStrings.DeletedRange
import typingsSlinky.activexDashWord.activexDashWordStrings.Doc
import typingsSlinky.activexDashWord.activexDashWordStrings.DocResult
import typingsSlinky.activexDashWord.activexDashWordStrings.DocumentBeforeClose
import typingsSlinky.activexDashWord.activexDashWordStrings.DocumentBeforePrint
import typingsSlinky.activexDashWord.activexDashWordStrings.DocumentBeforeSave
import typingsSlinky.activexDashWord.activexDashWordStrings.DocumentChange
import typingsSlinky.activexDashWord.activexDashWordStrings.DocumentOpen
import typingsSlinky.activexDashWord.activexDashWordStrings.DocumentSync
import typingsSlinky.activexDashWord.activexDashWordStrings.EPostageInsert
import typingsSlinky.activexDashWord.activexDashWordStrings.EPostageInsertEx
import typingsSlinky.activexDashWord.activexDashWordStrings.EPostagePropertyDialog
import typingsSlinky.activexDashWord.activexDashWordStrings.EndRecord
import typingsSlinky.activexDashWord.activexDashWordStrings.FromState
import typingsSlinky.activexDashWord.activexDashWordStrings.GetIDsOfNames
import typingsSlinky.activexDashWord.activexDashWordStrings.GetTypeInfo
import typingsSlinky.activexDashWord.activexDashWordStrings.GetTypeInfoCount
import typingsSlinky.activexDashWord.activexDashWordStrings.GotFocus
import typingsSlinky.activexDashWord.activexDashWordStrings.Handled
import typingsSlinky.activexDashWord.activexDashWordStrings.InUndoRedo
import typingsSlinky.activexDashWord.activexDashWordStrings.Invoke
import typingsSlinky.activexDashWord.activexDashWordStrings.LostFocus
import typingsSlinky.activexDashWord.activexDashWordStrings.MailMergeAfterMerge
import typingsSlinky.activexDashWord.activexDashWordStrings.MailMergeAfterRecordMerge
import typingsSlinky.activexDashWord.activexDashWordStrings.MailMergeBeforeMerge
import typingsSlinky.activexDashWord.activexDashWordStrings.MailMergeBeforeRecordMerge
import typingsSlinky.activexDashWord.activexDashWordStrings.MailMergeDataSourceLoad
import typingsSlinky.activexDashWord.activexDashWordStrings.MailMergeDataSourceValidate
import typingsSlinky.activexDashWord.activexDashWordStrings.MailMergeDataSourceValidate2
import typingsSlinky.activexDashWord.activexDashWordStrings.MailMergeWizardSendToCustom
import typingsSlinky.activexDashWord.activexDashWordStrings.MailMergeWizardStateChange
import typingsSlinky.activexDashWord.activexDashWordStrings.Name
import typingsSlinky.activexDashWord.activexDashWordStrings.New
import typingsSlinky.activexDashWord.activexDashWordStrings.NewContentControl
import typingsSlinky.activexDashWord.activexDashWordStrings.NewDocument
import typingsSlinky.activexDashWord.activexDashWordStrings.NewXMLNode
import typingsSlinky.activexDashWord.activexDashWordStrings.OldContentControl
import typingsSlinky.activexDashWord.activexDashWordStrings.OldXMLNode
import typingsSlinky.activexDashWord.activexDashWordStrings.Open
import typingsSlinky.activexDashWord.activexDashWordStrings.PrivateProfileString
import typingsSlinky.activexDashWord.activexDashWordStrings.ProtectedViewWindowActivate
import typingsSlinky.activexDashWord.activexDashWordStrings.ProtectedViewWindowBeforeClose
import typingsSlinky.activexDashWord.activexDashWordStrings.ProtectedViewWindowBeforeEdit
import typingsSlinky.activexDashWord.activexDashWordStrings.ProtectedViewWindowDeactivate
import typingsSlinky.activexDashWord.activexDashWordStrings.ProtectedViewWindowOpen
import typingsSlinky.activexDashWord.activexDashWordStrings.ProtectedViewWindowSize
import typingsSlinky.activexDashWord.activexDashWordStrings.PvWindow
import typingsSlinky.activexDashWord.activexDashWordStrings.QueryInterface
import typingsSlinky.activexDashWord.activexDashWordStrings.Quit
import typingsSlinky.activexDashWord.activexDashWordStrings.Range
import typingsSlinky.activexDashWord.activexDashWordStrings.Reason
import typingsSlinky.activexDashWord.activexDashWordStrings.Release
import typingsSlinky.activexDashWord.activexDashWordStrings.SaveAsUI
import typingsSlinky.activexDashWord.activexDashWordStrings.Sel
import typingsSlinky.activexDashWord.activexDashWordStrings.StartRecord
import typingsSlinky.activexDashWord.activexDashWordStrings.Startup
import typingsSlinky.activexDashWord.activexDashWordStrings.Sync
import typingsSlinky.activexDashWord.activexDashWordStrings.SyncEventType
import typingsSlinky.activexDashWord.activexDashWordStrings.Template
import typingsSlinky.activexDashWord.activexDashWordStrings.ToState
import typingsSlinky.activexDashWord.activexDashWordStrings.WindowActivate
import typingsSlinky.activexDashWord.activexDashWordStrings.WindowBeforeDoubleClick
import typingsSlinky.activexDashWord.activexDashWordStrings.WindowBeforeRightClick
import typingsSlinky.activexDashWord.activexDashWordStrings.WindowDeactivate
import typingsSlinky.activexDashWord.activexDashWordStrings.WindowSelectionChange
import typingsSlinky.activexDashWord.activexDashWordStrings.WindowSize
import typingsSlinky.activexDashWord.activexDashWordStrings.Wn
import typingsSlinky.activexDashWord.activexDashWordStrings.XMLAfterInsert
import typingsSlinky.activexDashWord.activexDashWordStrings.XMLBeforeDelete
import typingsSlinky.activexDashWord.activexDashWordStrings.XMLNode
import typingsSlinky.activexDashWord.activexDashWordStrings.XMLSelectionChange
import typingsSlinky.activexDashWord.activexDashWordStrings.XMLValidationError
import typingsSlinky.activexDashWord.activexDashWordStrings.cNames
import typingsSlinky.activexDashWord.activexDashWordStrings.itinfo
import typingsSlinky.activexDashWord.activexDashWordStrings.lcid
import typingsSlinky.activexDashWord.activexDashWordStrings.pctinfo
import typingsSlinky.activexDashWord.activexDashWordStrings.pptinfo
import typingsSlinky.activexDashWord.activexDashWordStrings.ppvObj
import typingsSlinky.activexDashWord.activexDashWordStrings.rgdispid
import typingsSlinky.activexDashWord.activexDashWordStrings.rgszNames
import typingsSlinky.activexDashWord.activexDashWordStrings.riid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Application,
    event: DocumentBeforeClose,
    argNames: js.Tuple2[Doc, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentBeforePrint,
    argNames: js.Tuple2[Doc, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentBeforeSave,
    argNames: js.Tuple3[Doc, SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelDoc, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentOpen,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Doc, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentSync,
    argNames: js.Tuple2[Doc, SyncEventType],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_DocSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: EPostageInsert,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Doc, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: EPostagePropertyDialog,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Doc, Unit]
  ): Unit = js.native
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
    event: MailMergeAfterMerge,
    argNames: js.Tuple2[Doc, DocResult],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_DocDocResult, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeAfterRecordMerge,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Doc, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeBeforeMerge,
    argNames: js.Tuple4[Doc, StartRecord, EndRecord, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelDocEndRecord, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeBeforeRecordMerge,
    argNames: js.Tuple2[Doc, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeDataSourceLoad,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Doc, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeDataSourceValidate2,
    argNames: js.Tuple2[Doc, Handled],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_DocHandledBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeDataSourceValidate,
    argNames: js.Tuple2[Doc, Handled],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_DocHandled, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeWizardSendToCustom,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Doc, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeWizardStateChange,
    argNames: js.Tuple4[Doc, FromState, ToState, Handled],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_DocFromState, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewDocument,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Doc, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[PvWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PvWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[PvWindow, CloseReason, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelCloseReason, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[PvWindow, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelPvWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[PvWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PvWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[PvWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PvWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowSize,
    argNames: js.Array[PvWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PvWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Doc, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_DocWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeDoubleClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeRightClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Doc, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_DocWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSelectionChange,
    argNames: js.Array[Sel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Sel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSize,
    argNames: js.Tuple2[Doc, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_DocWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: XMLSelectionChange,
    argNames: js.Tuple4[Sel, OldXMLNode, NewXMLNode, Reason],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_NewXMLNode, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: XMLValidationError,
    argNames: js.Array[XMLNode],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_XMLNode, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: BuildingBlockInsert,
    argNames: js.Tuple5[Range, Name, Category, BlockType, Template],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ Anon_BlockType, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlAfterAdd,
    argNames: js.Tuple2[NewContentControl, InUndoRedo],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ Anon_InUndoRedo, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlBeforeContentUpdate,
    argNames: js.Tuple2[ContentControl, Content],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ Anon_Content, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlBeforeDelete,
    argNames: js.Tuple2[OldContentControl, InUndoRedo],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ Anon_InUndoRedoOldContentControl, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlBeforeStoreUpdate,
    argNames: js.Tuple2[ContentControl, Content],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ Anon_Content, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlOnEnter,
    argNames: js.Array[ContentControl],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ Anon_ContentControl, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlOnExit,
    argNames: js.Tuple2[ContentControl, Cancel],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ Anon_CancelContentControl, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: Sync,
    argNames: js.Array[SyncEventType],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ Anon_SyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: XMLAfterInsert,
    argNames: js.Tuple2[NewXMLNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ Anon_InUndoRedoNewXMLNode, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: XMLBeforeDelete,
    argNames: js.Tuple3[DeletedRange, OldXMLNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ Anon_DeletedRange, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Application,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Close(
    obj: Document,
    event: Close,
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DocumentChange(
    obj: Application,
    event: DocumentChange,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EPostageInsertEx(
    obj: Application,
    event: EPostageInsertEx,
    argNames: Application_EPostageInsertEx_ArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Application_EPostageInsertEx_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: OLEControl,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Application,
    event: Invoke,
    argNames: Application_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Application_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: OLEControl,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_New(
    obj: Document,
    event: New,
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Open(
    obj: Document,
    event: Open,
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Quit(
    obj: Application,
    event: Quit,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Application,
    event: Release,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Startup(
    obj: Application,
    event: Startup,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_ActiveWritingStyle(obj: Document, propertyName: ActiveWritingStyle, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_Compatibility(
    obj: Document,
    propertyName: Compatibility,
    parameterTypes: js.Array[WdCompatibility],
    newValue: Boolean
  ): Unit = js.native
  @JSName("set")
  def set_PrivateProfileString(
    obj: System,
    propertyName: PrivateProfileString,
    parameterTypes: js.Tuple3[String, String, String],
    newValue: String
  ): Unit = js.native
}

