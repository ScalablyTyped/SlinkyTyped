package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsDeclare
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeAliasDeclarationBuilder extends StObject {
  
  def apply(id: IdentifierKind, typeAnnotation: TSTypeKind): TSTypeAliasDeclaration = js.native
  
  def from(params: CommentsDeclare): TSTypeAliasDeclaration = js.native
}
