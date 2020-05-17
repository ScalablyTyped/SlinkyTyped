package typingsSlinky.numbro.mod.numbro

import typingsSlinky.numbro.anon.Billion
import typingsSlinky.numbro.numbroStrings.billion
import typingsSlinky.numbro.numbroStrings.binary
import typingsSlinky.numbro.numbroStrings.byte
import typingsSlinky.numbro.numbroStrings.currency
import typingsSlinky.numbro.numbroStrings.decimal
import typingsSlinky.numbro.numbroStrings.general
import typingsSlinky.numbro.numbroStrings.infix
import typingsSlinky.numbro.numbroStrings.million
import typingsSlinky.numbro.numbroStrings.number
import typingsSlinky.numbro.numbroStrings.ordinal
import typingsSlinky.numbro.numbroStrings.parenthesis
import typingsSlinky.numbro.numbroStrings.percent
import typingsSlinky.numbro.numbroStrings.postfix
import typingsSlinky.numbro.numbroStrings.prefix
import typingsSlinky.numbro.numbroStrings.sign
import typingsSlinky.numbro.numbroStrings.string
import typingsSlinky.numbro.numbroStrings.thousand
import typingsSlinky.numbro.numbroStrings.time
import typingsSlinky.numbro.numbroStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var abbreviations: js.UndefOr[Billion] = js.native
  var average: js.UndefOr[Boolean] = js.native
  var base: js.UndefOr[decimal | binary | general] = js.native
  var characteristic: js.UndefOr[Double] = js.native
  var currencyPosition: js.UndefOr[prefix | infix | postfix] = js.native
  var currencySymbol: js.UndefOr[string] = js.native
  var exponential: js.UndefOr[Boolean] = js.native
  var forceAverage: js.UndefOr[trillion | billion | million | thousand] = js.native
  var forceSign: js.UndefOr[Boolean] = js.native
  var mantissa: js.UndefOr[Double] = js.native
  var negative: js.UndefOr[sign | parenthesis] = js.native
  var optionalCharacteristic: js.UndefOr[Boolean] = js.native
  var optionalMantissa: js.UndefOr[Boolean] = js.native
  var output: js.UndefOr[currency | percent | byte | time | ordinal | number] = js.native
  var postfix: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var prefixSymbol: js.UndefOr[Boolean] = js.native
  var spaceSeparated: js.UndefOr[Boolean] = js.native
  var spaceSeparatedCurrency: js.UndefOr[Boolean] = js.native
  var thousandSeparated: js.UndefOr[Boolean] = js.native
  var totalLength: js.UndefOr[Double] = js.native
  var trimMantissa: js.UndefOr[Boolean] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbbreviations(value: Billion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbbreviations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviations")(js.undefined)
        ret
    }
    @scala.inline
    def withAverage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(js.undefined)
        ret
    }
    @scala.inline
    def withBase(value: decimal | binary | general): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withCharacteristic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacteristic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristic")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyPosition(value: prefix | infix | postfix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencySymbol(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencySymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencySymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withExponential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponential")(js.undefined)
        ret
    }
    @scala.inline
    def withForceAverage(value: trillion | billion | million | thousand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceAverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAverage")(js.undefined)
        ret
    }
    @scala.inline
    def withForceSign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceSign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceSign")(js.undefined)
        ret
    }
    @scala.inline
    def withMantissa(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mantissa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMantissa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mantissa")(js.undefined)
        ret
    }
    @scala.inline
    def withNegative(value: sign | parenthesis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalCharacteristic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalCharacteristic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalCharacteristic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalCharacteristic")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalMantissa(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalMantissa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalMantissa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalMantissa")(js.undefined)
        ret
    }
    @scala.inline
    def withOutput(value: currency | percent | byte | time | ordinal | number): Self = {
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
    def withPostfix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixSymbol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceSeparated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceSeparated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceSeparated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceSeparated")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceSeparatedCurrency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceSeparatedCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceSeparatedCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceSeparatedCurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withThousandSeparated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandSeparated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThousandSeparated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousandSeparated")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimMantissa(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimMantissa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimMantissa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimMantissa")(js.undefined)
        ret
    }
  }
  
}

