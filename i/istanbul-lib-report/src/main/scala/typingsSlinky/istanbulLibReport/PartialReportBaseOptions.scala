package typingsSlinky.istanbulLibReport

import typingsSlinky.istanbulLibReport.mod.Summarizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.ReportBaseOptions> */
@js.native
trait PartialReportBaseOptions extends js.Object {
  var summarizer: js.UndefOr[Summarizers] = js.native
}

object PartialReportBaseOptions {
  @scala.inline
  def apply(): PartialReportBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReportBaseOptions]
  }
  @scala.inline
  implicit class PartialReportBaseOptionsOps[Self <: PartialReportBaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSummarizer(value: Summarizers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summarizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummarizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summarizer")(js.undefined)
        ret
    }
  }
  
}

