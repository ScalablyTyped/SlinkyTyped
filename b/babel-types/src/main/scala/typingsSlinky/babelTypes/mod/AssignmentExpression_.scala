package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.AmpersandEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.AssignmentExpression
import typingsSlinky.babelTypes.babelTypesStrings.AsteriskEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.Equalssign
import typingsSlinky.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.LessthansignLessthansignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.PercentsignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.PlussignEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.SlashEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.VerticallineEqualssign
import typingsSlinky.babelTypes.babelTypesStrings.`-Equalssign`
import typingsSlinky.babelTypes.babelTypesStrings.`^Equalssign`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentExpression_
  extends Node
     with Expression {
  var left: LVal = js.native
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign = js.native
  var right: Expression = js.native
  @JSName("type")
  var type_AssignmentExpression_ : AssignmentExpression = js.native
}

object AssignmentExpression_ {
  @scala.inline
  def apply(
    end: Double,
    left: LVal,
    loc: SourceLocation,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: Expression,
    start: Double,
    `type`: AssignmentExpression
  ): AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression_]
  }
  @scala.inline
  implicit class AssignmentExpression_Ops[Self <: AssignmentExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: LVal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(
      value: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
    ): Self = {
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
    def withType(value: AssignmentExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

