package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsComputed
import typingsSlinky.astDashTypes.astDashTypesStrings.get
import typingsSlinky.astDashTypes.astDashTypesStrings.init
import typingsSlinky.astDashTypes.astDashTypesStrings.set
import typingsSlinky.astDashTypes.genKindsMod.ExpressionKind
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.LiteralKind
import typingsSlinky.astDashTypes.genKindsMod.PatternKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyBuilder extends js.Object {
  def apply(kind: get, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: get, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: get, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: get, key: LiteralKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: init, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: init, key: LiteralKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: ExpressionKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: ExpressionKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: IdentifierKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: IdentifierKind, value: PatternKind): Property = js.native
  def apply(kind: set, key: LiteralKind, value: ExpressionKind): Property = js.native
  def apply(kind: set, key: LiteralKind, value: PatternKind): Property = js.native
  def from(params: Anon_CommentsComputed): Property = js.native
}

