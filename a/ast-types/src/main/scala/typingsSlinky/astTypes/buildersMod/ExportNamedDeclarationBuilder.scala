package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Declaration
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.ExportSpecifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportNamedDeclarationBuilder extends StObject {
  
  def apply(): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: js.UndefOr[scala.Nothing], source: LiteralKind): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def apply(declaration: Null, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: js.UndefOr[scala.Nothing], source: LiteralKind): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def apply(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  
  def from(params: Declaration): ExportNamedDeclaration = js.native
}
