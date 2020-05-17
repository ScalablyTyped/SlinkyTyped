package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.CallExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
*/
trait CallExpressionKind extends js.Object

object CallExpressionKind {
  @scala.inline
  implicit def apply(value: CallExpression): CallExpressionKind = value.asInstanceOf[CallExpressionKind]
  @scala.inline
  implicit def apply(value: OptionalCallExpression): CallExpressionKind = value.asInstanceOf[CallExpressionKind]
}

