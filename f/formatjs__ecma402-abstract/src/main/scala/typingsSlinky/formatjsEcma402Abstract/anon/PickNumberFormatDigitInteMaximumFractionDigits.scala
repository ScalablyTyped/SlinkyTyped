package typingsSlinky.formatjsEcma402Abstract.anon

import typingsSlinky.formatjsEcma402Abstract.numberMod.NumberFormatRoundingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/number.NumberFormatDigitInternalSlots, 'roundingType' | 'minimumSignificantDigits' | 'maximumSignificantDigits' | 'minimumIntegerDigits' | 'minimumFractionDigits' | 'maximumFractionDigits'> */
@js.native
trait PickNumberFormatDigitInteMaximumFractionDigits extends StObject {
  
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  
  var minimumIntegerDigits: Double = js.native
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  
  var roundingType: NumberFormatRoundingType = js.native
}
object PickNumberFormatDigitInteMaximumFractionDigits {
  
  @scala.inline
  def apply(minimumIntegerDigits: Double, roundingType: NumberFormatRoundingType): PickNumberFormatDigitInteMaximumFractionDigits = {
    val __obj = js.Dynamic.literal(minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickNumberFormatDigitInteMaximumFractionDigits]
  }
  
  @scala.inline
  implicit class PickNumberFormatDigitInteMaximumFractionDigitsMutableBuilder[Self <: PickNumberFormatDigitInteMaximumFractionDigits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
    
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
    
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    @scala.inline
    def setRoundingType(value: NumberFormatRoundingType): Self = StObject.set(x, "roundingType", value.asInstanceOf[js.Any])
  }
}
