package typingsSlinky.astTypes.kindsMod

import typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
import typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
import typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Literal
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXText
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.StringLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NumericLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BigIntLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.NullLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.BooleanLiteral
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
*/
trait LiteralKind extends js.Object

object LiteralKind {
  @scala.inline
  implicit def apply(value: BigIntLiteral): LiteralKind = value.asInstanceOf[LiteralKind]
  @scala.inline
  implicit def apply(value: BooleanLiteral): LiteralKind = value.asInstanceOf[LiteralKind]
  @scala.inline
  implicit def apply(value: JSXText): LiteralKind = value.asInstanceOf[LiteralKind]
  @scala.inline
  implicit def apply(value: Literal): LiteralKind = value.asInstanceOf[LiteralKind]
  @scala.inline
  implicit def apply(value: NullLiteral): LiteralKind = value.asInstanceOf[LiteralKind]
  @scala.inline
  implicit def apply(value: NumericLiteral): LiteralKind = value.asInstanceOf[LiteralKind]
  @scala.inline
  implicit def apply(value: RegExpLiteral): LiteralKind = value.asInstanceOf[LiteralKind]
  @scala.inline
  implicit def apply(value: StringLiteral): LiteralKind = value.asInstanceOf[LiteralKind]
}

