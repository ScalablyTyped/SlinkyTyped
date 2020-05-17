package typingsSlinky.cssSelectorTokenizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cssSelectorTokenizer.mod.SelectorsNode
  - typingsSlinky.cssSelectorTokenizer.mod.SelectorNode
  - typingsSlinky.cssSelectorTokenizer.mod.SelectorNodeType
*/
trait AnySelectorNode extends js.Object

object AnySelectorNode {
  @scala.inline
  implicit def apply(value: SelectorNode): AnySelectorNode = value.asInstanceOf[AnySelectorNode]
  @scala.inline
  implicit def apply(value: SelectorNodeType): AnySelectorNode = value.asInstanceOf[AnySelectorNode]
  @scala.inline
  implicit def apply(value: SelectorsNode): AnySelectorNode = value.asInstanceOf[AnySelectorNode]
}

