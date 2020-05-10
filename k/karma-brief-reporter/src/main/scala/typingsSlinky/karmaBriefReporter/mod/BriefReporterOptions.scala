package typingsSlinky.karmaBriefReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BriefReporterOptions extends js.Object {
  /**
    * Print the test failures immediately instead of at the end
    * @default false
    */
  var earlyErrorReport: js.UndefOr[Boolean] = js.native
  /**
    * Omits stack frames from external dependencies like qunit,
    * jasmine or chai, which appear in stack traces of failed
    * tests and which are usually irrelevant to the tested code
    * @default false
    */
  var omitExternalStackFrames: js.UndefOr[Boolean] = js.native
  /**
    * Only render the graphic after all tests have finished.
    * This is ideal for using this reporter in a continuous integration environment
    * @default false
    */
  var renderOnRunCompleteOnly: js.UndefOr[Boolean] = js.native
  /**
    * Suppress the browser console log at the end of the test run
    * @default false
    */
  var suppressBrowserLogs: js.UndefOr[Boolean] = js.native
  /**
    * Suppress the red background on errors in the error
    * report at the end of the test run.
    * @default false
    */
  var suppressErrorHighlighting: js.UndefOr[Boolean] = js.native
  /**
    * Suppress the error report at the end of the test run
    * @default false
    */
  var suppressErrorReport: js.UndefOr[Boolean] = js.native
}

object BriefReporterOptions {
  @scala.inline
  def apply(): BriefReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BriefReporterOptions]
  }
  @scala.inline
  implicit class BriefReporterOptionsOps[Self <: BriefReporterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEarlyErrorReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyErrorReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarlyErrorReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyErrorReport")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitExternalStackFrames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitExternalStackFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitExternalStackFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitExternalStackFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderOnRunCompleteOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOnRunCompleteOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderOnRunCompleteOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOnRunCompleteOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressBrowserLogs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressBrowserLogs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressBrowserLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressBrowserLogs")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressErrorHighlighting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressErrorHighlighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressErrorHighlighting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressErrorHighlighting")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressErrorReport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressErrorReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressErrorReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressErrorReport")(js.undefined)
        ret
    }
  }
  
}

