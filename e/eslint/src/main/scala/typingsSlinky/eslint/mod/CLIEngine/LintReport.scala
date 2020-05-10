package typingsSlinky.eslint.mod.CLIEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintReport extends js.Object {
  var errorCount: Double = js.native
  var fixableErrorCount: Double = js.native
  var fixableWarningCount: Double = js.native
  var results: js.Array[LintResult] = js.native
  var usedDeprecatedRules: js.Array[DeprecatedRuleUse] = js.native
  var warningCount: Double = js.native
}

object LintReport {
  @scala.inline
  def apply(
    errorCount: Double,
    fixableErrorCount: Double,
    fixableWarningCount: Double,
    results: js.Array[LintResult],
    usedDeprecatedRules: js.Array[DeprecatedRuleUse],
    warningCount: Double
  ): LintReport = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any], fixableErrorCount = fixableErrorCount.asInstanceOf[js.Any], fixableWarningCount = fixableWarningCount.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], usedDeprecatedRules = usedDeprecatedRules.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintReport]
  }
  @scala.inline
  implicit class LintReportOps[Self <: LintReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixableErrorCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixableErrorCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixableWarningCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixableWarningCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[LintResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedDeprecatedRules(value: js.Array[DeprecatedRuleUse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedDeprecatedRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

