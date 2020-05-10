package typingsSlinky.babelTypes

import typingsSlinky.babelTypes.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@babel/types.@babel/types.MemberExpression, 'object' | 'property'> */
@js.native
trait PickMemberExpressionobjec extends js.Object {
  var `object`: Expression = js.native
  var property: js.Any = js.native
}

object PickMemberExpressionobjec {
  @scala.inline
  def apply(`object`: Expression, property: js.Any): PickMemberExpressionobjec = {
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
    def withObject(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

