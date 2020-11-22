package typingsSlinky.babelTypes.anon

import typingsSlinky.babelTypes.indexTs37Mod.Expression
import typingsSlinky.babelTypes.indexTs37Mod.Identifier_
import typingsSlinky.babelTypes.indexTs37Mod.PrivateName_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@babel/types.@babel/types/lib/index-ts3.7.MemberExpression, 'object' | 'property'> */
@js.native
trait PickMemberExpressionobjec extends js.Object {
  
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
  implicit class PickMemberExpressionobjecOps[Self <: PickMemberExpressionobjec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObject(value: Expression): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Expression | Identifier_ | PrivateName_): Self = this.set("property", value.asInstanceOf[js.Any])
  }
}
