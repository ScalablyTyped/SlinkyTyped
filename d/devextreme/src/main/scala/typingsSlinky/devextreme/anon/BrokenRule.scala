package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.invalid
import typingsSlinky.devextreme.devextremeStrings.pending
import typingsSlinky.devextreme.devextremeStrings.valid
import typingsSlinky.devextreme.mod.DevExpress.ui.AsyncRule
import typingsSlinky.devextreme.mod.DevExpress.ui.CompareRule
import typingsSlinky.devextreme.mod.DevExpress.ui.CustomRule
import typingsSlinky.devextreme.mod.DevExpress.ui.EmailRule
import typingsSlinky.devextreme.mod.DevExpress.ui.NumericRule
import typingsSlinky.devextreme.mod.DevExpress.ui.PatternRule
import typingsSlinky.devextreme.mod.DevExpress.ui.RangeRule
import typingsSlinky.devextreme.mod.DevExpress.ui.RequiredRule
import typingsSlinky.devextreme.mod.DevExpress.ui.StringLengthRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokenRule extends StObject {
  
  var brokenRule: js.UndefOr[
    RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
  ] = js.native
  
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  
  var isValid: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[valid | invalid | pending] = js.native
  
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object BrokenRule {
  
  @scala.inline
  def apply(): BrokenRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokenRule]
  }
  
  @scala.inline
  implicit class BrokenRuleMutableBuilder[Self <: BrokenRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokenRule(
      value: RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ): Self = StObject.set(x, "brokenRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokenRuleUndefined: Self = StObject.set(x, "brokenRule", js.undefined)
    
    @scala.inline
    def setBrokenRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = StObject.set(x, "brokenRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokenRulesUndefined: Self = StObject.set(x, "brokenRules", js.undefined)
    
    @scala.inline
    def setBrokenRulesVarargs(
      value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
    ): Self = StObject.set(x, "brokenRules", js.Array(value :_*))
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: valid | invalid | pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setValidationRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
    
    @scala.inline
    def setValidationRulesVarargs(
      value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
    ): Self = StObject.set(x, "validationRules", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
