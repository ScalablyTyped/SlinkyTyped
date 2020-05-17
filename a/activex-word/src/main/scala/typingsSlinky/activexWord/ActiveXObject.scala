package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.Application
import typingsSlinky.activexWord.Word.Document
import typingsSlinky.activexWord.Word.EventHelperTypes.ApplicationEPostageInsertExArgNames
import typingsSlinky.activexWord.Word.EventHelperTypes.ApplicationEPostageInsertExParameter
import typingsSlinky.activexWord.Word.EventHelperTypes.ApplicationInvokeArgNames
import typingsSlinky.activexWord.Word.EventHelperTypes.ApplicationInvokeParameter
import typingsSlinky.activexWord.Word.OLEControl
import typingsSlinky.activexWord.Word.System
import typingsSlinky.activexWord.Word.WdCompatibility
import typingsSlinky.activexWord.activexWordStrings.ActiveWritingStyle
import typingsSlinky.activexWord.activexWordStrings.AddRef
import typingsSlinky.activexWord.activexWordStrings.BlockType
import typingsSlinky.activexWord.activexWordStrings.BuildingBlockInsert
import typingsSlinky.activexWord.activexWordStrings.Cancel
import typingsSlinky.activexWord.activexWordStrings.Category
import typingsSlinky.activexWord.activexWordStrings.Close
import typingsSlinky.activexWord.activexWordStrings.CloseReason
import typingsSlinky.activexWord.activexWordStrings.Compatibility
import typingsSlinky.activexWord.activexWordStrings.Content
import typingsSlinky.activexWord.activexWordStrings.ContentControl
import typingsSlinky.activexWord.activexWordStrings.ContentControlAfterAdd
import typingsSlinky.activexWord.activexWordStrings.ContentControlBeforeContentUpdate
import typingsSlinky.activexWord.activexWordStrings.ContentControlBeforeDelete
import typingsSlinky.activexWord.activexWordStrings.ContentControlBeforeStoreUpdate
import typingsSlinky.activexWord.activexWordStrings.ContentControlOnEnter
import typingsSlinky.activexWord.activexWordStrings.ContentControlOnExit
import typingsSlinky.activexWord.activexWordStrings.DeletedRange
import typingsSlinky.activexWord.activexWordStrings.Doc
import typingsSlinky.activexWord.activexWordStrings.DocResult
import typingsSlinky.activexWord.activexWordStrings.DocumentBeforeClose
import typingsSlinky.activexWord.activexWordStrings.DocumentBeforePrint
import typingsSlinky.activexWord.activexWordStrings.DocumentBeforeSave
import typingsSlinky.activexWord.activexWordStrings.DocumentChange
import typingsSlinky.activexWord.activexWordStrings.DocumentOpen
import typingsSlinky.activexWord.activexWordStrings.DocumentSync
import typingsSlinky.activexWord.activexWordStrings.EPostageInsert
import typingsSlinky.activexWord.activexWordStrings.EPostageInsertEx
import typingsSlinky.activexWord.activexWordStrings.EPostagePropertyDialog
import typingsSlinky.activexWord.activexWordStrings.EndRecord
import typingsSlinky.activexWord.activexWordStrings.FromState
import typingsSlinky.activexWord.activexWordStrings.GetIDsOfNames
import typingsSlinky.activexWord.activexWordStrings.GetTypeInfo
import typingsSlinky.activexWord.activexWordStrings.GetTypeInfoCount
import typingsSlinky.activexWord.activexWordStrings.GotFocus
import typingsSlinky.activexWord.activexWordStrings.Handled
import typingsSlinky.activexWord.activexWordStrings.InUndoRedo
import typingsSlinky.activexWord.activexWordStrings.Invoke
import typingsSlinky.activexWord.activexWordStrings.LostFocus
import typingsSlinky.activexWord.activexWordStrings.MailMergeAfterMerge
import typingsSlinky.activexWord.activexWordStrings.MailMergeAfterRecordMerge
import typingsSlinky.activexWord.activexWordStrings.MailMergeBeforeMerge
import typingsSlinky.activexWord.activexWordStrings.MailMergeBeforeRecordMerge
import typingsSlinky.activexWord.activexWordStrings.MailMergeDataSourceLoad
import typingsSlinky.activexWord.activexWordStrings.MailMergeDataSourceValidate
import typingsSlinky.activexWord.activexWordStrings.MailMergeDataSourceValidate2
import typingsSlinky.activexWord.activexWordStrings.MailMergeWizardSendToCustom
import typingsSlinky.activexWord.activexWordStrings.MailMergeWizardStateChange
import typingsSlinky.activexWord.activexWordStrings.Name
import typingsSlinky.activexWord.activexWordStrings.New
import typingsSlinky.activexWord.activexWordStrings.NewContentControl
import typingsSlinky.activexWord.activexWordStrings.NewDocument
import typingsSlinky.activexWord.activexWordStrings.NewXMLNode
import typingsSlinky.activexWord.activexWordStrings.OldContentControl
import typingsSlinky.activexWord.activexWordStrings.OldXMLNode
import typingsSlinky.activexWord.activexWordStrings.Open
import typingsSlinky.activexWord.activexWordStrings.PrivateProfileString
import typingsSlinky.activexWord.activexWordStrings.ProtectedViewWindowActivate
import typingsSlinky.activexWord.activexWordStrings.ProtectedViewWindowBeforeClose
import typingsSlinky.activexWord.activexWordStrings.ProtectedViewWindowBeforeEdit
import typingsSlinky.activexWord.activexWordStrings.ProtectedViewWindowDeactivate
import typingsSlinky.activexWord.activexWordStrings.ProtectedViewWindowOpen
import typingsSlinky.activexWord.activexWordStrings.ProtectedViewWindowSize
import typingsSlinky.activexWord.activexWordStrings.PvWindow
import typingsSlinky.activexWord.activexWordStrings.QueryInterface
import typingsSlinky.activexWord.activexWordStrings.Quit
import typingsSlinky.activexWord.activexWordStrings.Range
import typingsSlinky.activexWord.activexWordStrings.Reason
import typingsSlinky.activexWord.activexWordStrings.Release
import typingsSlinky.activexWord.activexWordStrings.SaveAsUI
import typingsSlinky.activexWord.activexWordStrings.Sel
import typingsSlinky.activexWord.activexWordStrings.StartRecord
import typingsSlinky.activexWord.activexWordStrings.Startup
import typingsSlinky.activexWord.activexWordStrings.Sync
import typingsSlinky.activexWord.activexWordStrings.SyncEventType
import typingsSlinky.activexWord.activexWordStrings.Template
import typingsSlinky.activexWord.activexWordStrings.ToState
import typingsSlinky.activexWord.activexWordStrings.WindowActivate
import typingsSlinky.activexWord.activexWordStrings.WindowBeforeDoubleClick
import typingsSlinky.activexWord.activexWordStrings.WindowBeforeRightClick
import typingsSlinky.activexWord.activexWordStrings.WindowDeactivate
import typingsSlinky.activexWord.activexWordStrings.WindowSelectionChange
import typingsSlinky.activexWord.activexWordStrings.WindowSize
import typingsSlinky.activexWord.activexWordStrings.Wn
import typingsSlinky.activexWord.activexWordStrings.XMLAfterInsert
import typingsSlinky.activexWord.activexWordStrings.XMLBeforeDelete
import typingsSlinky.activexWord.activexWordStrings.XMLNode
import typingsSlinky.activexWord.activexWordStrings.XMLSelectionChange
import typingsSlinky.activexWord.activexWordStrings.XMLValidationError
import typingsSlinky.activexWord.activexWordStrings.cNames
import typingsSlinky.activexWord.activexWordStrings.itinfo
import typingsSlinky.activexWord.activexWordStrings.lcid
import typingsSlinky.activexWord.activexWordStrings.pctinfo
import typingsSlinky.activexWord.activexWordStrings.pptinfo
import typingsSlinky.activexWord.activexWordStrings.ppvObj
import typingsSlinky.activexWord.activexWordStrings.rgdispid
import typingsSlinky.activexWord.activexWordStrings.rgszNames
import typingsSlinky.activexWord.activexWordStrings.riid
import typingsSlinky.activexWord.anon.CNames
import typingsSlinky.activexWord.anon.CancelContentControl
import typingsSlinky.activexWord.anon.CancelPvWindow
import typingsSlinky.activexWord.anon.DocDocument
import typingsSlinky.activexWord.anon.DocHandled
import typingsSlinky.activexWord.anon.InUndoRedoNewXMLNode
import typingsSlinky.activexWord.anon.Itinfo
import typingsSlinky.activexWord.anon.Pctinfo
import typingsSlinky.activexWord.anon.PpvObj
import typingsSlinky.activexWord.anon.SelSelection
import typingsSlinky.activexWord.anon.SyncEventTypeMsoSyncEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Application,
    event: DocumentBeforeClose,
    argNames: js.Tuple2[Doc, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexWord.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentBeforePrint,
    argNames: js.Tuple2[Doc, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexWord.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentBeforeSave,
    argNames: js.Tuple3[Doc, SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexWord.anon.Doc, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentOpen,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ DocDocument, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentSync,
    argNames: js.Tuple2[Doc, SyncEventType],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexWord.anon.SyncEventType, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: EPostageInsert,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ DocDocument, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: EPostagePropertyDialog,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ DocDocument, Unit]
  ): Unit = js.native
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
    event: MailMergeAfterMerge,
    argNames: js.Tuple2[Doc, DocResult],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexWord.anon.DocResult, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeAfterRecordMerge,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ DocDocument, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeBeforeMerge,
    argNames: js.Tuple4[Doc, StartRecord, EndRecord, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexWord.anon.EndRecord, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeBeforeRecordMerge,
    argNames: js.Tuple2[Doc, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexWord.anon.Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeDataSourceLoad,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ DocDocument, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeDataSourceValidate2,
    argNames: js.Tuple2[Doc, Handled],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ DocHandled, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeDataSourceValidate,
    argNames: js.Tuple2[Doc, Handled],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexWord.anon.Handled, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeWizardSendToCustom,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ DocDocument, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeWizardStateChange,
    argNames: js.Tuple4[Doc, FromState, ToState, Handled],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexWord.anon.FromState, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewDocument,
    argNames: js.Array[Doc],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ DocDocument, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[PvWindow],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexWord.anon.PvWindow, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[PvWindow, CloseReason, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexWord.anon.CloseReason, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[PvWindow, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelPvWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[PvWindow],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexWord.anon.PvWindow, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[PvWindow],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexWord.anon.PvWindow, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowSize,
    argNames: js.Array[PvWindow],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexWord.anon.PvWindow, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Doc, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexWord.anon.Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeDoubleClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexWord.anon.Sel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeRightClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexWord.anon.Sel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Doc, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexWord.anon.Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSelectionChange,
    argNames: js.Array[Sel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ SelSelection, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSize,
    argNames: js.Tuple2[Doc, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexWord.anon.Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: XMLSelectionChange,
    argNames: js.Tuple4[Sel, OldXMLNode, NewXMLNode, Reason],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typingsSlinky.activexWord.anon.NewXMLNode, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: XMLValidationError,
    argNames: js.Array[XMLNode],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typingsSlinky.activexWord.anon.XMLNode, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: BuildingBlockInsert,
    argNames: js.Tuple5[Range, Name, Category, BlockType, Template],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ typingsSlinky.activexWord.anon.BlockType, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlAfterAdd,
    argNames: js.Tuple2[NewContentControl, InUndoRedo],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ typingsSlinky.activexWord.anon.InUndoRedo, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlBeforeContentUpdate,
    argNames: js.Tuple2[ContentControl, Content],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ typingsSlinky.activexWord.anon.Content, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlBeforeDelete,
    argNames: js.Tuple2[OldContentControl, InUndoRedo],
    handler: js.ThisFunction1[
      /* this */ Document, 
      /* parameter */ typingsSlinky.activexWord.anon.OldContentControl, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlBeforeStoreUpdate,
    argNames: js.Tuple2[ContentControl, Content],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ typingsSlinky.activexWord.anon.Content, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlOnEnter,
    argNames: js.Array[ContentControl],
    handler: js.ThisFunction1[
      /* this */ Document, 
      /* parameter */ typingsSlinky.activexWord.anon.ContentControl, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlOnExit,
    argNames: js.Tuple2[ContentControl, Cancel],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ CancelContentControl, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: Sync,
    argNames: js.Array[SyncEventType],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ SyncEventTypeMsoSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: XMLAfterInsert,
    argNames: js.Tuple2[NewXMLNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ InUndoRedoNewXMLNode, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: XMLBeforeDelete,
    argNames: js.Tuple3[DeletedRange, OldXMLNode, InUndoRedo],
    handler: js.ThisFunction1[
      /* this */ Document, 
      /* parameter */ typingsSlinky.activexWord.anon.DeletedRange, 
      Unit
    ]
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
    argNames: ApplicationEPostageInsertExArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ApplicationEPostageInsertExParameter, Unit]
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
    argNames: ApplicationInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ApplicationInvokeParameter, Unit]
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

