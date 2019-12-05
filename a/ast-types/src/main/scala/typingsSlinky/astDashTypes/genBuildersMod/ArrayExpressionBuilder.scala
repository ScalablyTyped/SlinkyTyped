package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsElements
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.RestElementKind
import typingsSlinky.astDashTypes.genKindsMod.SpreadElementKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.ArrayExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayExpressionBuilder extends js.Object {
  def apply(elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]): ArrayExpression = js.native
  def from(params: Anon_CommentsElements): ArrayExpression = js.native
}

