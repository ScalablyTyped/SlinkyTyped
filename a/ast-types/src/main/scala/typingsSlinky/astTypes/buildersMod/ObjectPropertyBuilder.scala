package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonAccessibility
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPropertyBuilder extends js.Object {
  def apply(key: ExpressionKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: ExpressionKind, value: PatternKind): ObjectProperty = js.native
  def apply(key: IdentifierKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: IdentifierKind, value: PatternKind): ObjectProperty = js.native
  def apply(key: LiteralKind, value: ExpressionKind): ObjectProperty = js.native
  def apply(key: LiteralKind, value: PatternKind): ObjectProperty = js.native
  def from(params: AnonAccessibility): ObjectProperty = js.native
}

