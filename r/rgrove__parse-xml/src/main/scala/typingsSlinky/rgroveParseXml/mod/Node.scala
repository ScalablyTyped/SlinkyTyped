package typingsSlinky.rgroveParseXml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rgroveParseXml.mod.CData
  - typingsSlinky.rgroveParseXml.mod.Comment
  - typingsSlinky.rgroveParseXml.mod.Element
  - typingsSlinky.rgroveParseXml.mod.Text
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: CData): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Comment): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Element): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Text): Node = value.asInstanceOf[Node]
}

