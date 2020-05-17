package typingsSlinky.mediumEditor.MediumEditor

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeList
import org.scalajs.dom.raw.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.HTMLElement
  - js.Array[typingsSlinky.std.HTMLElement]
  - typingsSlinky.std.NodeList
  - typingsSlinky.std.NodeListOf[typingsSlinky.std.Element]
  - typingsSlinky.std.HTMLCollection
*/
trait elementType extends js.Object

object elementType {
  @scala.inline
  implicit def apply(value: js.Array[HTMLElement]): elementType = value.asInstanceOf[elementType]
  @scala.inline
  implicit def apply(value: HTMLCollection): elementType = value.asInstanceOf[elementType]
  @scala.inline
  implicit def apply(value: HTMLElement): elementType = value.asInstanceOf[elementType]
  @scala.inline
  implicit def apply(value: NodeList): elementType = value.asInstanceOf[elementType]
  @scala.inline
  implicit def apply(value: NodeListOf[Element with Node]): elementType = value.asInstanceOf[elementType]
  @scala.inline
  implicit def apply(value: String): elementType = value.asInstanceOf[elementType]
}

