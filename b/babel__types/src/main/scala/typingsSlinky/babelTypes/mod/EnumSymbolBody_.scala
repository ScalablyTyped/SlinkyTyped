package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.EnumSymbolBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait EnumSymbolBody_
  extends EnumBody
     with BaseNode {
  
  var members: js.Array[EnumDefaultedMember_] = js.native
  
  @JSName("type")
  var type_EnumSymbolBody_ : EnumSymbolBody = js.native
}
object EnumSymbolBody_ {
  
  @scala.inline
  def apply(members: js.Array[EnumDefaultedMember_], `type`: EnumSymbolBody): EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumSymbolBody_]
  }
  
  @scala.inline
  implicit class EnumSymbolBody_MutableBuilder[Self <: EnumSymbolBody_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: js.Array[EnumDefaultedMember_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: EnumDefaultedMember_ *): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setType(value: EnumSymbolBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
