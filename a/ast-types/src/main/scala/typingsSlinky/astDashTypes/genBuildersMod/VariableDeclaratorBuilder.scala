package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsId
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclaratorBuilder extends js.Object {
  def apply(id: PatternKind): VariableDeclarator = js.native
  def apply(id: PatternKind, init: ExpressionKind): VariableDeclarator = js.native
  def from(params: Anon_CommentsId): VariableDeclarator = js.native
}

