package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ImportKind
import typingsSlinky.astTypes.astTypesStrings.`type`
import typingsSlinky.astTypes.astTypesStrings.typeof
import typingsSlinky.astTypes.astTypesStrings.value
import typingsSlinky.astTypes.kindsMod.ImportDefaultSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportNamespaceSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportSpecifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDeclarationBuilder extends StObject {
  
  def apply(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind): ImportDeclaration = js.native
  def apply(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: `type`): ImportDeclaration = js.native
  def apply(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: typeof): ImportDeclaration = js.native
  def apply(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: value): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: `type`
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: typeof
  ): ImportDeclaration = js.native
  def apply(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: value
  ): ImportDeclaration = js.native
  
  def from(params: ImportKind): ImportDeclaration = js.native
}
