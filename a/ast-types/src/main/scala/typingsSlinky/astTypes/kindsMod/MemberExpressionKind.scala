package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
*/
trait MemberExpressionKind extends js.Object

object MemberExpressionKind {
  @scala.inline
  implicit def apply(value: JSXMemberExpression): MemberExpressionKind = value.asInstanceOf[MemberExpressionKind]
  @scala.inline
  implicit def apply(value: MemberExpression): MemberExpressionKind = value.asInstanceOf[MemberExpressionKind]
  @scala.inline
  implicit def apply(value: OptionalMemberExpression): MemberExpressionKind = value.asInstanceOf[MemberExpressionKind]
}

