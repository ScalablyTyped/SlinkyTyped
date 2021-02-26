package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.EnumDefaultedMemberKind
import typingsSlinky.astTypes.kindsMod.EnumStringMemberKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumStringBody extends ASTNode {
  
  var explicitType: Boolean = js.native
  
  var members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind] = js.native
  
  var `type`: typingsSlinky.astTypes.astTypesStrings.EnumStringBody = js.native
}
object EnumStringBody {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.EnumStringBody")
  @js.native
  val ^ : Type[EnumStringBody] = js.native
  
  @scala.inline
  implicit class EnumStringBodyMutableBuilder[Self <: EnumStringBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitType(value: Boolean): Self = StObject.set(x, "explicitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: (EnumDefaultedMemberKind | EnumStringMemberKind)*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.astTypes.astTypesStrings.EnumStringBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
