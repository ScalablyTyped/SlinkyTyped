package typingsSlinky.activexDashInfopath

import typingsSlinky.activexDashInfopath.InfoPath.ApplicationEvents
import typingsSlinky.activexDashInfopath.InfoPath.Button
import typingsSlinky.activexDashInfopath.InfoPath.DataDOM
import typingsSlinky.activexDashInfopath.InfoPath.EventHelperTypes.Button_Invoke_ArgNames
import typingsSlinky.activexDashInfopath.InfoPath.EventHelperTypes.Button_Invoke_Parameter
import typingsSlinky.activexDashInfopath.InfoPath.EventHelperTypes.DataDOM_Invoke_ArgNames
import typingsSlinky.activexDashInfopath.InfoPath.EventHelperTypes.DataDOM_Invoke_Parameter
import typingsSlinky.activexDashInfopath.InfoPath.EventHelperTypes.XDocument_Invoke_ArgNames
import typingsSlinky.activexDashInfopath.InfoPath.EventHelperTypes.XDocument_Invoke_Parameter
import typingsSlinky.activexDashInfopath.InfoPath.XDocument
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.AddRef
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.GetIDsOfNames
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.GetTypeInfo
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.GetTypeInfoCount
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.Invoke
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.NewXDocument
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnAfterChange
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnAfterImport
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnBeforeChange
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnClick
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnContextChange
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnLoad
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnMergeRequest
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnSaveRequest
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnSign
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnSubmitRequest
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnSwitchView
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnValidate
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.OnVersionUpgrade
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.QueryInterface
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.Quit
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.Release
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.WindowActivate
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.WindowDeactivate
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.WindowSize
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.XDocumentBeforeClose
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.XDocumentBeforePrint
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.XDocumentBeforeSave
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.XDocumentChange
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.XDocumentOpen
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.cNames
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.itinfo
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.lcid
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.pDataDOMEvent
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.pDocument
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.pEvent
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.pWindow
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.pctinfo
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.pfCancel
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.pptinfo
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.ppvObj
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.rgdispid
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.rgszNames
import typingsSlinky.activexDashInfopath.activexDashInfopathStrings.riid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: ApplicationEvents,
    event: NewXDocument,
    argNames: js.Array[pDocument],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocument, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowActivate,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowDeactivate,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowSize,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforeClose,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforePrint,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforeSave,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentOpen,
    argNames: js.Array[pDocument],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocument, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: OnClick,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Anon_PEvent, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnAfterChange,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_PDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnBeforeChange,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_PDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnValidate,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_PDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnAfterImport,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventDocEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnContextChange,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventDocContextChangeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnLoad,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventDocReturnEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnMergeRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventMergeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSaveRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventSaveEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSign,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventSignEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSubmitRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventDocReturnEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSwitchView,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventDocEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnVersionUpgrade,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventVersionUpgradeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Button,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: DataDOM,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: XDocument,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Button,
    event: Invoke,
    argNames: Button_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Button_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: DataDOM,
    event: Invoke,
    argNames: DataDOM_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ DataDOM_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: XDocument,
    event: Invoke,
    argNames: XDocument_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ XDocument_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Quit(
    obj: ApplicationEvents,
    event: Quit,
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Button,
    event: Release,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: DataDOM,
    event: Release,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: XDocument,
    event: Release,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_XDocumentChange(
    obj: ApplicationEvents,
    event: XDocumentChange,
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

