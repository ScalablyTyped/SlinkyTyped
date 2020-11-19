package typingsSlinky.ckeditorCkeditor5Engine.mod.conversion

import typingsSlinky.ckeditorCkeditor5Engine.anon.IsPhantom
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Position
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Range
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/conversion/mapper
@JSImport("@ckeditor/ckeditor5-engine", "conversion.Mapper")
@js.native
class Mapper () extends js.Object {
  
  def bindElementToMarker(element: Element, name: String): Unit = js.native
  
  def bindElements(modelElement: typingsSlinky.ckeditorCkeditor5Engine.mod.model.Element, viewElement: Element): Unit = js.native
  
  def clearBindings(): Unit = js.native
  
  def getModelLength(viewNode: Element): Double = js.native
  
  def markerNameToElements(name: String): Set[Element] | Null = js.native
  
  def registerViewToModelLength(viewElementName: String, lengthCallback: js.Function): Unit = js.native
  
  def toModelElement(viewElement: Element): js.UndefOr[typingsSlinky.ckeditorCkeditor5Engine.mod.model.Element] = js.native
  
  def toModelPosition(viewPosition: Position): typingsSlinky.ckeditorCkeditor5Engine.mod.model.Position = js.native
  
  def toModelRange(viewRange: Range): typingsSlinky.ckeditorCkeditor5Engine.mod.model.Range = js.native
  
  def toViewElement(modelElement: typingsSlinky.ckeditorCkeditor5Engine.mod.model.Element): js.UndefOr[Element] = js.native
  
  def toViewPosition(modelPosition: typingsSlinky.ckeditorCkeditor5Engine.mod.model.Position): Position = js.native
  def toViewPosition(modelPosition: typingsSlinky.ckeditorCkeditor5Engine.mod.model.Position, options: IsPhantom): Position = js.native
  
  def toViewRange(modelRange: typingsSlinky.ckeditorCkeditor5Engine.mod.model.Range): Range = js.native
  
  def unbindElementsFromMarkerName(name: String): Unit = js.native
  
  def unbindModelElement(modelElement: typingsSlinky.ckeditorCkeditor5Engine.mod.model.Element): Unit = js.native
  
  def unbindViewElement(viewElement: Element): Unit = js.native
}
