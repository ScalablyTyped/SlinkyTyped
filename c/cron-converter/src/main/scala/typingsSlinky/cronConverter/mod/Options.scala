package typingsSlinky.cronConverter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Changes the * to H on the `toString()`.
    * Default: `false`.
    */
  var outputHashes: js.UndefOr[Boolean] = js.native
  /**
    * Changes the numbers to 3 letter month names on the `toString()`.
    * Default: `false`.
    */
  var outputMonthNames: js.UndefOr[Boolean] = js.native
  /**
    * Changes the numbers to 3 letter weekday names on the `toString()`.
    * Default: `false`.
    */
  var outputWeekdayNames: js.UndefOr[Boolean] = js.native
  /**
    * Defines a timezone to the cron instance.
    * Default: `Local timezone`.
    */
  var timezone: js.UndefOr[String] = js.native
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
    def withOutputHashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputHashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputHashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputHashes")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputMonthNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputMonthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputMonthNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputMonthNames")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputWeekdayNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputWeekdayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputWeekdayNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputWeekdayNames")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
  }
  
}

