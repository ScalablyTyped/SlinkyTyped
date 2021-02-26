package typingsSlinky.ckeditorCkeditor5Engine.mod.model

import typingsSlinky.ckeditorCkeditor5Engine.anon.ParentFirst
import typingsSlinky.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/textproxy
@JSImport("@ckeditor/ckeditor5-engine", "model.TextProxy")
@js.native
class TextProxy protected ()
  extends Item
     with _NodeSet {
  protected def this(textNode: Text, offsetInText: Double, length: Double) = this()
  
  val data: String = js.native
  
  val document: Document | Null = js.native
  
  val endOffset: Double = js.native
  
  def getAncestors(options: ParentFirst): js.Array[TextProxy | Element | DocumentFragment] = js.native
  
  def getAttribute(key: String): js.Any = js.native
  
  def getAttributeKeys(): js.Iterable[String] = js.native
  
  def getAttributes(): js.Iterable[_] = js.native
  
  def getPath(): js.Array[Double] = js.native
  
  def hasAttribute(key: String): Boolean = js.native
  
  def is(`type`: String): Boolean = js.native
  
  val isPartial: Boolean = js.native
  
  @JSName("is")
  def is_textProxy(`type`: textProxy): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.TextProxy */ Boolean = js.native
  
  val offsetInText: Double = js.native
  
  val offsetSize: Double = js.native
  
  val parent: Element | DocumentFragment | Null = js.native
  
  val root: Node | DocumentFragment = js.native
  
  val startOffset: Double = js.native
  
  val textNode: Text = js.native
}
