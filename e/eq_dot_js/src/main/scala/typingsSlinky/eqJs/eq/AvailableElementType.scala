package typingsSlinky.eqJs.eq

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NodeList
import typingsSlinky.eqJs.JQuery
import typingsSlinky.std.HTMLCollectionOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.HTMLElement
  - typingsSlinky.std.HTMLCollectionOf[typingsSlinky.std.Element]
  - js.Array[typingsSlinky.std.HTMLElement]
  - typingsSlinky.std.NodeList
  - typingsSlinky.eqJs.JQuery
*/
trait AvailableElementType extends js.Object

object AvailableElementType {
  @scala.inline
  implicit def apply(value: js.Array[HTMLElement]): AvailableElementType = value.asInstanceOf[AvailableElementType]
  @scala.inline
  implicit def apply(value: HTMLCollectionOf[Element]): AvailableElementType = value.asInstanceOf[AvailableElementType]
  @scala.inline
  implicit def apply(value: HTMLElement): AvailableElementType = value.asInstanceOf[AvailableElementType]
  @scala.inline
  implicit def apply(value: JQuery): AvailableElementType = value.asInstanceOf[AvailableElementType]
  @scala.inline
  implicit def apply(value: NodeList): AvailableElementType = value.asInstanceOf[AvailableElementType]
}

