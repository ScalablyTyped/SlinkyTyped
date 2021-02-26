package typingsSlinky.babelTypes.anon

import typingsSlinky.babelTypes.mod.Expression
import typingsSlinky.babelTypes.mod.Identifier_
import typingsSlinky.babelTypes.mod.PrivateName_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@babel/types.@babel/types.MemberExpression, 'object' | 'property'> */
@js.native
trait PickMemberExpressionobjecObject extends StObject {
  
  var `object`: Expression = js.native
  
  var property: Expression | Identifier_ | PrivateName_ = js.native
}
object PickMemberExpressionobjecObject {
  
  @scala.inline
  def apply(`object`: Expression, property: Expression | Identifier_ | PrivateName_): PickMemberExpressionobjecObject = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickMemberExpressionobjecObject]
  }
  
  @scala.inline
  implicit class PickMemberExpressionobjecObjectMutableBuilder[Self <: PickMemberExpressionobjecObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Expression | Identifier_ | PrivateName_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
