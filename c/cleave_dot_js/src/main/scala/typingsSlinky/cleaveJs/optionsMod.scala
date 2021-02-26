package typingsSlinky.cleaveJs

import typingsSlinky.cleaveJs.creditCardMod.CreditCardTypeChangeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @js.native
  trait CleaveOptions extends StObject {
    
    var blocks: js.UndefOr[js.Array[Double]] = js.native
    
    var copyDelimiter: js.UndefOr[Boolean] = js.native
    
    var creditCard: js.UndefOr[Boolean] = js.native
    
    var creditCardStrictMode: js.UndefOr[Boolean] = js.native
    
    var creditCardType: js.UndefOr[String] = js.native
    
    var date: js.UndefOr[Boolean] = js.native
    
    var dateMax: js.UndefOr[String] = js.native
    
    var dateMin: js.UndefOr[String] = js.native
    
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
    
    var timeFormat: js.UndefOr[String] = js.native
    
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
    implicit class CleaveOptionsMutableBuilder[Self <: CleaveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocks(value: js.Array[Double]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      @scala.inline
      def setBlocksVarargs(value: Double*): Self = StObject.set(x, "blocks", js.Array(value :_*))
      
      @scala.inline
      def setCopyDelimiter(value: Boolean): Self = StObject.set(x, "copyDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyDelimiterUndefined: Self = StObject.set(x, "copyDelimiter", js.undefined)
      
      @scala.inline
      def setCreditCard(value: Boolean): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditCardStrictMode(value: Boolean): Self = StObject.set(x, "creditCardStrictMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditCardStrictModeUndefined: Self = StObject.set(x, "creditCardStrictMode", js.undefined)
      
      @scala.inline
      def setCreditCardType(value: String): Self = StObject.set(x, "creditCardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreditCardTypeUndefined: Self = StObject.set(x, "creditCardType", js.undefined)
      
      @scala.inline
      def setCreditCardUndefined: Self = StObject.set(x, "creditCard", js.undefined)
      
      @scala.inline
      def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateMax(value: String): Self = StObject.set(x, "dateMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateMaxUndefined: Self = StObject.set(x, "dateMax", js.undefined)
      
      @scala.inline
      def setDateMin(value: String): Self = StObject.set(x, "dateMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateMinUndefined: Self = StObject.set(x, "dateMin", js.undefined)
      
      @scala.inline
      def setDatePattern(value: js.Array[String]): Self = StObject.set(x, "datePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePatternUndefined: Self = StObject.set(x, "datePattern", js.undefined)
      
      @scala.inline
      def setDatePatternVarargs(value: String*): Self = StObject.set(x, "datePattern", js.Array(value :_*))
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterLazyShow(value: Boolean): Self = StObject.set(x, "delimiterLazyShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterLazyShowUndefined: Self = StObject.set(x, "delimiterLazyShow", js.undefined)
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setDelimiters(value: js.Array[String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      @scala.inline
      def setDelimitersVarargs(value: String*): Self = StObject.set(x, "delimiters", js.Array(value :_*))
      
      @scala.inline
      def setInitValue(value: js.Any): Self = StObject.set(x, "initValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
      
      @scala.inline
      def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
      
      @scala.inline
      def setNoImmediatePrefix(value: Boolean): Self = StObject.set(x, "noImmediatePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoImmediatePrefixUndefined: Self = StObject.set(x, "noImmediatePrefix", js.undefined)
      
      @scala.inline
      def setNumeral(value: Boolean): Self = StObject.set(x, "numeral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeralDecimalMark(value: String): Self = StObject.set(x, "numeralDecimalMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeralDecimalMarkUndefined: Self = StObject.set(x, "numeralDecimalMark", js.undefined)
      
      @scala.inline
      def setNumeralDecimalScale(value: Double): Self = StObject.set(x, "numeralDecimalScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeralDecimalScaleUndefined: Self = StObject.set(x, "numeralDecimalScale", js.undefined)
      
      @scala.inline
      def setNumeralIntegerScale(value: Double): Self = StObject.set(x, "numeralIntegerScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeralIntegerScaleUndefined: Self = StObject.set(x, "numeralIntegerScale", js.undefined)
      
      @scala.inline
      def setNumeralPositiveOnly(value: Boolean): Self = StObject.set(x, "numeralPositiveOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeralPositiveOnlyUndefined: Self = StObject.set(x, "numeralPositiveOnly", js.undefined)
      
      @scala.inline
      def setNumeralThousandsGroupStyle(value: NumeralThousandsGroupStyleType): Self = StObject.set(x, "numeralThousandsGroupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeralThousandsGroupStyleUndefined: Self = StObject.set(x, "numeralThousandsGroupStyle", js.undefined)
      
      @scala.inline
      def setNumeralUndefined: Self = StObject.set(x, "numeral", js.undefined)
      
      @scala.inline
      def setNumericOnly(value: Boolean): Self = StObject.set(x, "numericOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericOnlyUndefined: Self = StObject.set(x, "numericOnly", js.undefined)
      
      @scala.inline
      def setOnCreditCardTypeChanged(value: CreditCardTypeChangeHandler): Self = StObject.set(x, "onCreditCardTypeChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCreditCardTypeChangedUndefined: Self = StObject.set(x, "onCreditCardTypeChanged", js.undefined)
      
      @scala.inline
      def setOnValueChanged(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
      
      @scala.inline
      def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneRegionCode(value: String): Self = StObject.set(x, "phoneRegionCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneRegionCodeUndefined: Self = StObject.set(x, "phoneRegionCode", js.undefined)
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRawValueTrimPrefix(value: Boolean): Self = StObject.set(x, "rawValueTrimPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawValueTrimPrefixUndefined: Self = StObject.set(x, "rawValueTrimPrefix", js.undefined)
      
      @scala.inline
      def setStripLeadingZeroes(value: Boolean): Self = StObject.set(x, "stripLeadingZeroes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripLeadingZeroesUndefined: Self = StObject.set(x, "stripLeadingZeroes", js.undefined)
      
      @scala.inline
      def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
      
      @scala.inline
      def setTimePattern(value: js.Array[String]): Self = StObject.set(x, "timePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePatternUndefined: Self = StObject.set(x, "timePattern", js.undefined)
      
      @scala.inline
      def setTimePatternVarargs(value: String*): Self = StObject.set(x, "timePattern", js.Array(value :_*))
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.cleaveJs.cleaveJsStrings.lakh
    - typingsSlinky.cleaveJs.cleaveJsStrings.thousand
    - typingsSlinky.cleaveJs.cleaveJsStrings.wan
    - typingsSlinky.cleaveJs.cleaveJsStrings.none
  */
  trait NumeralThousandsGroupStyleType extends StObject
  object NumeralThousandsGroupStyleType {
    
    @scala.inline
    def lakh: typingsSlinky.cleaveJs.cleaveJsStrings.lakh = "lakh".asInstanceOf[typingsSlinky.cleaveJs.cleaveJsStrings.lakh]
    
    @scala.inline
    def none: typingsSlinky.cleaveJs.cleaveJsStrings.none = "none".asInstanceOf[typingsSlinky.cleaveJs.cleaveJsStrings.none]
    
    @scala.inline
    def thousand: typingsSlinky.cleaveJs.cleaveJsStrings.thousand = "thousand".asInstanceOf[typingsSlinky.cleaveJs.cleaveJsStrings.thousand]
    
    @scala.inline
    def wan: typingsSlinky.cleaveJs.cleaveJsStrings.wan = "wan".asInstanceOf[typingsSlinky.cleaveJs.cleaveJsStrings.wan]
  }
}
