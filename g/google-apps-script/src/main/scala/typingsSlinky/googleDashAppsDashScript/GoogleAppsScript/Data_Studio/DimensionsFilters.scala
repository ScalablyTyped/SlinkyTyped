package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import typingsSlinky.googleDashAppsDashScript.googleDashAppsDashScriptStrings.BETWEEN
import typingsSlinky.googleDashAppsDashScript.googleDashAppsDashScriptStrings.CONTAINS
import typingsSlinky.googleDashAppsDashScript.googleDashAppsDashScriptStrings.EQUALS
import typingsSlinky.googleDashAppsDashScript.googleDashAppsDashScriptStrings.EXCLUDE
import typingsSlinky.googleDashAppsDashScript.googleDashAppsDashScriptStrings.INCLUDE
import typingsSlinky.googleDashAppsDashScript.googleDashAppsDashScriptStrings.IN_LIST
import typingsSlinky.googleDashAppsDashScript.googleDashAppsDashScriptStrings.IS_NULL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionsFilters extends js.Object {
  /** The name of the field to be filtered */
  var fieldName: String
  /** The operator to apply. */
  var operator: EQUALS | CONTAINS | RegexpOperator | IN_LIST | IS_NULL | BETWEEN | NumericOperator
  /** Whether data matching this filter should be included or excluded from the getData() response. */
  var `type`: INCLUDE | EXCLUDE
  /** An array of values to use for the operator. */
  var values: js.Array[String]
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
}

