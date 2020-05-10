package typingsSlinky.modernizr

import typingsSlinky.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CssColumnsBoolean extends Boolean {
  var breakafter: scala.Boolean = js.native
  var breakbefore: scala.Boolean = js.native
  var breakinside: scala.Boolean = js.native
  var fill: scala.Boolean = js.native
  var gap: scala.Boolean = js.native
  var rule: scala.Boolean = js.native
  var rulecolor: scala.Boolean = js.native
  var rulestyle: scala.Boolean = js.native
  var rulewidth: scala.Boolean = js.native
  var span: scala.Boolean = js.native
  var width: scala.Boolean = js.native
}

object CssColumnsBoolean {
  @scala.inline
  def apply(
    breakafter: scala.Boolean,
    breakbefore: scala.Boolean,
    breakinside: scala.Boolean,
    fill: scala.Boolean,
    gap: scala.Boolean,
    rule: scala.Boolean,
    rulecolor: scala.Boolean,
    rulestyle: scala.Boolean,
    rulewidth: scala.Boolean,
    span: scala.Boolean,
    width: scala.Boolean
  ): CssColumnsBoolean = {
    val __obj = js.Dynamic.literal(breakafter = breakafter.asInstanceOf[js.Any], breakbefore = breakbefore.asInstanceOf[js.Any], breakinside = breakinside.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], rulecolor = rulecolor.asInstanceOf[js.Any], rulestyle = rulestyle.asInstanceOf[js.Any], rulewidth = rulewidth.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssColumnsBoolean]
  }
  @scala.inline
  implicit class CssColumnsBooleanOps[Self <: CssColumnsBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakafter(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakafter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakbefore(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakbefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakinside(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakinside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGap(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRule(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulecolor(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulecolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulestyle(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulestyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRulewidth(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rulewidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpan(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

