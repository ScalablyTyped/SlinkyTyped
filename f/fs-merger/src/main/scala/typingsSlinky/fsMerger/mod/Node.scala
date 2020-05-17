package typingsSlinky.fsMerger.mod

import typingsSlinky.broccoliNodeApi.mod.InputNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fsMerger.mod.FSMergerObject
  - typingsSlinky.broccoliNodeApi.mod.InputNode
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: FSMergerObject): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: InputNode): Node = value.asInstanceOf[Node]
}

