package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumBooleanMember extends ASTNode {
  
  var id: IdentifierKind = js.native
  
  var init: LiteralKind | Boolean = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.EnumBooleanMember = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.EnumBooleanMember")
@js.native
object EnumBooleanMember extends TopLevel[Type[EnumBooleanMember]]
