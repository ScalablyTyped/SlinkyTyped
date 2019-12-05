package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsLeftLocRight
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.AssignmentPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentPatternBuilder extends js.Object {
  def apply(left: PatternKind, right: ExpressionKind): AssignmentPattern = js.native
  def from(params: Anon_CommentsLeftLocRight): AssignmentPattern = js.native
}

