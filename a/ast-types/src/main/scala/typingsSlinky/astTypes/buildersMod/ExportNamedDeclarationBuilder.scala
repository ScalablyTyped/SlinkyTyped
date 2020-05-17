package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Specifiers
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.ExportSpecifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportNamedDeclarationBuilder extends js.Object {
  def apply(): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def from(params: Specifiers): ExportNamedDeclaration = js.native
}

