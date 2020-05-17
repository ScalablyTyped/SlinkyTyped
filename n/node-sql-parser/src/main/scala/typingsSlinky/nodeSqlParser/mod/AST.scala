package typingsSlinky.nodeSqlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeSqlParser.mod.Use
  - typingsSlinky.nodeSqlParser.mod.Select
  - typingsSlinky.nodeSqlParser.mod.InsertReplace
  - typingsSlinky.nodeSqlParser.mod.Update
  - typingsSlinky.nodeSqlParser.mod.Delete
  - typingsSlinky.nodeSqlParser.mod.Alter
*/
trait AST extends js.Object

object AST {
  @scala.inline
  implicit def apply(value: Alter): AST = value.asInstanceOf[AST]
  @scala.inline
  implicit def apply(value: Delete): AST = value.asInstanceOf[AST]
  @scala.inline
  implicit def apply(value: InsertReplace): AST = value.asInstanceOf[AST]
  @scala.inline
  implicit def apply(value: Select): AST = value.asInstanceOf[AST]
  @scala.inline
  implicit def apply(value: Update): AST = value.asInstanceOf[AST]
  @scala.inline
  implicit def apply(value: Use): AST = value.asInstanceOf[AST]
}

