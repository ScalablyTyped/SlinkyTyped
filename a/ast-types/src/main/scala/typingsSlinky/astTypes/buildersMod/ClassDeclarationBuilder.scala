package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Implements
import typingsSlinky.astTypes.kindsMod.ClassBodyKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassDeclarationBuilder extends StObject {
  
  def apply(id: Null, body: ClassBodyKind): ClassDeclaration = js.native
  def apply(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind): ClassDeclaration = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  
  def from(params: Implements): ClassDeclaration = js.native
}
