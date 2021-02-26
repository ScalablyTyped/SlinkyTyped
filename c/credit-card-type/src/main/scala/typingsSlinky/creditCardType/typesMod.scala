package typingsSlinky.creditCardType

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.creditCardType.anon.Name
import typingsSlinky.creditCardType.anon.Size
import typingsSlinky.creditCardType.creditCardTypeStrings.discover_
import typingsSlinky.creditCardType.creditCardTypeStrings.elo_
import typingsSlinky.creditCardType.creditCardTypeStrings.hiper_
import typingsSlinky.creditCardType.creditCardTypeStrings.hipercard_
import typingsSlinky.creditCardType.creditCardTypeStrings.jcb_
import typingsSlinky.creditCardType.creditCardTypeStrings.maestro_
import typingsSlinky.creditCardType.creditCardTypeStrings.mastercard_
import typingsSlinky.creditCardType.creditCardTypeStrings.mir_
import typingsSlinky.creditCardType.creditCardTypeStrings.unionpay_
import typingsSlinky.creditCardType.creditCardTypeStrings.visa_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait BuiltInCreditCardType extends CreditCardType {
    
    @JSName("code")
    var code_BuiltInCreditCardType: Size = js.native
    
    @JSName("niceType")
    var niceType_BuiltInCreditCardType: CreditCardTypeCardBrandNiceType = js.native
    
    @JSName("type")
    var type_BuiltInCreditCardType: CreditCardTypeCardBrandId = js.native
  }
  object BuiltInCreditCardType {
    
    @scala.inline
    def apply(
      code: Size,
      gaps: js.Array[Double],
      lengths: js.Array[Double],
      niceType: CreditCardTypeCardBrandNiceType,
      patterns: js.Array[js.Array[Double] | Double],
      `type`: CreditCardTypeCardBrandId
    ): BuiltInCreditCardType = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuiltInCreditCardType]
    }
    
    @scala.inline
    implicit class BuiltInCreditCardTypeMutableBuilder[Self <: BuiltInCreditCardType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Size): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNiceType(value: CreditCardTypeCardBrandNiceType): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CreditCardTypeCardBrandId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CardCollection = StringDictionary[CreditCardType]
  
  @js.native
  trait CreditCardType extends StObject {
    
    var code: Name = js.native
    
    var gaps: js.Array[Double] = js.native
    
    var lengths: js.Array[Double] = js.native
    
    var matchStrength: js.UndefOr[Double] = js.native
    
    var niceType: String = js.native
    
    var patterns: js.Array[js.Array[Double] | Double] = js.native
    
    var `type`: String = js.native
  }
  object CreditCardType {
    
    @scala.inline
    def apply(
      code: Name,
      gaps: js.Array[Double],
      lengths: js.Array[Double],
      niceType: String,
      patterns: js.Array[js.Array[Double] | Double],
      `type`: String
    ): CreditCardType = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreditCardType]
    }
    
    @scala.inline
    implicit class CreditCardTypeMutableBuilder[Self <: CreditCardType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Name): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaps(value: js.Array[Double]): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapsVarargs(value: Double*): Self = StObject.set(x, "gaps", js.Array(value :_*))
      
      @scala.inline
      def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value :_*))
      
      @scala.inline
      def setMatchStrength(value: Double): Self = StObject.set(x, "matchStrength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchStrengthUndefined: Self = StObject.set(x, "matchStrength", js.undefined)
      
      @scala.inline
      def setNiceType(value: String): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatterns(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "patterns", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.creditCardType.creditCardTypeStrings.`american-express`
    - typingsSlinky.creditCardType.creditCardTypeStrings.`diners-club`
    - typingsSlinky.creditCardType.creditCardTypeStrings.discover_
    - typingsSlinky.creditCardType.creditCardTypeStrings.elo_
    - typingsSlinky.creditCardType.creditCardTypeStrings.hiper_
    - typingsSlinky.creditCardType.creditCardTypeStrings.hipercard_
    - typingsSlinky.creditCardType.creditCardTypeStrings.jcb_
    - typingsSlinky.creditCardType.creditCardTypeStrings.maestro_
    - typingsSlinky.creditCardType.creditCardTypeStrings.mastercard_
    - typingsSlinky.creditCardType.creditCardTypeStrings.mir_
    - typingsSlinky.creditCardType.creditCardTypeStrings.unionpay_
    - typingsSlinky.creditCardType.creditCardTypeStrings.visa_
  */
  trait CreditCardTypeCardBrandId extends StObject
  object CreditCardTypeCardBrandId {
    
    @scala.inline
    def `american-express`: typingsSlinky.creditCardType.creditCardTypeStrings.`american-express` = "american-express".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.`american-express`]
    
    @scala.inline
    def `diners-club`: typingsSlinky.creditCardType.creditCardTypeStrings.`diners-club` = "diners-club".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.`diners-club`]
    
    @scala.inline
    def discover: discover_ = "discover".asInstanceOf[discover_]
    
    @scala.inline
    def elo: elo_ = "elo".asInstanceOf[elo_]
    
    @scala.inline
    def hiper: hiper_ = "hiper".asInstanceOf[hiper_]
    
    @scala.inline
    def hipercard: hipercard_ = "hipercard".asInstanceOf[hipercard_]
    
    @scala.inline
    def jcb: jcb_ = "jcb".asInstanceOf[jcb_]
    
    @scala.inline
    def maestro: maestro_ = "maestro".asInstanceOf[maestro_]
    
    @scala.inline
    def mastercard: mastercard_ = "mastercard".asInstanceOf[mastercard_]
    
    @scala.inline
    def mir: mir_ = "mir".asInstanceOf[mir_]
    
    @scala.inline
    def unionpay: unionpay_ = "unionpay".asInstanceOf[unionpay_]
    
    @scala.inline
    def visa: visa_ = "visa".asInstanceOf[visa_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.creditCardType.creditCardTypeStrings.`American Express`
    - typingsSlinky.creditCardType.creditCardTypeStrings.`Diners Club`
    - typingsSlinky.creditCardType.creditCardTypeStrings.Discover
    - typingsSlinky.creditCardType.creditCardTypeStrings.Elo
    - typingsSlinky.creditCardType.creditCardTypeStrings.Hiper
    - typingsSlinky.creditCardType.creditCardTypeStrings.Hipercard
    - typingsSlinky.creditCardType.creditCardTypeStrings.JCB
    - typingsSlinky.creditCardType.creditCardTypeStrings.Maestro
    - typingsSlinky.creditCardType.creditCardTypeStrings.Mastercard
    - typingsSlinky.creditCardType.creditCardTypeStrings.Mir
    - typingsSlinky.creditCardType.creditCardTypeStrings.UnionPay
    - typingsSlinky.creditCardType.creditCardTypeStrings.Visa
  */
  trait CreditCardTypeCardBrandNiceType extends StObject
  object CreditCardTypeCardBrandNiceType {
    
    @scala.inline
    def `American Express`: typingsSlinky.creditCardType.creditCardTypeStrings.`American Express` = ("American Express").asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.`American Express`]
    
    @scala.inline
    def `Diners Club`: typingsSlinky.creditCardType.creditCardTypeStrings.`Diners Club` = ("Diners Club").asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.`Diners Club`]
    
    @scala.inline
    def Discover: typingsSlinky.creditCardType.creditCardTypeStrings.Discover = "Discover".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.Discover]
    
    @scala.inline
    def Elo: typingsSlinky.creditCardType.creditCardTypeStrings.Elo = "Elo".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.Elo]
    
    @scala.inline
    def Hiper: typingsSlinky.creditCardType.creditCardTypeStrings.Hiper = "Hiper".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.Hiper]
    
    @scala.inline
    def Hipercard: typingsSlinky.creditCardType.creditCardTypeStrings.Hipercard = "Hipercard".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.Hipercard]
    
    @scala.inline
    def JCB: typingsSlinky.creditCardType.creditCardTypeStrings.JCB = "JCB".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.JCB]
    
    @scala.inline
    def Maestro: typingsSlinky.creditCardType.creditCardTypeStrings.Maestro = "Maestro".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.Maestro]
    
    @scala.inline
    def Mastercard: typingsSlinky.creditCardType.creditCardTypeStrings.Mastercard = "Mastercard".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.Mastercard]
    
    @scala.inline
    def Mir: typingsSlinky.creditCardType.creditCardTypeStrings.Mir = "Mir".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.Mir]
    
    @scala.inline
    def UnionPay: typingsSlinky.creditCardType.creditCardTypeStrings.UnionPay = "UnionPay".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.UnionPay]
    
    @scala.inline
    def Visa: typingsSlinky.creditCardType.creditCardTypeStrings.Visa = "Visa".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.Visa]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.creditCardType.creditCardTypeStrings.CVV
    - typingsSlinky.creditCardType.creditCardTypeStrings.CVC
    - typingsSlinky.creditCardType.creditCardTypeStrings.CID
    - typingsSlinky.creditCardType.creditCardTypeStrings.CVN
    - typingsSlinky.creditCardType.creditCardTypeStrings.CVE
    - typingsSlinky.creditCardType.creditCardTypeStrings.CVP2
  */
  trait CreditCardTypeSecurityCodeLabel extends StObject
  object CreditCardTypeSecurityCodeLabel {
    
    @scala.inline
    def CID: typingsSlinky.creditCardType.creditCardTypeStrings.CID = "CID".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.CID]
    
    @scala.inline
    def CVC: typingsSlinky.creditCardType.creditCardTypeStrings.CVC = "CVC".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.CVC]
    
    @scala.inline
    def CVE: typingsSlinky.creditCardType.creditCardTypeStrings.CVE = "CVE".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.CVE]
    
    @scala.inline
    def CVN: typingsSlinky.creditCardType.creditCardTypeStrings.CVN = "CVN".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.CVN]
    
    @scala.inline
    def CVP2: typingsSlinky.creditCardType.creditCardTypeStrings.CVP2 = "CVP2".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.CVP2]
    
    @scala.inline
    def CVV: typingsSlinky.creditCardType.creditCardTypeStrings.CVV = "CVV".asInstanceOf[typingsSlinky.creditCardType.creditCardTypeStrings.CVV]
  }
}
