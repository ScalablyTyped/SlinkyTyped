package typingsSlinky.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseExpressionData extends js.Object {
  var `type`: ExpressionType = js.native
  def evaluate(scope: js.Any): js.Any = js.native
}

object BaseExpressionData {
  @scala.inline
  def apply(evaluate: js.Any => js.Any, `type`: ExpressionType): BaseExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExpressionData]
  }
  @scala.inline
  implicit class BaseExpressionDataOps[Self <: BaseExpressionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluate(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: ExpressionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

