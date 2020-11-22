package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsDeclaration
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDefaultDeclarationBuilder extends js.Object {
  
  def apply(declaration: DeclarationKind): ExportDefaultDeclaration = js.native
  def apply(declaration: ExpressionKind): ExportDefaultDeclaration = js.native
  
  def from(params: CommentsDeclaration): ExportDefaultDeclaration = js.native
}
