package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsLiteral
import typingsSlinky.astDashTypes.genKindsMod.BooleanLiteralKind
import typingsSlinky.astDashTypes.genKindsMod.NumericLiteralKind
import typingsSlinky.astDashTypes.genKindsMod.StringLiteralKind
import typingsSlinky.astDashTypes.genKindsMod.TemplateLiteralKind
import typingsSlinky.astDashTypes.genKindsMod.UnaryExpressionKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSLiteralType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSLiteralTypeBuilder extends js.Object {
  def apply(literal: BooleanLiteralKind): TSLiteralType = js.native
  def apply(literal: NumericLiteralKind): TSLiteralType = js.native
  def apply(literal: StringLiteralKind): TSLiteralType = js.native
  def apply(literal: TemplateLiteralKind): TSLiteralType = js.native
  def apply(literal: UnaryExpressionKind): TSLiteralType = js.native
  def from(params: Anon_CommentsLiteral): TSLiteralType = js.native
}

