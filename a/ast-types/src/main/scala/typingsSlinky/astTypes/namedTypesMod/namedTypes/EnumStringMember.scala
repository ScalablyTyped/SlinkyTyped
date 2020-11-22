package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumStringMember extends ASTNode {
  
  var id: IdentifierKind = js.native
  
  var init: LiteralKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.EnumStringMember = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.EnumStringMember")
@js.native
object EnumStringMember extends TopLevel[Type[EnumStringMember]]
