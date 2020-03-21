package typingsSlinky.esquery.mod

import typingsSlinky.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esquery", "query")
@js.native
object query extends js.Object {
  /** Query the code AST using the selector string. */
  def apply(ast: Node, selector: String): js.Array[Node] = js.native
}

