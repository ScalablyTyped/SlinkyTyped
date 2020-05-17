package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsExpression
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSExpressionWithTypeArgumentsBuilder extends js.Object {
  def apply(expression: IdentifierKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSQualifiedNameKind): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  def from(params: CommentsExpression): TSExpressionWithTypeArguments = js.native
}

