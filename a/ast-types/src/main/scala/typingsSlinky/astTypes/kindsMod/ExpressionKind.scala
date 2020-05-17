package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Import
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal
import typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
import typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Super
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ThisExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SequenceExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.UnaryExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BinaryExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.UpdateExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.LogicalExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ConditionalExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NewExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AwaitExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXElement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXFragment
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DoExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Super
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BindExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MetaProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Import
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
*/
trait ExpressionKind extends js.Object

object ExpressionKind {
  @scala.inline
  implicit def apply(value: ArrayExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: ArrowFunctionExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: AssignmentExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: AwaitExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: BigIntLiteral): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: BinaryExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: BindExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: BooleanLiteral): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: CallExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: ClassExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: ComprehensionExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: ConditionalExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: DirectiveLiteral): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: DoExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: FunctionExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: GeneratorExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: Identifier): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: Import): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: JSXElement): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: JSXEmptyExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: JSXExpressionContainer): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: JSXFragment): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: JSXIdentifier): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: JSXMemberExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: JSXSpreadChild): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: JSXText): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: Literal): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: LogicalExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: MemberExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: MetaProperty): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: NewExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: NullLiteral): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: NumericLiteral): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: ObjectExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: OptionalCallExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: OptionalMemberExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: ParenthesizedExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: PrivateName): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: RegExpLiteral): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: SequenceExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: StringLiteral): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: Super): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: TSAsExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: TSNonNullExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: TSTypeAssertion): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: TSTypeParameter): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: TaggedTemplateExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: TemplateLiteral): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: ThisExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: TypeCastExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: UnaryExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: UpdateExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
  @scala.inline
  implicit def apply(value: YieldExpression): ExpressionKind = value.asInstanceOf[ExpressionKind]
}

