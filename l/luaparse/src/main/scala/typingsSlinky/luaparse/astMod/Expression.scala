package typingsSlinky.luaparse.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.luaparse.astMod.FunctionDeclaration
  - typingsSlinky.luaparse.astMod.Identifier
  - typingsSlinky.luaparse.astMod.StringLiteral
  - typingsSlinky.luaparse.astMod.NumericLiteral
  - typingsSlinky.luaparse.astMod.BooleanLiteral
  - typingsSlinky.luaparse.astMod.NilLiteral
  - typingsSlinky.luaparse.astMod.VarargLiteral
  - typingsSlinky.luaparse.astMod.TableConstructorExpression
  - typingsSlinky.luaparse.astMod.BinaryExpression
  - typingsSlinky.luaparse.astMod.LogicalExpression
  - typingsSlinky.luaparse.astMod.UnaryExpression
  - typingsSlinky.luaparse.astMod.MemberExpression
  - typingsSlinky.luaparse.astMod.IndexExpression
  - typingsSlinky.luaparse.astMod.CallExpression
  - typingsSlinky.luaparse.astMod.TableCallExpression
  - typingsSlinky.luaparse.astMod.StringCallExpression
*/
trait Expression extends Node

object Expression {
  @scala.inline
  implicit def apply(value: BinaryExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: BooleanLiteral): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: CallExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: FunctionDeclaration): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: Identifier): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: IndexExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: LogicalExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: MemberExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: NilLiteral): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: NumericLiteral): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: StringCallExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: StringLiteral): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: TableCallExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: TableConstructorExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: UnaryExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: VarargLiteral): Expression = value.asInstanceOf[Expression]
}

