package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsComputedKey
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.LiteralKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.PropertyPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyPatternBuilder extends js.Object {
  def apply(key: ExpressionKind, pattern: PatternKind): PropertyPattern = js.native
  def apply(key: IdentifierKind, pattern: PatternKind): PropertyPattern = js.native
  def apply(key: LiteralKind, pattern: PatternKind): PropertyPattern = js.native
  def from(params: Anon_CommentsComputedKey): PropertyPattern = js.native
}

