package typingsSlinky.officeJsPreview.Excel

import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Formula
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.GreaterThan
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.GreaterThanOrEqual
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Number
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Percent
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Percentile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an Icon Criterion which contains a type, value, an Operator, and an optional custom icon, if not using an iconset.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalIconCriterion extends StObject {
  
  /**
    *
    * The custom icon for the current criterion if different from the default IconSet, else null will be returned.
    *
    * [Api set: ExcelApi 1.6]
    */
  var customIcon: js.UndefOr[Icon] = js.native
  
  /**
    *
    * A number or a formula depending on the type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: String = js.native
  
  /**
    *
    * GreaterThan or GreaterThanOrEqual for each of the rule type for the Icon conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalIconCriterionOperator | Invalid | GreaterThan | GreaterThanOrEqual = js.native
  
  /**
    *
    * What the icon conditional formula should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatIconRuleType | Invalid | Number | Percent | Formula | Percentile = js.native
}
object ConditionalIconCriterion {
  
  @scala.inline
  def apply(
    formula: String,
    operator: ConditionalIconCriterionOperator | Invalid | GreaterThan | GreaterThanOrEqual,
    `type`: ConditionalFormatIconRuleType | Invalid | Number | Percent | Formula | Percentile
  ): ConditionalIconCriterion = {
    val __obj = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalIconCriterion]
  }
  
  @scala.inline
  implicit class ConditionalIconCriterionMutableBuilder[Self <: ConditionalIconCriterion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomIcon(value: Icon): Self = StObject.set(x, "customIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomIconUndefined: Self = StObject.set(x, "customIcon", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: ConditionalIconCriterionOperator | Invalid | GreaterThan | GreaterThanOrEqual): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ConditionalFormatIconRuleType | Invalid | Number | Percent | Formula | Percentile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
