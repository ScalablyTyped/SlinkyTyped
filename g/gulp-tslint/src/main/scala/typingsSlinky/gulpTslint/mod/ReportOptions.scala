package typingsSlinky.gulpTslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportOptions extends js.Object {
  var allowWarnings: js.UndefOr[Boolean] = js.native
  var emitError: js.UndefOr[Boolean] = js.native
  var reportLimit: js.UndefOr[Double] = js.native
  var summarizeFailureOutput: js.UndefOr[Boolean] = js.native
}

object ReportOptions {
  @scala.inline
  def apply(): ReportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportOptions]
  }
  @scala.inline
  implicit class ReportOptionsOps[Self <: ReportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWarnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWarnings")(js.undefined)
        ret
    }
    @scala.inline
    def withEmitError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitError")(js.undefined)
        ret
    }
    @scala.inline
    def withReportLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSummarizeFailureOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summarizeFailureOutput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummarizeFailureOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summarizeFailureOutput")(js.undefined)
        ret
    }
  }
  
}

