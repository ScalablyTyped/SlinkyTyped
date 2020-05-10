package typingsSlinky.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumeralJSLocale extends js.Object {
  var abbreviations: AnonBillion = js.native
  var currency: AnonSymbol = js.native
  var delimiters: AnonDecimal = js.native
  def ordinal(num: Double): String = js.native
}

object NumeralJSLocale {
  @scala.inline
  def apply(
    abbreviations: AnonBillion,
    currency: AnonSymbol,
    delimiters: AnonDecimal,
    ordinal: Double => String
  ): NumeralJSLocale = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal))
    __obj.asInstanceOf[NumeralJSLocale]
  }
  @scala.inline
  implicit class NumeralJSLocaleOps[Self <: NumeralJSLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbbreviations(value: AnonBillion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbreviations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: AnonSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelimiters(value: AnonDecimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrdinal(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

