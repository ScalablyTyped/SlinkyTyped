package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonCommentsDeclaration
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDefaultDeclarationBuilder extends js.Object {
  def apply(declaration: DeclarationKind): ExportDefaultDeclaration = js.native
  def apply(declaration: ExpressionKind): ExportDefaultDeclaration = js.native
  def from(params: AnonCommentsDeclaration): ExportDefaultDeclaration = js.native
}

