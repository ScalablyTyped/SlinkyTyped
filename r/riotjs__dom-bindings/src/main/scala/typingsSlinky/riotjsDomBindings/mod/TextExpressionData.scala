package typingsSlinky.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextExpressionData
  extends BaseExpressionData
     with _ExpressionData {
  var childNodeIndex: Double = js.native
}

object TextExpressionData {
  @scala.inline
  def apply(childNodeIndex: Double, evaluate: js.Any => js.Any, `type`: ExpressionType): TextExpressionData = {
    val __obj = js.Dynamic.literal(childNodeIndex = childNodeIndex.asInstanceOf[js.Any], evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextExpressionData]
  }
  @scala.inline
  implicit class TextExpressionDataOps[Self <: TextExpressionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildNodeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childNodeIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

