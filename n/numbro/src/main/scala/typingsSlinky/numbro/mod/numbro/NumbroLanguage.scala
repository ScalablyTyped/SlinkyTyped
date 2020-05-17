package typingsSlinky.numbro.mod.numbro

import typingsSlinky.numbro.anon.Code
import typingsSlinky.numbro.anon.Decimal
import typingsSlinky.numbro.anon.FourDigits
import typingsSlinky.numbro.anon.Million
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumbroLanguage extends js.Object {
  var abbreviations: Million = js.native
  var byteFormat: js.UndefOr[Format] = js.native
  var currency: Code = js.native
  var currencyFormat: js.UndefOr[Format] = js.native
  var defaults: js.UndefOr[Format] = js.native
  var delimiters: Decimal = js.native
  var formats: FourDigits = js.native
  var languageTag: String = js.native
  var ordinalFormat: js.UndefOr[Format] = js.native
  var percentageFormat: js.UndefOr[Format] = js.native
  var spaceSeparated: js.UndefOr[Boolean] = js.native
  def ordinal(num: Double): String = js.native
}

object NumbroLanguage {
  @scala.inline
  def apply(
    abbreviations: Million,
    currency: Code,
    delimiters: Decimal,
    formats: FourDigits,
    languageTag: String,
    ordinal: Double => String
  ): NumbroLanguage = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
    __obj.asInstanceOf[NumbroLanguage]
  }
  @scala.inline
  implicit class NumbroLanguageOps[Self <: NumbroLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbbreviations(value: Million): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: Code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelimiters(value: Decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormats(value: FourDigits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrdinal(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withByteFormat(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrencyFormat(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currencyFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdinalFormat(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinalFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdinalFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinalFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentageFormat(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentageFormat")(js.undefined)
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
  }
  
}

