package typingsSlinky.karmaSpecReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecReporterOptions extends js.Object {
  /** test would finish with error when a first fail occurs */
  var failFast: js.UndefOr[Boolean] = js.native
  /** limit number of lines logged per test */
  var maxLogLines: js.UndefOr[Double] = js.native
  /** print the time elapsed for each spec */
  var showSpecTiming: js.UndefOr[Boolean] = js.native
  /** do not print error summary */
  var suppressErrorSummary: js.UndefOr[Boolean] = js.native
  /** do not print information about failed tests */
  var suppressFailed: js.UndefOr[Boolean] = js.native
  /** do not print information about passed tests */
  var suppressPassed: js.UndefOr[Boolean] = js.native
  /** do not print information about skipped tests */
  var suppressSkipped: js.UndefOr[Boolean] = js.native
}

object SpecReporterOptions {
  @scala.inline
  def apply(): SpecReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecReporterOptions]
  }
  @scala.inline
  implicit class SpecReporterOptionsOps[Self <: SpecReporterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailFast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failFast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailFast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failFast")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLogLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLogLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLogLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLogLines")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSpecTiming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpecTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSpecTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSpecTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressErrorSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressErrorSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressErrorSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressErrorSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressFailed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressPassed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPassed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressPassed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressPassed")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressSkipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressSkipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressSkipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressSkipped")(js.undefined)
        ret
    }
  }
  
}

