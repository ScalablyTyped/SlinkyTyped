package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonBlocks
import typingsSlinky.astTypes.kindsMod.ComprehensionBlockKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.GeneratorExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorExpressionBuilder extends js.Object {
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): GeneratorExpression = js.native
  def apply(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): GeneratorExpression = js.native
  def from(params: AnonBlocks): GeneratorExpression = js.native
}

