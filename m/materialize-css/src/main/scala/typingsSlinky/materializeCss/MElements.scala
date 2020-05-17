package typingsSlinky.materializeCss

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import typingsSlinky.cash.Cash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.NodeListOf[typingsSlinky.std.Element]
  - typingsSlinky.materializeCss.JQuery
  - typingsSlinky.cash.Cash
*/
trait MElements extends js.Object

object MElements {
  @scala.inline
  implicit def apply(value: Cash): MElements = value.asInstanceOf[MElements]
  @scala.inline
  implicit def apply(value: JQuery): MElements = value.asInstanceOf[MElements]
  @scala.inline
  implicit def apply(value: NodeListOf[Element with Node]): MElements = value.asInstanceOf[MElements]
}

