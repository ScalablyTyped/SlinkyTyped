package typingsSlinky.antd.utilsMod

import org.scalajs.dom.raw.ClientRect
import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ClientRect
  - typingsSlinky.std.DOMRect
*/
trait Rect extends js.Object

object Rect {
  @scala.inline
  implicit def apply(value: ClientRect): Rect = value.asInstanceOf[Rect]
  @scala.inline
  implicit def apply(value: DOMRect): Rect = value.asInstanceOf[Rect]
}

