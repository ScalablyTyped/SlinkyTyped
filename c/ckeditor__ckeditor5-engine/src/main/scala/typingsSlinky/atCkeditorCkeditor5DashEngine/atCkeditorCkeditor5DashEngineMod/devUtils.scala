package typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod

import typingsSlinky.atCkeditorCkeditor5DashEngine.Anon_Arg
import typingsSlinky.atCkeditorCkeditor5DashEngine.Anon_BatchType
import typingsSlinky.atCkeditorCkeditor5DashEngine.Anon_Context
import typingsSlinky.atCkeditorCkeditor5DashEngine.Anon_ConvertMarkers
import typingsSlinky.atCkeditorCkeditor5DashEngine.Anon_IgnoreRoot
import typingsSlinky.atCkeditorCkeditor5DashEngine.Anon_LastRangeBackward
import typingsSlinky.atCkeditorCkeditor5DashEngine.Anon_RenderUIElements
import typingsSlinky.atCkeditorCkeditor5DashEngine.Anon_RootName
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.devUtils.DebugPlugin
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Batch
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Marker
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Model
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.RootElement
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Schema
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Selection
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.DocumentFragment
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.DocumentSelection
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Element
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Position
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Range
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Text
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "devUtils")
@js.native
object devUtils extends js.Object {
  // engine/dev-utils/enableenginedebug
  @js.native
  class DebugPlugin () extends js.Object
  
  // engine/dev-utils/operationreplayer
  @js.native
  class OperationReplayer () extends js.Object
  
  def disableEngineDebug(): Unit = js.native
  def enableEngineDebug(_logger: Anon_Arg): DebugPlugin = js.native
  // engine/dev-utils/view
  def getData(view: View): String = js.native
  def getData(view: View, options: Anon_RenderUIElements): String = js.native
  def parse(data: String, options: Anon_LastRangeBackward): Text | Element | DocumentFragment | js.Object = js.native
  def setData(view: View, data: String, options: Anon_RootName): Unit = js.native
  def stringify(node: DocumentFragment): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: DocumentSelection, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Position, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: DocumentFragment, selectionOrPositionOrRange: Range, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Element): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: DocumentSelection, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Position, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: Element, selectionOrPositionOrRange: Range, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Text): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: DocumentSelection): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: DocumentSelection, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Position): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Position, options: Anon_IgnoreRoot): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Range): String = js.native
  def stringify(node: Text, selectionOrPositionOrRange: Range, options: Anon_IgnoreRoot): String = js.native
  // engine/dev-utils/model
  @js.native
  object devmodel extends js.Object {
    def getData(model: Model): String = js.native
    def getData(model: Model, options: Anon_ConvertMarkers): String = js.native
    def parse(data: String, schema: Schema, batch: Batch): typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Element | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Text | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.DocumentFragment | js.Object = js.native
    def parse(data: String, schema: Schema, batch: Batch, options: Anon_Context): typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Element | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Text | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.DocumentFragment | js.Object = js.native
    def setData(model: String, data: js.Object, options: Anon_BatchType): Unit = js.native
    def stringify(
      node: RootElement | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Element | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Text | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: Selection | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Position | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Range
    ): String = js.native
    def stringify(
      node: RootElement | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Element | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Text | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: Selection | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Position | typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Range,
      markers: js.Iterable[Marker]
    ): String = js.native
  }
  
}

