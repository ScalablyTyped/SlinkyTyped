package typingsSlinky.cypress.Mocha_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to Mocha.
  */
@js.native
trait MochaOptions extends js.Object {
  var allowUncaught: js.UndefOr[Boolean] = js.native
  var asyncOnly: js.UndefOr[Boolean] = js.native
  /** bail on the first test failure. */
  var bail: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Boolean] = js.native
  var enableTimeouts: js.UndefOr[Boolean] = js.native
  var forbidOnly: js.UndefOr[Boolean] = js.native
  var forbidPending: js.UndefOr[Boolean] = js.native
  /** display the full stack trace on failure. */
  var fullStackTrace: js.UndefOr[Boolean] = js.native
  /** Array of accepted globals. */
  var globals: js.UndefOr[js.Array[String]] = js.native
  /** string or regexp to filter tests with. */
  var grep: js.UndefOr[String | js.RegExp] = js.native
  /** Enable growl support. */
  var growl: js.UndefOr[Boolean] = js.native
  /** Do not show diffs at all. */
  var hideDiff: js.UndefOr[Boolean] = js.native
  /** ignore global leaks. */
  var ignoreLeaks: js.UndefOr[Boolean] = js.native
  /** Use inline diffs rather than +/-. */
  var inlineDiffs: js.UndefOr[Boolean] = js.native
  var noHighlighting: js.UndefOr[Boolean] = js.native
  /**
    * Reporter constructor, built-in reporter name, or reporter module path. Defaults to
    * `"spec"`.
    */
  var reporter: js.UndefOr[String | ReporterConstructor] = js.native
  /** Options to pass to the reporter. */
  var reporterOptions: js.UndefOr[js.Any] = js.native
  /** number of times to retry failed tests. */
  var retries: js.UndefOr[Double] = js.native
  /** milliseconds to wait before considering a test slow. */
  var slow: js.UndefOr[Double] = js.native
  /** timeout in milliseconds. */
  var timeout: js.UndefOr[Double] = js.native
  /** Test interfaces ("bdd", "tdd", "exports", etc.). */
  var ui: js.UndefOr[Interface] = js.native
  /** Emit color output. */
  var useColors: js.UndefOr[Boolean] = js.native
}

object MochaOptions {
  @scala.inline
  def apply(): MochaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaOptions]
  }
  @scala.inline
  implicit class MochaOptionsOps[Self <: MochaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUncaught(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUncaught")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUncaught: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUncaught")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withBail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bail")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTimeouts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTimeouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTimeouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTimeouts")(js.undefined)
        ret
    }
    @scala.inline
    def withForbidOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbidOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withForbidPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbidPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidPending")(js.undefined)
        ret
    }
    @scala.inline
    def withFullStackTrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullStackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullStackTrace")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobals(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.undefined)
        ret
    }
    @scala.inline
    def withGrepRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrep(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grep")(js.undefined)
        ret
    }
    @scala.inline
    def withGrowl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrowl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("growl")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDiff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDiff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDiff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDiff")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreLeaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLeaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreLeaks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreLeaks")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineDiffs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineDiffs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineDiffs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineDiffs")(js.undefined)
        ret
    }
    @scala.inline
    def withNoHighlighting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noHighlighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoHighlighting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noHighlighting")(js.undefined)
        ret
    }
    @scala.inline
    def withReporter(value: String | ReporterConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporter")(js.undefined)
        ret
    }
    @scala.inline
    def withReporterOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReporterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reporterOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retries")(js.undefined)
        ret
    }
    @scala.inline
    def withSlow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUi(value: Interface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(js.undefined)
        ret
    }
    @scala.inline
    def withUseColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useColors")(js.undefined)
        ret
    }
  }
  
}

