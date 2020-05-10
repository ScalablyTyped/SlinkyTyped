package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.AmpersandAmpersand
import typingsSlinky.babelTypes.babelTypesStrings.LogicalExpression
import typingsSlinky.babelTypes.babelTypesStrings.QuestionmarkQuestionmark
import typingsSlinky.babelTypes.babelTypesStrings.VerticallineVerticalline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.mod._Node because Already inherited */ @js.native
trait LogicalExpression_
  extends Binary
     with BaseNode
     with Expression {
  var left: Expression = js.native
  var operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark = js.native
  var right: Expression = js.native
  @JSName("type")
  var type_LogicalExpression_ : LogicalExpression = js.native
}

object LogicalExpression_ {
  @scala.inline
  def apply(
    left: Expression,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: Expression,
    `type`: LogicalExpression
  ): LogicalExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalExpression_]
  }
  @scala.inline
  implicit class LogicalExpression_Ops[Self <: LogicalExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: LogicalExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

