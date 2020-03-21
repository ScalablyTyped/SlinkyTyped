package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonKey
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyPatternBuilder extends js.Object {
  def apply(key: ExpressionKind, pattern: PatternKind): PropertyPattern = js.native
  def apply(key: IdentifierKind, pattern: PatternKind): PropertyPattern = js.native
  def apply(key: LiteralKind, pattern: PatternKind): PropertyPattern = js.native
  def from(params: AnonKey): PropertyPattern = js.native
}

