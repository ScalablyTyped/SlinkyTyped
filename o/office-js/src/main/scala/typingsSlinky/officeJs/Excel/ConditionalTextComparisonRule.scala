package typingsSlinky.officeJs.Excel

import typingsSlinky.officeJs.officeJsStrings.BeginsWith
import typingsSlinky.officeJs.officeJsStrings.Contains
import typingsSlinky.officeJs.officeJsStrings.EndsWith
import typingsSlinky.officeJs.officeJsStrings.Invalid
import typingsSlinky.officeJs.officeJsStrings.NotContains
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a Cell Value Conditional Format Rule
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait ConditionalTextComparisonRule extends StObject {
  
  /**
    *
    * The operator of the text conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var operator: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith = js.native
  
  /**
    *
    * The Text value of conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var text: String = js.native
}
object ConditionalTextComparisonRule {
  
  @scala.inline
  def apply(
    operator: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith,
    text: String
  ): ConditionalTextComparisonRule = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalTextComparisonRule]
  }
  
  @scala.inline
  implicit class ConditionalTextComparisonRuleMutableBuilder[Self <: ConditionalTextComparisonRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: ConditionalTextOperator | Invalid | Contains | NotContains | BeginsWith | EndsWith): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
