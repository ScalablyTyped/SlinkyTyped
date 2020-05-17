package typingsSlinky.ckeditorCkeditor5Engine.mod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/model/item
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ckeditorCkeditor5Engine.mod.model.Node
  - typingsSlinky.ckeditorCkeditor5Engine.mod.model.TextProxy
*/
trait Item extends js.Object

object Item {
  @scala.inline
  implicit def apply(value: Node): Item = value.asInstanceOf[Item]
  @scala.inline
  implicit def apply(value: TextProxy): Item = value.asInstanceOf[Item]
}

