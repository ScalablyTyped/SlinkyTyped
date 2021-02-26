package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumBooleanMember extends ASTNode {
  
  var id: IdentifierKind = js.native
  
  var init: LiteralKind | Boolean = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.EnumBooleanMember = js.native
}
object EnumBooleanMember {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumBooleanMember")
  @js.native
  val ^ : Type[EnumBooleanMember] = js.native
  
  @scala.inline
  implicit class EnumBooleanMemberMutableBuilder[Self <: EnumBooleanMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: LiteralKind | Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.EnumBooleanMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
