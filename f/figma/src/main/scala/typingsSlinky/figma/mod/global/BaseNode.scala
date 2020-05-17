package typingsSlinky.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.mod.global.DocumentNode
  - typingsSlinky.figma.mod.global.PageNode
  - typingsSlinky.figma.mod.global.SceneNode
*/
trait BaseNode extends js.Object

object BaseNode {
  @scala.inline
  implicit def apply(value: DocumentNode): BaseNode = value.asInstanceOf[BaseNode]
  @scala.inline
  implicit def apply(value: PageNode): BaseNode = value.asInstanceOf[BaseNode]
  @scala.inline
  implicit def apply(value: SceneNode): BaseNode = value.asInstanceOf[BaseNode]
}

