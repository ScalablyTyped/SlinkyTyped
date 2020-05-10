package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleCallExpression
  extends BaseCallExpression
     with CallExpression {
  @JSName("type")
  var type_SimpleCallExpression: typingsSlinky.estree.estreeStrings.CallExpression = js.native
}

object SimpleCallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    `type`: typingsSlinky.estree.estreeStrings.CallExpression
  ): SimpleCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleCallExpression]
  }
  @scala.inline
  implicit class SimpleCallExpressionOps[Self <: SimpleCallExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.estree.estreeStrings.CallExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

