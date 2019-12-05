package typingsSlinky.googleDashLibphonenumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-libphonenumber", JSImport.Namespace)
@js.native
object googleDashLibphonenumberMod extends js.Object {
  @js.native
  class AsYouTypeFormatter protected ()
    extends typingsSlinky.googleDashLibphonenumber.libphonenumber.AsYouTypeFormatter {
    def this(region: String) = this()
  }
  
  @js.native
  class PhoneNumber ()
    extends typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumber
  
  @js.native
  class PhoneNumberUtil ()
    extends typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil
  
  @js.native
  class StringBuffer ()
    extends typingsSlinky.googleDashLibphonenumber.libphonenumber.StringBuffer {
    def this(opt_a1: js.Any, var_args: js.Any*) = this()
  }
  
  @js.native
  object PhoneNumber extends js.Object {
    @js.native
    object CountryCodeSource extends js.Object {
      /* 20 */ val FROM_DEFAULT_COUNTRY: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY with Double = js.native
      /* 10 */ val FROM_NUMBER_WITHOUT_PLUS_SIGN: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN with Double = js.native
      /* 5 */ val FROM_NUMBER_WITH_IDD: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD with Double = js.native
      /* 1 */ val FROM_NUMBER_WITH_PLUS_SIGN: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource with Double
          ] = js.native
    }
    
  }
  
  @js.native
  object PhoneNumberFormat extends js.Object {
    /* 0 */ val E164: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.E164 with Double = js.native
    /* 1 */ val INTERNATIONAL: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.INTERNATIONAL with Double = js.native
    /* 2 */ val NATIONAL: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.NATIONAL with Double = js.native
    /* 3 */ val RFC3966: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat.RFC3966 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberFormat with Double
      ] = js.native
  }
  
  @js.native
  object PhoneNumberType extends js.Object {
    /* 0 */ val FIXED_LINE: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE with Double = js.native
    /* 2 */ val FIXED_LINE_OR_MOBILE: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.FIXED_LINE_OR_MOBILE with Double = js.native
    /* 1 */ val MOBILE: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.MOBILE with Double = js.native
    /* 8 */ val PAGER: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.PAGER with Double = js.native
    /* 7 */ val PERSONAL_NUMBER: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.PERSONAL_NUMBER with Double = js.native
    /* 4 */ val PREMIUM_RATE: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.PREMIUM_RATE with Double = js.native
    /* 5 */ val SHARED_COST: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.SHARED_COST with Double = js.native
    /* 3 */ val TOLL_FREE: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.TOLL_FREE with Double = js.native
    /* 9 */ val UAN: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.UAN with Double = js.native
    /* -1 */ val UNKNOWN: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.UNKNOWN with Double = js.native
    /* 10 */ val VOICEMAIL: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.VOICEMAIL with Double = js.native
    /* 6 */ val VOIP: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType.VOIP with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberType with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object PhoneNumberUtil extends js.Object {
    def getInstance(): typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil = js.native
    @js.native
    object MatchType extends js.Object {
      /* 0 */ val EXACT_MATCH: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.EXACT_MATCH with Double = js.native
      /* 2 */ val NOT_A_NUMBER: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NOT_A_NUMBER with Double = js.native
      /* 1 */ val NO_MATCH: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NO_MATCH with Double = js.native
      /* 3 */ val NSN_MATCH: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NSN_MATCH with Double = js.native
      /* 4 */ val SHORT_NSN_MATCH: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.SHORT_NSN_MATCH with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType with Double
          ] = js.native
    }
    
    @js.native
    object ValidationResult extends js.Object {
      /* 1 */ val INVALID_COUNTRY_CODE: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.INVALID_COUNTRY_CODE with Double = js.native
      /* 0 */ val IS_POSSIBLE: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.IS_POSSIBLE with Double = js.native
      /* 3 */ val TOO_LONG: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_LONG with Double = js.native
      /* 2 */ val TOO_SHORT: typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_SHORT with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.googleDashLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult with Double
          ] = js.native
    }
    
  }
  
}

