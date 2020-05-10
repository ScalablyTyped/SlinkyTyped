package typingsSlinky.axeWebdriverjs.mod

import typingsSlinky.axeCore.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxeAnalysis extends js.Object {
  var inapplicable: js.Array[Result] = js.native
  var incomplete: js.Array[Result] = js.native
  var passes: js.Array[Result] = js.native
  var timestamp: String = js.native
  var url: String = js.native
  var violations: js.Array[Result] = js.native
}

object AxeAnalysis {
  @scala.inline
  def apply(
    inapplicable: js.Array[Result],
    incomplete: js.Array[Result],
    passes: js.Array[Result],
    timestamp: String,
    url: String,
    violations: js.Array[Result]
  ): AxeAnalysis = {
    val __obj = js.Dynamic.literal(inapplicable = inapplicable.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxeAnalysis]
  }
  @scala.inline
  implicit class AxeAnalysisOps[Self <: AxeAnalysis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInapplicable(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inapplicable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncomplete(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasses(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViolations(value: js.Array[Result]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

