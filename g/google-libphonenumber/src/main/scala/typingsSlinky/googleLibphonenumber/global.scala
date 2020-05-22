package typingsSlinky.googleLibphonenumber

import typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object libphonenumber extends js.Object {
    @js.native
    class AsYouTypeFormatter protected ()
      extends typingsSlinky.googleLibphonenumber.libphonenumber.AsYouTypeFormatter {
      def this(region: String) = this()
      /* CompleteClass */
      override def clear(): Unit = js.native
      /* CompleteClass */
      override def inputDigit(digit: String): String = js.native
    }
    
    @js.native
    class PhoneNumber ()
      extends typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber {
      /* CompleteClass */
      override def clearCountryCode(): Unit = js.native
      /* CompleteClass */
      override def clearCountryCodeSource(): Unit = js.native
      /* CompleteClass */
      override def clearExtension(): Unit = js.native
      /* CompleteClass */
      override def clearItalianLeadingZero(): Unit = js.native
      /* CompleteClass */
      override def clearNationalNumber(): Unit = js.native
      /* CompleteClass */
      override def clearNumberOfLeadingZeros(): Unit = js.native
      /* CompleteClass */
      override def clearPreferredDomesticCarrierCode(): Unit = js.native
      /* CompleteClass */
      override def clearRawInput(): Unit = js.native
      /* CompleteClass */
      override def countryCodeCount(): Double = js.native
      /* CompleteClass */
      override def countryCodeSourceCount(): Double = js.native
      /* CompleteClass */
      override def extensionCount(): Double = js.native
      /* CompleteClass */
      override def getCountryCode(): js.UndefOr[Double] = js.native
      /* CompleteClass */
      override def getCountryCodeOrDefault(): Double = js.native
      /* CompleteClass */
      override def getCountryCodeSource(): js.UndefOr[CountryCodeSource] = js.native
      /* CompleteClass */
      override def getCountryCodeSourceOrDefault(): CountryCodeSource = js.native
      /* CompleteClass */
      override def getExtension(): js.UndefOr[String] = js.native
      /* CompleteClass */
      override def getExtensionOrDefault(): String = js.native
      /* CompleteClass */
      override def getItalianLeadingZero(): js.UndefOr[Boolean] = js.native
      /* CompleteClass */
      override def getItalianLeadingZeroOrDefault(): Boolean = js.native
      /* CompleteClass */
      override def getNationalNumber(): js.UndefOr[Double] = js.native
      /* CompleteClass */
      override def getNationalNumberOrDefault(): Double = js.native
      /* CompleteClass */
      override def getNumberOfLeadingZeros(): js.UndefOr[Double] = js.native
      /* CompleteClass */
      override def getNumberOfLeadingZerosOrDefault(): Double = js.native
      /* CompleteClass */
      override def getPreferredDomesticCarrierCode(): js.UndefOr[String] = js.native
      /* CompleteClass */
      override def getPreferredDomesticCarrierCodeOrDefault(): String = js.native
      /* CompleteClass */
      override def getRawInput(): js.UndefOr[String] = js.native
      /* CompleteClass */
      override def getRawInputOrDefault(): String = js.native
      /* CompleteClass */
      override def hasCountryCode(): Boolean = js.native
      /* CompleteClass */
      override def hasCountryCodeSource(): Boolean = js.native
      /* CompleteClass */
      override def hasExtension(): Boolean = js.native
      /* CompleteClass */
      override def hasItalianLeadingZero(): Boolean = js.native
      /* CompleteClass */
      override def hasNationalNumber(): Boolean = js.native
      /* CompleteClass */
      override def hasNumberOfLeadingZeros(): Boolean = js.native
      /* CompleteClass */
      override def hasPreferredDomesticCarrierCode(): Boolean = js.native
      /* CompleteClass */
      override def hasRawInput(): Boolean = js.native
      /* CompleteClass */
      override def italianLeadingZeroCount(): Double = js.native
      /* CompleteClass */
      override def nationalNumberCount(): Double = js.native
      /* CompleteClass */
      override def numberOfLeadingZerosCount(): Double = js.native
      /* CompleteClass */
      override def preferredDomesticCarrierCodeCount(): Double = js.native
      /* CompleteClass */
      override def rawInputCount(): Double = js.native
      /* CompleteClass */
      override def setCountryCode(value: Double): Unit = js.native
      /* CompleteClass */
      override def setCountryCodeSource(value: CountryCodeSource): Unit = js.native
      /* CompleteClass */
      override def setExtension(value: String): Unit = js.native
      /* CompleteClass */
      override def setItalianLeadingZero(value: Boolean): Unit = js.native
      /* CompleteClass */
      override def setNationalNumber(value: Double): Double = js.native
      /* CompleteClass */
      override def setNumberOfLeadingZeros(value: Double): Unit = js.native
      /* CompleteClass */
      override def setPreferredDomesticCarrierCode(value: String): Unit = js.native
      /* CompleteClass */
      override def setRawInput(value: String): Unit = js.native
    }
    
    @js.native
    class PhoneNumberUtil ()
      extends typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil
    
    @js.native
    class StringBuffer ()
      extends typingsSlinky.googleLibphonenumber.libphonenumber.StringBuffer {
      def this(opt_a1: js.Any, var_args: js.Any*) = this()
    }
    
    @js.native
    object PhoneNumber extends js.Object {
      @js.native
      object CountryCodeSource extends js.Object {
        /* 20 */ val FROM_DEFAULT_COUNTRY: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY with Double = js.native
        /* 10 */ val FROM_NUMBER_WITHOUT_PLUS_SIGN: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN with Double = js.native
        /* 5 */ val FROM_NUMBER_WITH_IDD: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD with Double = js.native
        /* 1 */ val FROM_NUMBER_WITH_PLUS_SIGN: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN with Double = js.native
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource with Double
              ] = js.native
      }
      
    }
    
    @js.native
    object PhoneNumberFormat extends js.Object {
      /* 0 */ val E164: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberFormat.E164 with Double = js.native
      /* 1 */ val INTERNATIONAL: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberFormat.INTERNATIONAL with Double = js.native
      /* 2 */ val NATIONAL: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberFormat.NATIONAL with Double = js.native
      /* 3 */ val RFC3966: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberFormat.RFC3966 with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberFormat with Double] = js.native
    }
    
    @js.native
    object PhoneNumberType extends js.Object {
      /* 0 */ val FIXED_LINE: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE with Double = js.native
      /* 2 */ val FIXED_LINE_OR_MOBILE: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE_OR_MOBILE with Double = js.native
      /* 1 */ val MOBILE: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.MOBILE with Double = js.native
      /* 8 */ val PAGER: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.PAGER with Double = js.native
      /* 7 */ val PERSONAL_NUMBER: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.PERSONAL_NUMBER with Double = js.native
      /* 4 */ val PREMIUM_RATE: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.PREMIUM_RATE with Double = js.native
      /* 5 */ val SHARED_COST: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.SHARED_COST with Double = js.native
      /* 3 */ val TOLL_FREE: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.TOLL_FREE with Double = js.native
      /* 9 */ val UAN: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.UAN with Double = js.native
      /* -1 */ val UNKNOWN: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.UNKNOWN with Double = js.native
      /* 10 */ val VOICEMAIL: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.VOICEMAIL with Double = js.native
      /* 6 */ val VOIP: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType.VOIP with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType with Double] = js.native
    }
    
    /* static members */
    @js.native
    object PhoneNumberUtil extends js.Object {
      def getInstance(): typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil = js.native
      @js.native
      object MatchType extends js.Object {
        /* 0 */ val EXACT_MATCH: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.EXACT_MATCH with Double = js.native
        /* 2 */ val NOT_A_NUMBER: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NOT_A_NUMBER with Double = js.native
        /* 1 */ val NO_MATCH: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NO_MATCH with Double = js.native
        /* 3 */ val NSN_MATCH: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NSN_MATCH with Double = js.native
        /* 4 */ val SHORT_NSN_MATCH: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.SHORT_NSN_MATCH with Double = js.native
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType with Double
              ] = js.native
      }
      
      @js.native
      object ValidationResult extends js.Object {
        /* 1 */ val INVALID_COUNTRY_CODE: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.INVALID_COUNTRY_CODE with Double = js.native
        /* 0 */ val IS_POSSIBLE: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.IS_POSSIBLE with Double = js.native
        /* 3 */ val TOO_LONG: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_LONG with Double = js.native
        /* 2 */ val TOO_SHORT: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_SHORT with Double = js.native
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult with Double
              ] = js.native
      }
      
    }
    
  }
  
}

