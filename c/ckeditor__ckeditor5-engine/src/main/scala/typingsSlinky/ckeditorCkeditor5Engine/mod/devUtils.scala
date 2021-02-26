package typingsSlinky.ckeditorCkeditor5Engine.mod

import typingsSlinky.ckeditorCkeditor5Engine.anon.BatchType
import typingsSlinky.ckeditorCkeditor5Engine.anon.Context
import typingsSlinky.ckeditorCkeditor5Engine.anon.ConvertMarkers
import typingsSlinky.ckeditorCkeditor5Engine.anon.Error
import typingsSlinky.ckeditorCkeditor5Engine.anon.IgnoreRoot
import typingsSlinky.ckeditorCkeditor5Engine.anon.LastRangeBackward
import typingsSlinky.ckeditorCkeditor5Engine.anon.RenderUIElements
import typingsSlinky.ckeditorCkeditor5Engine.anon.RootName
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Batch
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.DocumentFragment
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Element
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Marker
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Model
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Position
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Range
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.RootElement
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Schema
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Selection
import typingsSlinky.ckeditorCkeditor5Engine.mod.model.Text
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.DocumentSelection
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devUtils {
  
  // engine/dev-utils/enableenginedebug
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.DebugPlugin")
  @js.native
  class DebugPlugin () extends StObject
  
  // engine/dev-utils/operationreplayer
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.OperationReplayer")
  @js.native
  class OperationReplayer () extends StObject
  
  // engine/dev-utils/model
  object devmodel {
    
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.getData")
    @js.native
    def getData(model: Model): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.getData")
    @js.native
    def getData(model: Model, options: ConvertMarkers): String = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.parse")
    @js.native
    def parse(data: String, schema: Schema, batch: Batch): Element | Text | DocumentFragment | js.Object = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.parse")
    @js.native
    def parse(data: String, schema: Schema, batch: Batch, options: Context): Element | Text | DocumentFragment | js.Object = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.setData")
    @js.native
    def setData(model: String, data: js.Object, options: BatchType): Unit = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(
      node: DocumentFragment,
      selectionOrPositionOrRange: Position,
      // TODO optional
    markers: js.Iterable[Marker]
    ): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(
      node: DocumentFragment,
      selectionOrPositionOrRange: Range,
      // TODO optional
    markers: js.Iterable[Marker]
    ): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: DocumentFragment, selectionOrPositionOrRange: Selection): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(
      node: DocumentFragment,
      selectionOrPositionOrRange: Selection,
      // TODO optional
    markers: js.Iterable[Marker]
    ): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: Element, selectionOrPositionOrRange: Position): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: Element, selectionOrPositionOrRange: Position, // TODO optional
    markers: js.Iterable[Marker]): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: Element, selectionOrPositionOrRange: Range): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: Element, selectionOrPositionOrRange: Range, // TODO optional
    markers: js.Iterable[Marker]): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: Element, selectionOrPositionOrRange: Selection): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(
      node: Element,
      selectionOrPositionOrRange: Selection,
      // TODO optional
    markers: js.Iterable[Marker]
    ): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: RootElement, selectionOrPositionOrRange: Position): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(
      node: RootElement,
      selectionOrPositionOrRange: Position,
      // TODO optional
    markers: js.Iterable[Marker]
    ): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: RootElement, selectionOrPositionOrRange: Range): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(
      node: RootElement,
      selectionOrPositionOrRange: Range,
      // TODO optional
    markers: js.Iterable[Marker]
    ): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: RootElement, selectionOrPositionOrRange: Selection): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(
      node: RootElement,
      selectionOrPositionOrRange: Selection,
      // TODO optional
    markers: js.Iterable[Marker]
    ): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: Text, selectionOrPositionOrRange: Position): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: Text, selectionOrPositionOrRange: Position, // TODO optional
    markers: js.Iterable[Marker]): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: Text, selectionOrPositionOrRange: Range): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: Text, selectionOrPositionOrRange: Range, // TODO optional
    markers: js.Iterable[Marker]): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: Text, selectionOrPositionOrRange: Selection): String = js.native
    @JSImport("@ckeditor/ckeditor5-engine", "devUtils.devmodel.stringify")
    @js.native
    def stringify(node: Text, selectionOrPositionOrRange: Selection, // TODO optional
    markers: js.Iterable[Marker]): String = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.disableEngineDebug")
  @js.native
  def disableEngineDebug(): Unit = js.native
  
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.enableEngineDebug")
  @js.native
  def enableEngineDebug(_logger: Error): DebugPlugin = js.native
  
  // engine/dev-utils/view
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.getData")
  @js.native
  def getData(view: View): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.getData")
  @js.native
  def getData(view: View, options: RenderUIElements): String = js.native
  
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.parse")
  @js.native
  def parse(data: String, options: LastRangeBackward): typingsSlinky.ckeditorCkeditor5Engine.mod.view.Text | typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element | typingsSlinky.ckeditorCkeditor5Engine.mod.view.DocumentFragment | js.Object = js.native
  
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.setData")
  @js.native
  def setData(view: View, data: String, options: RootName): Unit = js.native
  
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.DocumentFragment): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: js.UndefOr[scala.Nothing],
    options: IgnoreRoot
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: DocumentSelection
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: DocumentSelection,
    options: IgnoreRoot
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Position
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Position,
    options: IgnoreRoot
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Range
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.DocumentFragment,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Range,
    options: IgnoreRoot
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: js.UndefOr[scala.Nothing],
    options: IgnoreRoot
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: DocumentSelection
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: DocumentSelection,
    options: IgnoreRoot
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Position
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Position,
    options: IgnoreRoot
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Range
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Range,
    options: IgnoreRoot
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Text): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: js.UndefOr[scala.Nothing],
    options: IgnoreRoot
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: DocumentSelection
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: DocumentSelection,
    options: IgnoreRoot
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Position
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Position,
    options: IgnoreRoot
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Range
  ): String = js.native
  @JSImport("@ckeditor/ckeditor5-engine", "devUtils.stringify")
  @js.native
  def stringify(
    node: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Text,
    selectionOrPositionOrRange: typingsSlinky.ckeditorCkeditor5Engine.mod.view.Range,
    options: IgnoreRoot
  ): String = js.native
}
