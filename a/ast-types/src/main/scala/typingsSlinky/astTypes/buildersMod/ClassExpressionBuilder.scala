package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.SuperClass
import typingsSlinky.astTypes.kindsMod.ClassBodyKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassExpressionBuilder extends js.Object {
  def apply(id: js.UndefOr[IdentifierKind | Null], body: ClassBodyKind): ClassExpression = js.native
  def apply(id: js.UndefOr[IdentifierKind | Null], body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def from(params: SuperClass): ClassExpression = js.native
}

