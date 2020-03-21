package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonExpression
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Decorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratorBuilder extends js.Object {
  def apply(expression: ExpressionKind): Decorator = js.native
  def from(params: AnonExpression): Decorator = js.native
}

