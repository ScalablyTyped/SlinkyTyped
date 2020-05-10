package typingsSlinky.cleaveJs.optionsMod

import typingsSlinky.cleaveJs.creditCardMod.CreditCardTypeChangeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CleaveOptions extends js.Object {
  var blocks: js.UndefOr[js.Array[Double]] = js.native
  var copyDelimiter: js.UndefOr[Boolean] = js.native
  var creditCard: js.UndefOr[Boolean] = js.native
  var creditCardStrictMode: js.UndefOr[Boolean] = js.native
  var creditCardType: js.UndefOr[String] = js.native
  var date: js.UndefOr[Boolean] = js.native
  var datePattern: js.UndefOr[js.Array[String]] = js.native
  var delimiter: js.UndefOr[String] = js.native
  var delimiterLazyShow: js.UndefOr[Boolean] = js.native
  var delimiters: js.UndefOr[js.Array[String]] = js.native
  var initValue: js.UndefOr[js.Any] = js.native
  var lowercase: js.UndefOr[Boolean] = js.native
  var noImmediatePrefix: js.UndefOr[Boolean] = js.native
  var numeral: js.UndefOr[Boolean] = js.native
  var numeralDecimalMark: js.UndefOr[String] = js.native
  var numeralDecimalScale: js.UndefOr[Double] = js.native
  var numeralIntegerScale: js.UndefOr[Double] = js.native
  var numeralPositiveOnly: js.UndefOr[Boolean] = js.native
  var numeralThousandsGroupStyle: js.UndefOr[NumeralThousandsGroupStyleType] = js.native
  var numericOnly: js.UndefOr[Boolean] = js.native
  var onCreditCardTypeChanged: js.UndefOr[CreditCardTypeChangeHandler] = js.native
  var onValueChanged: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  var phone: js.UndefOr[Boolean] = js.native
  var phoneRegionCode: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var rawValueTrimPrefix: js.UndefOr[Boolean] = js.native
  var stripLeadingZeroes: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Boolean] = js.native
  var timePattern: js.UndefOr[js.Array[String]] = js.native
  var uppercase: js.UndefOr[Boolean] = js.native
}

object CleaveOptions {
  @scala.inline
  def apply(): CleaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CleaveOptions]
  }
  @scala.inline
  implicit class CleaveOptionsOps[Self <: CleaveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocks(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyDelimiter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditCard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCard")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditCardStrictMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCardStrictMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditCardStrictMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCardStrictMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditCardType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCardType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditCardType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditCardType")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDatePattern(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiterLazyShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterLazyShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiterLazyShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiterLazyShow")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(js.undefined)
        ret
    }
    @scala.inline
    def withInitValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withNoImmediatePrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImmediatePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoImmediatePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noImmediatePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeral(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeral")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeralDecimalMark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralDecimalMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeralDecimalMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralDecimalMark")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeralDecimalScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralDecimalScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeralDecimalScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralDecimalScale")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeralIntegerScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralIntegerScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeralIntegerScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralIntegerScale")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeralPositiveOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralPositiveOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeralPositiveOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralPositiveOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeralThousandsGroupStyle(value: NumeralThousandsGroupStyleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralThousandsGroupStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeralThousandsGroupStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeralThousandsGroupStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNumericOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumericOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numericOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCreditCardTypeChanged(value: CreditCardTypeChangeHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreditCardTypeChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCreditCardTypeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreditCardTypeChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValueChanged(value: /* event */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneRegionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneRegionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneRegionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneRegionCode")(js.undefined)
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
    def withRawValueTrimPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValueTrimPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawValueTrimPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawValueTrimPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStripLeadingZeroes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLeadingZeroes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripLeadingZeroes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLeadingZeroes")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePattern(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withUppercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUppercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(js.undefined)
        ret
    }
  }
  
}

