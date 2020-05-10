package typingsSlinky.markdownlint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownlintResult extends js.Object {
  var errorContext: String = js.native
  var errorDetail: js.UndefOr[String] = js.native
  var errorRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var lineNumber: Double = js.native
  var ruleAlias: String = js.native
  var ruleDescription: String = js.native
  var ruleName: String = js.native
}

object MarkdownlintResult {
  @scala.inline
  def apply(
    errorContext: String,
    lineNumber: Double,
    ruleAlias: String,
    ruleDescription: String,
    ruleName: String
  ): MarkdownlintResult = {
    val __obj = js.Dynamic.literal(errorContext = errorContext.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], ruleAlias = ruleAlias.asInstanceOf[js.Any], ruleDescription = ruleDescription.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownlintResult]
  }
  @scala.inline
  implicit class MarkdownlintResultOps[Self <: MarkdownlintResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorRange(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorRange")(js.undefined)
        ret
    }
  }
  
}

