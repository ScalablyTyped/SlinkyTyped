package typingsSlinky.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.luaparse.astMod.Statement
  - typingsSlinky.luaparse.astMod.Expression
  - typingsSlinky.luaparse.astMod.IfClause
  - typingsSlinky.luaparse.astMod.ElseifClause
  - typingsSlinky.luaparse.astMod.ElseClause
  - typingsSlinky.luaparse.astMod.Chunk
  - typingsSlinky.luaparse.astMod.TableKey
  - typingsSlinky.luaparse.astMod.TableKeyString
  - typingsSlinky.luaparse.astMod.TableValue
  - typingsSlinky.luaparse.astMod.Comment
*/
trait Node extends js.Object

object Node {
  @scala.inline
  implicit def apply(value: Chunk): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Comment): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: ElseClause): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: ElseifClause): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Expression): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: IfClause): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: Statement): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: TableKey): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: TableKeyString): Node = value.asInstanceOf[Node]
  @scala.inline
  implicit def apply(value: TableValue): Node = value.asInstanceOf[Node]
}

