package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.LocName
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXNamespacedNameKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXClosingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXClosingElementBuilder extends js.Object {
  def apply(name: JSXIdentifierKind): JSXClosingElement = js.native
  def apply(name: JSXMemberExpressionKind): JSXClosingElement = js.native
  def apply(name: JSXNamespacedNameKind): JSXClosingElement = js.native
  def from(params: LocName): JSXClosingElement = js.native
}

