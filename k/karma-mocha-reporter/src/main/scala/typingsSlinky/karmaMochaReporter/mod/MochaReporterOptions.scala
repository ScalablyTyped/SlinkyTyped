package typingsSlinky.karmaMochaReporter.mod

import typingsSlinky.karmaMochaReporter.karmaMochaReporterBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reporter options
  */
@js.native
trait MochaReporterOptions extends js.Object {
  /**
    * Lets you overwrite the default colors.
    * Possible values are all colors and background colors from chalk.
    */
  var colors: js.UndefOr[ColorOptions] = js.native
  /** The string to output between multiple test runs. Set to false or empty string to disable */
  var divider: js.UndefOr[String | `false`] = js.native
  /**
    * When setting the ignoreSkipped flag to true, the reporter will ignore the skipped tests in the output
    * and you will see only the tests that where really executed.
    * The summary will still contain the number of skipped tests.
    */
  var ignoreSkipped: js.UndefOr[Boolean] = js.native
  /**
    * Lets you set the maximum number of lines which are printed for a failure.
    * The default value is 999. Helps to cut long stack traces. Set the value to -1 to disable stack traces.
    */
  var maxLogLines: js.UndefOr[Double] = js.native
  /**
    * output type printed to the console
    */
  var output: js.UndefOr[OutputOptions] = js.native
  /**
    * Prints the result of an it block after it is run in one browser.
    * This options is useful when you have tests which are conditionally run in one browser only.
    * Otherwise the result of the it block would not be printed because it was not run in all browsers.
    */
  var printFirstSuccess: js.UndefOr[Boolean] = js.native
  /**
    * Shows a diff output. Is disabled by default.
    * All credits to the contributors of mocha, since the diff logic is used from there and customized for this modul
    */
  var showDiff: js.UndefOr[ShowDiffOptions] = js.native
  /**
    * Lets you overwrite the default symbols.
    */
  var symbols: js.UndefOr[SymbolOptions] = js.native
}

object MochaReporterOptions {
  @scala.inline
  def apply(): MochaReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaReporterOptions]
  }
  @scala.inline
  implicit class MochaReporterOptionsOps[Self <: MochaReporterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: ColorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withDivider(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreSkipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSkipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreSkipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreSkipped")(js.undefined)
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
    def withOutput(value: OutputOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintFirstSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printFirstSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintFirstSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printFirstSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDiff(value: ShowDiffOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDiff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDiff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDiff")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbols(value: SymbolOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(js.undefined)
        ret
    }
  }
  
}

