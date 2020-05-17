package typingsSlinky.idyllCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.idyllCompiler.mod.TreeNode
  - java.lang.String
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: String): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: TreeNode): Node = value.asInstanceOf[Node]
}

