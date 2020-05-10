package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ConditionalExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalExpression_
  extends Node
     with Conditional
     with Expression {
  var alternate: Expression = js.native
  var consequent: Expression = js.native
  var test: Expression = js.native
  @JSName("type")
  var type_ConditionalExpression_ : ConditionalExpression = js.native
}

object ConditionalExpression_ {
  @scala.inline
  def apply(
    alternate: Expression,
    consequent: Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: ConditionalExpression
  ): ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalExpression_]
  }
  @scala.inline
  implicit class ConditionalExpression_Ops[Self <: ConditionalExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternate(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsequent(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consequent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ConditionalExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

