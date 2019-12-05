package typingsSlinky.activexDashOffice

import typingsSlinky.activexDashOffice.Office.CommandBarButton
import typingsSlinky.activexDashOffice.Office.CommandBarComboBox
import typingsSlinky.activexDashOffice.Office.CommandBars
import typingsSlinky.activexDashOffice.Office.CustomTaskPane
import typingsSlinky.activexDashOffice.Office.CustomXMLPart
import typingsSlinky.activexDashOffice.Office.CustomXMLParts
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CommandBarButton_Invoke_ArgNames
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CommandBarButton_Invoke_Parameter
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CommandBarComboBox_Invoke_ArgNames
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CommandBarComboBox_Invoke_Parameter
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CommandBars_Invoke_ArgNames
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CommandBars_Invoke_Parameter
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CustomTaskPane_Invoke_ArgNames
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CustomTaskPane_Invoke_Parameter
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CustomXMLPart_Invoke_ArgNames
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CustomXMLPart_Invoke_Parameter
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CustomXMLParts_Invoke_ArgNames
import typingsSlinky.activexDashOffice.Office.EventHelperTypes.CustomXMLParts_Invoke_Parameter
import typingsSlinky.activexDashOffice.Office.MsoEnvelope
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.AddRef
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.CancelDefault
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.Change
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.Click
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.Ctrl
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.CustomTaskPaneInst
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.DockPositionStateChange
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.EnvelopeHide
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.EnvelopeShow
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.GetIDsOfNames
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.GetTypeInfo
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.GetTypeInfoCount
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.InUndoRedo
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.Invoke
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.List
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.NewNode
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.NewPart
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.NodeAfterDelete
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.NodeAfterInsert
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.NodeAfterReplace
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.OldNextSibling
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.OldNode
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.OldParentNode
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.OldPart
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.OnUpdate
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.Part
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.PartAfterAdd
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.PartAfterLoad
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.PartBeforeDelete
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.QueryInterface
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.Release
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.VisibleStateChange
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.accName
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.accValue
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.cNames
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.itinfo
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.lcid
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.pctinfo
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.pptinfo
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.ppvObj
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.rgdispid
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.rgszNames
import typingsSlinky.activexDashOffice.activexDashOfficeStrings.riid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: CommandBarButton,
    event: Click,
    argNames: js.Tuple2[Ctrl, CancelDefault],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Anon_CancelDefault, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: Change,
    argNames: js.Array[Ctrl],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Anon_Ctrl, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: DockPositionStateChange,
    argNames: js.Array[CustomTaskPaneInst],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_CustomTaskPaneInst, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: VisibleStateChange,
    argNames: js.Array[CustomTaskPaneInst],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_CustomTaskPaneInst, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterDelete,
    argNames: js.Tuple4[OldNode, OldParentNode, OldNextSibling, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_InUndoRedo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterInsert,
    argNames: js.Tuple2[NewNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_InUndoRedoNewNode, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterReplace,
    argNames: js.Tuple3[OldNode, NewNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_InUndoRedoNewNodeOldNode, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterAdd,
    argNames: js.Array[NewPart],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_NewPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterLoad,
    argNames: js.Array[Part],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_Part, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartBeforeDelete,
    argNames: js.Array[OldPart],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_OldPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBarButton,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBarComboBox,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBars,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomTaskPane,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomXMLPart,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomXMLParts,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnvelopeHide(
    obj: MsoEnvelope,
    event: EnvelopeHide,
    handler: js.ThisFunction1[/* this */ MsoEnvelope, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnvelopeShow(
    obj: MsoEnvelope,
    event: EnvelopeShow,
    handler: js.ThisFunction1[/* this */ MsoEnvelope, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBarButton,
    event: Invoke,
    argNames: CommandBarButton_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ CommandBarButton_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBarComboBox,
    event: Invoke,
    argNames: CommandBarComboBox_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ CommandBarComboBox, 
      /* parameter */ CommandBarComboBox_Invoke_Parameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBars,
    event: Invoke,
    argNames: CommandBars_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ CommandBars_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomTaskPane,
    event: Invoke,
    argNames: CustomTaskPane_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ CustomTaskPane_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomXMLPart,
    event: Invoke,
    argNames: CustomXMLPart_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ CustomXMLPart_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomXMLParts,
    event: Invoke,
    argNames: CustomXMLParts_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ CustomXMLParts_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnUpdate(
    obj: CommandBars,
    event: OnUpdate,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBarButton,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBarComboBox,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBars,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomTaskPane,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomXMLPart,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomXMLParts,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_List(obj: CommandBarComboBox, propertyName: List, parameterTypes: js.Array[Double], newValue: String): Unit = js.native
  @JSName("set")
  def set_accName(obj: CommandBarButton, propertyName: accName, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accName(obj: CommandBarComboBox, propertyName: accName, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accValue(obj: CommandBarButton, propertyName: accValue, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accValue(obj: CommandBarComboBox, propertyName: accValue, parameterTypes: js.Array[_], newValue: String): Unit = js.native
}

