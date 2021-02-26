package typingsSlinky.intlTelInput.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intlTelInputUtils {
  
  @js.native
  sealed trait numberFormat extends StObject
  @JSImport("intl-tel-input", "intlTelInputUtils.numberFormat")
  @js.native
  object numberFormat extends StObject {
    
    @js.native
    sealed trait E164 extends numberFormat
    
    @js.native
    sealed trait INTERNATIONAL extends numberFormat
    
    @js.native
    sealed trait NATIONAL extends numberFormat
    
    @js.native
    sealed trait RFC3966 extends numberFormat
  }
  
  @js.native
  sealed trait numberType extends StObject
  @JSImport("intl-tel-input", "intlTelInputUtils.numberType")
  @js.native
  object numberType extends StObject {
    
    @js.native
    sealed trait FIXED_LINE extends numberType
    
    @js.native
    sealed trait FIXED_LINE_OR_MOBILE extends numberType
    
    @js.native
    sealed trait MOBILE extends numberType
    
    @js.native
    sealed trait PAGER extends numberType
    
    @js.native
    sealed trait PERSONAL_NUMBER extends numberType
    
    @js.native
    sealed trait PREMIUM_RATE extends numberType
    
    @js.native
    sealed trait SHARED_COST extends numberType
    
    @js.native
    sealed trait TOLL_FREE extends numberType
    
    @js.native
    sealed trait UAN extends numberType
    
    @js.native
    sealed trait UNKNOWN extends numberType
    
    @js.native
    sealed trait VOICEMAIL extends numberType
    
    @js.native
    sealed trait VOIP extends numberType
  }
  
  @js.native
  sealed trait validationError extends StObject
  @JSImport("intl-tel-input", "intlTelInputUtils.validationError")
  @js.native
  object validationError extends StObject {
    
    @js.native
    sealed trait INVALID_COUNTRY_CODE extends validationError
    
    @js.native
    sealed trait IS_POSSIBLE extends validationError
    
    @js.native
    sealed trait NOT_A_NUMBER extends validationError
    
    @js.native
    sealed trait TOO_LONG extends validationError
    
    @js.native
    sealed trait TOO_SHORT extends validationError
  }
  
  @js.native
  trait CountryData extends StObject {
    
    var dialCode: String = js.native
    
    var iso2: String = js.native
    
    var name: String = js.native
  }
  object CountryData {
    
    @scala.inline
    def apply(dialCode: String, iso2: String, name: String): CountryData = {
      val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryData]
    }
    
    @scala.inline
    implicit class CountryDataMutableBuilder[Self <: CountryData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIso2(value: String): Self = StObject.set(x, "iso2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.intlTelInput.intlTelInputStrings.FIXED_LINE_OR_MOBILE
    - typingsSlinky.intlTelInput.intlTelInputStrings.FIXED_LINE
    - typingsSlinky.intlTelInput.intlTelInputStrings.MOBILE
    - typingsSlinky.intlTelInput.intlTelInputStrings.PAGER
    - typingsSlinky.intlTelInput.intlTelInputStrings.PERSONAL_NUMBER
    - typingsSlinky.intlTelInput.intlTelInputStrings.PREMIUM_RATE
    - typingsSlinky.intlTelInput.intlTelInputStrings.SHARED_COST
    - typingsSlinky.intlTelInput.intlTelInputStrings.TOLL_FREE
    - typingsSlinky.intlTelInput.intlTelInputStrings.UAN
    - typingsSlinky.intlTelInput.intlTelInputStrings.UNKNOWN
    - typingsSlinky.intlTelInput.intlTelInputStrings.VOICEMAIL
    - typingsSlinky.intlTelInput.intlTelInputStrings.VOIP
  */
  trait placeholderNumberType extends StObject
  object placeholderNumberType {
    
    @scala.inline
    def FIXED_LINE: typingsSlinky.intlTelInput.intlTelInputStrings.FIXED_LINE = "FIXED_LINE".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.FIXED_LINE]
    
    @scala.inline
    def FIXED_LINE_OR_MOBILE: typingsSlinky.intlTelInput.intlTelInputStrings.FIXED_LINE_OR_MOBILE = "FIXED_LINE_OR_MOBILE".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.FIXED_LINE_OR_MOBILE]
    
    @scala.inline
    def MOBILE: typingsSlinky.intlTelInput.intlTelInputStrings.MOBILE = "MOBILE".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.MOBILE]
    
    @scala.inline
    def PAGER: typingsSlinky.intlTelInput.intlTelInputStrings.PAGER = "PAGER".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.PAGER]
    
    @scala.inline
    def PERSONAL_NUMBER: typingsSlinky.intlTelInput.intlTelInputStrings.PERSONAL_NUMBER = "PERSONAL_NUMBER".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.PERSONAL_NUMBER]
    
    @scala.inline
    def PREMIUM_RATE: typingsSlinky.intlTelInput.intlTelInputStrings.PREMIUM_RATE = "PREMIUM_RATE".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.PREMIUM_RATE]
    
    @scala.inline
    def SHARED_COST: typingsSlinky.intlTelInput.intlTelInputStrings.SHARED_COST = "SHARED_COST".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.SHARED_COST]
    
    @scala.inline
    def TOLL_FREE: typingsSlinky.intlTelInput.intlTelInputStrings.TOLL_FREE = "TOLL_FREE".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.TOLL_FREE]
    
    @scala.inline
    def UAN: typingsSlinky.intlTelInput.intlTelInputStrings.UAN = "UAN".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.UAN]
    
    @scala.inline
    def UNKNOWN: typingsSlinky.intlTelInput.intlTelInputStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.UNKNOWN]
    
    @scala.inline
    def VOICEMAIL: typingsSlinky.intlTelInput.intlTelInputStrings.VOICEMAIL = "VOICEMAIL".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.VOICEMAIL]
    
    @scala.inline
    def VOIP: typingsSlinky.intlTelInput.intlTelInputStrings.VOIP = "VOIP".asInstanceOf[typingsSlinky.intlTelInput.intlTelInputStrings.VOIP]
  }
}
