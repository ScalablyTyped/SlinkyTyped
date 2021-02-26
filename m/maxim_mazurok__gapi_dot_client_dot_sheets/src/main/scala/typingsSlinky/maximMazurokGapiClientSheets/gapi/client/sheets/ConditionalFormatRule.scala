package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalFormatRule extends StObject {
  
  /** The formatting is either "on" or "off" according to the rule. */
  var booleanRule: js.UndefOr[BooleanRule] = js.native
  
  /** The formatting will vary based on the gradients in the rule. */
  var gradientRule: js.UndefOr[GradientRule] = js.native
  
  /** The ranges that are formatted if the condition is true. All the ranges must be on the same grid. */
  var ranges: js.UndefOr[js.Array[GridRange]] = js.native
}
object ConditionalFormatRule {
  
  @scala.inline
  def apply(): ConditionalFormatRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatRule]
  }
  
  @scala.inline
  implicit class ConditionalFormatRuleMutableBuilder[Self <: ConditionalFormatRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanRule(value: BooleanRule): Self = StObject.set(x, "booleanRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanRuleUndefined: Self = StObject.set(x, "booleanRule", js.undefined)
    
    @scala.inline
    def setGradientRule(value: GradientRule): Self = StObject.set(x, "gradientRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientRuleUndefined: Self = StObject.set(x, "gradientRule", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[GridRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: GridRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
  }
}
