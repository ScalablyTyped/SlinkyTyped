package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Quasis
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.TemplateElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TemplateLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateLiteralBuilder extends js.Object {
  def apply(quasis: js.Array[TemplateElementKind], expressions: js.Array[ExpressionKind]): TemplateLiteral = js.native
  def from(params: Quasis): TemplateLiteral = js.native
}

