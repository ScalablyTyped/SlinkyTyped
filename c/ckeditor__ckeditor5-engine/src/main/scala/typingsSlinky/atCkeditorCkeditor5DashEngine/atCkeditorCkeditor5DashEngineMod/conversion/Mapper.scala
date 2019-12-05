package typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.conversion

import typingsSlinky.atCkeditorCkeditor5DashEngine.Anon_IsPhantom
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Element
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Position
import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.Range
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/conversion/mapper
@JSImport("@ckeditor/ckeditor5-engine", "conversion.Mapper")
@js.native
class Mapper () extends js.Object {
  def bindElementToMarker(element: Element, name: String): Unit = js.native
  def bindElements(
    modelElement: typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Element,
    viewElement: Element
  ): Unit = js.native
  def clearBindings(): Unit = js.native
  def getModelLength(viewNode: Element): Double = js.native
  def markerNameToElements(name: String): Set[Element] | Null = js.native
  def registerViewToModelLength(viewElementName: String, lengthCallback: js.Function): Unit = js.native
  def toModelElement(viewElement: Element): js.UndefOr[
    typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Element
  ] = js.native
  def toModelPosition(viewPosition: Position): typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Position = js.native
  def toModelRange(viewRange: Range): typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Range = js.native
  def toViewElement(
    modelElement: typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Element
  ): js.UndefOr[Element] = js.native
  def toViewPosition(
    modelPosition: typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Position
  ): Position = js.native
  def toViewPosition(
    modelPosition: typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Position,
    options: Anon_IsPhantom
  ): Position = js.native
  def toViewRange(
    modelRange: typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Range
  ): Range = js.native
  def unbindElementsFromMarkerName(name: String): Unit = js.native
  def unbindModelElement(
    modelElement: typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model.Element
  ): Unit = js.native
  def unbindViewElement(viewElement: Element): Unit = js.native
}

