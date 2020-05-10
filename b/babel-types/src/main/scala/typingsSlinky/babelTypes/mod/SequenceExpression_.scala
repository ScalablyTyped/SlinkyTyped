package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.SequenceExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceExpression_
  extends Node
     with Expression {
  var expressions: js.Array[Expression] = js.native
  @JSName("type")
  var type_SequenceExpression_ : SequenceExpression = js.native
}

object SequenceExpression_ {
  @scala.inline
  def apply(
    end: Double,
    expressions: js.Array[Expression],
    loc: SourceLocation,
    start: Double,
    `type`: SequenceExpression
  ): SequenceExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceExpression_]
  }
  @scala.inline
  implicit class SequenceExpression_Ops[Self <: SequenceExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpressions(value: js.Array[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: SequenceExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

