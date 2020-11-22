package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Global
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.kindsMod.TSModuleBlockKind
import typingsSlinky.astTypes.kindsMod.TSModuleDeclarationKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSModuleDeclarationBuilder extends js.Object {
  
  def apply(id: IdentifierKind): TSModuleDeclaration = js.native
  def apply(id: IdentifierKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: IdentifierKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: StringLiteralKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def apply(id: TSQualifiedNameKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  
  def from(params: Global): TSModuleDeclaration = js.native
}
