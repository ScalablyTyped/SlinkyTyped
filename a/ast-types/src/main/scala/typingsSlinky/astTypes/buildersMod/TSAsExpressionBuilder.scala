package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ExpressionExtra
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSAsExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind, typeAnnotation: TSTypeKind): TSAsExpression = js.native
  def from(params: ExpressionExtra): TSAsExpression = js.native
}

