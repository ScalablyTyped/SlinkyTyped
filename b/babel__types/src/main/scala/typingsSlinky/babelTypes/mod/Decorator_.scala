package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.Decorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decorator_
  extends BaseNode
     with Node {
  var expression: Expression = js.native
  @JSName("type")
  var type_Decorator_ : Decorator = js.native
}

object Decorator_ {
  @scala.inline
  def apply(expression: Expression, `type`: Decorator): Decorator_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorator_]
  }
  @scala.inline
  implicit class Decorator_Ops[Self <: Decorator_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Decorator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

