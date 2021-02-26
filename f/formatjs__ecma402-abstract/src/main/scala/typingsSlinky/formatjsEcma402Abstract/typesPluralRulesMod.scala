package typingsSlinky.formatjsEcma402Abstract

import typingsSlinky.formatjsEcma402Abstract.anon.Cardinal
import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.cardinal
import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ordinal
import typingsSlinky.formatjsEcma402Abstract.typesCoreMod.LocaleData
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatDigitInternalSlots
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatRoundingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluralRulesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.zero
    - typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.one
    - typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.two
    - typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.few
    - typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.many
    - typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.other
  */
  trait LDMLPluralRule extends StObject
  object LDMLPluralRule {
    
    @scala.inline
    def few: typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.few = "few".asInstanceOf[typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.few]
    
    @scala.inline
    def many: typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.many = "many".asInstanceOf[typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.many]
    
    @scala.inline
    def one: typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.one = "one".asInstanceOf[typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.one]
    
    @scala.inline
    def other: typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.other = "other".asInstanceOf[typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.other]
    
    @scala.inline
    def two: typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.two = "two".asInstanceOf[typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.two]
    
    @scala.inline
    def zero: typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.zero = "zero".asInstanceOf[typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.zero]
  }
  
  @js.native
  trait PluralRulesData extends StObject {
    
    var categories: Cardinal = js.native
    
    def fn(`val`: String): LDMLPluralRule = js.native
    def fn(`val`: String, ord: Boolean): LDMLPluralRule = js.native
    def fn(`val`: Double): LDMLPluralRule = js.native
    def fn(`val`: Double, ord: Boolean): LDMLPluralRule = js.native
  }
  
  @js.native
  trait PluralRulesInternal extends NumberFormatDigitInternalSlots {
    
    var initializedPluralRules: Boolean = js.native
    
    var locale: String = js.native
    
    var `type`: cardinal | ordinal = js.native
  }
  object PluralRulesInternal {
    
    @scala.inline
    def apply(
      initializedPluralRules: Boolean,
      locale: String,
      minimumIntegerDigits: Double,
      roundingType: NumberFormatRoundingType,
      `type`: cardinal | ordinal
    ): PluralRulesInternal = {
      val __obj = js.Dynamic.literal(initializedPluralRules = initializedPluralRules.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralRulesInternal]
    }
    
    @scala.inline
    implicit class PluralRulesInternalMutableBuilder[Self <: PluralRulesInternal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitializedPluralRules(value: Boolean): Self = StObject.set(x, "initializedPluralRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: cardinal | ordinal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type PluralRulesLocaleData = LocaleData[PluralRulesData]
}
