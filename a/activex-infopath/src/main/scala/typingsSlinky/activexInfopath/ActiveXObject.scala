package typingsSlinky.activexInfopath

import typingsSlinky.activexInfopath.InfoPath.ApplicationEvents
import typingsSlinky.activexInfopath.InfoPath.Button
import typingsSlinky.activexInfopath.InfoPath.DataDOM
import typingsSlinky.activexInfopath.InfoPath.EventHelperTypes.ButtonInvokeArgNames
import typingsSlinky.activexInfopath.InfoPath.EventHelperTypes.ButtonInvokeParameter
import typingsSlinky.activexInfopath.InfoPath.EventHelperTypes.DataDOMInvokeArgNames
import typingsSlinky.activexInfopath.InfoPath.EventHelperTypes.DataDOMInvokeParameter
import typingsSlinky.activexInfopath.InfoPath.EventHelperTypes.XDocumentInvokeArgNames
import typingsSlinky.activexInfopath.InfoPath.EventHelperTypes.XDocumentInvokeParameter
import typingsSlinky.activexInfopath.InfoPath.XDocument
import typingsSlinky.activexInfopath.activexInfopathStrings.AddRef
import typingsSlinky.activexInfopath.activexInfopathStrings.GetIDsOfNames
import typingsSlinky.activexInfopath.activexInfopathStrings.GetTypeInfo
import typingsSlinky.activexInfopath.activexInfopathStrings.GetTypeInfoCount
import typingsSlinky.activexInfopath.activexInfopathStrings.Invoke
import typingsSlinky.activexInfopath.activexInfopathStrings.NewXDocument
import typingsSlinky.activexInfopath.activexInfopathStrings.OnAfterChange
import typingsSlinky.activexInfopath.activexInfopathStrings.OnAfterImport
import typingsSlinky.activexInfopath.activexInfopathStrings.OnBeforeChange
import typingsSlinky.activexInfopath.activexInfopathStrings.OnClick
import typingsSlinky.activexInfopath.activexInfopathStrings.OnContextChange
import typingsSlinky.activexInfopath.activexInfopathStrings.OnLoad
import typingsSlinky.activexInfopath.activexInfopathStrings.OnMergeRequest
import typingsSlinky.activexInfopath.activexInfopathStrings.OnSaveRequest
import typingsSlinky.activexInfopath.activexInfopathStrings.OnSign
import typingsSlinky.activexInfopath.activexInfopathStrings.OnSubmitRequest
import typingsSlinky.activexInfopath.activexInfopathStrings.OnSwitchView
import typingsSlinky.activexInfopath.activexInfopathStrings.OnValidate
import typingsSlinky.activexInfopath.activexInfopathStrings.OnVersionUpgrade
import typingsSlinky.activexInfopath.activexInfopathStrings.QueryInterface
import typingsSlinky.activexInfopath.activexInfopathStrings.Quit
import typingsSlinky.activexInfopath.activexInfopathStrings.Release
import typingsSlinky.activexInfopath.activexInfopathStrings.WindowActivate
import typingsSlinky.activexInfopath.activexInfopathStrings.WindowDeactivate
import typingsSlinky.activexInfopath.activexInfopathStrings.WindowSize
import typingsSlinky.activexInfopath.activexInfopathStrings.XDocumentBeforeClose
import typingsSlinky.activexInfopath.activexInfopathStrings.XDocumentBeforePrint
import typingsSlinky.activexInfopath.activexInfopathStrings.XDocumentBeforeSave
import typingsSlinky.activexInfopath.activexInfopathStrings.XDocumentChange
import typingsSlinky.activexInfopath.activexInfopathStrings.XDocumentOpen
import typingsSlinky.activexInfopath.activexInfopathStrings.cNames
import typingsSlinky.activexInfopath.activexInfopathStrings.itinfo
import typingsSlinky.activexInfopath.activexInfopathStrings.lcid
import typingsSlinky.activexInfopath.activexInfopathStrings.pDataDOMEvent
import typingsSlinky.activexInfopath.activexInfopathStrings.pDocument
import typingsSlinky.activexInfopath.activexInfopathStrings.pEvent
import typingsSlinky.activexInfopath.activexInfopathStrings.pWindow
import typingsSlinky.activexInfopath.activexInfopathStrings.pctinfo
import typingsSlinky.activexInfopath.activexInfopathStrings.pfCancel
import typingsSlinky.activexInfopath.activexInfopathStrings.pptinfo
import typingsSlinky.activexInfopath.activexInfopathStrings.ppvObj
import typingsSlinky.activexInfopath.activexInfopathStrings.rgdispid
import typingsSlinky.activexInfopath.activexInfopathStrings.rgszNames
import typingsSlinky.activexInfopath.activexInfopathStrings.riid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: ApplicationEvents,
    event: NewXDocument,
    argNames: js.Array[pDocument],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPDocument, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowActivate,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowDeactivate,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowSize,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforeClose,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforePrint,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforeSave,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentOpen,
    argNames: js.Array[pDocument],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ AnonPDocument, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: OnClick,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ AnonPEvent, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnAfterChange,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonPDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnBeforeChange,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonPDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnValidate,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonPDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnAfterImport,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventDocEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnContextChange,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventDocContextChangeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnLoad,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventDocReturnEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnMergeRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventMergeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSaveRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventSaveEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSign,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventSignEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSubmitRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventDocReturnEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSwitchView,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventDocEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnVersionUpgrade,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPEventVersionUpgradeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ AnonPpvObj, Unit]
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
    argNames: ButtonInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ ButtonInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: DataDOM,
    event: Invoke,
    argNames: DataDOMInvokeArgNames,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ DataDOMInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: XDocument,
    event: Invoke,
    argNames: XDocumentInvokeArgNames,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ XDocumentInvokeParameter, Unit]
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

