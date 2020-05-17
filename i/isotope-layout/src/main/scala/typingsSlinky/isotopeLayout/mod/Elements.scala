package typingsSlinky.isotopeLayout.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NodeList
import typingsSlinky.isotopeLayout.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[typingsSlinky.std.HTMLElement]
  - typingsSlinky.std.HTMLElement
  - typingsSlinky.isotopeLayout.mod.global.JQuery
  - typingsSlinky.std.NodeList
*/
trait Elements extends js.Object

object Elements {
  @scala.inline
  implicit def apply(value: js.Array[HTMLElement]): Elements = value.asInstanceOf[Elements]
  @scala.inline
  implicit def apply(value: HTMLElement): Elements = value.asInstanceOf[Elements]
  @scala.inline
  implicit def apply(value: JQuery): Elements = value.asInstanceOf[Elements]
  @scala.inline
  implicit def apply(value: NodeList): Elements = value.asInstanceOf[Elements]
}

