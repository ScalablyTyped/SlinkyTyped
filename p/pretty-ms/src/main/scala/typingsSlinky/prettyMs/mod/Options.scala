package typingsSlinky.prettyMs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Display time using colon notation: `5h 1m 45s` → `5:01:45`. Always shows time in at least minutes: `1s` → `0:01`
  		Useful when you want to display time without the time units, similar to a digital watch.
  		Setting `colonNotation` to `true` overrides the following options to `false`:
  		- `compact`
  		- `formatSubMilliseconds`
  		- `separateMilliseconds`
  		- `verbose`
  		@default false
  		*/
  val colonNotation: js.UndefOr[Boolean] = js.native
  /**
  		Only show the first unit: `1h 10m` → `~1h`.
  		Also ensures that `millisecondsDecimalDigits` and `secondsDecimalDigits` are both set to `0`.
  		@default false
  		*/
  val compact: js.UndefOr[Boolean] = js.native
  /**
  		Show microseconds and nanoseconds.
  		@default false
  		*/
  val formatSubMilliseconds: js.UndefOr[Boolean] = js.native
  /**
  		Keep milliseconds on whole seconds: `13s` → `13.0s`.
  		Useful when you are showing a number of seconds spent on an operation and don't want the width of the output to change when hitting a whole number.
  		@default false
  		*/
  val keepDecimalsOnWholeSeconds: js.UndefOr[Boolean] = js.native
  /**
  		Number of digits to appear after the milliseconds decimal point.
  		Useful in combination with [`process.hrtime()`](https://nodejs.org/api/process.html#process_process_hrtime).
  		@default 0
  		*/
  val millisecondsDecimalDigits: js.UndefOr[Double] = js.native
  /**
  		Number of digits to appear after the seconds decimal point.
  		@default 1
  		*/
  val secondsDecimalDigits: js.UndefOr[Double] = js.native
  /**
  		Show milliseconds separately. This means they won't be included in the decimal part of the seconds.
  		@default false
  		*/
  val separateMilliseconds: js.UndefOr[Boolean] = js.native
  /**
  		Number of units to show. Setting `compact` to `true` overrides this option.
  		@default Infinity
  		*/
  val unitCount: js.UndefOr[Double] = js.native
  /**
  		Use full-length units: `5h 1m 45s` → `5 hours 1 minute 45 seconds`.
  		@default false
  		*/
  val verbose: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColonNotation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colonNotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColonNotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colonNotation")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatSubMilliseconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatSubMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatSubMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatSubMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepDecimalsOnWholeSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepDecimalsOnWholeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepDecimalsOnWholeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepDecimalsOnWholeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMillisecondsDecimalDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecondsDecimalDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisecondsDecimalDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecondsDecimalDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondsDecimalDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsDecimalDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondsDecimalDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsDecimalDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparateMilliseconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separateMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparateMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separateMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitCount")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

