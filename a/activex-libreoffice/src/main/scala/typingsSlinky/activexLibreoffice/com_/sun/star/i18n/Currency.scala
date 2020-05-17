package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Symbols, names, and attributes of a specific currency, returned in a sequence by {@link XLocaleData.getAllCurrencies()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait Currency extends js.Object {
  /**
    * {@link Currency} abbreviation used by banks and in money exchange, for example, **EUR** or **USD** . This usually should be identical to the ISO 4217
    * currency code also used in the {@link ID} , but doesn't necessarily have to be.
    */
  var BankSymbol: String = js.native
  /** The number of decimal places, for example, **2** for US Dollar or **0** for Italian Lira. */
  var DecimalPlaces: Double = js.native
  /** If this currency is the default currency for a given locale. */
  var Default: Boolean = js.native
  /** ISO 4217 currency code identifier, for example, **EUR** or **USD** . */
  var ID: String = js.native
  /** Name of the currency, for example, **Euro** or **US Dollar** . Should be the localized name. */
  var Name: String = js.native
  /** {@link Currency} symbol, for example, **$** . */
  var Symbol: String = js.native
  /**
    * If this currency is the one used in compatible number format codes with {@link FormatElement.formatIndex()} values in the range 12..17. Those format
    * codes are used to generate some old style currency format codes for compatibility with StarOffice5 and StarOffice4.
    * @see com.sun.star.i18n.NumberFormatIndex
    */
  var UsedInCompatibleFormatCodes: Boolean = js.native
}

object Currency {
  @scala.inline
  def apply(
    BankSymbol: String,
    DecimalPlaces: Double,
    Default: Boolean,
    ID: String,
    Name: String,
    Symbol: String,
    UsedInCompatibleFormatCodes: Boolean
  ): Currency = {
    val __obj = js.Dynamic.literal(BankSymbol = BankSymbol.asInstanceOf[js.Any], DecimalPlaces = DecimalPlaces.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Symbol = Symbol.asInstanceOf[js.Any], UsedInCompatibleFormatCodes = UsedInCompatibleFormatCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  @scala.inline
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBankSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedInCompatibleFormatCodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsedInCompatibleFormatCodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

