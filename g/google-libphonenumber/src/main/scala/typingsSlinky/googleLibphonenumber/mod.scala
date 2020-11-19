package typingsSlinky.googleLibphonenumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-libphonenumber", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class AsYouTypeFormatter protected ()
    extends typingsSlinky.googleLibphonenumber.libphonenumber.AsYouTypeFormatter {
    def this(region: String) = this()
  }
  
  @js.native
  class PhoneNumber ()
    extends typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber
  @js.native
  object PhoneNumber extends js.Object {
    
    @js.native
    object CountryCodeSource extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource with Double
          ] = js.native
      
      /* 20 */ val FROM_DEFAULT_COUNTRY: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY with Double = js.native
      
      /* 10 */ val FROM_NUMBER_WITHOUT_PLUS_SIGN: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN with Double = js.native
      
      /* 5 */ val FROM_NUMBER_WITH_IDD: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD with Double = js.native
      
      /* 1 */ val FROM_NUMBER_WITH_PLUS_SIGN: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN with Double = js.native
    }
  }
  
  @js.native
  object PhoneNumberFormat extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberFormat with Double] = js.native
    
    /* 0 */ val E164: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberFormat.E164 with Double = js.native
    
    /* 1 */ val INTERNATIONAL: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberFormat.INTERNATIONAL with Double = js.native
    
    /* 2 */ val NATIONAL: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberFormat.NATIONAL with Double = js.native
    
    /* 3 */ val RFC3966: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberFormat.RFC3966 with Double = js.native
  }
  
  @js.native
  object PhoneNumberType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberType with Double] = js.native
    
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
  }
  
  @js.native
  class PhoneNumberUtil ()
    extends typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil
  /* static members */
  @js.native
  object PhoneNumberUtil extends js.Object {
    
    def getInstance(): typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil = js.native
    
    @js.native
    object MatchType extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType with Double
          ] = js.native
      
      /* 0 */ val EXACT_MATCH: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.EXACT_MATCH with Double = js.native
      
      /* 2 */ val NOT_A_NUMBER: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NOT_A_NUMBER with Double = js.native
      
      /* 1 */ val NO_MATCH: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NO_MATCH with Double = js.native
      
      /* 3 */ val NSN_MATCH: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.NSN_MATCH with Double = js.native
      
      /* 4 */ val SHORT_NSN_MATCH: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.MatchType.SHORT_NSN_MATCH with Double = js.native
    }
    
    @js.native
    object ValidationResult extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult with Double
          ] = js.native
      
      /* 1 */ val INVALID_COUNTRY_CODE: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.INVALID_COUNTRY_CODE with Double = js.native
      
      /* 0 */ val IS_POSSIBLE: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.IS_POSSIBLE with Double = js.native
      
      /* 3 */ val TOO_LONG: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_LONG with Double = js.native
      
      /* 2 */ val TOO_SHORT: typingsSlinky.googleLibphonenumber.libphonenumber.PhoneNumberUtil.ValidationResult.TOO_SHORT with Double = js.native
    }
  }
  
  @js.native
  class StringBuffer protected ()
    extends typingsSlinky.googleLibphonenumber.libphonenumber.StringBuffer {
    def this(opt_a1: js.UndefOr[scala.Nothing], var_args: js.Any*) = this()
    def this(opt_a1: js.Any, var_args: js.Any*) = this()
  }
}
