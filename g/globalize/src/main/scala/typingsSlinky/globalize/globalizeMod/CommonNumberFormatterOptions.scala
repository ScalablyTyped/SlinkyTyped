package typingsSlinky.globalize.globalizeMod

import typingsSlinky.globalize.globalizeStrings.ceil
import typingsSlinky.globalize.globalizeStrings.floor
import typingsSlinky.globalize.globalizeStrings.long
import typingsSlinky.globalize.globalizeStrings.round
import typingsSlinky.globalize.globalizeStrings.short
import typingsSlinky.globalize.globalizeStrings.truncate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonNumberFormatterOptions extends js.Object {
  /**
  		 * String `short` or `long` indicating which compact number format should be used to represent the number.
  		 */
  var compact: js.UndefOr[short | long] = js.native
  /**
  		 * Non-negative integer Number values indicating the minimum and maximum fraction digits to be used.
  		 * Numbers will be rounded or padded with trailing zeroes if necessary.
  		 * Either one or both of these properties must be present.
  		 * If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
  		 */
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  /**
  		 * Positive integer Number values indicating the minimum and maximum fraction digits to be shown.
  		 * Either none or both of these properties are present.
  		 * If they are, they override minimum and maximum integer and fraction digits.
  		 * The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
  		 */
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  /**
  		 * Non-negative integer Number values indicating the minimum and maximum fraction digits to be used.
  		 * Numbers will be rounded or padded with trailing zeroes if necessary.
  		 * Either one or both of these properties must be present.
  		 * If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
  		 */
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  /**
  		 * Non-negative integer Number value indicating the minimum integer digits to be used. Numbers will be padded with leading zeroes if necessary.
  		 */
  var minimumIntegerDigits: js.UndefOr[Double] = js.native
  /**
  		 * Positive integer Number values indicating the minimum and maximum fraction digits to be shown.
  		 * Either none or both of these properties are present
  		 * If they are, they override minimum and maximum integer and fraction digits.
  		 * The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
  		 */
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  /**
  		 * String with rounding method ceil, floor, round (default), or truncate.
  		 */
  var round: js.UndefOr[ceil | floor | typingsSlinky.globalize.globalizeStrings.round | truncate] = js.native
  /**
  		 * Boolean (default is true) value indicating whether a grouping separator should be used.
  		 */
  var useGrouping: js.UndefOr[Boolean] = js.native
}

object CommonNumberFormatterOptions {
  @scala.inline
  def apply(): CommonNumberFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonNumberFormatterOptions]
  }
  @scala.inline
  implicit class CommonNumberFormatterOptionsOps[Self <: CommonNumberFormatterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompact(value: short | long): Self = {
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
    def withMaximumFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumFractionDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFractionDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumSignificantDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSignificantDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumSignificantDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumSignificantDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumFractionDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFractionDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumFractionDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumFractionDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumIntegerDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumIntegerDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumIntegerDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumIntegerDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumSignificantDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSignificantDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumSignificantDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumSignificantDigits")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: ceil | floor | round | truncate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withUseGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGrouping")(js.undefined)
        ret
    }
  }
  
}

