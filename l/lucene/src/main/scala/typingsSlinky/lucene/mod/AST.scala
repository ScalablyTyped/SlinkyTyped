package typingsSlinky.lucene.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lucene.mod.LeftOnlyAST
  - typingsSlinky.lucene.mod.BinaryAST
*/
trait AST extends js.Object

object AST {
  @scala.inline
  implicit def apply(value: BinaryAST): AST = value.asInstanceOf[AST]
  @scala.inline
  implicit def apply(value: LeftOnlyAST): AST = value.asInstanceOf[AST]
}

