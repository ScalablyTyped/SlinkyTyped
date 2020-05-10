package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YieldExpression_
  extends Node
     with Expression
     with Terminatorless {
  var argument: Expression = js.native
  var delegate: Boolean = js.native
  @JSName("type")
  var type_YieldExpression_ : YieldExpression = js.native
}

object YieldExpression_ {
  @scala.inline
  def apply(
    argument: Expression,
    delegate: Boolean,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: YieldExpression
  ): YieldExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], delegate = delegate.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YieldExpression_]
  }
  @scala.inline
  implicit class YieldExpression_Ops[Self <: YieldExpression_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgument(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelegate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: YieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

