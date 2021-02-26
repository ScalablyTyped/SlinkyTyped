package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.Formula
import typingsSlinky.officeJs.officeJsStrings.HighestValue
import typingsSlinky.officeJs.officeJsStrings.Invalid
import typingsSlinky.officeJs.officeJsStrings.LowestValue
import typingsSlinky.officeJs.officeJsStrings.Number
import typingsSlinky.officeJs.officeJsStrings.Percent
import typingsSlinky.officeJs.officeJsStrings.Percentile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a Color Scale Criterion which contains a type, value, and a color.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalColorScaleCriterion extends StObject {
  
  /**
    *
    * HTML color code representation of the color scale color (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *
    * A number, a formula, or null (if Type is LowestValue).
    *
    * [Api set: ExcelApi 1.6]
    */
  var formula: js.UndefOr[String] = js.native
  
  /**
    *
    * What the criterion conditional formula should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile = js.native
}
object ConditionalColorScaleCriterion {
  
  @scala.inline
  def apply(
    `type`: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile
  ): ConditionalColorScaleCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalColorScaleCriterion]
  }
  
  @scala.inline
  implicit class ConditionalColorScaleCriterionMutableBuilder[Self <: ConditionalColorScaleCriterion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setType(
      value: ConditionalFormatColorCriterionType | Invalid | LowestValue | HighestValue | Number | Percent | Formula | Percentile
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
