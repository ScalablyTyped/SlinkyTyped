package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumNumberMember extends ASTNode {
  
  var id: IdentifierKind = js.native
  
  var init: LiteralKind = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.EnumNumberMember = js.native
}
@JSImport("ast-types/gen/namedTypes", "namedTypes.EnumNumberMember")
@js.native
object EnumNumberMember extends TopLevel[Type[EnumNumberMember]]
