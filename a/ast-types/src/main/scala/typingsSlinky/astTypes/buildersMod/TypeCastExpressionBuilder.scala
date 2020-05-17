package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ExpressionLoc
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.TypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeCastExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeCastExpressionBuilder extends js.Object {
  def apply(expression: ExpressionKind, typeAnnotation: TypeAnnotationKind): TypeCastExpression = js.native
  def from(params: ExpressionLoc): TypeCastExpression = js.native
}

