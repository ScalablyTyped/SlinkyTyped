package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.BodyCommentsIdLoc
import typingsSlinky.astTypes.kindsMod.EnumBooleanBodyKind
import typingsSlinky.astTypes.kindsMod.EnumNumberBodyKind
import typingsSlinky.astTypes.kindsMod.EnumStringBodyKind
import typingsSlinky.astTypes.kindsMod.EnumSymbolBodyKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumDeclarationBuilder extends js.Object {
  
  def apply(id: IdentifierKind, body: EnumBooleanBodyKind): EnumDeclaration = js.native
  def apply(id: IdentifierKind, body: EnumNumberBodyKind): EnumDeclaration = js.native
  def apply(id: IdentifierKind, body: EnumStringBodyKind): EnumDeclaration = js.native
  def apply(id: IdentifierKind, body: EnumSymbolBodyKind): EnumDeclaration = js.native
  
  def from(params: BodyCommentsIdLoc): EnumDeclaration = js.native
}
