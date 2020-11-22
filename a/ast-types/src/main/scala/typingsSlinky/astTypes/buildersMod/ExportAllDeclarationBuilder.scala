package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Source
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportAllDeclarationBuilder extends js.Object {
  
  def apply(source: LiteralKind): ExportAllDeclaration = js.native
  def apply(source: LiteralKind, exported: IdentifierKind): ExportAllDeclaration = js.native
  
  def from(params: Source): ExportAllDeclaration = js.native
}
