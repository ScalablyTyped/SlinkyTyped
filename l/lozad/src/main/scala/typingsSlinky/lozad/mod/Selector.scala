package typingsSlinky.lozad.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsSlinky.std.HTMLCollectionOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Element
  - typingsSlinky.std.HTMLCollectionOf[typingsSlinky.std.Element]
  - typingsSlinky.std.NodeListOf[typingsSlinky.std.Element]
*/
trait Selector extends js.Object

object Selector {
  @scala.inline
  implicit def apply(value: Element): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: HTMLCollectionOf[Element]): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: NodeListOf[Element with Node]): Selector = value.asInstanceOf[Selector]
  @scala.inline
  implicit def apply(value: String): Selector = value.asInstanceOf[Selector]
}

