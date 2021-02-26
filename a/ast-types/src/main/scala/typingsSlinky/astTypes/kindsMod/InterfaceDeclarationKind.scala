package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass
*/
trait InterfaceDeclarationKind extends StObject
object InterfaceDeclarationKind {
  
  @scala.inline
  def DeclareClass(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareClass
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareClass]
  }
  
  @scala.inline
  def DeclareInterface(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareInterface
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareInterface]
  }
  
  @scala.inline
  def InterfaceDeclaration(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.InterfaceDeclaration
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration]
  }
}
