package typingsSlinky.browserReport

import org.scalajs.dom.raw.ErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  def browserReport(result: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, _]): Unit = js.native
  def browserReportSync(): ReportResult = js.native
}

object Window {
  @scala.inline
  def apply(
    browserReport: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, _] => Unit,
    browserReportSync: () => ReportResult
  ): Window = {
    val __obj = js.Dynamic.literal(browserReport = js.Any.fromFunction1(browserReport), browserReportSync = js.Any.fromFunction0(browserReportSync))
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowserReport(value: js.Function2[/* error */ ErrorEvent, /* report */ ReportResult, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserReport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBrowserReportSync(value: () => ReportResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserReportSync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

