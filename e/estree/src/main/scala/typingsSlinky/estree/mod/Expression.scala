package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.ThisExpression
  - typingsSlinky.estree.mod.ArrayExpression
  - typingsSlinky.estree.mod.ObjectExpression
  - typingsSlinky.estree.mod.FunctionExpression
  - typingsSlinky.estree.mod.ArrowFunctionExpression
  - typingsSlinky.estree.mod.YieldExpression
  - typingsSlinky.estree.mod.Literal
  - typingsSlinky.estree.mod.UnaryExpression
  - typingsSlinky.estree.mod.UpdateExpression
  - typingsSlinky.estree.mod.BinaryExpression
  - typingsSlinky.estree.mod.AssignmentExpression
  - typingsSlinky.estree.mod.LogicalExpression
  - typingsSlinky.estree.mod.MemberExpression
  - typingsSlinky.estree.mod.ConditionalExpression
  - typingsSlinky.estree.mod.CallExpression
  - typingsSlinky.estree.mod.NewExpression
  - typingsSlinky.estree.mod.SequenceExpression
  - typingsSlinky.estree.mod.TemplateLiteral
  - typingsSlinky.estree.mod.TaggedTemplateExpression
  - typingsSlinky.estree.mod.ClassExpression
  - typingsSlinky.estree.mod.MetaProperty
  - typingsSlinky.estree.mod.Identifier
  - typingsSlinky.estree.mod.AwaitExpression
  - typingsSlinky.estree.mod.ImportExpression
*/
trait Expression extends Node

object Expression {
  @scala.inline
  implicit def apply(value: ArrayExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: ArrowFunctionExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: AssignmentExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: AwaitExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: BinaryExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: CallExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: ClassExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: ConditionalExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: FunctionExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: Identifier): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: ImportExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: Literal): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: LogicalExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: MemberExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: MetaProperty): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: NewExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: ObjectExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: SequenceExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: TaggedTemplateExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: TemplateLiteral): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: ThisExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: UnaryExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: UpdateExpression): Expression = value.asInstanceOf[Expression]
  @scala.inline
  implicit def apply(value: YieldExpression): Expression = value.asInstanceOf[Expression]
}

