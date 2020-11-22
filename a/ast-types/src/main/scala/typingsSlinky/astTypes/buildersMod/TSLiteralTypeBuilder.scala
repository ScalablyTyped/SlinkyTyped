package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Literal
import typingsSlinky.astTypes.kindsMod.BooleanLiteralKind
import typingsSlinky.astTypes.kindsMod.NumericLiteralKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.kindsMod.TemplateLiteralKind
import typingsSlinky.astTypes.kindsMod.UnaryExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSLiteralType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSLiteralTypeBuilder extends js.Object {
  
  def apply(literal: BooleanLiteralKind): TSLiteralType = js.native
  def apply(literal: NumericLiteralKind): TSLiteralType = js.native
  def apply(literal: StringLiteralKind): TSLiteralType = js.native
  def apply(literal: TemplateLiteralKind): TSLiteralType = js.native
  def apply(literal: UnaryExpressionKind): TSLiteralType = js.native
  
  def from(params: Literal): TSLiteralType = js.native
}
