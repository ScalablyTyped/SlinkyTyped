package typingsSlinky.ckeditorCkeditor5Engine.mod.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/item
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ckeditorCkeditor5Engine.mod.view.Node
  - typingsSlinky.ckeditorCkeditor5Engine.mod.view.TextProxy
*/
trait Item extends js.Object

object Item {
  @scala.inline
  implicit def apply(value: Node): Item = value.asInstanceOf[Item]
  @scala.inline
  implicit def apply(value: TextProxy): Item = value.asInstanceOf[Item]
}

