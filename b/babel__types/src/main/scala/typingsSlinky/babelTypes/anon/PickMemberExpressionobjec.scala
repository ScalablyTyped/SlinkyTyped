package typingsSlinky.babelTypes.anon

import typingsSlinky.babelTypes.indexTs37Mod.Expression
import typingsSlinky.babelTypes.indexTs37Mod.Identifier_
import typingsSlinky.babelTypes.indexTs37Mod.PrivateName_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@babel/types.@babel/types/lib/index-ts3.7.MemberExpression, 'object' | 'property'> */
@js.native
trait PickMemberExpressionobjec extends StObject {
  
  var `object`: Expression = js.native
  
  var property: Expression | Identifier_ | PrivateName_ = js.native
}
object PickMemberExpressionobjec {
  
  @scala.inline
  def apply(`object`: Expression, property: Expression | Identifier_ | PrivateName_): PickMemberExpressionobjec = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickMemberExpressionobjec]
  }
  
  @scala.inline
  implicit class PickMemberExpressionobjecMutableBuilder[Self <: PickMemberExpressionobjec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Expression | Identifier_ | PrivateName_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
