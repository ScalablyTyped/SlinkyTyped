package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsExpression
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ExpressionStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionStatementBuilder extends js.Object {
  def apply(expression: ExpressionKind): ExpressionStatement = js.native
  def from(params: Anon_CommentsExpression): ExpressionStatement = js.native
}

