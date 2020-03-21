package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCommentsComputed
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXMemberExpressionBuilder extends js.Object {
  def apply(`object`: JSXIdentifierKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def apply(`object`: JSXMemberExpressionKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def from(params: AnonCommentsComputed): JSXMemberExpression = js.native
}

