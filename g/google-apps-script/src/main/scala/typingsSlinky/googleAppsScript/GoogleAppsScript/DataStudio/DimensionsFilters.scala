package typingsSlinky.googleAppsScript.GoogleAppsScript.DataStudio

import typingsSlinky.googleAppsScript.googleAppsScriptStrings.BETWEEN
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.CONTAINS
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.EQUALS
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.EXCLUDE
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.INCLUDE
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.IN_LIST
import typingsSlinky.googleAppsScript.googleAppsScriptStrings.IS_NULL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionsFilters extends StObject {
  
  /** The name of the field to be filtered */
  var fieldName: String = js.native
  
  /** The operator to apply. */
  var operator: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator = js.native
  
  /** Whether data matching this filter should be included or excluded from the getData() response. */
  var `type`: INCLUDE | EXCLUDE = js.native
  
  /** An array of values to use for the operator. */
  var values: js.Array[String] = js.native
}
object DimensionsFilters {
  
  @scala.inline
  def apply(
    fieldName: String,
    operator: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator,
    `type`: INCLUDE | EXCLUDE,
    values: js.Array[String]
  ): DimensionsFilters = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionsFilters]
  }
  
  @scala.inline
  implicit class DimensionsFiltersMutableBuilder[Self <: DimensionsFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: INCLUDE | EXCLUDE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
