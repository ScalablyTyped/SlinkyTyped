package typingsSlinky.preact.internalMod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.Text
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.std.EventTarget because Already inherited
- typingsSlinky.std.Node because Already inherited
- typingsSlinky.std.NonDocumentTypeChildNode because Already inherited
- typingsSlinky.std.ChildNode because Already inherited
- typingsSlinky.std.Slottable because Already inherited
- typingsSlinky.std.CharacterData because var conflicts: nodeValue, textContent. Inlined appendData, data, deleteData, insertData, length, ownerDocument_CharacterData, replaceData, substringData
- typingsSlinky.std.Text because var conflicts: nodeValue, textContent. Inlined splitText, wholeText */ @js.native
trait PreactElement extends HTMLElement {
  
  var _children: js.UndefOr[VNode[_] | Null] = js.native
  
  /** Event listeners to support event delegation */
  var _listeners: Record[String, js.Function1[/* e */ Event, Unit]] = js.native
  
  def appendData(data: String): Unit = js.native
  
  // style: HTMLElement["style"]; // From HTMLElement
  var data: js.UndefOr[Double | String] = js.native
  
  def deleteData(offset: Double, count: Double): Unit = js.native
  
  def insertData(offset: Double, data: String): Unit = js.native
  
  val length: Double = js.native
  
  @JSName("ownerDocument")
  val ownerDocument_CharacterData: Document = js.native
  
  // Preact uses this attribute to detect SVG nodes
  var ownerSVGElement: js.UndefOr[SVGElement | Null] = js.native
  
  def replaceData(offset: Double, count: Double, data: String): Unit = js.native
  
  /**
    * Splits data at the given offset and returns the remainder as Text node.
    */
  def splitText(offset: Double): Text = js.native
  
  def substringData(offset: Double, count: Double): String = js.native
  
  /**
    * Returns the combined data of all direct Text node siblings.
    */
  val wholeText: String = js.native
}
