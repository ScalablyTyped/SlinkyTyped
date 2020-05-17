package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Computed
import typingsSlinky.astTypes.astTypesStrings.get
import typingsSlinky.astTypes.astTypesStrings.init
import typingsSlinky.astTypes.astTypesStrings.set
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Property
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
  def from(params: Computed): Property = js.native
}

